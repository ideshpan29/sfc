/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.LookupTable. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.LookupTable"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.LookupTable");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_LOOKUPVALUE = "lookupValue";
theClass.ATTR_AUTOCASEIDENTIFIER1 = "autoCaseIdentifier1";
theClass.ATTR_LOOKUPKEY = "lookupKey";
theClass.ATTR_ENABLEFLAG = "enableFlag";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_LOOKUPVALUE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_AUTOCASEIDENTIFIER1] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LOOKUPKEY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ENABLEFLAG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_LOOKUPVALUE, theClass.ATTR_AUTOCASEIDENTIFIER1, theClass.ATTR_LOOKUPKEY, theClass.ATTR_ENABLEFLAG];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_LOOKUPVALUE, theClass.ATTR_AUTOCASEIDENTIFIER1, theClass.ATTR_LOOKUPKEY, theClass.ATTR_ENABLEFLAG];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.LookupTable";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.LookupTable");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable");
};

theClass.prototype.getLookupValue = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_LOOKUPVALUE, useInternal);
};

theClass.prototype.setLookupValue = function(lookupValue) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_LOOKUPVALUE, lookupValue);
};


theClass.prototype.getAutoCaseIdentifier1 = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_AUTOCASEIDENTIFIER1, useInternal);
};

theClass.prototype.setAutoCaseIdentifier1 = function(autoCaseIdentifier1) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_AUTOCASEIDENTIFIER1, autoCaseIdentifier1);
};


theClass.prototype.getLookupKey = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_LOOKUPKEY, useInternal);
};

theClass.prototype.setLookupKey = function(lookupKey) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_LOOKUPKEY, lookupKey);
};


theClass.prototype.getEnableFlag = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_ENABLEFLAG, useInternal);
};

theClass.prototype.setEnableFlag = function(enableFlag) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.LookupTable").ATTR_ENABLEFLAG, enableFlag);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.LookupTable"]();
