

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw'] = new Object();
tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw'];
    fc['rule_cancel'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "cancel", "cancel", fc['action_cancel']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(cancel) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_close'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "close", "close", fc['action_close']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(close) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_submit'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "submit", "SubmitForm", fc['action_SubmitForm']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(submit) Error: " + e);
	       throw e;
	   }
	}

			fc['action_SubmitForm'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				//if(data.getTaskName()=='PM_Review'){
var flag=0;
var temp=data.getMaterial_Record();
//logger.info(temp.size());
//logger.info(flag);
for(var index=0; index<temp.size(); index++){
	if((temp.get(index).getSiebelCircuitID()==null)||(temp.get(index).getSiebelCircuitID()=="")||(temp.get(index).getQty()==null)||(temp.get(index).getQty()=="")||(temp.get(index).getUDM()==null)||(temp.get(index).getUDM()=="")||(temp.get(index).getAmount()==null)||(temp.get(index).getAmount()=="")) {
					flag=1;
					logger.info("Inside IF "+flag);
					//break;
	}
	else {
		flag=0;
		logger.info("Inside ELSE "+flag);
		
	}
	
}
if(flag==1){
//logger.info("Inside Alert");
alert("Please delete Extra Material or Fill Required Details");
}
else{
this.getForm().invokeAction("submit",this,context);
}
/*
else if(data.getTaskName()=='Select_Contractor'){
	if((control.availableContractors.getValue()==null) || (control.availableContractors.getValue() =="" )) {
		alert("Please select the Contractor before proceeding.");
	}
	else {
		this.getForm().invokeAction("submit",this,context);
	}
	
}
else if(data.getTaskName()=='GateKeeper'){
	if((control.selectPM.getValue()==null) || (control.selectPM.getValue() =="" )) {
		alert("Please select the Project Manager before proceeding.");
	}
	else {
		this.getForm().invokeAction("submit",this,context);
	}
}
else if(data.getTaskName()=='Provision_Management_IP') {

	if( (control.TechnicalInfo_carrierVLAN.getValue()=="") || (control.TechnicalInfo_carrierIP.getValue()=="")|| (control.TechnicalInfo_aggPoint.getValue()=="")  || (control.TechnicalInfo_port.getValue()=="")) {
		alert("Please fill in all of the information for Management IPs before proceeding.");
	}
	else{
	this.getForm().invokeAction("submit",this,context);
	}

}
else if(data.getTaskName()=='Provision_IPs') {

	if( (control.TechnicalInfo_clientVLAN.getValue()=="") || (control.TechnicalInfo_clientIP.getValue()=="")|| (control.TechnicalInfo_SFCPOPPE.getValue()=="")  || (control.TechnicalInfo_portType.getValue()=="")) {
		alert("Please fill in all of the information for Service IPs before proceeding.");
	}
	else{
	this.getForm().invokeAction("submit",this,context);
	}
}
else if(data.getTaskName()=='TES_OSG_Verification') {

	if(pane.TechnicalInfo_equipment.getValue().size()==0) {
		alert("Please fill in at least one Equipment before proceeding");
	}
	else{
	this.getForm().invokeAction("submit",this,context);
	}
}
else {
		this.getForm().invokeAction("submit",this,context);
	}
*/

			}
    fc['rule_initialize_fields_Visibility'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "initialize_fields_Visibility", "initialize_fields_Visibility", fc['action_initialize_fields_Visibility']);
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "initialize_fields_Visibility", "set_form_labels", fc['action_set_form_labels']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(initialize_fields_Visibility) Error: " + e);
	       throw e;
	   }
	}

			fc['action_initialize_fields_Visibility'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var name=data.getTaskName();
for(var index=0; index<name.length; index++) {
name=name.replace("_"," ");
}
pane.content.setLabel(name);
//pane.ProvisioningData.setEnabled(false);
pane.Pane03.setEnabled(false);
pane.clientDetails01.setEnabled(false);
pane.pneSrvcDt.setEnabled(false);
pane.pane8.setEnabled(false);
pane.pne01.setEnabled(false);
pane.contactDetails01.setEnabled(false);
pane.serviceRequest.setEnabled(false);
pane.pane17.setEnabled(false);
control.Material_Record_unitPrice.setEnabled(false);
if(data.getTaskName()=="Review_Materials"){
pane.pane16.setEnabled(false);
}
else{
pane.pane16.setEnabled(true);
}
//pane.content.setLabel(name);
/*
pane.pneMarginPaneCntrAgnt.setVisible(false);
pane.selectContractorAgency.setVisible(false);
control.lblContractorAgency.setVisible(false);

pane.pneMarginPaneSelectContractor.setVisible(false);
control.lblSelectContractor.setVisible(false);
pane.selectContractor.setVisible(false);

control.addEquipment.setVisible(false);
pane.pneTechInfoParent.setVisible(false);
pane.MarginPaneTechnicalInfo.setVisible(false);
control.lblTechInfo.setVisible(false);

pane.pneSelectProjectManager.setVisible(false);

if(data.getTaskName()=="GateKeeper"){
	pane.pneSelectProjectManager.setVisible(true);
}
else if(data.getTaskName()=="PM_Track_Installation"){
	control.lblContractorAgency.setVisible(true);
	pane.pneMarginPaneCntrAgnt.setVisible(true);
	pane.selectContractorAgency.setVisible(true);
}
else if(data.getTaskName()=="Select_Contractor"){

	control.lblSelectContractor.setVisible(true);
	pane.pneMarginPaneSelectContractor.setVisible(true);
	pane.selectContractor.setVisible(true);	
	
	pane.pneTechInfoParent.setVisible(true);
	control.lblTechInfo.setVisible(true);
	pane.pneTechInfoParent.setEnabled(false);
}
else if(data.getTaskName()=="TES_OSG_Verification") { 
	pane.pneTechInfoParent.setVisible(true);
	pane.MarginPaneTechnicalInfo.setVisible(true);
	control.lblTechInfo.setVisible(true);
	
	pane.pneServiceIPs.setEnabled(false);
	pane.pneMgmtIPs.setEnabled(false);
	
	control.addEquipment.setVisible(true);
	pane.TechnicalInfo_equipment.setVisible(true);
	pane.TechnicalInfo_equipment.setEnabled(true);
	disableServiceIPFields();
	disableMgmtIPFields();

}
else if (data.getTaskName()=="Provision_Management_IP") {
	pane.pneTechInfoParent.setVisible(true);
	pane.MarginPaneTechnicalInfo.setVisible(true);
	control.lblTechInfo.setVisible(true);
	
	control.addEquipment.setVisible(false);
	pane.TechnicalInfo_equipment.setVisible(true);
	pane.TechnicalInfo_equipment.setEnabled(false);
	
	pane.pneServiceIPs.setEnabled(false);
	disableServiceIPFields();
	pane.pneMgmtIPs.setEnabled(true);
}
else if(data.getTaskName()=="Provision_IPs") {
	pane.pneTechInfoParent.setVisible(true);
	pane.MarginPaneTechnicalInfo.setVisible(true);
	control.lblTechInfo.setVisible(true);
	
	control.addEquipment.setVisible(false);
	pane.TechnicalInfo_equipment.setVisible(true);
	pane.TechnicalInfo_equipment.setEnabled(false);
	
	pane.pneServiceIPs.setEnabled(true);

	pane.pneMgmtIPs.setEnabled(false);
	disableMgmtIPFields();
	
}

if( (data.getTaskName()=="Select_Contractor") || (data.getTaskName()=="Manual_Installation") || (data.getTaskName()=="Configure_IPs") || (data.getTaskName()=="Obtain_Customer_Confirmation") || (data.getTaskName()=="Verification_Customer_Acknowledgement")) {
	pane.pneTechInfoParent.setVisible(true);
	pane.MarginPaneTechnicalInfo.setVisible(true);
	control.lblTechInfo.setVisible(true);
	
	pane.TechnicalInfo_equipment.setVisible(true);
	pane.TechnicalInfo_equipment.setEnabled(false);
	pane.pneServiceIPs.setEnabled(false);
	pane.pneMgmtIPs.setEnabled(false);
	disableMgmtIPFields();
	disableServiceIPFields();
	chngeBkGrndColorProvData();
	
}
if(data.getTaskName()=="Select_Contractor"||data.getTaskName()=="TES_OSG_Verification"||data.getTaskName()=="Provision_Management_IP"||data.getTaskName()=="Manual_Installation"||data.getTaskName()=="Manual_Installation"||data.getTaskName()=="Configure_IPs"||data.getTaskName()=="Obtain_Customer_Confirmation" ||data.getTaskName()=="Verification_Customer_Acknowledgement" ){
	pane.pne01.setEnabled(false);
	pane.clientDetails01.setEnabled(false);
	pane.Pane03.setEnabled(false);
	pane.pane8.setEnabled(false);
	pane.serviceRequest.setEnabled(false);
	pane.contactDetails01.setEnabled(false);
	pane.pneSrvcDt.setEnabled(false);
	chngeBkGrndColorProvData();
}

control.fileattachments.setValue("<iframe SCROLLING='yes' frameborder=0 width=1000 height=250 src='"+data.getXDMSURL().toString()+"/archiv?xfunc=list&folderid="+data.getProvisioning_Data().getSiebelCircuitID()+"&xupload=true&target=_blank'></iframe>");
*/
			}
			fc['action_set_form_labels'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				setupFontColor('[id$=generalDetails]');
setupFontColor('[id$=clientDetails]');
setupFontColor('[id$=resource]');
setupFontColor('[id$=installationAddress]');
setupFontColor('[id$=lblServiceRequest]');
setupFontColor('[id$=contactDetails]');
setupFontColor('[id$=serviceDates]');
setupFontColor('[id$=commentsText]');
setupFontColor('[id$=lblTechInfo]');
setupFontColor('[id$=lblContractorAgency]');
setupFontColor('[id$=lblSelectContractor]');
setupFontColor('[id$=commentHistory]');
setupFontColor('[id$=lblUploadDocuments01]');
setupFontColor('[id$=lblSelectProjectManager01]');

			}
    fc['rule_addMaterial'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "addMaterial", "addMaterial", fc['action_addMaterial']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(addMaterial) Error: " + e);
	       throw e;
	   }
	}

			fc['action_addMaterial'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				//control.Provisioning_Data_siebelCircuitID.setValue("1111");
var newrecord=factory.com_sfc_fosImpl_dataModel.createMaterialBreakdown();
newrecord.setSiebelCircuitID(data.getProvision_Data().getSiebelCircuitID().toString());
pane.Material_Record.getValue().add(newrecord);
pane.Material_Record.setSelection(newrecord);

			}
    fc['rule_calculateUnitPrice'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "calculateUnitPrice", "calculateUnitPrice", fc['action_calculateUnitPrice']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(calculateUnitPrice) Error: " + e);
	       throw e;
	   }
	}

			fc['action_calculateUnitPrice'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				/*control.Material_Record_unitPrice.setValue(parseInt()*parseInt(control.Material_Record_amount.getValue()));

logger.info(control.Material_Record_amount.getValue());
control.Material_Record_qty.getValue()
logger.info(data.getMaterial_Record().get(0).getQty());
logger.info(data.getMaterial_Record().get(0).getAmount());
logger.info(control.Material_Record_amount.
*/
//r temp=factory.com_sfc_fosImpl_dataModel.createMaterialBreakdown();
//mp.setQty()
//ntrol.
/*for(var index=0; index<data.getMaterial_Record().size(); index++) {
data.getMaterial_Record().get(index).setUnitPrice(parseInt(data.getMaterial_Record().get(index).getQty())*parseInt(data.getMaterial_Record().get(index).getAmount()));
//	control.Material_Record_unitPrice.setValue(parseInt(data.getMaterial_Record().get(index).getQty())*parseInt(data.getMaterial_Record().get(index).getAmount()));
}*/
			}
    fc['rule_calculatePrice'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "calculatePrice", "calculatePrice", fc['action_calculatePrice']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(calculatePrice) Error: " + e);
	       throw e;
	   }
	}

			fc['action_calculatePrice'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var total=0;
for(var index=0; index<data.getMaterial_Record().size(); index++) {
data.getMaterial_Record().get(index).setUnitPrice(parseInt(data.getMaterial_Record().get(index).getQty())*parseInt(data.getMaterial_Record().get(index).getAmount())+" /-");
//	control.Material_Record_unitPrice.setValue(parseInt(data.getMaterial_Record().get(index).getQty())*parseInt(data.getMaterial_Record().get(index).getAmount()));
total=total+parseInt(data.getMaterial_Record().get(index).getUnitPrice());
}
control.billingAmount.setValue(total.toString()+" /-");

/*for(var index=0; index<data.getMaterial_Record().size(); index++) {
	data.getMaterial_Record().get(index).setUnitPrice((parseInt(data.getMaterial_Record().get(index).getQty()))*(parseInt(data.getMaterial_Record().get(index).getAmount()))+" /-");	
	total=total+parseInt(data.getMaterial_Record().get(index).getUnitPrice());
}

//this.setValue(total.toString());

control.billingAmount.setValue(total.toString()+" /-");
*/
			}
	fc['action_cancel'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('cancel');
	}

	fc['action_apply'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('apply');
	}
	
	fc['action_close'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('close');
	}

	fc['action_submit'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('submit');
	}
	
	fc['action_validate'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('validate');
    }
    
    fc['action_reset'] = function(context, data, pane, control, factory, pkg, f , p) {
    	context.form.invokeAction('reset');
    }
    
    fc['generator_info'] = function() {
        return "TIBCO Forms 4.1.0 V17 compliant";
    }
};
tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw']['defineActions']();

tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw'];
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_sector_Provisioning_Data_sector__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_sector: Provisioning_Data_sector__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_sector__length", true, true);
}
	
	
	
	
fc['validation_Material_Record_siebelCircuitID_Material_Record_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 19) ? true : [context.control.getLabel(), \'19\'] : context.value.length <= 19;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_siebelCircuitID: Material_Record_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_siebelCircuitID__length", true, true);
}
	
fc['validation_Material_Record_UDM_Material_Record_UDM__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_UDM: Material_Record_UDM__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_UDM__length", true, true);
}
	
fc['validation_Provisioning_Data_floor_Provisioning_Data_floor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_floor: Provisioning_Data_floor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_floor__length", true, true);
}
	
fc['validation_Provisioning_Data_accountManager_Provisioning_Data_accountManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_accountManager: Provisioning_Data_accountManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_accountManager__length", true, true);
}
	
	
fc['validation_Provisioning_Data_clientID_Provisioning_Data_clientID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientID: Provisioning_Data_clientID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientID__length", true, true);
}
	
	
fc['validation_Provisioning_Data_buildingID_Provisioning_Data_buildingID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingID: Provisioning_Data_buildingID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingID__length", true, true);
}
	
	
fc['validation_Provisioning_Data_serviceEnd_Provisioning_Data_serviceEnd__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceEnd: Provisioning_Data_serviceEnd__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceEnd__datetime", true, true);
}
	
