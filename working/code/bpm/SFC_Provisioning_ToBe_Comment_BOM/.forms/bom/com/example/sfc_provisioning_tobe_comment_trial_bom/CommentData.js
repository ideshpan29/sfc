/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_ADDEDBY = "addedby";
theClass.ATTR_COMMENTS = "comments";
theClass.ATTR_STEPNAME = "stepName";
theClass.ATTR_TIME = "time";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_ADDEDBY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_COMMENTS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STEPNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TIME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_ADDEDBY, theClass.ATTR_COMMENTS, theClass.ATTR_STEPNAME, theClass.ATTR_TIME];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_ADDEDBY, theClass.ATTR_COMMENTS, theClass.ATTR_STEPNAME, theClass.ATTR_TIME];

theClass.getName = function() {
    return "com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData";
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
		throw("Attribute " + attName + " not recognized for class com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData");
};

theClass.prototype.getAddedby = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_ADDEDBY, useInternal);
};

theClass.prototype.setAddedby = function(addedby) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_ADDEDBY, addedby);
};


theClass.prototype.getComments = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_COMMENTS, useInternal);
};

theClass.prototype.setComments = function(comments) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_COMMENTS, comments);
};


theClass.prototype.getStepName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_STEPNAME, useInternal);
};

theClass.prototype.setStepName = function(stepName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_STEPNAME, stepName);
};


theClass.prototype.getTime = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_TIME, useInternal);
};

theClass.prototype.setTime = function(time) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData").ATTR_TIME, time);
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

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioning_tobe_comment_trial_bom.CommentData"]();
