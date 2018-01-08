/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.genericReporting.Task. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.genericReporting.Task"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.genericReporting.Task");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PROCESSINSTANCE = "processInstance";
theClass.ATTR_FIRSTOFFERTIME = "firstOfferTime";
theClass.ATTR_TASKNAME = "taskName";
theClass.ATTR_TASKDURATION = "taskDuration";
theClass.ATTR_WAITDURATION = "waitDuration";
theClass.ATTR_WORKDURATION = "workDuration";
theClass.ATTR_STATUS = "status";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSINSTANCE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FIRSTOFFERTIME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKDURATION] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WAITDURATION] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKDURATION] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PROCESSINSTANCE, theClass.ATTR_FIRSTOFFERTIME, theClass.ATTR_TASKNAME, theClass.ATTR_TASKDURATION, theClass.ATTR_WAITDURATION, theClass.ATTR_WORKDURATION, theClass.ATTR_STATUS];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PROCESSINSTANCE, theClass.ATTR_FIRSTOFFERTIME, theClass.ATTR_TASKNAME, theClass.ATTR_TASKDURATION, theClass.ATTR_WAITDURATION, theClass.ATTR_WORKDURATION, theClass.ATTR_STATUS];

theClass.getName = function() {
    return "com.sfc.fosImpl.genericReporting.Task";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.genericReporting.Task");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.genericReporting.Task");
};

theClass.prototype.getProcessInstance = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_PROCESSINSTANCE, useInternal);
};

theClass.prototype.setProcessInstance = function(processInstance) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_PROCESSINSTANCE, processInstance);
};


theClass.prototype.getFirstOfferTime = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_FIRSTOFFERTIME, useInternal);
};

theClass.prototype.setFirstOfferTime = function(firstOfferTime) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_FIRSTOFFERTIME, firstOfferTime);
};


theClass.prototype.getTaskName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_TASKNAME, useInternal);
};

theClass.prototype.setTaskName = function(taskName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_TASKNAME, taskName);
};


theClass.prototype.getTaskDuration = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_TASKDURATION, useInternal);
};

theClass.prototype.setTaskDuration = function(taskDuration) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_TASKDURATION, taskDuration);
};


theClass.prototype.getWaitDuration = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_WAITDURATION, useInternal);
};

theClass.prototype.setWaitDuration = function(waitDuration) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_WAITDURATION, waitDuration);
};


theClass.prototype.getWorkDuration = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_WORKDURATION, useInternal);
};

theClass.prototype.setWorkDuration = function(workDuration) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_WORKDURATION, workDuration);
};


theClass.prototype.getStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_STATUS, useInternal);
};

theClass.prototype.setStatus = function(status) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Task").ATTR_STATUS, status);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.genericReporting.Task"]();