fc['validation_Provisioning_Data_projectManager_Provisioning_Data_projectManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_projectManager: Provisioning_Data_projectManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_projectManager__length", true, true);
}
	
fc['validation_Provisioning_Data_installDate_Provisioning_Data_installDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_installDate: Provisioning_Data_installDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_installDate__datetime", true, true);
}
	
fc['validation_Provisioning_Data_serviceType_Provisioning_Data_serviceType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceType: Provisioning_Data_serviceType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceType__length", true, true);
}
	
	
fc['validation_TaskName_TaskName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskName: TaskName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskName__length", true, true);
}
	
fc['validation_Provisioning_Data_serviceStatus_Provisioning_Data_serviceStatus__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStatus: Provisioning_Data_serviceStatus__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStatus__length", true, true);
}
	
	
fc['validation_Provisioning_Data_contractor_Provisioning_Data_contractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contractor: Provisioning_Data_contractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contractor__length", true, true);
}
	
	
fc['validation_Provisioning_Data_clientName_Provisioning_Data_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientName: Provisioning_Data_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientName__length", true, true);
}
	
fc['validation_Provisioning_Data_buildingName_Provisioning_Data_buildingName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingName: Provisioning_Data_buildingName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingName__length", true, true);
}
	
fc['validation_Provisioning_Data_requestDate_Provisioning_Data_requestDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_requestDate: Provisioning_Data_requestDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_requestDate__datetime", true, true);
}
	
