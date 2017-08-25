package com.github.jmodel.mapper.plugin.example;

import com.github.jmodel.api.domain.Model;
import com.github.jmodel.mapper.api.domain.Mapping;
import java.util.Map;

@SuppressWarnings("all")
public class CreateRiArap extends Mapping {
  private static Mapping instance;
  
  public static synchronized Mapping getInstance() {
    if (instance == null) {
    	instance = new com.github.jmodel.mapper.plugin.example.CreateRiArap();
    	
    	instance.init(instance);
    }	
    
    return instance;
  }
  
  @Override
  public void init(final Mapping myInstance) {
    super.init(myInstance);
    com.github.jmodel.api.domain.Entity sourceRootModel = new com.github.jmodel.api.domain.Entity();
    myInstance.setSourceTemplateModel(sourceRootModel);
    com.github.jmodel.api.domain.Entity targetRootModel = new com.github.jmodel.api.domain.Entity();
    myInstance.setTargetTemplateModel(targetRootModel); 
    		
    myInstance.setFromFormat(com.github.jmodel.api.format.FormatEnum.JSON);														
    
    myInstance.setToFormat(com.github.jmodel.api.format.FormatEnum.JSON);														
    
    	
    			
    	
    				
    	myInstance.getRawSourceFieldPaths().add("RiFee._");
    	myInstance.getRawTargetFieldPaths().add("Arap._");
    	
    	myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[]._");
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[]._");
    	
    
        myInstance.getRawSourceFieldPaths().add("RiFee.BusinessTransactionId");
        myInstance.getRawSourceFieldPaths().add("RiFee.BusinessSource");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyNo");
        myInstance.getRawSourceFieldPaths().add("RiFee.EndorsementNo");
        myInstance.getRawSourceFieldPaths().add("RiFee.ClaimNo");
        myInstance.getRawSourceFieldPaths().add("RiFee.BranchCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.EndorsementExpiryDate");
        myInstance.getRawSourceFieldPaths().add("RiFee.EndorsementEffectiveDate");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyExpiryDate");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyEffectiveDate");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyHolderId");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyHolderCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyHolderName");
        myInstance.getRawSourceFieldPaths().add("RiFee.PolicyHolderCountry");
        myInstance.getRawSourceFieldPaths().add("RiFee.LobCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.ProductCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].IsArap");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].FeeType");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].FeeTypeName");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].RiInFacType");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].RiOutType");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].CurrencyCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].Amount");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].Arap");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].AccountEr");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].AccountAmount");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].FundType");
        myInstance.getRawSourceFieldPaths().add("RiFee.Fronting");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReserveType");
        myInstance.getRawSourceFieldPaths().add("RiFee.DateOfLoss");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerBrokerCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerBrokerName");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerLocationAreaId");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerCategory");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].CountryOfReinsurer");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].TaxCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerId");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerCode");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].ReinsurerName");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].CountryOfReinsurer");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].RelatedCompany");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].FeeDetailType");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].RiStatementNo");
        myInstance.getRawSourceFieldPaths().add("RiFee.RiFeeDetails[].TreatyRiskCategoryCode");
    	
    	myInstance.getRawTargetFieldPaths().add("Arap.BusinessTransactionId");												
    	myInstance.getRawTargetFieldPaths().add("Arap.BusinessSource");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyNo");												
    	myInstance.getRawTargetFieldPaths().add("Arap.EndoNo");												
    	myInstance.getRawTargetFieldPaths().add("Arap.ClaimNo");												
    	myInstance.getRawTargetFieldPaths().add("Arap.BranchCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.EndoExpDate");												
    	myInstance.getRawTargetFieldPaths().add("Arap.EndoEffDate");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyExpDate");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyEffDate");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyholderId");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyholderCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyholderName");												
    	myInstance.getRawTargetFieldPaths().add("Arap.PolicyholderCountry");												
    	myInstance.getRawTargetFieldPaths().add("Arap.RiskCategory");												
    	myInstance.getRawTargetFieldPaths().add("Arap.ProductCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].FeeType");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].FeeTypeName");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiFacType");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiFacOutType");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].CurrencyCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].Amount");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].FeeCate");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].AccountEr");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].AccountAmount");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].FundType");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].Fronting");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].ReserveType");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].DateOfLoss");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiCompanyCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiCompanyName");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiLocationOfReinsurer");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RegUnregAuth");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiCountryOfReinsurer");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].TaxCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].PartyId");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].PartyCode");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].PartyName");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].PartyCountry");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].TradingPartner");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].FeeDetailType");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].RiSettlementNo");												
    	myInstance.getRawTargetFieldPaths().add("Arap.FeeList[].TreatyRiskCategCode");												
  }
  
  @Override
  public void execute(final Model mySourceModel, final Model myTargetModel, final Map myVariablesMap) {
    super.execute(mySourceModel, myTargetModel, myVariablesMap);
    {
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.BusinessTransactionId")));
    myTargetModel.getFieldPathMap().get("Arap.BusinessTransactionId").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.BusinessTransactionId").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.BusinessSource")));
    myTargetModel.getFieldPathMap().get("Arap.BusinessSource").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.BusinessSource").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyNo")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyNo").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyNo").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.EndorsementNo")));
    myTargetModel.getFieldPathMap().get("Arap.EndoNo").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.EndoNo").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.ClaimNo")));
    myTargetModel.getFieldPathMap().get("Arap.ClaimNo").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.ClaimNo").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.BranchCode")));
    myTargetModel.getFieldPathMap().get("Arap.BranchCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.BranchCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.EndorsementExpiryDate")));
    myTargetModel.getFieldPathMap().get("Arap.EndoExpDate").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.EndoExpDate").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.EndorsementEffectiveDate")));
    myTargetModel.getFieldPathMap().get("Arap.EndoEffDate").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.EndoEffDate").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyExpiryDate")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyExpDate").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyExpDate").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyEffectiveDate")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyEffDate").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyEffDate").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyHolderId")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderId").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderId").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyHolderCode")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyHolderName")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderName").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderName").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.PolicyHolderCountry")));
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderCountry").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.PolicyholderCountry").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.LobCode")));
    myTargetModel.getFieldPathMap().get("Arap.RiskCategory").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.RiskCategory").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.ProductCode")));
    myTargetModel.getFieldPathMap().get("Arap.ProductCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get("Arap.ProductCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);   
    
    }
    {
    java.util.function.Predicate<String> p = null;
    p = (String f) -> ((com.github.jmodel.api.utils.ModelHelper.predict(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(f + ".IsArap")),"1",com.github.jmodel.api.utils.OperationEnum.EQUALS)));
    com.github.jmodel.mapper.api.utils.MappingHelper.arrayMapping(mySourceModel, myTargetModel, mySourceModel.getModelPathMap().get("RiFee.RiFeeDetails[]"), myTargetModel.getModelPathMap().get("Arap.FeeList[]"), "RiFee.RiFeeDetails[]", "Arap.FeeList[]", 0, false, p,
    (String[] m_1) ->
    {
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".FeeType")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeType").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeType").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".FeeTypeName")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeTypeName").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeTypeName").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".RiInFacType")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiFacType").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiFacType").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".RiOutType")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiFacOutType").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiFacOutType").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".CurrencyCode")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".CurrencyCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".CurrencyCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".Amount")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".Amount").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".Amount").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".Arap")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeCate").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeCate").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".AccountEr")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".AccountEr").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".AccountEr").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".AccountAmount")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".AccountAmount").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".AccountAmount").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".FundType")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FundType").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FundType").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.Fronting")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".Fronting").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".Fronting").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReserveType")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".ReserveType").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".ReserveType").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get("RiFee.DateOfLoss")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".DateOfLoss").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".DateOfLoss").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerBrokerCode")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiCompanyCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiCompanyCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerBrokerName")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiCompanyName").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiCompanyName").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerLocationAreaId")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiLocationOfReinsurer").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiLocationOfReinsurer").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerCategory")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RegUnregAuth").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RegUnregAuth").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".CountryOfReinsurer")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiCountryOfReinsurer").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiCountryOfReinsurer").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".TaxCode")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".TaxCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".TaxCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerId")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyId").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyId").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerCode")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".ReinsurerName")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyName").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyName").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".CountryOfReinsurer")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyCountry").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".PartyCountry").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".RelatedCompany")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".TradingPartner").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".TradingPartner").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".FeeDetailType")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeDetailType").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".FeeDetailType").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".RiStatementNo")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiSettlementNo").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".RiSettlementNo").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    {
    String fieldValue = null;
    fieldValue = String.valueOf(com.github.jmodel.api.utils.ModelHelper.getFieldValue(mySourceModel.getFieldPathMap().get(m_1[0] + ".TreatyRiskCategoryCode")));
    myTargetModel.getFieldPathMap().get(m_1[1] + ".TreatyRiskCategCode").setValue(fieldValue); 
    
    myTargetModel.getFieldPathMap().get(m_1[1] + ".TreatyRiskCategCode").setDataType(com.github.jmodel.api.domain.DataTypeEnum.STRING);  
    
    }
    });
    }
    }
  }
}
