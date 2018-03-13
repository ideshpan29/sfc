

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw'] = new Object();
tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw'];
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
				if(data.getTaskName()=='PM_Review'){
	if((control.contractorAgency.getValue()==null) || (control.contractorAgency.getValue() =="" )) {
		alert("Please select the Contractor Agency before proceeding.");
	}
	else {
		this.getForm().invokeAction("submit",this,context);
	}
	
}
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
    fc['rule_selectGroup'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "selectGroup", "rule12", fc['action_rule12']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(selectGroup) Error: " + e);
	       throw e;
	   }
	}

			fc['action_rule12'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setSelectedContractorGroup(context.control.getValue());
			}
    fc['rule_selectContractor'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "selectContractor", "rule13", fc['action_rule13']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(selectContractor) Error: " + e);
	       throw e;
	   }
	}

			fc['action_rule13'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setSelectedContractor(context.control.getValue());
control.Provisioning_Data_contractor.setValue(context.control.getValue());

			}
    fc['rule_addEquipment'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "addEquipment", "equipments", fc['action_equipments']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(addEquipment) Error: " + e);
	       throw e;
	   }
	}

			fc['action_equipments'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var Record=factory.com_sfc_fosImpl_dataModel.createEquipmentDetails();
pane.TechnicalInfo_equipment.getValue().add(Record);
//pane.TechnicalInfo_equipment.setSelection(Record);

			}
    fc['rule_trapdoorLogic'] = function(formId, context, thisObj) {
	   try {
			return;
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(trapdoorLogic) Error: " + e);
	       throw e;
	   }
	}

			fc['action_trapdoorLogic'] = function(context, data, pane, control, factory, pkg, f , p) {
				return;
			}
    fc['rule_updatePM'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "updatePM", "updatePM", fc['action_updatePM']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(updatePM) Error: " + e);
	       throw e;
	   }
	}

			fc['action_updatePM'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setSelectedPM(context.control.getValue());
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
tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw']['defineActions']();

tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw'];
	
	
	
fc['validation_TechnicalInfo_aggPoint_TechnicalInfo_aggPoint__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_aggPoint: TechnicalInfo_aggPoint__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_aggPoint__length", true, true);
}
	
	
	
	
	
fc['validation_Provisioning_Data_contactPerson_Provisioning_Data_contactPerson__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contactPerson: Provisioning_Data_contactPerson__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contactPerson__length", true, true);
}
	
	
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_installDate_Provisioning_Data_installDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_installDate: Provisioning_Data_installDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_installDate__datetime", true, true);
}
	
	
	
	
	
	
	
	
fc['validation_TechnicalInfo_equipment_TechnicalInfo_equipment__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment: TechnicalInfo_equipment__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment__multiplicity", true, false);
}
	
fc['validation_TechnicalInfo_equipment_address_TechnicalInfo_equipment_address__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_address: TechnicalInfo_equipment_address__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_address__length", true, true);
}
	
	
fc['validation_CommentHistory_time_CommentHistory_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_time: CommentHistory_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_time__length", true, true);
}
	
	
	
	
	
fc['validation_Provisioning_Data_projectManager_Provisioning_Data_projectManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_projectManager: Provisioning_Data_projectManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_projectManager__length", true, true);
}
	
	
fc['validation_TechnicalInfo_carrierIP_TechnicalInfo_carrierIP__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierIP: TechnicalInfo_carrierIP__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierIP__length", true, true);
}
	
	
fc['validation_TechnicalInfo_SFCPOPPE_TechnicalInfo_SFCPOPPE__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_SFCPOPPE: TechnicalInfo_SFCPOPPE__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_SFCPOPPE__length", true, true);
}
	
	
	
fc['validation_Provisioning_Data_siebelCircuitID_Provisioning_Data_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_siebelCircuitID: Provisioning_Data_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_siebelCircuitID__length", true, true);
}
	
	
	
	
	
