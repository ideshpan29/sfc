/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.SLA_Configuration. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.SLA_Configuration"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.SLA_Configuration");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_SLALEVEL = "SLALevel";
theClass.ATTR_TASKNAME = "taskName";
theClass.ATTR_PROCESSNAME = "processName";
theClass.ATTR_SLA_DEADLINE = "SLA_Deadline";
theClass.ATTR_EMAILTO = "emailTo";
theClass.ATTR_TASKTO = "taskTo";
theClass.ATTR_EMAILCONFIG = "emailConfig";
theClass.ATTR_TASKCONFIG = "taskConfig";
theClass.ATTR_ENABLEDISABLEFLAG = "enableDisableFlag";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_SLALEVEL] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SLA_DEADLINE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EMAILTO] = {type:"com.sfc.fosImpl.dataModel.EmailRecipient", baseType:"com.sfc.fosImpl.dataModel.EmailRecipient", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKTO] = {type:"com.sfc.fosImpl.dataModel.TaskRecipient", baseType:"com.sfc.fosImpl.dataModel.TaskRecipient", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EMAILCONFIG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKCONFIG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ENABLEDISABLEFLAG] = {type:"com.sfc.fosImpl.dataModel.EnableDisable", baseType:"com.sfc.fosImpl.dataModel.EnableDisable", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_SLALEVEL, theClass.ATTR_TASKNAME, theClass.ATTR_PROCESSNAME, theClass.ATTR_SLA_DEADLINE, theClass.ATTR_EMAILTO, theClass.ATTR_TASKTO, theClass.ATTR_EMAILCONFIG, theClass.ATTR_TASKCONFIG, theClass.ATTR_ENABLEDISABLEFLAG];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_SLALEVEL, theClass.ATTR_TASKNAME, theClass.ATTR_PROCESSNAME, theClass.ATTR_SLA_DEADLINE, theClass.ATTR_EMAILTO, theClass.ATTR_TASKTO, theClass.ATTR_EMAILCONFIG, theClass.ATTR_TASKCONFIG, theClass.ATTR_ENABLEDISABLEFLAG];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.SLA_Configuration";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.SLA_Configuration");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration");
};

theClass.prototype.getSLALevel = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_SLALEVEL, useInternal);
};

theClass.prototype.setSLALevel = function(SLALevel) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_SLALEVEL, SLALevel);
};


theClass.prototype.getTaskName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_TASKNAME, useInternal);
};

theClass.prototype.setTaskName = function(taskName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_TASKNAME, taskName);
};


theClass.prototype.getProcessName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_PROCESSNAME, useInternal);
};

theClass.prototype.setProcessName = function(processName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_PROCESSNAME, processName);
};


theClass.prototype.getSLA_Deadline = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_SLA_DEADLINE, useInternal);
};

theClass.prototype.setSLA_Deadline = function(SLA_Deadline) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_SLA_DEADLINE, SLA_Deadline);
};


theClass.prototype.getEmailTo = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_EMAILTO, useInternal);
};

theClass.prototype.setEmailTo = function(emailTo) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_EMAILTO, emailTo);
};


theClass.prototype.getTaskTo = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_TASKTO, useInternal);
};

theClass.prototype.setTaskTo = function(taskTo) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_TASKTO, taskTo);
};


theClass.prototype.getEmailConfig = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_EMAILCONFIG, useInternal);
};

theClass.prototype.setEmailConfig = function(emailConfig) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_EMAILCONFIG, emailConfig);
};


theClass.prototype.getTaskConfig = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_TASKCONFIG, useInternal);
};

theClass.prototype.setTaskConfig = function(taskConfig) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_TASKCONFIG, taskConfig);
};


theClass.prototype.getEnableDisableFlag = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_ENABLEDISABLEFLAG, useInternal);
};

theClass.prototype.setEnableDisableFlag = function(enableDisableFlag) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.SLA_Configuration").ATTR_ENABLEDISABLEFLAG, enableDisableFlag);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.SLA_Configuration"]();
