/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.planItem. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.ProvisioningDataModel");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.TechnicalInformation");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.UserDefinedFields");

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.planItem"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.planItem");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PLANITEMID = "planItemID";
theClass.ATTR_PROVISIONINGDATA = "provisioningData";
theClass.ATTR_TECHNICALINFORMATION = "technicalInformation";
theClass.ATTR_UDF = "udf";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PLANITEMID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROVISIONINGDATA] = {type:"com.sfc.fosImpl.dataModel.ProvisioningDataModel", baseType:"com.sfc.fosImpl.dataModel.ProvisioningDataModel", primitive:false, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TECHNICALINFORMATION] = {type:"com.sfc.fosImpl.dataModel.TechnicalInformation", baseType:"com.sfc.fosImpl.dataModel.TechnicalInformation", primitive:false, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_UDF] = {type:"com.sfc.fosImpl.dataModel.UserDefinedFields", baseType:"com.sfc.fosImpl.dataModel.UserDefinedFields", primitive:false, multivalued:true, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PLANITEMID];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_PROVISIONINGDATA, theClass.ATTR_TECHNICALINFORMATION, theClass.ATTR_UDF];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PLANITEMID, theClass.ATTR_PROVISIONINGDATA, theClass.ATTR_TECHNICALINFORMATION, theClass.ATTR_UDF];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.planItem";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.planItem");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.planItem");
};

theClass.prototype.getPlanItemID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.planItem").ATTR_PLANITEMID, useInternal);
};

theClass.prototype.setPlanItemID = function(planItemID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.planItem").ATTR_PLANITEMID, planItemID);
};


theClass.prototype.getProvisioningData = function() {
    return this._getComplexAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.planItem").ATTR_PROVISIONINGDATA);
};

theClass.prototype.setProvisioningData = function(provisioningData) {
    var classRef = this.loader.getClass("com.sfc.fosImpl.dataModel.planItem");
    var attrRef = classRef.ATTR_PROVISIONINGDATA;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("provisioningData instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, provisioningData);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getTechnicalInformation = function() {
    return this._getComplexAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.planItem").ATTR_TECHNICALINFORMATION);
};

theClass.prototype.setTechnicalInformation = function(technicalInformation) {
    var classRef = this.loader.getClass("com.sfc.fosImpl.dataModel.planItem");
    var attrRef = classRef.ATTR_TECHNICALINFORMATION;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("technicalInformation instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, technicalInformation);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getUdf = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.planItem").ATTR_UDF);
};

theClass.prototype.setUdf = function(udf) {
    throw("unsupported array attribute: udf");
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.planItem"]();
