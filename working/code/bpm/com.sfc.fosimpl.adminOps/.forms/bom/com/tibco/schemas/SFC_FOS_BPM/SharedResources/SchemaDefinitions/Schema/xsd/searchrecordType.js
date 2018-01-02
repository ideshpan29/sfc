/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType. 
 */ 


com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PROCESS_INSTANCE = "process_instance";
theClass.ATTR_CUSTOMER_NAME = "customer_name";
theClass.ATTR_SIBELCIRCUIT_ID = "sibelcircuit_id";
theClass.ATTR_PROJECTMANAGER = "projectmanager";
theClass.ATTR_CUR_ACTIVITY = "cur_activity";
theClass.ATTR_STATUS = "status";
theClass.ATTR_EXEC_MILLS = "exec_mills";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PROCESS_INSTANCE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CUSTOMER_NAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SIBELCIRCUIT_ID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROJECTMANAGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CUR_ACTIVITY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EXEC_MILLS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PROCESS_INSTANCE, theClass.ATTR_CUSTOMER_NAME, theClass.ATTR_SIBELCIRCUIT_ID, theClass.ATTR_PROJECTMANAGER, theClass.ATTR_CUR_ACTIVITY, theClass.ATTR_STATUS, theClass.ATTR_EXEC_MILLS];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PROCESS_INSTANCE, theClass.ATTR_CUSTOMER_NAME, theClass.ATTR_SIBELCIRCUIT_ID, theClass.ATTR_PROJECTMANAGER, theClass.ATTR_CUR_ACTIVITY, theClass.ATTR_STATUS, theClass.ATTR_EXEC_MILLS];

theClass.getName = function() {
    return "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType";
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
		throw("Attribute " + attName + " not recognized for class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType");
};

theClass.prototype.getProcess_instance = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_PROCESS_INSTANCE, useInternal);
};

theClass.prototype.setProcess_instance = function(process_instance) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_PROCESS_INSTANCE, process_instance);
};


theClass.prototype.getCustomer_name = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_CUSTOMER_NAME, useInternal);
};

theClass.prototype.setCustomer_name = function(customer_name) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_CUSTOMER_NAME, customer_name);
};


theClass.prototype.getSibelcircuit_id = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_SIBELCIRCUIT_ID, useInternal);
};

theClass.prototype.setSibelcircuit_id = function(sibelcircuit_id) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_SIBELCIRCUIT_ID, sibelcircuit_id);
};


theClass.prototype.getProjectmanager = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_PROJECTMANAGER, useInternal);
};

theClass.prototype.setProjectmanager = function(projectmanager) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_PROJECTMANAGER, projectmanager);
};


theClass.prototype.getCur_activity = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_CUR_ACTIVITY, useInternal);
};

theClass.prototype.setCur_activity = function(cur_activity) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_CUR_ACTIVITY, cur_activity);
};


theClass.prototype.getStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_STATUS, useInternal);
};

theClass.prototype.setStatus = function(status) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_STATUS, status);
};


theClass.prototype.getExec_mills = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_EXEC_MILLS, useInternal);
};

theClass.prototype.setExec_mills = function(exec_mills) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType").ATTR_EXEC_MILLS, exec_mills);
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

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.xsd.searchrecordType"]();
