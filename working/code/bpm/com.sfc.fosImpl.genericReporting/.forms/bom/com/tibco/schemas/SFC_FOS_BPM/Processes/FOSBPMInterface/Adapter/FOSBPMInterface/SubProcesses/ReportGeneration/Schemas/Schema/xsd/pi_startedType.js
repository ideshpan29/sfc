/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType. 
 */ 


com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType"] = function() {

/**
 * Constructor.
 */
var theClass = function(context) {
	this.data = new Object();
	this.isParameter = false;
    if (context == null) {
    	this.detached = true;
    } else  {
    	this.detached = (context.item == null);
		this.dataStore = context.dataStore;
		this.item = context.item;
		this.logger = context.logger;
		this.id = context.id;
		this.form = context.form;
		this.loader = this.form._loader;
        this.parentWrapper = context.parentWrapper;
	}
};

theClass.LOADER = com.tibco.data.Loader.currentLoader;
theClass.LOADER.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PROCESS_INSTANCE = "process_instance";
theClass.ATTR_CUSTOMER_NAME = "customer_name";
theClass.ATTR_SIBELCIRCUITID = "sibelcircuitId";
theClass.ATTR_PROJECT_MANAGER = "project_manager";
theClass.ATTR_CUR_ACTIVITY = "cur_activity";
theClass.ATTR_STATUS = "status";
theClass.ATTR_EXEC_MILLS = "exec_mills";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PROCESS_INSTANCE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CUSTOMER_NAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SIBELCIRCUITID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROJECT_MANAGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CUR_ACTIVITY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EXEC_MILLS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PROCESS_INSTANCE, theClass.ATTR_CUSTOMER_NAME, theClass.ATTR_SIBELCIRCUITID, theClass.ATTR_PROJECT_MANAGER, theClass.ATTR_CUR_ACTIVITY, theClass.ATTR_STATUS, theClass.ATTR_EXEC_MILLS];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PROCESS_INSTANCE, theClass.ATTR_CUSTOMER_NAME, theClass.ATTR_SIBELCIRCUITID, theClass.ATTR_PROJECT_MANAGER, theClass.ATTR_CUR_ACTIVITY, theClass.ATTR_STATUS, theClass.ATTR_EXEC_MILLS];

theClass.getName = function() {
    return "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType";
};

theClass._hasAttribute = function(attName) {
	return this.TYPE_ARRAY[attName] != null;
};

theClass._getAttributes = function() {
	return this.ATTRIBUTE_NAMES;
};


theClass._getCompositeAttributes = function() {
    return this.COMPOSITE_ATTRIBUTE_NAMES;
};

theClass._getPrimitiveAttributes = function() {
    return this.PRIMITIVE_ATTRIBUTE_NAMES;
};

theClass._isAttributeMultivalued = function(attName) {
	return this._getTypeDef(attName).multivalued;
};

theClass._isAttributeRequired = function(attName) {
    return this._getTypeDef(attName).required;
};

theClass._getTypeDef = function(attName) {
    var attType = this.TYPE_ARRAY[attName];
	if (attType == null)
		throw("Attribute " + attName + " not recognized for class com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType");
};

theClass.prototype.getProcess_instance = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_PROCESS_INSTANCE, useInternal);
};

theClass.prototype.setProcess_instance = function(process_instance) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_PROCESS_INSTANCE, process_instance);
};


theClass.prototype.getCustomer_name = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_CUSTOMER_NAME, useInternal);
};

theClass.prototype.setCustomer_name = function(customer_name) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_CUSTOMER_NAME, customer_name);
};


theClass.prototype.getSibelcircuitId = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_SIBELCIRCUITID, useInternal);
};

theClass.prototype.setSibelcircuitId = function(sibelcircuitId) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_SIBELCIRCUITID, sibelcircuitId);
};


theClass.prototype.getProject_manager = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_PROJECT_MANAGER, useInternal);
};

theClass.prototype.setProject_manager = function(project_manager) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_PROJECT_MANAGER, project_manager);
};


theClass.prototype.getCur_activity = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_CUR_ACTIVITY, useInternal);
};

theClass.prototype.setCur_activity = function(cur_activity) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_CUR_ACTIVITY, cur_activity);
};


theClass.prototype.getStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_STATUS, useInternal);
};

theClass.prototype.setStatus = function(status) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_STATUS, status);
};


theClass.prototype.getExec_mills = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_EXEC_MILLS, useInternal);
};

theClass.prototype.setExec_mills = function(exec_mills) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType").ATTR_EXEC_MILLS, exec_mills);
};

theClass.getAttributeNames = function() {
    return theClass._getAttributes();
};

theClass.getPrimitiveAttributeNames = function() {
    return theClass._getPrimitiveAttributes();
};

theClass.getComplexAttributeNames = function() {
    return theClass._getCompositeAttributes();
};

theClass.getAttributeType = function(attName) {
    return this._getTypeDef(attName).type;
};

theClass.isAttributeMultivalued = function(attName) {
    return theClass._isAttributeMultivalued(attName);
};

theClass.isAttributePrimitive = function(attName) {
    return this._getTypeDef(attName).primitive;
};

theClass.prototype.getAttributeValue = function(attName) {
    var isSingle = !theClass.isAttributeMultivalued(attName);
    var isPrimitive = theClass.isAttributePrimitive(attName);
    if (isSingle) {
        if (isPrimitive) {
            return this._getPrimitiveAttribute(attName);
        } else {
            return this._getComplexAttribute(attName);
        }
    } else {
        if (isPrimitive) {
            return this._getPrimitiveArrayAttribute(attName);
        } else {
            return this._getComplexArrayAttribute(attName);
        }
    }    
};

theClass.prototype.setAttributeValue = function(attName, value) {
    var isSingle = !theClass.isAttributeMultivalued(attName);
    var isPrimitive = theClass.isAttributePrimitive(attName);
    if (isSingle) {
        if (isPrimitive) {
            this._setPrimitiveAttribute(attName, value);
        } else {
            this._setComplexAttribute(attName, value);
        }
    } else {
        if (isPrimitive) {
            this._setPrimitiveAttribute(attName, value);
        } else {
            throw("Cannot set child List for attribute \"" + attName + "\". You can only modify the existing List");
        }
    }    
};

};

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ReportGeneration.Schemas.Schema.xsd.pi_startedType"]();
