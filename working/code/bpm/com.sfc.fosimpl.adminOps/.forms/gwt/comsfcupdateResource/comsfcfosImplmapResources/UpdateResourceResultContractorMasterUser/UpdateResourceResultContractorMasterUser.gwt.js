

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q'] = new Object();
tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q']['defineActions'] = function() {
var fc = tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q'];
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

    fc['rule_updateResponse'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "updateResponse", "updateResponse", fc['action_updateResponse']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(updateResponse) Error: " + e);
	       throw e;
	   }
	}

			fc['action_updateResponse'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var a;

if(data.getLDAPEntry().getInput().get(0).getResponse()=="SUCCESS") {
	control.lblResponseMessage.setValue("Below Contractor Group and Groups's Master User have been added successfully");
}
else {
	control.lblResponseMessage.setValue("Error Occured: Please contact System Administrator for more details");
}
			}
    fc['rule_setupLabelBackground'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setupLabelBackground", "setupLabelBackground", fc['action_setupLabelBackground']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setupLabelBackground) Error: " + e);
	       throw e;
	   }
	}

			fc['action_setupLabelBackground'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var a;
setupFontColor('[id$=lblContractorGroupDetails]');
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
tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q']['defineActions']();

tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q'];
	
	
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
	
	
	
	
fc['validation_LDAPEntry_input_LDAPEntry_input__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "LDAPEntry_input: LDAPEntry_input__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "LDAPEntry_input__multiplicity", true, false);
}
	
	
	
	
	
	
fc['validation_ContractorGroup_emailID_ContractorGroup_emailID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_emailID: ContractorGroup_emailID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_emailID__length", true, true);
}
	
	
	
	
	
	
	
fc['validation_ContractorGroup_lastName_ContractorGroup_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_lastName: ContractorGroup_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_lastName__length", true, true);
}
	
	
fc['validation_ContractorGroup_firstName_ContractorGroup_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_firstName: ContractorGroup_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_firstName__length", true, true);
}
	
	
	
	
fc['validation_ContractorGroup_contractorGroupName_ContractorGroup_contractorGroupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_contractorGroupName: ContractorGroup_contractorGroupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ContractorGroup_contractorGroupName__length", true, true);
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
	   form.registerPackages(['com.sfc.fosImpl.dataModel.DataModelPackage', 'com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage']);
       form.registerFactories(['com.sfc.fosImpl.dataModel.DataModelFactory', 'com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getLDAPEntry = function() {
			return this.form.dataMap['LDAPEntry'].getValue();
		};
		this.setLDAPEntry = function(value) {
			return this.form.dataMap['LDAPEntry'].setValue(value);
		};
		this.getContractorGroup = function() {
			return this.form.dataMap['ContractorGroup'].getValue();
		};
		this.setContractorGroup = function(value) {
			return this.form.dataMap['ContractorGroup'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_u1yYoPtREeeupNwu8S8N4Q']['defineValidations']();
