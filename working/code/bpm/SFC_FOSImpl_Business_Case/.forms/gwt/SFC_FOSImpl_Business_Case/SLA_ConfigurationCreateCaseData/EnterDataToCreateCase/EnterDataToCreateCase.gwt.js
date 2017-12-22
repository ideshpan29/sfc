

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA'] = new Object();
tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA']['defineActions'] = function() {
var fc = tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA'];
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

    fc['rule_setVisible2'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setVisible2", "rule11", fc['action_rule11']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setVisible2) Error: " + e);
	       throw e;
	   }
	}

			fc['action_rule11'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				logger.info(data.getSLA_Configuration().getEmailTo()+'Outside');
if(data.getSLA_Configuration().getEmailTo()=='PM'){
logger.info(data.getSLA_Configuration().getEmailTo()+'Inside');
control.SLA_Configuration_emailConfig.setVisible(false);
}
else{
control.SLA_Configuration_emailConfig.setVisible(true);
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
tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA']['defineActions']();

tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA'];
	
	
	
	
	
fc['validation_SLA_Configuration_taskName_SLA_Configuration_taskName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_taskName: SLA_Configuration_taskName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_taskName__length", true, true);
}
	
fc['validation_SLA_Configuration_SLA_Deadline_SLA_Configuration_SLA_Deadline__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_SLA_Deadline: SLA_Configuration_SLA_Deadline__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_SLA_Deadline__length", true, true);
}
	
fc['validation_SLA_Configuration_taskConfig_SLA_Configuration_taskConfig__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_taskConfig: SLA_Configuration_taskConfig__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_taskConfig__length", true, true);
}
	
	
	
fc['validation_SLA_Configuration_SLALevel_SLA_Configuration_SLALevel__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkNumberConstraint(context.stringValue, 19, 0) ? true : [context.control.getLabel(), \'19\'] : !isNaN(context.value) && this.getForm().numberFormat(context.value,19, 0);';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_SLALevel: SLA_Configuration_SLALevel__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_SLALevel__length", true, true);
}
	
	
fc['validation_SLA_Configuration_processName_SLA_Configuration_processName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_processName: SLA_Configuration_processName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_processName__length", true, true);
}
	
	
	
fc['validation_SLA_Configuration_emailConfig_SLA_Configuration_emailConfig__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_emailConfig: SLA_Configuration_emailConfig__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SLA_Configuration_emailConfig__length", true, true);
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
	   form.registerPackages(['com.example.sfc_provisioningbom.Sfc_provisioningbomPackage']);
       form.registerFactories(['com.example.sfc_provisioningbom.Sfc_provisioningbomFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getSLA_Configuration = function() {
			return this.form.dataMap['SLA_Configuration'].getValue();
		};
		this.setSLA_Configuration = function(value) {
			return this.form.dataMap['SLA_Configuration'].setValue(value);
		};
	}
	   
            
	   
	   
};
tibcoforms.formCode['_HOs-AOY6Eeep9dkvO_z3LA']['defineValidations']();
