/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.adminOps.dataModel.ContractorGroups. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.adminOps.dataModel.ContractorGroups"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.adminOps.dataModel.ContractorGroups");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_FIRSTNAME = "firstName";
theClass.ATTR_LASTNAME = "lastName";
theClass.ATTR_EMAILID = "emailID";
theClass.ATTR_CONTRACTORGROUPNAME = "contractorGroupName";
theClass.ATTR_MASTERUSER = "masterUser";
theClass.ATTR_LOGINNAME = "loginName";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_FIRSTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LASTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EMAILID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CONTRACTORGROUPNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MASTERUSER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LOGINNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_FIRSTNAME, theClass.ATTR_LASTNAME, theClass.ATTR_EMAILID, theClass.ATTR_CONTRACTORGROUPNAME, theClass.ATTR_MASTERUSER, theClass.ATTR_LOGINNAME];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_FIRSTNAME, theClass.ATTR_LASTNAME, theClass.ATTR_EMAILID, theClass.ATTR_CONTRACTORGROUPNAME, theClass.ATTR_MASTERUSER, theClass.ATTR_LOGINNAME];

theClass.getName = function() {
    return "com.sfc.fosImpl.adminOps.dataModel.ContractorGroups";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.adminOps.dataModel.ContractorGroups");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups");
};

theClass.prototype.getFirstName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_FIRSTNAME, useInternal);
};

theClass.prototype.setFirstName = function(firstName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_FIRSTNAME, firstName);
};


theClass.prototype.getLastName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_LASTNAME, useInternal);
};

theClass.prototype.setLastName = function(lastName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_LASTNAME, lastName);
};


theClass.prototype.getEmailID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_EMAILID, useInternal);
};

theClass.prototype.setEmailID = function(emailID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_EMAILID, emailID);
};


theClass.prototype.getContractorGroupName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_CONTRACTORGROUPNAME, useInternal);
};

theClass.prototype.setContractorGroupName = function(contractorGroupName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_CONTRACTORGROUPNAME, contractorGroupName);
};


theClass.prototype.getMasterUser = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_MASTERUSER, useInternal);
};

theClass.prototype.setMasterUser = function(masterUser) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_MASTERUSER, masterUser);
};


theClass.prototype.getLoginName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_LOGINNAME, useInternal);
};

theClass.prototype.setLoginName = function(loginName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.adminOps.dataModel.ContractorGroups").ATTR_LOGINNAME, loginName);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.adminOps.dataModel.ContractorGroups"]();