fc['validation_TechnicalInfo_clientIP_TechnicalInfo_clientIP__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientIP: TechnicalInfo_clientIP__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientIP__length", true, true);
}
	
	
	
fc['validation_CommentHistory_comments_CommentHistory_comments__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 500) ? true : [context.control.getLabel(), \'500\'] : context.value.length <= 500;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_comments: CommentHistory_comments__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_comments__length", true, true);
}
	
	
fc['validation_Provisioning_Data_requestDate_Provisioning_Data_requestDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_requestDate: Provisioning_Data_requestDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_requestDate__datetime", true, true);
}
	
fc['validation_CommentHistory_stepName_CommentHistory_stepName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_stepName: CommentHistory_stepName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_stepName__length", true, true);
}
	
fc['validation_Provisioning_Data_accountManager_Provisioning_Data_accountManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_accountManager: Provisioning_Data_accountManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_accountManager__length", true, true);
}
	
	
fc['validation_Provisioning_Data_contractor_Provisioning_Data_contractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contractor: Provisioning_Data_contractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contractor__length", true, true);
}
	
	
	
	
fc['validation_TechnicalInfo_modifiedBy_TechnicalInfo_modifiedBy__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedBy: TechnicalInfo_modifiedBy__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedBy__length", true, true);
}
	
	
	
fc['validation_SelectedContractor_SelectedContractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedContractor: SelectedContractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedContractor__length", true, true);
}
	
	
	
	
	
	
fc['validation_Provisioning_Data_serviceStart_Provisioning_Data_serviceStart__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStart: Provisioning_Data_serviceStart__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStart__datetime", true, true);
}
	
	
fc['validation_TechnicalInfo_clientVLAN_TechnicalInfo_clientVLAN__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientVLAN: TechnicalInfo_clientVLAN__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientVLAN__length", true, true);
}
	
	
	
	
fc['validation_EscalationEmail_EscalationEmail__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "EscalationEmail: EscalationEmail__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "EscalationEmail__length", true, true);
}
	
	
	
fc['validation_CommentText_CommentText__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 500) ? true : [context.control.getLabel(), \'500\'] : context.value.length <= 500;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentText: CommentText__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentText__length", true, true);
}
	
fc['validation_GroupNames_GroupNames__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "GroupNames: GroupNames__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "GroupNames__length", true, true);
}
	
	
	
	
fc['validation_CommentHistory_addedby_CommentHistory_addedby__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_addedby: CommentHistory_addedby__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_addedby__length", true, true);
}
	
	
	
fc['validation_UID_UID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "UID: UID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "UID__length", true, true);
}
	
fc['validation_Provisioning_Data_clientID_Provisioning_Data_clientID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientID: Provisioning_Data_clientID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientID__length", true, true);
}
	
	
fc['validation_TechnicalInfo_equipment_VLAN_TechnicalInfo_equipment_VLAN__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_VLAN: TechnicalInfo_equipment_VLAN__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_VLAN__length", true, true);
}
	
fc['validation_xDMSURL_xDMSURL__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 300) ? true : [context.control.getLabel(), \'300\'] : context.value.length <= 300;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "xDMSURL: xDMSURL__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "xDMSURL__length", true, true);
}
	
	
fc['validation_TechnicalInfo_carrierVLAN_TechnicalInfo_carrierVLAN__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierVLAN: TechnicalInfo_carrierVLAN__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierVLAN__length", true, true);
}
	
	
fc['validation_Provisioning_Data_GPSCoordinates_Provisioning_Data_GPSCoordinates__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_GPSCoordinates: Provisioning_Data_GPSCoordinates__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_GPSCoordinates__length", true, true);
}
	
fc['validation_Provisioning_Data_sector_Provisioning_Data_sector__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_sector: Provisioning_Data_sector__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_sector__length", true, true);
}
	
