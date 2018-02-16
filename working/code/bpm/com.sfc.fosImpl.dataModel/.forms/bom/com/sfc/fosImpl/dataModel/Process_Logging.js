/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.Process_Logging. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.Process_Logging"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.Process_Logging");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PROCESSTYPE = "processType";
theClass.ATTR_SIEBELCIRCUITID = "siebelCircuitID";
theClass.ATTR_TASKNAME = "taskName";
theClass.ATTR_CUSTOMERNAME = "customerName";
theClass.ATTR_PROJECTMANAGER = "projectManager";
theClass.ATTR_ACCOUNTMANAGER = "accountManager";
theClass.ATTR_TASKDEFAULTSLA = "taskDefaultSLA";
theClass.ATTR_TASKINITIATIONTIME = "taskInitiationTime";
theClass.ATTR_TASKCOMPLETIONTIME = "taskCompletionTime";
theClass.ATTR_TOTALTIMETAKEN = "totalTimeTaken";
theClass.ATTR_SLASTATUS = "SLAStatus";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSTYPE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SIEBELCIRCUITID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CUSTOMERNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROJECTMANAGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ACCOUNTMANAGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKDEFAULTSLA] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKINITIATIONTIME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKCOMPLETIONTIME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TOTALTIMETAKEN] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SLASTATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PROCESSTYPE, theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_TASKNAME, theClass.ATTR_CUSTOMERNAME, theClass.ATTR_PROJECTMANAGER, theClass.ATTR_ACCOUNTMANAGER, theClass.ATTR_TASKDEFAULTSLA, theClass.ATTR_TASKINITIATIONTIME, theClass.ATTR_TASKCOMPLETIONTIME, theClass.ATTR_TOTALTIMETAKEN, theClass.ATTR_SLASTATUS];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PROCESSTYPE, theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_TASKNAME, theClass.ATTR_CUSTOMERNAME, theClass.ATTR_PROJECTMANAGER, theClass.ATTR_ACCOUNTMANAGER, theClass.ATTR_TASKDEFAULTSLA, theClass.ATTR_TASKINITIATIONTIME, theClass.ATTR_TASKCOMPLETIONTIME, theClass.ATTR_TOTALTIMETAKEN, theClass.ATTR_SLASTATUS];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.Process_Logging";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.Process_Logging");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging");
};

theClass.prototype.getProcessType = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_PROCESSTYPE, useInternal);
};

theClass.prototype.setProcessType = function(processType) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_PROCESSTYPE, processType);
};


theClass.prototype.getSiebelCircuitID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_SIEBELCIRCUITID, useInternal);
};

theClass.prototype.setSiebelCircuitID = function(siebelCircuitID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_SIEBELCIRCUITID, siebelCircuitID);
};


theClass.prototype.getTaskName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKNAME, useInternal);
};

theClass.prototype.setTaskName = function(taskName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKNAME, taskName);
};


theClass.prototype.getCustomerName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_CUSTOMERNAME, useInternal);
};

theClass.prototype.setCustomerName = function(customerName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_CUSTOMERNAME, customerName);
};


theClass.prototype.getProjectManager = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_PROJECTMANAGER, useInternal);
};

theClass.prototype.setProjectManager = function(projectManager) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_PROJECTMANAGER, projectManager);
};


theClass.prototype.getAccountManager = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_ACCOUNTMANAGER, useInternal);
};

theClass.prototype.setAccountManager = function(accountManager) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_ACCOUNTMANAGER, accountManager);
};


theClass.prototype.getTaskDefaultSLA = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKDEFAULTSLA, useInternal);
};

theClass.prototype.setTaskDefaultSLA = function(taskDefaultSLA) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKDEFAULTSLA, taskDefaultSLA);
};


theClass.prototype.getTaskInitiationTime = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKINITIATIONTIME, useInternal);
};

theClass.prototype.setTaskInitiationTime = function(taskInitiationTime) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKINITIATIONTIME, taskInitiationTime);
};


theClass.prototype.getTaskCompletionTime = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKCOMPLETIONTIME, useInternal);
};

theClass.prototype.setTaskCompletionTime = function(taskCompletionTime) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TASKCOMPLETIONTIME, taskCompletionTime);
};


theClass.prototype.getTotalTimeTaken = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TOTALTIMETAKEN, useInternal);
};

theClass.prototype.setTotalTimeTaken = function(totalTimeTaken) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_TOTALTIMETAKEN, totalTimeTaken);
};


theClass.prototype.getSLAStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_SLASTATUS, useInternal);
};

theClass.prototype.setSLAStatus = function(SLAStatus) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.Process_Logging").ATTR_SLASTATUS, SLAStatus);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.Process_Logging"]();