fc['validation_Material_Record_amount_Material_Record_amount__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_amount: Material_Record_amount__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_amount__length", true, true);
}
	
	
	
	
fc['validation_Provisioning_Data_email_Provisioning_Data_email__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_email: Provisioning_Data_email__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_email__length", true, true);
}
	
	
fc['validation_Provisioning_Data_contactPerson_Provisioning_Data_contactPerson__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contactPerson: Provisioning_Data_contactPerson__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contactPerson__length", true, true);
}
	
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_GPSCoordinates_Provisioning_Data_GPSCoordinates__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_GPSCoordinates: Provisioning_Data_GPSCoordinates__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_GPSCoordinates__length", true, true);
}
	
	
	
fc['validation_Material_Record_qty_Material_Record_qty__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_qty: Material_Record_qty__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_qty__length", true, true);
}
	
fc['validation_Provisioning_Data_regionView_Provisioning_Data_regionView__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_regionView: Provisioning_Data_regionView__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_regionView__length", true, true);
}
	
	
	
fc['validation_Provisioning_Data_serviceStart_Provisioning_Data_serviceStart__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStart: Provisioning_Data_serviceStart__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStart__datetime", true, true);
}
	
	
	
	
	
fc['validation_Material_Record_unitPrice_Material_Record_unitPrice__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_unitPrice: Material_Record_unitPrice__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_unitPrice__length", true, true);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_mobile_Provisioning_Data_mobile__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_mobile: Provisioning_Data_mobile__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_mobile__length", true, true);
}
	
	
	
	
	
