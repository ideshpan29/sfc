/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.requestType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.responseType");

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_REQUEST = "request";
theClass.ATTR_RESPONSE = "response";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_REQUEST] = {type:"com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.requestType", baseType:"com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.requestType", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_RESPONSE] = {type:"com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.responseType", baseType:"com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.responseType", primitive:false, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_REQUEST, theClass.ATTR_RESPONSE];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_REQUEST, theClass.ATTR_RESPONSE];

theClass.getName = function() {
    return "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType";
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
		throw("Attribute " + attName + " not recognized for class com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType");
};

theClass.prototype.getRequest = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType").ATTR_REQUEST);
};

theClass.prototype.setRequest = function(request) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType");
    var attrRef = classRef.ATTR_REQUEST;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("request instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, request);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getResponse = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType").ATTR_RESPONSE);
};

theClass.prototype.setResponse = function(response) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType");
    var attrRef = classRef.ATTR_RESPONSE;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("response instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, response);
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

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType"]();
