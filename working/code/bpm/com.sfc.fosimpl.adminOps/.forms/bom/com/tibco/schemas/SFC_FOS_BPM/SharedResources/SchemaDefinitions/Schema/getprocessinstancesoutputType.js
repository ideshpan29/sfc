/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType");

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PI_COMPLETE = "pi_complete";
theClass.ATTR_PI_STARTED = "pi_started";
theClass.ATTR_PI_HALTED = "pi_halted";
theClass.ATTR_PI_CANCELLED = "pi_cancelled";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PI_COMPLETE] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType", primitive:false, multivalued:true, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PI_STARTED] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType", primitive:false, multivalued:true, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PI_HALTED] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType", primitive:false, multivalued:true, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PI_CANCELLED] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType", primitive:false, multivalued:true, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_PI_COMPLETE, theClass.ATTR_PI_STARTED, theClass.ATTR_PI_HALTED, theClass.ATTR_PI_CANCELLED];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PI_COMPLETE, theClass.ATTR_PI_STARTED, theClass.ATTR_PI_HALTED, theClass.ATTR_PI_CANCELLED];

theClass.getName = function() {
    return "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType";
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
		throw("Attribute " + attName + " not recognized for class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType");
};

theClass.prototype.getPi_complete = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType").ATTR_PI_COMPLETE);
};

theClass.prototype.setPi_complete = function(pi_complete) {
    throw("unsupported array attribute: pi_complete");
};


theClass.prototype.getPi_started = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType").ATTR_PI_STARTED);
};

theClass.prototype.setPi_started = function(pi_started) {
    throw("unsupported array attribute: pi_started");
};


theClass.prototype.getPi_halted = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType").ATTR_PI_HALTED);
};

theClass.prototype.setPi_halted = function(pi_halted) {
    throw("unsupported array attribute: pi_halted");
};


theClass.prototype.getPi_cancelled = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType").ATTR_PI_CANCELLED);
};

theClass.prototype.setPi_cancelled = function(pi_cancelled) {
    throw("unsupported array attribute: pi_cancelled");
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

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType"]();
