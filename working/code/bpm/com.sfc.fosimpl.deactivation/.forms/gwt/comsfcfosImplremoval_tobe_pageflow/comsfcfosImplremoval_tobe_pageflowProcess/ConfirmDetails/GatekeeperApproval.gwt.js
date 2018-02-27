

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ'] = new Object();
tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ']['defineActions'] = function() {
var fc = tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ'];
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
else {
		this.getForm().invokeAction("submit",this,context);
	}
			}
    fc['rule_initrule1'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "initrule1", "rule1", fc['action_rule1']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(initrule1) Error: " + e);
	       throw e;
	   }
	}

			fc['action_rule1'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				//data.setTaskName("Deactivation_Process_Initiate");
if(data.getTaskName()=="Deactivation_Process_Initiate") {
pane.serviceDates.setEnabled(true);
pane.contactDetails.setEnabled(true);
pane.serviceRequest.setEnabled(true);
pane.pane8.setEnabled(true);
pane.Pane03.setEnabled(true);
pane.clientDetails.setEnabled(true);
pane.pne01.setEnabled(true);
	pane.TechnicalInfo.setEnabled(true);
	
}
else {
	pane.serviceDates.setEnabled(false);
	pane.contactDetails.setEnabled(false);
	pane.serviceRequest.setEnabled(false);
	pane.pane8.setEnabled(false);
	pane.Pane03.setEnabled(false);
	pane.clientDetails.setEnabled(false);
	pane.pne01.setEnabled(false);
	pane.TechnicalInfo.setEnabled(false);
}

			}
    fc['rule_setHeaderName'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setHeaderName", "rule11", fc['action_rule11']);
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setHeaderName", "setFontColor", fc['action_setFontColor']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setHeaderName) Error: " + e);
	       throw e;
	   }
	}

			fc['action_rule11'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				//data.setTaskName("Deactivation_Process_Initiate");
logger.info(data.getTaskName().length);
var name=data.getTaskName();
for(var index=0; index<name.length; index++) {
	name=name.replace("_"," ");
	//data.setTaskName(name);
}
logger.info(name);
pane.content.setLabel(name);

pane.pneMarginPaneCntrAgnt.setVisible(false);
pane.selectContractorAgency.setVisible(false);
control.lblContractorAgency.setVisible(false);
control.lblSelectContractor.setVisible(false);
control.addEquipment.setVisible(false);

pane.pneMarginPaneSelectContractor.setVisible(false);
pane.selectContractor.setVisible(false);

//control.lblMgmtIP.setVisible(false);
//pane.pneManagementIPs.setVisible(false);
pane.MarginPaneTechnicalInfo.setVisible(true);
//pane.pane13.setVisible(false);

if(data.getTaskName()=="Deactivation_Process_Initiate"){
control.addEquipment.setVisible(true);
}

if(data.getTaskName()=="Select_Contractor"){
pane.pneMarginPaneCntrAgnt.setVisible(false);
pane.selectContractorAgency.setVisible(false);

control.lblContractorAgency.setVisible(false);

control.lblSelectContractor.setVisible(true);


pane.pneMarginPaneSelectContractor.setVisible(true);
pane.selectContractor.setVisible(true);
}

if(data.getTaskName()=="PM_Review"){
control.lblContractorAgency.setVisible(true);
control.lblSelectContractor.setVisible(false);

pane.pneMarginPaneCntrAgnt.setVisible(true);
pane.selectContractorAgency.setVisible(true);

pane.pneMarginPaneSelectContractor.setVisible(false);
pane.selectContractor.setVisible(false);
}

			}
			fc['action_setFontColor'] = function(context, data, pane, control, factory, pkg, f , p) {
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
				data.setSelectedGroup(context.control.getValue());
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
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "trapdoorLogic", "trapdoorLogic", fc['action_trapdoorLogic']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(trapdoorLogic) Error: " + e);
	       throw e;
	   }
	}

			fc['action_trapdoorLogic'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var a;

if(data.getProvisioning_Data().getSiebelCircuitID()=='90981'){
    data.getProvisioning_Data().setClientName("Excel Cinema");
    //data.getProvisioning_Data().setProjectManager("NA");
    data.getProvisioning_Data().setAccount("NEW");
    data.getProvisioning_Data().setClientID("4536");
    data.getProvisioning_Data().setAccountManager("Alan Witsel");
    data.getProvisioning_Data().setClientName("Excel Cinema");
    data.getProvisioning_Data().setContactPerson("Alan Witsel");
    data.getProvisioning_Data().setRegionView("Nairobi");
    data.getProvisioning_Data().setContractor("NA");
     data.getProvisioning_Data().setBuildingID("1215");
    data.getProvisioning_Data().setBuildingName("Apex Global");
    data.getProvisioning_Data().setFloor("2");
    data.getProvisioning_Data().setLocation("Kenya");
    data.getProvisioning_Data().setSector("2");
    data.getProvisioning_Data().setGPSCoordinates("23");
    data.getProvisioning_Data().setMobile("9879786767");
    data.getProvisioning_Data().setBandwidthupdown("FFB5");
    data.getProvisioning_Data().setServiceType("INTERNET");
    data.getProvisioning_Data().setTechnology("FIBER");
    data.getProvisioning_Data().setEmail("alan@demogmail.com");
	
	control.Provisioning_Data_serviceStatus.setValue("Registered");
	
	control.TechnicalInfo_SFCPOPPE.setValue("Gospel");
	control.TechnicalInfo_aggPoint.setValue("Gospel");
	control.TechnicalInfo_carrierIP.setValue("10.163.184.212");
	control.TechnicalInfo_carrierVLAN.setValue("3181");
	control.TechnicalInfo_clientIP.setValue("41.90.11.200/30");
	control.TechnicalInfo_clientVLAN.setValue("765");

	var record = factory.com_sfc_fosImpl_dataModel.createEquipmentDetails();
		record.setAddress("10.215.17.163/28");
		record.setType("AR169F");
		record.setVLAN("3341");
	pane.TechnicalInfo_equipment.getValue().add(record);
	control.TechnicalInfo_modifiedDate.setValue(new Date());
} 
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
tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ']['defineActions']();

tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ'];
	
	
	
fc['validation_Provisioning_Data_clientName_Provisioning_Data_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientName: Provisioning_Data_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientName__length", true, true);
}
	
	
fc['validation_GroupNames_GroupNames__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "GroupNames: GroupNames__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "GroupNames__length", true, true);
}
	
	
	
fc['validation_Provisioning_Data_contactPerson_Provisioning_Data_contactPerson__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contactPerson: Provisioning_Data_contactPerson__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contactPerson__length", true, true);
}
	
fc['validation_TechnicalInfo_aggPoint_TechnicalInfo_aggPoint__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_aggPoint: TechnicalInfo_aggPoint__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_aggPoint__length", true, true);
}
	
	
fc['validation_TechnicalInfo_equipment_TechnicalInfo_equipment__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment: TechnicalInfo_equipment__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment__multiplicity", true, false);
}
	
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_clientID_Provisioning_Data_clientID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientID: Provisioning_Data_clientID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_clientID__length", true, true);
}
	
	
	
	
	
	
fc['validation_TechnicalInfo_portType_TechnicalInfo_portType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_portType: TechnicalInfo_portType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_portType__length", true, true);
}
	
	
	
	
	
	
	
