

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A'] = new Object();
tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A']['defineActions'] = function() {
var fc = tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A'];
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
	//pane.resourceList.setVisible(true);
	pane.BusinessUser.setVisible(true);
	pane.ContractorGroup.setVisible(false);
}
else if(context.control.getValue()=="CONTRACTOR_MASTER") {
	pane.ContractorGroup.setVisible(true);
	data.getContractorGroup().setMasterUser("Y");
}

			}
    fc['rule_setPanesVisibility'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setPanesVisibility", "setPanesVisibility", fc['action_setPanesVisibility']);
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
				if(control.ContractorMasterUserFlag.getValue()==true) {
	control.onboardUsers.setVisible(false);
	pane.BusinessUser.setVisible(false);
	pane.ContractorGroup.setVisible(false);
	pane.ContractorNormalUsers.setVisible(true);
}
else if(control.ContractorMasterUserFlag.getValue()==false) {
	control.onboardUsers.setVisible(true);
	pane.ContractorNormalUsers.setVisible(false);
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
tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A']['defineActions']();

tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A'];
	
	
fc['validation_ContractorNormalUsers_firstName_ContractorNormalUsers_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_firstName: ContractorNormalUsers_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_firstName__length", true, true);
}
	
fc['validation_ContractorNormalUsers_loginName_ContractorNormalUsers_loginName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_loginName: ContractorNormalUsers_loginName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_loginName__length", true, true);
}
	
fc['validation_BusinessUser_createresourcerequest_BusinessUser_createresourcerequest__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BusinessUser_createresourcerequest: BusinessUser_createresourcerequest__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "BusinessUser_createresourcerequest__multiplicity", true, false);
}
	
	
	
fc['validation_ContractorGroup_firstName_ContractorGroup_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_firstName: ContractorGroup_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_firstName__length", true, true);
}
	
	
	
	
fc['validation_ContractorNormalUsers_contractorGroupName_ContractorNormalUsers_contractorGroupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_contractorGroupName: ContractorNormalUsers_contractorGroupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_contractorGroupName__length", true, true);
}
	
fc['validation_ContractorNormalUsers_lastName_ContractorNormalUsers_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_lastName: ContractorNormalUsers_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_lastName__length", true, true);
}
	
	
fc['validation_ContractorGroup_emailID_ContractorGroup_emailID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_emailID: ContractorGroup_emailID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_emailID__length", true, true);
}
	
fc['validation_ContractorNormalUsers_emailID_ContractorNormalUsers_emailID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_emailID: ContractorNormalUsers_emailID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_emailID__length", true, true);
}
	
	
	
fc['validation_ContractorNormalUsers_masterUser_ContractorNormalUsers_masterUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_masterUser: ContractorNormalUsers_masterUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorNormalUsers_masterUser__length", true, true);
}
	
fc['validation_ContractorGroup_contractorGroupName_ContractorGroup_contractorGroupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_contractorGroupName: ContractorGroup_contractorGroupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_contractorGroupName__length", true, true);
}
	
	
	
fc['validation_ContractorGroup_loginName_ContractorGroup_loginName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_loginName: ContractorGroup_loginName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_loginName__length", true, true);
}
	
	
	
	
	
	
	
	
	
fc['validation_ContractorGroup_masterUser_ContractorGroup_masterUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_masterUser: ContractorGroup_masterUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_masterUser__length", true, true);
}
	
	
	
	
fc['validation_ContractorGroup_lastName_ContractorGroup_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_lastName: ContractorGroup_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_lastName__length", true, true);
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
	   form.registerPackages(['com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage', 'com.sfc.fosImpl.adminOps.dataModel.DataModelPackage', 'com.example.sfc_provisioningbom.Sfc_provisioningbomPackage']);
       form.registerFactories(['com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory', 'com.sfc.fosImpl.adminOps.dataModel.DataModelFactory', 'com.example.sfc_provisioningbom.Sfc_provisioningbomFactory']);
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
	}
	   
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_SrPVQPEbEeeW2tm46yiN8A']['defineValidations']();
