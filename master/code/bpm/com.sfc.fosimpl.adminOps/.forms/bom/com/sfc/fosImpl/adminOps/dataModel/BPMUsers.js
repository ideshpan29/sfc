/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.adminOps.dataModel.BPMUsers. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.adminOps.dataModel.BPMUsers"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.adminOps.dataModel.BPMUsers");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_NAME = "name";
theClass.ATTR_GROUPNAME = "groupName";
theClass.ATTR_ADDEDBY = "addedBy";
theClass.ATTR_ADDEDON = "addedOn";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_NAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GROUPNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ADDEDBY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ADDEDON] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_NAME, theClass.ATTR_GROUPNAME, theClass.ATTR_ADDEDBY, theClass.ATTR_ADDEDON];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_NAME, theClass.ATTR_GROUPNAME, theClass.ATTR_ADDEDBY, theClass.ATTR_ADDEDON];

theClass.getName = function() {
    return "com.sfc.fosImpl.adminOps.dataModel.BPMUsers";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.adminOps.dataModel.BPMUsers");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers");
};

theClass.prototype.getName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_NAME, useInternal);
};

theClass.prototype.setName = function(name) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_NAME, name);
};


theClass.prototype.getGroupName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_GROUPNAME, useInternal);
};

theClass.prototype.setGroupName = function(groupName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_GROUPNAME, groupName);
};


theClass.prototype.getAddedBy = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_ADDEDBY, useInternal);
};

theClass.prototype.setAddedBy = function(addedBy) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_ADDEDBY, addedBy);
};


theClass.prototype.getAddedOn = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_ADDEDON, useInternal);
};

theClass.prototype.setAddedOn = function(addedOn) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.BPMUsers").ATTR_ADDEDON, addedOn);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.adminOps.dataModel.BPMUsers"]();
