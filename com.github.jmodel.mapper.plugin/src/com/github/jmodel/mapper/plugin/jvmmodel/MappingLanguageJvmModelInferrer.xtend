package com.github.jmodel.mapper.plugin.jvmmodel

import com.github.jmodel.mapper.plugin.mappinglanguage.Block
import com.github.jmodel.mapper.plugin.mappinglanguage.Mapping
import com.github.jmodel.mapper.plugin.mappinglanguage.SingleSourceFieldPath
import com.github.jmodel.mapper.plugin.mappinglanguage.TargetFieldPath
import com.github.jmodel.mapper.plugin.mappinglanguage.Variable
import com.github.jmodel.mapper.plugin.util.Util
import com.google.inject.Inject
import java.util.Map
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class MappingLanguageJvmModelInferrer extends AbstractModelInferrer {

	val _MAPPING = "com.github.jmodel.mapper.api.domain.Mapping"
	val _MODEL = "com.github.jmodel.api.domain.Model"
	val _MODEL_EXCEPTION = "com.github.jmodel.ModelException"

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder

	// @Inject MappingXbaseCompiler compiler
	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(Mapping element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {

		acceptor.accept(element.toClass(element.name)) [

			if (element.superType === null) {
				superTypes += typeRef(_MAPPING)
			} else {
				superTypes += typeRef(element.superType.name)
			}

			members += element.toField("instance", typeRef(_MAPPING)) [
				static = true
			]

			members += element.toConstructor() [
				visibility = JvmVisibility.PRIVATE
			]

			members += element.toMethod("getInstance", typeRef(_MAPPING)) [
				static = true
				synchronized = true

				body = '''
					if (instance == null) {
						instance = new «element.name»();
						
						instance.init(instance);
					}	
					
					return instance;
				'''
			]

			members += element.toMethod("init", typeRef(void)) [
				parameters += element.toParameter("myInstance", typeRef(_MAPPING))
				annotations += annotationRef("java.lang.Override")
				body = '''
					super.init(myInstance);
					«element.genCommonSetting»
					«element.genOriginalPaths»
				'''
			]

			members += element.toMethod("execute", typeRef(void)) [
				parameters += element.toParameter("mySourceModel", typeRef(_MODEL))
				parameters += element.toParameter("myTargetModel", typeRef(_MODEL))
				parameters += element.toParameter("myVariablesMap", typeRef(Map))
				exceptions += typeRef(_MODEL_EXCEPTION)
				annotations += annotationRef("java.lang.Override")
				body = element.body
			]

		]
	}

	/* 
	 * 	def dispatch void infer(Body body, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
	 * 		
	 * 		
	 * 		
	 * 		
	 * 		'''super.execute(mySourceModel, myTargetModel, myVariablesMap);'''

	 * 		val mapping = body.eContainer as Mapping
	 * 		if (mapping.to.bean !== null) {
	 * 			newLine
	 * 			append('''myTargetModel.setTargetBean(new «mapping.to.bean»());''')
	 * 		}

	 * 		for (block : body.blocks) {
	 * 			doInternalToJavaStatement(block, it, isReferenced)
	 * 		}
	 * 		
	 * 		]
	 * 
	 * 		
	 * 		
	 * 	}
	 */
	def genCommonSetting(Mapping element) '''
		com.github.jmodel.api.domain.Entity sourceRootModel = new com.github.jmodel.api.domain.Entity();
		myInstance.setSourceTemplateModel(sourceRootModel);
		com.github.jmodel.api.domain.Entity targetRootModel = new com.github.jmodel.api.domain.Entity();
		myInstance.setTargetTemplateModel(targetRootModel); 
				
		«IF element.from.name.literal== 'JSON'»								
			myInstance.setFromFormat(com.github.jmodel.api.format.FormatEnum.JSON);														
		«ELSEIF element.from.name.literal== 'XML'» 
			myInstance.setFromFormat(com.github.jmodel.api.format.FormatEnum.XML);	
		«ELSEIF element.from.name.literal== 'BEAN'» 
			myInstance.setFromFormat(com.github.jmodel.api.format.FormatEnum.BEAN);	
		«ENDIF»
		
		«IF element.to.name.literal== 'JSON'»								
			myInstance.setToFormat(com.github.jmodel.api.format.FormatEnum.JSON);														
		«ELSEIF element.to.name.literal== 'XML'» 
			myInstance.setToFormat(com.github.jmodel.api.format.FormatEnum.XML);	
		«ELSEIF element.to.name.literal== 'BEAN'» 
			myInstance.setToFormat(com.github.jmodel.api.format.FormatEnum.BEAN);	
		«ENDIF»	
		
			
					
	'''

	def genOriginalPaths(Mapping element) '''
			
			«FOR variable : element.eAllContents.toIterable.filter(typeof(Variable))»
			myInstance.getRawVariables().add("«Util.getVariableName(variable.expression)»");
			«ENDFOR»
						
			«FOR block : element.eAllContents.toIterable.filter(typeof(Block))»
				myInstance.getRawSourceFieldPaths().add("«Util.getFullModelPath(block, true)»._");
				myInstance.getRawTargetFieldPaths().add("«Util.getFullModelPath(block, false)»._");
				
				«IF block.sourceRecursive!==null»
					myInstance.getSourceModelRecursiveMap().put("«Util.getFullModelPath(block, true)»", true);
				«ENDIF»
				«IF block.targetRecursive!==null»
					myInstance.getTargetModelRecursiveMap().put("«Util.getFullModelPath(block, false)»", true);
				«ENDIF»
			«ENDFOR»
		
		    «FOR field : element.eAllContents.toIterable.filter(typeof(SingleSourceFieldPath))»
		    	«IF field.absolutePath!==null»
		    		myInstance.getRawSourceFieldPaths().add("«Util.getSourceModelPathByPath(field)».«field.content»");
		    	«ELSE»
		    		myInstance.getRawSourceFieldPaths().add("«Util.getFullModelPath(field, true)».«field.content»");
		    	«ENDIF»		
		    «ENDFOR»		
			
			«FOR targetFieldPath : element.eAllContents.toIterable.filter(typeof(TargetFieldPath))»
				myInstance.getRawTargetFieldPaths().add("«Util.getFullModelPath(targetFieldPath, false)».«targetFieldPath.expression»");												
			«ENDFOR»
	'''
}