fc['validation_TechnicalInfo_equipment_address_TechnicalInfo_equipment_address__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_address: TechnicalInfo_equipment_address__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_address__length", true, true);
}
	
fc['validation_Provisioning_Data_GPSCoordinates_Provisioning_Data_GPSCoordinates__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_GPSCoordinates: Provisioning_Data_GPSCoordinates__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_GPSCoordinates__length", true, true);
}
	
fc['validation_CommentHistory_comments_CommentHistory_comments__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 500) ? true : [context.control.getLabel(), \'500\'] : context.value.length <= 500;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_comments: CommentHistory_comments__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_comments__length", true, true);
}
	
fc['validation_Provisioning_Data_installDate_Provisioning_Data_installDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_installDate: Provisioning_Data_installDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_installDate__datetime", true, true);
}
	
	
fc['validation_Mail_Mail__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mail: Mail__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mail__length", true, true);
}
	
fc['validation_Provisioning_Data_contractor_Provisioning_Data_contractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contractor: Provisioning_Data_contractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_contractor__length", true, true);
}
	
	
	
	
	
	
	
	
fc['validation_Provisioning_Data_regionView_Provisioning_Data_regionView__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_regionView: Provisioning_Data_regionView__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_regionView__length", true, true);
}
	
fc['validation_Provisioning_Data_buildingID_Provisioning_Data_buildingID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingID: Provisioning_Data_buildingID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingID__length", true, true);
}
	
