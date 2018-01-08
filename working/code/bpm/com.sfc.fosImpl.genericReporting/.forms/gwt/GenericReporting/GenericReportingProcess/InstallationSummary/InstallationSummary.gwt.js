

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg'] = new Object();
tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg']['defineActions'] = function() {
var fc = tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg'];
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

    fc['rule_loadProcessList'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "loadProcessList", "loadProcessList", fc['action_loadProcessList']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(loadProcessList) Error: " + e);
	       throw e;
	   }
	}

			fc['action_loadProcessList'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setFetchDataURL("http://rajagtap-t470:9801/");
data.setIsGateKeeper("true");




ldPrcNames(control,logger,data.getFetchDataURL(),"getProcessnames");
pane.pneSearchCriteria.setVisible(false);




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
				
if (control.rdioSearchOption.getValue()=="SEARCH")
{
	pane.CancelledInstances.getValue().clear();
	pane.CompletedInstances.getValue().clear();
	pane.HaltedInstances.getValue().clear();
	pane.StartedInstances.getValue().clear();
	pane.pneSearchCriteria.setVisible(true);
}
else if (control.rdioSearchOption.getValue()=="VIEWALL")
{
	ldPrcData(factory,pane,control,logger,data.getFetchDataURL(),"getProcessInstances?processname="+control.optnSelectProcess.getValue(),data.getIsGateKeeper(),data.getLoginName());
	pane.pneSearchCriteria.setVisible(false);
	control.optnSearchCriteria.setValue(null);
	control.txtSearchValue.setValue("");
}


			}
    fc['rule_searchRule'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "searchRule", "searchInstances", fc['action_searchInstances']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(searchRule) Error: " + e);
	       throw e;
	   }
	}

			fc['action_searchInstances'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				ldPrcSearchData(factory,pane,control,logger,data.getFetchDataURL(),"searchBy?searchby="+control.optnSearchCriteria.getValue()+"&searchvalue="+control.txtSearchValue.getValue()+"&processname="+control.optnSelectProcess.getValue(),data.getIsGateKeeper(),data.getLoginName());


  
 var record = factory.com_sfc_fosImpl_genericReporting.createTask();
 /*
 record.setFirstOfferTime("firstOfferTime");
 record.setProcessInstance(processInstance);
 record.setTaskDuration(taskDuration);
 record.setTaskName(taskName);
 record.setWaitDuration(waitDuration);
 record.setWorkDuration(workDuration);
 record.set
 
 */
			}
    fc['rule_getCancelledProcessesTasks'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "getCancelledProcessesTasks", "getCancelledProcessesTasks", fc['action_getCancelledProcessesTasks']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(getCancelledProcessesTasks) Error: " + e);
	       throw e;
	   }
	}

			fc['action_getCancelledProcessesTasks'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				
pane.taskAnalysis.open();
var proc_instance=context.pane.getSelection().getProcessInstance();

ldTskData(factory,pane,control,logger,data.getFetchDataURL(),"getProcessInstanceDetails?instanceid="+proc_instance);


logger.info("clicked");
			}
    fc['rule_getErrorProcessesTasks'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "getErrorProcessesTasks", "getErrorProcessesTasks", fc['action_getErrorProcessesTasks']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(getErrorProcessesTasks) Error: " + e);
	       throw e;
	   }
	}

			fc['action_getErrorProcessesTasks'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				
pane.taskAnalysis.open();
var proc_instance=context.pane.getSelection().getProcessInstance();

ldTskData(factory,pane,control,logger,data.getFetchDataURL(),"getProcessInstanceDetails?instanceid="+proc_instance);


logger.info("clicked");
			}
    fc['rule_getInprogressProcessesTasks'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "getInprogressProcessesTasks", "getInprogressProcessesTasks", fc['action_getInprogressProcessesTasks']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(getInprogressProcessesTasks) Error: " + e);
	       throw e;
	   }
	}

			fc['action_getInprogressProcessesTasks'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				
pane.taskAnalysis.open();
var proc_instance=context.pane.getSelection().getProcessInstance();

ldTskData(factory,pane,control,logger,data.getFetchDataURL(),"getProcessInstanceDetails?instanceid="+proc_instance);


logger.info("clicked");
			}
    fc['rule_getCompletedProcessTasks'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "getCompletedProcessTasks", "getCompletedProcessTasks", fc['action_getCompletedProcessTasks']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(getCompletedProcessTasks) Error: " + e);
	       throw e;
	   }
	}

			fc['action_getCompletedProcessTasks'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				
pane.taskAnalysis.open();
var proc_instance=context.pane.getSelection().getProcessInstance();

ldTskData(factory,pane,control,logger,data.getFetchDataURL(),"getProcessInstanceDetails?instanceid="+proc_instance);


logger.info("clicked");


			}
    fc['rule_unSelectOthers'] = function(formId, context, thisObj) {
	   try {
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(unSelectOthers) Error: " + e);
	       throw e;
	   }
	}

			fc['action_unselectOthers'] = function(context, data, pane, control, factory, pkg, f , p) {
				return;
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
tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg']['defineActions']();

tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg'];
	
	
	
fc['validation_TaskList_status_TaskList_status__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 150) ? true : [context.control.getLabel(), \'150\'] : context.value.length <= 150;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_status: TaskList_status__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_status__length", true, true);
}
	
fc['validation_HaltedInstances_siebelCircuitID_HaltedInstances_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_siebelCircuitID: HaltedInstances_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_siebelCircuitID__length", true, true);
}
	
	
fc['validation_HaltedInstances_clientName_HaltedInstances_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_clientName: HaltedInstances_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_clientName__length", true, true);
}
	
	
	
fc['validation_CompletedInstances_processInstance_CompletedInstances_processInstance__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_processInstance: CompletedInstances_processInstance__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_processInstance__length", true, true);
}
	
	
fc['validation_StartedInstances_processTemplate_StartedInstances_processTemplate__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_processTemplate: StartedInstances_processTemplate__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_processTemplate__length", true, true);
}
	
	
	
fc['validation_CompletedInstances_status_CompletedInstances_status__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_status: CompletedInstances_status__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_status__length", true, true);
}
	
fc['validation_IsGateKeeper_IsGateKeeper__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IsGateKeeper: IsGateKeeper__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IsGateKeeper__length", true, true);
}
	
fc['validation_StartedInstances_processInstance_StartedInstances_processInstance__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_processInstance: StartedInstances_processInstance__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_processInstance__length", true, true);
}
	
fc['validation_TaskList_processInstance_TaskList_processInstance__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_processInstance: TaskList_processInstance__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_processInstance__length", true, true);
}
	
	
fc['validation_CompletedInstances_clientName_CompletedInstances_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_clientName: CompletedInstances_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_clientName__length", true, true);
}
	
	
fc['validation_StartedInstances_projectName_StartedInstances_projectName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_projectName: StartedInstances_projectName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_projectName__length", true, true);
}
	
fc['validation_HaltedInstances_time_HaltedInstances_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_time: HaltedInstances_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_time__length", true, true);
}
	
	
	
fc['validation_TaskList_workDuration_TaskList_workDuration__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 150) ? true : [context.control.getLabel(), \'150\'] : context.value.length <= 150;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_workDuration: TaskList_workDuration__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_workDuration__length", true, true);
}
	
	
fc['validation_CancelledInstances_status_CancelledInstances_status__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_status: CancelledInstances_status__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_status__length", true, true);
}
	
	
fc['validation_TaskList_firstOfferTime_TaskList_firstOfferTime__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 150) ? true : [context.control.getLabel(), \'150\'] : context.value.length <= 150;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_firstOfferTime: TaskList_firstOfferTime__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_firstOfferTime__length", true, true);
}
	
	
	
fc['validation_CancelledInstances_time_CancelledInstances_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_time: CancelledInstances_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_time__length", true, true);
}
	
	
	
	
	
	
fc['validation_TaskList_waitDuration_TaskList_waitDuration__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 150) ? true : [context.control.getLabel(), \'150\'] : context.value.length <= 150;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_waitDuration: TaskList_waitDuration__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_waitDuration__length", true, true);
}
	
	
	
fc['validation_CompletedInstances_time_CompletedInstances_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_time: CompletedInstances_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_time__length", true, true);
}
	
fc['validation_CancelledInstances_processInstance_CancelledInstances_processInstance__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_processInstance: CancelledInstances_processInstance__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_processInstance__length", true, true);
}
	
	
	
fc['validation_CompletedInstances_siebelCircuitID_CompletedInstances_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_siebelCircuitID: CompletedInstances_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_siebelCircuitID__length", true, true);
}
	
fc['validation_HaltedInstances_processTemplate_HaltedInstances_processTemplate__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_processTemplate: HaltedInstances_processTemplate__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_processTemplate__length", true, true);
}
	
fc['validation_HaltedInstances_status_HaltedInstances_status__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_status: HaltedInstances_status__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_status__length", true, true);
}
	
	
fc['validation_CancelledInstances_processTemplate_CancelledInstances_processTemplate__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_processTemplate: CancelledInstances_processTemplate__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_processTemplate__length", true, true);
}
	
fc['validation_StartedInstances_siebelCircuitID_StartedInstances_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_siebelCircuitID: StartedInstances_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_siebelCircuitID__length", true, true);
}
	
fc['validation_StartedInstances_time_StartedInstances_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_time: StartedInstances_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_time__length", true, true);
}
	
	
fc['validation_CompletedInstances_processTemplate_CompletedInstances_processTemplate__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_processTemplate: CompletedInstances_processTemplate__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_processTemplate__length", true, true);
}
	
fc['validation_TaskList_taskDuration_TaskList_taskDuration__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 150) ? true : [context.control.getLabel(), \'150\'] : context.value.length <= 150;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_taskDuration: TaskList_taskDuration__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_taskDuration__length", true, true);
}
	
fc['validation_StartedInstances_clientName_StartedInstances_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_clientName: StartedInstances_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_clientName__length", true, true);
}
	
fc['validation_CancelledInstances_projectName_CancelledInstances_projectName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_projectName: CancelledInstances_projectName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_projectName__length", true, true);
}
	
fc['validation_CancelledInstances_clientName_CancelledInstances_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_clientName: CancelledInstances_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_clientName__length", true, true);
}
	
	
fc['validation_StartedInstances_status_StartedInstances_status__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_status: StartedInstances_status__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "StartedInstances_status__length", true, true);
}
	
fc['validation_CancelledInstances_siebelCircuitID_CancelledInstances_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_siebelCircuitID: CancelledInstances_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CancelledInstances_siebelCircuitID__length", true, true);
}
	
fc['validation_TaskList_taskName_TaskList_taskName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 150) ? true : [context.control.getLabel(), \'150\'] : context.value.length <= 150;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_taskName: TaskList_taskName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskList_taskName__length", true, true);
}
	
	
fc['validation_HaltedInstances_projectName_HaltedInstances_projectName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_projectName: HaltedInstances_projectName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_projectName__length", true, true);
}
	
fc['validation_HaltedInstances_processInstance_HaltedInstances_processInstance__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_processInstance: HaltedInstances_processInstance__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "HaltedInstances_processInstance__length", true, true);
}
	
fc['validation_loginName_loginName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "loginName: loginName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "loginName__length", true, true);
}
	
fc['validation_CompletedInstances_projectName_CompletedInstances_projectName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_projectName: CompletedInstances_projectName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CompletedInstances_projectName__length", true, true);
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
	   form.registerPackages(['com.sfc.fosImpl.genericReporting.GenericReportingPackage']);
       form.registerFactories(['com.sfc.fosImpl.genericReporting.GenericReportingFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getFetchDataURL = function(useInternal) {
			return this.form.dataMap['fetchDataURL'].getValue(useInternal);
		};
		this.setFetchDataURL = function(value) {
			return this.form.dataMap['fetchDataURL'].setValue(value);
		};
		this.getCancelledInstances = function() {
			return this.form.dataMap['CancelledInstances'].getValue();
		};
		this.getStartedInstances = function() {
			return this.form.dataMap['StartedInstances'].getValue();
		};
		this.getHaltedInstances = function() {
			return this.form.dataMap['HaltedInstances'].getValue();
		};
		this.getCompletedInstances = function() {
			return this.form.dataMap['CompletedInstances'].getValue();
		};
		this.getIsGateKeeper = function(useInternal) {
			return this.form.dataMap['IsGateKeeper'].getValue(useInternal);
		};
		this.setIsGateKeeper = function(value) {
			return this.form.dataMap['IsGateKeeper'].setValue(value);
		};
		this.getLoginName = function(useInternal) {
			return this.form.dataMap['loginName'].getValue(useInternal);
		};
		this.setLoginName = function(value) {
			return this.form.dataMap['loginName'].setValue(value);
		};
		this.getTaskList = function() {
			return this.form.dataMap['TaskList'].getValue();
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_lZJ3IPSjEeec1fMXPv5KDg']['defineValidations']();
