

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w'] = new Object();
tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w']['defineActions'] = function() {
var fc = tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w'];
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
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "submit", "submit", fc['action_submit']);
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "submit", "Submit", fc['action_Submit']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(submit) Error: " + e);
	       throw e;
	   }
	}

			fc['action_Submit'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setDummycomment(control.ProvisioningData_notesComments.getValue());

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
				var a;
this.getControl("folderID").setValue(data.getProvisioningData().getSiebelCircuitID().toString());
logger.info("[SFc] xDMS URL: "+data.getXDMSURL());

this.getControl("fileattachments").setValue("<iframe SCROLLING='yes' frameborder=0 width=1000 height=250 " +
 "src='"+data.getXDMSURL()+"/archiv?xfunc=list&folderid="+this.getControl("folderID").getValue()+"&xupload=true&target=_blank'></iframe>");
			}
    fc['rule_setHeaderName'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setHeaderName", "setHeaderLabel", fc['action_setHeaderLabel']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setHeaderName) Error: " + e);
	       throw e;
	   }
	}

			fc['action_setHeaderLabel'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				var a;
//data.setTaskName("PM Task"); 
//data.setTaskName("GateKeeper Approval");

//alert(data.getTaskName());

pane.content.setLabel(data.getTaskName());
control.ProvisioningData_notesComments.setValue("");

var lblArr = new Array(); var lblVal = new Array(); 
for (var i=0;i<data.getResource().getResources().size();i++) {
lblArr[i]=data.getResource().getResources().get(i).getName();
lblVal[i]=data.getResource().getResources().get(i).getGuid();
}

if(data.getTaskName()=="GateKeeper Approval") {
control.lblselectPM.setVisible(true);
pane.pneSelectPM.setVisible(true);
pane.MarginPanePM2.setVisible(false);
control.selectPMlist.setVisible(false);
pane.controlUpdatePMDetail.setVisible(true);
control.selectPMlist.setOptions(lblArr,lblArr);



}
else{
control.lblselectPM.setVisible(false);
pane.pneSelectPM.setVisible(false);
pane.MarginPanePM2.setVisible(false);
control.selectPMlist.setVisible(false);
pane.controlUpdatePMDetail.setVisible(false);
control.lblselectContractor.setVisible(false);
pane.pneSelectContractor.setVisible(false);

}

if(data.getTaskName()=="PM Task")  {
pane.content.setLabel(data.getTaskName());
	pane.MarginPanePM.setVisible(true);
	control.lblselectContractor.setVisible(true);
	pane.pneSelectContractor.setVisible(true);
	control.selectContractorList.setVisible(true);
	control.lblEscalatePM.setVisible(false);
	control.lblselectPM.setVisible(false);
	control.selectContractorList.setOptions(lblArr,lblArr);	
}
else {
	pane.MarginPanePM.setVisible(false);
	control.lblselectContractor.setVisible(false);
	pane.pneSelectContractor.setVisible(false);
	control.selectContractorList.setVisible(false);
}

if( data.getTaskName()=="Contractor") {
	pane.MarginPaneContractor.setVisible(true);
	control.contractorUpdateDetails.setVisible(true);
	pane.ContractorUpdateDetails.setVisible(true);
}
else {
	pane.MarginPaneContractor.setVisible(false);
	control.contractorUpdateDetails.setVisible(false);
	pane.ContractorUpdateDetails.setVisible(false);
}


if( data.getTaskName()=="TESFAE - Management IP Provision") {
	pane.pneManagementIPs.setVisible(true);
	control.lblMgmtIP.setVisible(true);
	pane.MarginPaneMgmtIPs.setVisible(true);
}
else {
	pane.pneManagementIPs.setVisible(false);
	control.lblMgmtIP.setVisible(false);
	pane.MarginPaneMgmtIPs.setVisible(false);
}

/*
if((data.getTaskName()!="PM Task") || (data.getTaskName()!="GateKeeper")) {
pane.ProvisioningData.setEnabled(false);
}
*/



if(data.getTaskName()!="Escalate PM") {
control.lblEscalatePM.setVisible(false);
}





			}
    fc['rule_setContractor'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setContractor", "setContractor", fc['action_setContractor']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setContractor) Error: " + e);
	       throw e;
	   }
	}

			fc['action_setContractor'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setAlternativeContractor("resource(name='"+context.control.getValue()+"')");

			}
    fc['rule_setRemedyTicket'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setRemedyTicket", "setRemedyTicket", fc['action_setRemedyTicket']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setRemedyTicket) Error: " + e);
	       throw e;
	   }
	}

			fc['action_setRemedyTicket'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				if(context.control.getValue()==true)  {
control.remedyTicketDescription.setValue("");
control.remedyTicketDescription.setVisible(true);

control.remedyTicketPriority.setValue("");
control.remedyTicketPriority.setVisible(true);

control.remedyTicketSubject.setValue("");
control.remedyTicketSubject.setVisible(true);
}
else {
control.remedyTicketDescription.setVisible(false);
control.remedyTicketPriority.setVisible(false);
control.remedyTicketSubject.setVisible(false);
}


if(context.control.getValue()==true){
data.setTicketFlag(true);
}
else {
data.setTicketFlag(false);
}
			}
    fc['rule_setIPFlag'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setIPFlag", "setIPFlag", fc['action_setIPFlag']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setIPFlag) Error: " + e);
	       throw e;
	   }
	}

			fc['action_setIPFlag'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				if(context.control.getValue()==true){
data.setIPFlag(true);
}
else {
data.setIPFlag(false);
}
			}
    fc['rule_updateGrid'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "updateGrid", "rule11", fc['action_rule11']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(updateGrid) Error: " + e);
	       throw e;
	   }
	}

			fc['action_rule11'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setDummycomment(context.control.getValue());

			}
    fc['rule_setPMChoiceVisible'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setPMChoiceVisible", "pMListVisible", fc['action_pMListVisible']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setPMChoiceVisible) Error: " + e);
	       throw e;
	   }
	}

			fc['action_pMListVisible'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				if(context.control.getValue()=='2') {
control.selectPMlist.setValue("");
control.selectPMlist.setVisible(true);
}
else {
control.selectPMlist.setVisible(false);
data.setAlternativePM("group(name='PM')");
}


			}
    fc['rule_setAlternativePM'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "setAlternativePM", "alternativePMSelect", fc['action_alternativePMSelect']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(setAlternativePM) Error: " + e);
	       throw e;
	   }
	}

			fc['action_alternativePMSelect'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				data.setAlternativePM("resource(name='"+context.control.getValue()+"')");
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
tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w']['defineActions']();

tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w'];
	
	
fc['validation_CommentHistory_comments_CommentHistory_comments__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_comments: CommentHistory_comments__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_comments__length", true, true);
}
	
	
fc['validation_ProvisioningData_serviceEnd_ProvisioningData_serviceEnd__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_serviceEnd: ProvisioningData_serviceEnd__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_serviceEnd__datetime", true, true);
}
	
	
	
	
fc['validation_ProvisioningData_notesComments_ProvisioningData_notesComments__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_notesComments: ProvisioningData_notesComments__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_notesComments__length", true, true);
}
	
fc['validation_ProvisioningData_serviceStart_ProvisioningData_serviceStart__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_serviceStart: ProvisioningData_serviceStart__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_serviceStart__datetime", true, true);
}
	
fc['validation_ProvisioningData_projectManager_ProvisioningData_projectManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_projectManager: ProvisioningData_projectManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_projectManager__length", true, true);
}
	
	
fc['validation_ProvisioningData_mobile_ProvisioningData_mobile__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_mobile: ProvisioningData_mobile__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_mobile__length", true, true);
}
	
	
	
	
	
fc['validation_ProvisioningData_requestDate_ProvisioningData_requestDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_requestDate: ProvisioningData_requestDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_requestDate__datetime", true, true);
}
	
fc['validation_CommentHistory_addedby_CommentHistory_addedby__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_addedby: CommentHistory_addedby__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_addedby__length", true, true);
}
	
	
	
fc['validation_ProvisioningData_installDate_ProvisioningData_installDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_installDate: ProvisioningData_installDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_installDate__datetime", true, true);
}
	
fc['validation_ProvisioningData_accountManager_ProvisioningData_accountManager__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_accountManager: ProvisioningData_accountManager__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_accountManager__length", true, true);
}
	
fc['validation_Resource_resources_Resource_resources__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Resource_resources: Resource_resources__multiplicity", true, false);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Resource_resources__multiplicity", true, false);
}
	
	
fc['validation_CommentHistory_stepName_CommentHistory_stepName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_stepName: CommentHistory_stepName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_stepName__length", true, true);
}
	
	
	
	
	
	
	
	
fc['validation_ProvisioningData_contractor_ProvisioningData_contractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_contractor: ProvisioningData_contractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_contractor__length", true, true);
}
	
	
fc['validation_TicketFlag_TicketFlag__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TicketFlag: TicketFlag__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TicketFlag__length", true, true);
}
	
	
	
	
	
	
	
	
	
fc['validation_ResourceGUID_ResourceGUID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ResourceGUID: ResourceGUID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ResourceGUID__length", true, true);
}
	
	
	
fc['validation_CommentHistory_time_CommentHistory_time__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_time: CommentHistory_time__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CommentHistory_time__length", true, true);
}
	
	
fc['validation_folderID_folderID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "folderID: folderID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "folderID__length", true, true);
}
	
fc['validation_ProvisioningData_buildingID_ProvisioningData_buildingID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_buildingID: ProvisioningData_buildingID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_buildingID__length", true, true);
}
	
fc['validation_ProvisioningData_regionView_ProvisioningData_regionView__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_regionView: ProvisioningData_regionView__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_regionView__length", true, true);
}
	
	
	
fc['validation_uid_uid__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "uid: uid__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "uid__length", true, true);
}
	
	
fc['validation_ProvisioningData_email_ProvisioningData_email__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_email: ProvisioningData_email__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_email__length", true, true);
}
	
	
	
	
fc['validation_GroupName_GroupName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "GroupName: GroupName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "GroupName__length", true, true);
}
	
fc['validation_ProvisioningData_location_ProvisioningData_location__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_location: ProvisioningData_location__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_location__length", true, true);
}
	
fc['validation_ProvisioningData_serviceStatus_ProvisioningData_serviceStatus__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_serviceStatus: ProvisioningData_serviceStatus__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_serviceStatus__length", true, true);
}
	
	
	
	
	
fc['validation_ProvisioningData_clientName_ProvisioningData_clientName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_clientName: ProvisioningData_clientName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_clientName__length", true, true);
}
	
	
	
fc['validation_ProvisioningData_GPSCoordinates_ProvisioningData_GPSCoordinates__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_GPSCoordinates: ProvisioningData_GPSCoordinates__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_GPSCoordinates__length", true, true);
}
	
	
fc['validation_ProvisioningData_floor_ProvisioningData_floor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_floor: ProvisioningData_floor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_floor__length", true, true);
}
	
	
	
	
	
	
	
	
fc['validation_ProvisioningData_siebelCircuitID_ProvisioningData_siebelCircuitID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_siebelCircuitID: ProvisioningData_siebelCircuitID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_siebelCircuitID__length", true, true);
}
	
	
	
fc['validation_ProvisioningData_contactPerson_ProvisioningData_contactPerson__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_contactPerson: ProvisioningData_contactPerson__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_contactPerson__length", true, true);
}
	
	
	
	
	
	
fc['validation_IPFlag_IPFlag__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IPFlag: IPFlag__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IPFlag__length", true, true);
}
	
	
	
	
	
fc['validation_TaskName_TaskName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 100) ? true : [context.control.getLabel(), \'100\'] : context.value.length <= 100;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskName: TaskName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "TaskName__length", true, true);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
fc['validation_ProvisioningData_clientID_ProvisioningData_clientID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_clientID: ProvisioningData_clientID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_clientID__length", true, true);
}
	
fc['validation_ResourceNames_ResourceNames__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ResourceNames: ResourceNames__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ResourceNames__length", true, true);
}
	
	
	
	
	
	
fc['validation_SelectContractor_SelectContractor__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectContractor: SelectContractor__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "SelectContractor__length", true, true);
}
	
fc['validation_Dummycomment_Dummycomment__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 400) ? true : [context.control.getLabel(), \'400\'] : context.value.length <= 400;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dummycomment: Dummycomment__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dummycomment__length", true, true);
}
	
fc['validation_ProvisioningData_buildingName_ProvisioningData_buildingName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_buildingName: ProvisioningData_buildingName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_buildingName__length", true, true);
}
	
	
	
	
	
	
	
	
	
	
fc['validation_ProvisioningData_sector_ProvisioningData_sector__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_sector: ProvisioningData_sector__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProvisioningData_sector__length", true, true);
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
	   form.registerPackages(['com.example.sfc_provisioningbom.Sfc_provisioningbomPackage', 'com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Package', 'com.example.sfc_provisioning_tobe_comment_bom.Sfc_provisioning_tobe_comment_bomPackage']);
       form.registerFactories(['com.example.sfc_provisioningbom.Sfc_provisioningbomFactory', 'com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Factory', 'com.example.sfc_provisioning_tobe_comment_bom.Sfc_provisioning_tobe_comment_bomFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getProvisioningData = function() {
			return this.form.dataMap['ProvisioningData'].getValue();
		};
		this.setProvisioningData = function(value) {
			return this.form.dataMap['ProvisioningData'].setValue(value);
		};
		this.getCommentHistory = function() {
			return this.form.dataMap['CommentHistory'].getValue();
		};
		this.getUid = function(useInternal) {
			return this.form.dataMap['uid'].getValue(useInternal);
		};
		this.setUid = function(value) {
			return this.form.dataMap['uid'].setValue(value);
		};
		this.getFolderID = function(useInternal) {
			return this.form.dataMap['folderID'].getValue(useInternal);
		};
		this.setFolderID = function(value) {
			return this.form.dataMap['folderID'].setValue(value);
		};
		this.getTaskName = function(useInternal) {
			return this.form.dataMap['TaskName'].getValue(useInternal);
		};
		this.setTaskName = function(value) {
			return this.form.dataMap['TaskName'].setValue(value);
		};
		this.getResourceNames = function(useInternal) {
			return this.form.dataMap['ResourceNames'].getValue(useInternal);
		};
		this.setResourceNames = function(value) {
			return this.form.dataMap['ResourceNames'].setValue(value);
		};
		this.getResourceGUID = function(useInternal) {
			return this.form.dataMap['ResourceGUID'].getValue(useInternal);
		};
		this.setResourceGUID = function(value) {
			return this.form.dataMap['ResourceGUID'].setValue(value);
		};
		this.getResource = function() {
			return this.form.dataMap['Resource'].getValue();
		};
		this.setResource = function(value) {
			return this.form.dataMap['Resource'].setValue(value);
		};
		this.getGroupName = function(useInternal) {
			return this.form.dataMap['GroupName'].getValue(useInternal);
		};
		this.setGroupName = function(value) {
			return this.form.dataMap['GroupName'].setValue(value);
		};
		this.getSelectContractor = function(useInternal) {
			return this.form.dataMap['SelectContractor'].getValue(useInternal);
		};
		this.setSelectContractor = function(value) {
			return this.form.dataMap['SelectContractor'].setValue(value);
		};
		this.getAlternativeContractor = function(useInternal) {
			return this.form.dataMap['AlternativeContractor'].getValue(useInternal);
		};
		this.setAlternativeContractor = function(value) {
			return this.form.dataMap['AlternativeContractor'].setValue(value);
		};
		this.getAlternativePM = function(useInternal) {
			return this.form.dataMap['AlternativePM'].getValue(useInternal);
		};
		this.setAlternativePM = function(value) {
			return this.form.dataMap['AlternativePM'].setValue(value);
		};
		this.getDummycomment = function(useInternal) {
			return this.form.dataMap['Dummycomment'].getValue(useInternal);
		};
		this.setDummycomment = function(value) {
			return this.form.dataMap['Dummycomment'].setValue(value);
		};
		this.getIPFlag = function(useInternal) {
			return this.form.dataMap['IPFlag'].getValue(useInternal);
		};
		this.setIPFlag = function(value) {
			return this.form.dataMap['IPFlag'].setValue(value);
		};
		this.getTicketFlag = function(useInternal) {
			return this.form.dataMap['TicketFlag'].getValue(useInternal);
		};
		this.setTicketFlag = function(value) {
			return this.form.dataMap['TicketFlag'].setValue(value);
		};
		this.getXDMSURL = function(useInternal) {
			return this.form.dataMap['xDMSURL'].getValue(useInternal);
		};
		this.setXDMSURL = function(value) {
			return this.form.dataMap['xDMSURL'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_x5h7ANvXEeeO2Z9phKVo-w']['defineValidations']();
