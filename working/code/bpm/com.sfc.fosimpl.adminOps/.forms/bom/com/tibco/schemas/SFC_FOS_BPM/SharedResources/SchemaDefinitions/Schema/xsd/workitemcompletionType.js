/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletioninputType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionoutputType");

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_WORKITEMCOMPLETIONINPUT = "workitemcompletioninput";
theClass.ATTR_WORKITEMCOMPLETIONOUTPUT = "workitemcompletionoutput";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_WORKITEMCOMPLETIONINPUT] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletioninputType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletioninputType", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKITEMCOMPLETIONOUTPUT] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionoutputType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionoutputType", primitive:false, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_WORKITEMCOMPLETIONINPUT, theClass.ATTR_WORKITEMCOMPLETIONOUTPUT];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_WORKITEMCOMPLETIONINPUT, theClass.ATTR_WORKITEMCOMPLETIONOUTPUT];

theClass.getName = function() {
    return "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType";
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
		throw("Attribute " + attName + " not recognized for class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType");
};

theClass.prototype.getWorkitemcompletioninput = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType").ATTR_WORKITEMCOMPLETIONINPUT);
};

theClass.prototype.setWorkitemcompletioninput = function(workitemcompletioninput) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType");
    var attrRef = classRef.ATTR_WORKITEMCOMPLETIONINPUT;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("workitemcompletioninput instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, workitemcompletioninput);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getWorkitemcompletionoutput = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType").ATTR_WORKITEMCOMPLETIONOUTPUT);
};

theClass.prototype.setWorkitemcompletionoutput = function(workitemcompletionoutput) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType");
    var attrRef = classRef.ATTR_WORKITEMCOMPLETIONOUTPUT;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("workitemcompletionoutput instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, workitemcompletionoutput);
    } else {
        throw("Wrong input object type.");
    }
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

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType"]();
