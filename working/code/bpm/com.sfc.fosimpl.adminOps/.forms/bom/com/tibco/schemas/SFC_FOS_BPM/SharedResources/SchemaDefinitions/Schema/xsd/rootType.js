/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.fetchresourceType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.reportgenerationType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.reesourcecreationandmappingType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType");
com.tibco.data.Loader.currentLoader.load("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.faultType");

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_FETCHRESOURCE = "fetchresource";
theClass.ATTR_REPORTGENERATION = "reportgeneration";
theClass.ATTR_REESOURCECREATIONANDMAPPING = "reesourcecreationandmapping";
theClass.ATTR_WORKITEMCOMPLETION = "workitemcompletion";
theClass.ATTR_FAULT = "fault";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_FETCHRESOURCE] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.fetchresourceType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.fetchresourceType", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_REPORTGENERATION] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.reportgenerationType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.reportgenerationType", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_REESOURCECREATIONANDMAPPING] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.reesourcecreationandmappingType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.reesourcecreationandmappingType", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKITEMCOMPLETION] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.workitemcompletionType", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FAULT] = {type:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.faultType", baseType:"com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.faultType", primitive:false, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_FETCHRESOURCE, theClass.ATTR_REPORTGENERATION, theClass.ATTR_REESOURCECREATIONANDMAPPING, theClass.ATTR_WORKITEMCOMPLETION, theClass.ATTR_FAULT];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_FETCHRESOURCE, theClass.ATTR_REPORTGENERATION, theClass.ATTR_REESOURCECREATIONANDMAPPING, theClass.ATTR_WORKITEMCOMPLETION, theClass.ATTR_FAULT];

theClass.getName = function() {
    return "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType";
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
		throw("Attribute " + attName + " not recognized for class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
};

theClass.prototype.getFetchresource = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType").ATTR_FETCHRESOURCE);
};

theClass.prototype.setFetchresource = function(fetchresource) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
    var attrRef = classRef.ATTR_FETCHRESOURCE;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("fetchresource instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, fetchresource);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getReportgeneration = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType").ATTR_REPORTGENERATION);
};

theClass.prototype.setReportgeneration = function(reportgeneration) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
    var attrRef = classRef.ATTR_REPORTGENERATION;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("reportgeneration instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, reportgeneration);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getReesourcecreationandmapping = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType").ATTR_REESOURCECREATIONANDMAPPING);
};

theClass.prototype.setReesourcecreationandmapping = function(reesourcecreationandmapping) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
    var attrRef = classRef.ATTR_REESOURCECREATIONANDMAPPING;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("reesourcecreationandmapping instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, reesourcecreationandmapping);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getWorkitemcompletion = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType").ATTR_WORKITEMCOMPLETION);
};

theClass.prototype.setWorkitemcompletion = function(workitemcompletion) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
    var attrRef = classRef.ATTR_WORKITEMCOMPLETION;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("workitemcompletion instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, workitemcompletion);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getFault = function() {
    return this._getComplexAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType").ATTR_FAULT);
};

theClass.prototype.setFault = function(fault) {
    var classRef = this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType");
    var attrRef = classRef.ATTR_FAULT;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("fault instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, fault);
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

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.rootType"]();