fc['validation_ContractorNames_ContractorNames__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNames: ContractorNames__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNames__length", true, true);
}
	
	
fc['validation_Provisioning_Data_sector_Provisioning_Data_sector__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_sector: Provisioning_Data_sector__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_sector__length", true, true);
}
	
	
fc['validation_TechnicalInfo_clientIP_TechnicalInfo_clientIP__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientIP: TechnicalInfo_clientIP__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientIP__length", true, true);
}
	
fc['validation_Provisioning_Data_serviceStatus_Provisioning_Data_serviceStatus__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStatus: Provisioning_Data_serviceStatus__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStatus__length", true, true);
}
	
	
	
fc['validation_Provisioning_Data_email_Provisioning_Data_email__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_email: Provisioning_Data_email__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_email__length", true, true);
}
	
	
fc['validation_TechnicalInfo_carrierIP_TechnicalInfo_carrierIP__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierIP: TechnicalInfo_carrierIP__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierIP__length", true, true);
}
	
	
fc['validation_CommentHistory_addedby_CommentHistory_addedby__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_addedby: CommentHistory_addedby__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_addedby__length", true, true);
}
	
	
fc['validation_Provisioning_Data_notesComments_Provisioning_Data_notesComments__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_notesComments: Provisioning_Data_notesComments__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_notesComments__length", true, true);
}
	
fc['validation_TechnicalInfo_equipment_VLAN_TechnicalInfo_equipment_VLAN__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_VLAN: TechnicalInfo_equipment_VLAN__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_VLAN__length", true, true);
}
	
fc['validation_CommentText_CommentText__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 500) ? true : [context.control.getLabel(), \'500\'] : context.value.length <= 500;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentText: CommentText__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentText__length", true, true);
}
	
	
fc['validation_Provisioning_Data_serviceStart_Provisioning_Data_serviceStart__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStart: Provisioning_Data_serviceStart__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceStart__datetime", true, true);
}
	
fc['validation_Provisioning_Data_buildingName_Provisioning_Data_buildingName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingName: Provisioning_Data_buildingName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_buildingName__length", true, true);
}
	
fc['validation_Provisioning_Data_location_Provisioning_Data_location__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_location: Provisioning_Data_location__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_location__length", true, true);
}
	
	
	
	
fc['validation_SelectedContractor_SelectedContractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedContractor: SelectedContractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedContractor__length", true, true);
}
	
	
	
	
fc['validation_Provisioning_Data_siebelCircuitID_Provisioning_Data_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_siebelCircuitID: Provisioning_Data_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_siebelCircuitID__length", true, true);
}
	
	
fc['validation_Provisioning_Data_floor_Provisioning_Data_floor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_floor: Provisioning_Data_floor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_floor__length", true, true);
}
	
fc['validation_TechnicalInfo_equipment_type_TechnicalInfo_equipment_type__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_type: TechnicalInfo_equipment_type__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_equipment_type__length", true, true);
}
	
