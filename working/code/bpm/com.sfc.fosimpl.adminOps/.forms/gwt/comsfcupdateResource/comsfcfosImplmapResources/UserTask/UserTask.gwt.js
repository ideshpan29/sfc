

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg'] = new Object();
tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg']['defineActions'] = function() {
var fc = tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg'];
    fc['rule_cancel'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "cancel", "cancel", fc['action_cancel']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(cancel) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_submit'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "submit", "submit", fc['action_submit']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(submit) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_updateDecision'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "updateDecision", "updateDecision", fc['action_updateDecision']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(updateDecision) Error: " + e);
	       throw e;
	   }
	}

			fc['action_updateDecision'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setDecision(context.control.getValue());
if(context.control.getValue()=="BUSINESS") {
	pane.BPMUsers.setVisible(false);
	pane.pneAddBusinessUsers.setVisible(true);
	pane.BusinessUser_createresourcerequest.getValue().clear();
	pane.pneContractorMaster.setVisible(false);
	pane.pneButton01.setVisible(true);
	
}
else if(context.control.getValue()=="CONTRACTOR_MASTER") {
	pane.BPMUsers.setVisible(false);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(true);
	data.getContractorGroup().setMasterUser("Y");
}
else if(context.control.getValue()=="USERS_LIST") {
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(false);
	
	
	//control.LoginName.setValue("ABC");
	listUsers(factory,pane,control,logger,"http://rbapat-t470:9801/getusers","?emailid="+control.LoginName.getValue());
	
	
	pane.BPMUsers.getValue().clear();
	pane.BPMUsers.setVisible(true);
	
	
}
else {
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(false);
}

			}
    fc['rule_setPanesVisibility'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setPanesVisibility", "setPanesVisibility", fc['action_setPanesVisibility']);
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setPanesVisibility", "SetLabelBackground", fc['action_SetLabelBackground']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setPanesVisibility) Error: " + e);
	       throw e;
	   }
	}

			fc['action_setPanesVisibility'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				//control.ContractorMasterUserFlag.setValue(false);

if(control.ContractorMasterUserFlag.getValue()==true) {
	pane.pneOnBoardUserDetailsParent.setVisible(false);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(false);
	pane.pneContractorUserDetails.setVisible(true);
	pane.ContractorNormalUsers.setVisible(true);
	pane.pane3.setVisible(false);
}
else if(control.ContractorMasterUserFlag.getValue()==false) {
	pane.pneOnBoardUserDetailsParent.setVisible(true);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(false);
	pane.pneContractorUserDetails.setVisible(false);
	pane.ContractorNormalUsers.setVisible(false);
	
	pane.pneButton01.setVisible(false);
}


/*
control.ContractorMasterUserFlag.setValue(false);

if(control.ContractorMasterUserFlag.getValue()==true) {
	pane.pneContractorUserDetails.setVisible(true);
	control.onboardUsers.setVisible(false);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(false);
	pane.BusinessUser_createresourcerequest.setVisible(false);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.ContractorNormalUsers.setVisible(true);
	pane.pane3.setVisible(false);
}
else if(control.ContractorMasterUserFlag.getValue()==false) {
	control.onboardUsers.setVisible(true);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.pneContractorMaster.setVisible(false);
	pane.pneContractorUserDetails.setVisible(false);
	pane.BusinessUser_createresourcerequest.setVisible(true);
	pane.pneAddBusinessUsers.setVisible(false);
	pane.ContractorNormalUsers.setVisible(false);
	pane.pneButton01.setVisible(false);
}
*/
			}
			fc['action_SetLabelBackground'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				setupFontColor('[id$=lblSelectOption]');
setupFontColor('[id$=contractorGroupDetails]');
setupFontColor('[id$=contractorUsers]');

			}
    fc['rule_addNewRow'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "addNewRow", "addNewRow", fc['action_addNewRow']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(addNewRow) Error: " + e);
	       throw e;
	   }
	}

			fc['action_addNewRow'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				pane.BusinessUser_createresourcerequest.getValue().add(factory.com_tibco_schemas_SFC_FOS_BPM_SharedResources_SchemaDefinitions_Schema.createCreateresourcerequestType());



			}
    fc['rule_deleteSelectedRow'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "deleteSelectedRow", "deleteSelectedRow", fc['action_deleteSelectedRow']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(deleteSelectedRow) Error: " + e);
	       throw e;
	   }
	}

			fc['action_deleteSelectedRow'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				if(pane.BusinessUser_createresourcerequest.getSelection()== null) {
	alert("Please select one row for deletion.");
}
else {
	pane.BusinessUser_createresourcerequest.getValue().remove(pane.BusinessUser_createresourcerequest.getSelection());
}
			}
    fc['rule_addNewRowContractors'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "addNewRowContractors", "addNewRowContractors", fc['action_addNewRowContractors']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(addNewRowContractors) Error: " + e);
	       throw e;
	   }
	}

			fc['action_addNewRowContractors'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var a;
pane.ContractorNormalUsers.getValue().add(data.getContractorSingleUser());


			}
    fc['rule_deleteSelectedRowContractors'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "deleteSelectedRowContractors", "deleteSelectedRowContractors", fc['action_deleteSelectedRowContractors']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(deleteSelectedRowContractors) Error: " + e);
	       throw e;
	   }
	}

			fc['action_deleteSelectedRowContractors'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				pane.ContractorNormalUsers.getValue().remove(pane.ContractorNormalUsers.getSelection());

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
tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg']['defineActions']();

tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg'];
	
fc['validation_BPMUsers_name_BPMUsers_name__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_name: BPMUsers_name__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_name__length", true, true);
}
	
fc['validation_ContractorNormalUsers_firstName_ContractorNormalUsers_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_firstName: ContractorNormalUsers_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_firstName__length", true, true);
}
	
	
	
	
	
	
fc['validation_BPMUsers_groupName_BPMUsers_groupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_groupName: BPMUsers_groupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_groupName__length", true, true);
}
	
	
	
fc['validation_ContractorGroup_lastName_ContractorGroup_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_lastName: ContractorGroup_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_lastName__length", true, true);
}
	
	
	
	
	
fc['validation_BPMUsers_addedOn_BPMUsers_addedOn__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_addedOn: BPMUsers_addedOn__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_addedOn__length", true, true);
}
	
	
	
	
fc['validation_ContractorGroup_contractorGroupName_ContractorGroup_contractorGroupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_contractorGroupName: ContractorGroup_contractorGroupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_contractorGroupName__length", true, true);
}
	
	
	
	
	
fc['validation_BusinessUser_createresourcerequest_BusinessUser_createresourcerequest__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BusinessUser_createresourcerequest: BusinessUser_createresourcerequest__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BusinessUser_createresourcerequest__multiplicity", true, false);
}
	
	
	
fc['validation_ContractorNormalUsers_masterUser_ContractorNormalUsers_masterUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_masterUser: ContractorNormalUsers_masterUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_masterUser__length", true, true);
}
	
	
	
	
	
fc['validation_BPMUsers_addedBy_BPMUsers_addedBy__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_addedBy: BPMUsers_addedBy__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BPMUsers_addedBy__length", true, true);
}
	
fc['validation_ContractorGroup_firstName_ContractorGroup_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_firstName: ContractorGroup_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_firstName__length", true, true);
}
	
	
fc['validation_ContractorGroup_masterUser_ContractorGroup_masterUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_masterUser: ContractorGroup_masterUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_masterUser__length", true, true);
}
	
	
	
	
	
fc['validation_ContractorGroup_emailID_ContractorGroup_emailID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_emailID: ContractorGroup_emailID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_emailID__length", true, true);
}
	
	
	
fc['validation_ContractorGroup_loginName_ContractorGroup_loginName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_loginName: ContractorGroup_loginName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_loginName__length", true, true);
}
	
	
	
fc['validation_ContractorNormalUsers_lastName_ContractorNormalUsers_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_lastName: ContractorNormalUsers_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_lastName__length", true, true);
}
	
	
fc['validation_ContractorNormalUsers_emailID_ContractorNormalUsers_emailID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_emailID: ContractorNormalUsers_emailID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_emailID__length", true, true);
}
	
fc['validation_ContractorNormalUsers_contractorGroupName_ContractorNormalUsers_contractorGroupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_contractorGroupName: ContractorNormalUsers_contractorGroupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_contractorGroupName__length", true, true);
}
	
	
	
	
	
	
fc['validation_LoginName_LoginName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "LoginName: LoginName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "LoginName__length", true, true);
}
	
	
	
fc['validation_ContractorNormalUsers_loginName_ContractorNormalUsers_loginName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_loginName: ContractorNormalUsers_loginName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_loginName__length", true, true);
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
	   form.registerPackages(['com.sfc.fosImpl.adminOps.dataModel.DataModelPackage', 'com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage', 'com.sfc.fosImpl.dataModel.DataModelPackage']);
       form.registerFactories(['com.sfc.fosImpl.adminOps.dataModel.DataModelFactory', 'com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory', 'com.sfc.fosImpl.dataModel.DataModelFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getResourceList = function() {
			return this.form.dataMap['resourceList'].getValue();
		};
		this.getGroupName = function(useInternal) {
			return this.form.dataMap['GroupName'].getValue(useInternal);
		};
		this.setGroupName = function(value) {
			return this.form.dataMap['GroupName'].setValue(value);
		};
		this.getContractorGroup = function() {
			return this.form.dataMap['ContractorGroup'].getValue();
		};
		this.setContractorGroup = function(value) {
			return this.form.dataMap['ContractorGroup'].setValue(value);
		};
		this.getDecision = function(useInternal) {
			return this.form.dataMap['decision'].getValue(useInternal);
		};
		this.setDecision = function(value) {
			return this.form.dataMap['decision'].setValue(value);
		};
		this.getBusinessUser = function() {
			return this.form.dataMap['BusinessUser'].getValue();
		};
		this.setBusinessUser = function(value) {
			return this.form.dataMap['BusinessUser'].setValue(value);
		};
		this.getContractorMasterUserFlag = function(useInternal) {
			return this.form.dataMap['ContractorMasterUserFlag'].getValue(useInternal);
		};
		this.setContractorMasterUserFlag = function(value) {
			return this.form.dataMap['ContractorMasterUserFlag'].setValue(value);
		};
		this.getContractorNormalUsers = function() {
			return this.form.dataMap['ContractorNormalUsers'].getValue();
		};
		this.getBPMUsers = function() {
			return this.form.dataMap['BPMUsers'].getValue();
		};
		this.getLoginName = function(useInternal) {
			return this.form.dataMap['LoginName'].getValue(useInternal);
		};
		this.setLoginName = function(value) {
			return this.form.dataMap['LoginName'].setValue(value);
		};
		this.getContractorSingleUser = function() {
			return this.form.dataMap['ContractorSingleUser'].getValue();
		};
		this.setContractorSingleUser = function(value) {
			return this.form.dataMap['ContractorSingleUser'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_TkvkgPk8EeeqiZsRWP-qWg']['defineValidations']();
