/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.genericReporting.Record. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.genericReporting.Record"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.genericReporting.Record");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PROCESSINSTANCE = "processInstance";
theClass.ATTR_PROCESSTEMPLATE = "processTemplate";
theClass.ATTR_STATUS = "status";
theClass.ATTR_TIME = "time";
theClass.ATTR_SIEBELCIRCUITID = "siebelCircuitID";
theClass.ATTR_CLIENTNAME = "clientName";
theClass.ATTR_PROJECTNAME = "projectName";
theClass.ATTR_CURRENTACTIVITY = "currentActivity";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSINSTANCE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSTEMPLATE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TIME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SIEBELCIRCUITID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CLIENTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROJECTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CURRENTACTIVITY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PROCESSINSTANCE, theClass.ATTR_PROCESSTEMPLATE, theClass.ATTR_STATUS, theClass.ATTR_TIME, theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_CLIENTNAME, theClass.ATTR_PROJECTNAME, theClass.ATTR_CURRENTACTIVITY];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PROCESSINSTANCE, theClass.ATTR_PROCESSTEMPLATE, theClass.ATTR_STATUS, theClass.ATTR_TIME, theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_CLIENTNAME, theClass.ATTR_PROJECTNAME, theClass.ATTR_CURRENTACTIVITY];

theClass.getName = function() {
    return "com.sfc.fosImpl.genericReporting.Record";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.genericReporting.Record");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.genericReporting.Record");
};

theClass.prototype.getProcessInstance = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_PROCESSINSTANCE, useInternal);
};

theClass.prototype.setProcessInstance = function(processInstance) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_PROCESSINSTANCE, processInstance);
};


theClass.prototype.getProcessTemplate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_PROCESSTEMPLATE, useInternal);
};

theClass.prototype.setProcessTemplate = function(processTemplate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_PROCESSTEMPLATE, processTemplate);
};


theClass.prototype.getStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_STATUS, useInternal);
};

theClass.prototype.setStatus = function(status) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_STATUS, status);
};


theClass.prototype.getTime = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_TIME, useInternal);
};

theClass.prototype.setTime = function(time) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_TIME, time);
};


theClass.prototype.getSiebelCircuitID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_SIEBELCIRCUITID, useInternal);
};

theClass.prototype.setSiebelCircuitID = function(siebelCircuitID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_SIEBELCIRCUITID, siebelCircuitID);
};


theClass.prototype.getClientName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_CLIENTNAME, useInternal);
};

theClass.prototype.setClientName = function(clientName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_CLIENTNAME, clientName);
};


theClass.prototype.getProjectName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_PROJECTNAME, useInternal);
};

theClass.prototype.setProjectName = function(projectName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_PROJECTNAME, projectName);
};


theClass.prototype.getCurrentActivity = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_CURRENTACTIVITY, useInternal);
};

theClass.prototype.setCurrentActivity = function(currentActivity) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.genericReporting.Record").ATTR_CURRENTACTIVITY, currentActivity);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.genericReporting.Record"]();
