/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.UserDefinedFields. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.UserDefinedFields"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.UserDefinedFields");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_EVALUATIONPRIORITY = "evaluationPriority";
theClass.ATTR_TYPE = "type";
theClass.ATTR_FLAVOUR = "flavour";
theClass.ATTR_NAME = "name";
theClass.ATTR_VALUE = "value";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_EVALUATIONPRIORITY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TYPE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FLAVOUR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_NAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VALUE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_EVALUATIONPRIORITY, theClass.ATTR_TYPE, theClass.ATTR_FLAVOUR, theClass.ATTR_NAME, theClass.ATTR_VALUE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_EVALUATIONPRIORITY, theClass.ATTR_TYPE, theClass.ATTR_FLAVOUR, theClass.ATTR_NAME, theClass.ATTR_VALUE];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.UserDefinedFields";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.UserDefinedFields");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields");
};

theClass.prototype.getEvaluationPriority = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_EVALUATIONPRIORITY, useInternal);
};

theClass.prototype.setEvaluationPriority = function(evaluationPriority) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_EVALUATIONPRIORITY, evaluationPriority);
};


theClass.prototype.getType = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_TYPE, useInternal);
};

theClass.prototype.setType = function(type) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_TYPE, type);
};


theClass.prototype.getFlavour = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_FLAVOUR, useInternal);
};

theClass.prototype.setFlavour = function(flavour) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_FLAVOUR, flavour);
};


theClass.prototype.getName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_NAME, useInternal);
};

theClass.prototype.setName = function(name) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_NAME, name);
};


theClass.prototype.getValue = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_VALUE, useInternal);
};

theClass.prototype.setValue = function(value) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.UserDefinedFields").ATTR_VALUE, value);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.UserDefinedFields"]();
