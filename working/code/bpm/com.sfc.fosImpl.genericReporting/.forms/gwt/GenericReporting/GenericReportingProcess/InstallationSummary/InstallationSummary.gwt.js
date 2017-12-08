

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g'] = new Object();
tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g']['defineActions'] = function() {
var fc = tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g'];
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

    fc['rule_createCopy'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "createCopy", "createCopy", fc['action_createCopy']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(createCopy) Error: " + e);
	       throw e;
	   }
	}

			fc['action_createCopy'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var tmp = data.getListOfTables();
data.setListOfTablesCopy(tmp);
logger.info("Copy of the object has been made");
logger.info(data.getListOfTablesCopy().getPi_cancelled().size());
logger.info("End of the rule Form load"+data.getListOfTablesCopy().getPi_cancelled().size());

			}
    fc['rule_search'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "search", "search", fc['action_search']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(search) Error: " + e);
	       throw e;
	   }
	}

			fc['action_search'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				logger.info("Start of the rule "+data.getListOfTablesCopy().getPi_cancelled().size());

if(context.control.getValue()=="SEARCH") {
	logger.info("Start of the If condition "+data.getListOfTablesCopy().getPi_cancelled().size());
	
	data.setListOfTables(null);
	logger.info("End of the If condition "+data.getListOfTablesCopy().getPi_cancelled().size());
}
else {		
	
	data.setListOfTables(data.getListOfTablesCopy());
}
logger.info("End of the script"+data.getListOfTablesCopy().getPi_cancelled().size());
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
tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g']['defineActions']();

tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g'];
	
fc['validation_ListOfTables_pi_started_ListOfTables_pi_started__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_started: ListOfTables_pi_started__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_started__multiplicity", true, false);
}
	
	
	
	
	
fc['validation_ListOfTables_pi_complete_ListOfTables_pi_complete__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_complete: ListOfTables_pi_complete__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_complete__multiplicity", true, false);
}
	
fc['validation_ListOfTables_pi_cancelled_ListOfTables_pi_cancelled__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_cancelled: ListOfTables_pi_cancelled__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_cancelled__multiplicity", true, false);
}
	
	
	
	
	
	
	
	
fc['validation_ListOfTables_pi_halted_ListOfTables_pi_halted__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_halted: ListOfTables_pi_halted__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ListOfTables_pi_halted__multiplicity", true, false);
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
	   form.registerPackages(['com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.XsdPackage']);
       form.registerFactories(['com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.XsdFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getListOfTables = function() {
			return this.form.dataMap['ListOfTables'].getValue();
		};
		this.setListOfTables = function(value) {
			return this.form.dataMap['ListOfTables'].setValue(value);
		};
		this.getListOfTablesCopy = function() {
			return this.form.dataMap['ListOfTablesCopy'].getValue();
		};
		this.setListOfTablesCopy = function(value) {
			return this.form.dataMap['ListOfTablesCopy'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_fVOuANwGEeewD-vyNDe4_g']['defineValidations']();