fc['validation_Provisioning_Data_serviceEnd_Provisioning_Data_serviceEnd__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceEnd: Provisioning_Data_serviceEnd__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_serviceEnd__datetime", true, true);
}
	
	
fc['validation_TechnicalInfo_SFCPOPPE_TechnicalInfo_SFCPOPPE__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_SFCPOPPE: TechnicalInfo_SFCPOPPE__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_SFCPOPPE__length", true, true);
}
	
	
	
	
	
	
fc['validation_Provisioning_Data_mobile_Provisioning_Data_mobile__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_mobile: Provisioning_Data_mobile__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_mobile__length", true, true);
}
	
	
	
	
	
	
	
	
fc['validation_TechnicalInfo_clientVLAN_TechnicalInfo_clientVLAN__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientVLAN: TechnicalInfo_clientVLAN__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_clientVLAN__length", true, true);
}
	
	
fc['validation_Provisioning_Data_requestDate_Provisioning_Data_requestDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_requestDate: Provisioning_Data_requestDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_requestDate__datetime", true, true);
}
	
	
fc['validation_SelectedGroup_SelectedGroup__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedGroup: SelectedGroup__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectedGroup__length", true, true);
}
	
	
	
	
fc['validation_TechnicalInfo_port_TechnicalInfo_port__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_port: TechnicalInfo_port__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_port__length", true, true);
}
	
fc['validation_TaskName_TaskName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskName: TaskName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskName__length", true, true);
}
	
	
	
	
fc['validation_Provisioning_Data_accountManager_Provisioning_Data_accountManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_accountManager: Provisioning_Data_accountManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_accountManager__length", true, true);
}
	
fc['validation_Provisioning_Data_projectManager_Provisioning_Data_projectManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_projectManager: Provisioning_Data_projectManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Provisioning_Data_projectManager__length", true, true);
}
	
fc['validation_TechnicalInfo_modifiedBy_TechnicalInfo_modifiedBy__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedBy: TechnicalInfo_modifiedBy__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedBy__length", true, true);
}
	
fc['validation_TechnicalInfo_carrierVLAN_TechnicalInfo_carrierVLAN__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierVLAN: TechnicalInfo_carrierVLAN__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_carrierVLAN__length", true, true);
}
	
	
	
fc['validation_TechnicalInfo_modifiedDate_TechnicalInfo_modifiedDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedDate: TechnicalInfo_modifiedDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TechnicalInfo_modifiedDate__datetime", true, true);
}
	
	
	
fc['validation_CommentHistory_stepName_CommentHistory_stepName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_stepName: CommentHistory_stepName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_stepName__length", true, true);
}
	
fc['validation_CommentHistory_time_CommentHistory_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_time: CommentHistory_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_time__length", true, true);
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
		this.getGroupNames = function(useInternal) {
			return this.form.dataMap['GroupNames'].getValue(useInternal);
		};
		this.setGroupNames = function(value) {
			return this.form.dataMap['GroupNames'].setValue(value);
		};
		this.getSelectedGroup = function(useInternal) {
			return this.form.dataMap['SelectedGroup'].getValue(useInternal);
		};
		this.setSelectedGroup = function(value) {
			return this.form.dataMap['SelectedGroup'].setValue(value);
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
		this.getMasterContractor = function(useInternal) {
			return this.form.dataMap['MasterContractor'].getValue(useInternal);
		};
		this.setMasterContractor = function(value) {
			return this.form.dataMap['MasterContractor'].setValue(value);
		};
		this.getMail = function(useInternal) {
			return this.form.dataMap['Mail'].getValue(useInternal);
		};
		this.setMail = function(value) {
			return this.form.dataMap['Mail'].setValue(value);
		};
		this.getCommentText = function(useInternal) {
			return this.form.dataMap['CommentText'].getValue(useInternal);
		};
		this.setCommentText = function(value) {
			return this.form.dataMap['CommentText'].setValue(value);
		};
		this.getEscalationEmail = function(useInternal) {
			return this.form.dataMap['EscalationEmail'].getValue(useInternal);
		};
		this.setEscalationEmail = function(value) {
			return this.form.dataMap['EscalationEmail'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_1eB4gBt9Eeiw_KamrUM1SQ']['defineValidations']();