fc['validation_Material_Record_materialDescription_Material_Record_materialDescription__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 300) ? true : [context.control.getLabel(), \'300\'] : context.value.length <= 300;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_materialDescription: Material_Record_materialDescription__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Material_Record_materialDescription__length", true, true);
}
	
	
	
	
fc['validation_Provisioning_Data_siebelCircuitID_Provisioning_Data_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_siebelCircuitID: Provisioning_Data_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_siebelCircuitID__length", true, true);
}
	fc['validate_required'] = function(formId, controlName, cloneUID, listIndex) {
	var context = new Object();
    var form = tibcoforms.formCache[formId];
	var logger = tibcoforms.bridge.log_logger();
	context.control = this;
    if (listIndex == -1) {
        context.value = context.control.getValue();
        if (context.control.getStringValue)
            context.stringValue = context.control.getStringValue();
    } else {
        context.value = context.control.getValue()[listIndex];
        if (context.control.getStringValue)
            context.stringValue = context.control.getStringValue()[listIndex];
    }
    if (context.value == null)
        context.value = '';
		var controlType = context.control.getControlType();
		var strContxtControlValue = context.control.getValue();
	    if (listIndex >= 0) {
	       strContxtControlValue = strContxtControlValue[listIndex];
	    }
	    return !(context.control.getRequired() && 
                 (strContxtControlValue == null || strContxtControlValue.toString().replace(/^\s+|\s+$/gm,'').length == 0) ||
                 (("com.tibco.forms.controls.checkbox" == controlType) && 'true' != strContxtControlValue.toString().toLowerCase()));
	}
	fc['register_pkgs_and_fcts'] = function(formId) {
	   var form = tibcoforms.formCache[formId];
	   form.registerPackages(['com.sfc.fosImpl.dataModel.DataModelPackage']);
       form.registerFactories(['com.sfc.fosImpl.dataModel.DataModelFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getProvision_Data = function() {
			return this.form.dataMap['Provision_Data'].getValue();
		};
		this.setProvision_Data = function(value) {
			return this.form.dataMap['Provision_Data'].setValue(value);
		};
		this.getMaterial_Record = function() {
			return this.form.dataMap['Material_Record'].getValue();
		};
		this.getTaskName = function(useInternal) {
			return this.form.dataMap['TaskName'].getValue(useInternal);
		};
		this.setTaskName = function(value) {
			return this.form.dataMap['TaskName'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_RM6LYCXnEeiVIr-c0HRmlw']['defineValidations']();
