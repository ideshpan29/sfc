/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.CommentDataCase. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.CommentDataCase"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.CommentDataCase");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_COMMENT_ID = "comment_Id";
theClass.ATTR_SIEBELCIRCUITID = "siebelCircuitID";
theClass.ATTR_TASKNAME = "taskName";
theClass.ATTR_ADDEDBY = "addedby";
theClass.ATTR_COMMENTS = "comments";
theClass.ATTR_TIME = "time";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_COMMENT_ID] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SIEBELCIRCUITID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASKNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ADDEDBY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_COMMENTS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TIME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_COMMENT_ID, theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_TASKNAME, theClass.ATTR_ADDEDBY, theClass.ATTR_COMMENTS, theClass.ATTR_TIME];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_COMMENT_ID, theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_TASKNAME, theClass.ATTR_ADDEDBY, theClass.ATTR_COMMENTS, theClass.ATTR_TIME];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.CommentDataCase";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.CommentDataCase");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase");
};

theClass.prototype.getComment_Id = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_COMMENT_ID, useInternal);
};

theClass.prototype.setComment_Id = function(comment_Id) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_COMMENT_ID, comment_Id);
};


theClass.prototype.getSiebelCircuitID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_SIEBELCIRCUITID, useInternal);
};

theClass.prototype.setSiebelCircuitID = function(siebelCircuitID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_SIEBELCIRCUITID, siebelCircuitID);
};


theClass.prototype.getTaskName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_TASKNAME, useInternal);
};

theClass.prototype.setTaskName = function(taskName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_TASKNAME, taskName);
};


theClass.prototype.getAddedby = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_ADDEDBY, useInternal);
};

theClass.prototype.setAddedby = function(addedby) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_ADDEDBY, addedby);
};


theClass.prototype.getComments = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_COMMENTS, useInternal);
};

theClass.prototype.setComments = function(comments) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_COMMENTS, comments);
};


theClass.prototype.getTime = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_TIME, useInternal);
};

theClass.prototype.setTime = function(time) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.CommentDataCase").ATTR_TIME, time);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.CommentDataCase"]();