fc['validation_TechnicalInfo_portType_TechnicalInfo_portType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_portType: TechnicalInfo_portType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_portType__length", true, true);
}
	
	
	
	
	
	
fc['validation_TechnicalInfo_modifiedDate_TechnicalInfo_modifiedDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedDate: TechnicalInfo_modifiedDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedDate__datetime", true, true);
}
	
fc['validation_Provisioning_Data_buildingName_Provisioning_Data_buildingName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingName: Provisioning_Data_buildingName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingName__length", true, true);
}
	
fc['validation_SelectedContractorGroup_SelectedContractorGroup__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedContractorGroup: SelectedContractorGroup__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedContractorGroup__length", true, true);
}
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_regionView_Provisioning_Data_regionView__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_regionView: Provisioning_Data_regionView__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_regionView__length", true, true);
}
	
	
fc['validation_FolderID_FolderID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "FolderID: FolderID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "FolderID__length", true, true);
}
	
	
fc['validation_Provisioning_Data_clientName_Provisioning_Data_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientName: Provisioning_Data_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientName__length", true, true);
}
	
	
	
fc['validation_TechnicalInfo_port_TechnicalInfo_port__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_port: TechnicalInfo_port__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_port__length", true, true);
}
	
	
	
	
	
fc['validation_Provisioning_Data_mobile_Provisioning_Data_mobile__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_mobile: Provisioning_Data_mobile__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_mobile__length", true, true);
}
	
	
fc['validation_Provisioning_Data_email_Provisioning_Data_email__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_email: Provisioning_Data_email__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_email__length", true, true);
}
	
fc['validation_ContractorNames_ContractorNames__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNames: ContractorNames__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNames__length", true, true);
}
	
fc['validation_Provisioning_Data_serviceEnd_Provisioning_Data_serviceEnd__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceEnd: Provisioning_Data_serviceEnd__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceEnd__datetime", true, true);
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
		this.getProvisioning_Data = function() {
			return this.form.dataMap['Provisioning_Data'].getValue();
		};
		this.setProvisioning_Data = function(value) {
			return this.form.dataMap['Provisioning_Data'].setValue(value);
		};
		this.getTechnicalInfo = function() {
			return this.form.dataMap['TechnicalInfo'].getValue();
		};
		this.setTechnicalInfo = function(value) {
			return this.form.dataMap['TechnicalInfo'].setValue(value);
		};
		this.getTaskName = function(useInternal) {
			return this.form.dataMap['TaskName'].getValue(useInternal);
		};
		this.setTaskName = function(value) {
			return this.form.dataMap['TaskName'].setValue(value);
		};
		this.getSelectedContractor = function(useInternal) {
			return this.form.dataMap['SelectedContractor'].getValue(useInternal);
		};
		this.setSelectedContractor = function(value) {
			return this.form.dataMap['SelectedContractor'].setValue(value);
		};
		this.getContractorNames = function(useInternal) {
			return this.form.dataMap['ContractorNames'].getValue(useInternal);
		};
		this.setContractorNames = function(value) {
			return this.form.dataMap['ContractorNames'].setValue(value);
		};
		this.getCommentHistory = function() {
			return this.form.dataMap['CommentHistory'].getValue();
		};
		this.getCommentText = function(useInternal) {
			return this.form.dataMap['CommentText'].getValue(useInternal);
		};
		this.setCommentText = function(value) {
			return this.form.dataMap['CommentText'].setValue(value);
		};
		this.getSelectedPM = function(useInternal) {
			return this.form.dataMap['SelectedPM'].getValue(useInternal);
		};
		this.setSelectedPM = function(value) {
			return this.form.dataMap['SelectedPM'].setValue(value);
		};
		this.getPM_List = function(useInternal) {
			return this.form.dataMap['PM_List'].getValue(useInternal);
		};
		this.setPM_List = function(value) {
			return this.form.dataMap['PM_List'].setValue(value);
		};
		this.getGroupNames = function(useInternal) {
			return this.form.dataMap['GroupNames'].getValue(useInternal);
		};
		this.setGroupNames = function(value) {
			return this.form.dataMap['GroupNames'].setValue(value);
		};
		this.getSelectedContractorGroup = function(useInternal) {
			return this.form.dataMap['SelectedContractorGroup'].getValue(useInternal);
		};
		this.setSelectedContractorGroup = function(value) {
			return this.form.dataMap['SelectedContractorGroup'].setValue(value);
		};
		this.getGrpNames = function(useInternal) {
			return this.form.dataMap['GrpNames'].getValue(useInternal);
		};
		this.setGrpNames = function(value) {
			return this.form.dataMap['GrpNames'].setValue(value);
		};
		this.getMgmtIPFlag = function(useInternal) {
			return this.form.dataMap['mgmtIPFlag'].getValue(useInternal);
		};
		this.setMgmtIPFlag = function(value) {
			return this.form.dataMap['mgmtIPFlag'].setValue(value);
		};
		this.getEquipmentFlag = function(useInternal) {
			return this.form.dataMap['equipmentFlag'].getValue(useInternal);
		};
		this.setEquipmentFlag = function(value) {
			return this.form.dataMap['equipmentFlag'].setValue(value);
		};
		this.getFolderID = function(useInternal) {
			return this.form.dataMap['FolderID'].getValue(useInternal);
		};
		this.setFolderID = function(value) {
			return this.form.dataMap['FolderID'].setValue(value);
		};
		this.getXDMSURL = function(useInternal) {
			return this.form.dataMap['xDMSURL'].getValue(useInternal);
		};
		this.setXDMSURL = function(value) {
			return this.form.dataMap['xDMSURL'].setValue(value);
		};
		this.getUID = function(useInternal) {
			return this.form.dataMap['UID'].getValue(useInternal);
		};
		this.setUID = function(value) {
			return this.form.dataMap['UID'].setValue(value);
		};
		this.getTechnologyArray = function(useInternal) {
			return this.form.dataMap['TechnologyArray'].getValue(useInternal);
		};
		this.setTechnologyArray = function(value) {
			return this.form.dataMap['TechnologyArray'].setValue(value);
		};
		this.getServiceTypeArray = function(useInternal) {
			return this.form.dataMap['ServiceTypeArray'].getValue(useInternal);
		};
		this.setServiceTypeArray = function(value) {
			return this.form.dataMap['ServiceTypeArray'].setValue(value);
		};
		this.getEquipmentArray = function(useInternal) {
			return this.form.dataMap['EquipmentArray'].getValue(useInternal);
		};
		this.setEquipmentArray = function(value) {
			return this.form.dataMap['EquipmentArray'].setValue(value);
		};
		this.getServiceStatusArray = function(useInternal) {
			return this.form.dataMap['ServiceStatusArray'].getValue(useInternal);
		};
		this.setServiceStatusArray = function(value) {
			return this.form.dataMap['ServiceStatusArray'].setValue(value);
		};
		this.getBandwidthArray = function(useInternal) {
			return this.form.dataMap['BandwidthArray'].getValue(useInternal);
		};
		this.setBandwidthArray = function(value) {
			return this.form.dataMap['BandwidthArray'].setValue(value);
		};
		this.getAccountTypeArray = function(useInternal) {
			return this.form.dataMap['AccountTypeArray'].getValue(useInternal);
		};
		this.setAccountTypeArray = function(value) {
			return this.form.dataMap['AccountTypeArray'].setValue(value);
		};
		this.getBuildingFloorArray = function(useInternal) {
			return this.form.dataMap['BuildingFloorArray'].getValue(useInternal);
		};
		this.setBuildingFloorArray = function(value) {
			return this.form.dataMap['BuildingFloorArray'].setValue(value);
		};
		this.getBuildingIDArray = function(useInternal) {
			return this.form.dataMap['BuildingIDArray'].getValue(useInternal);
		};
		this.setBuildingIDArray = function(value) {
			return this.form.dataMap['BuildingIDArray'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_ROzBwCXnEeiVIr-c0HRmlw']['defineValidations']();
