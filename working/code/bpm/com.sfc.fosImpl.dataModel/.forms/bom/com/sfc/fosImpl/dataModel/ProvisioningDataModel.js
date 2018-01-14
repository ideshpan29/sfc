/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.ProvisioningDataModel. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.ProvisioningDataModel"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.ProvisioningDataModel");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_SIEBELCIRCUITID = "siebelCircuitID";
theClass.ATTR_PROJECTMANAGER = "projectManager";
theClass.ATTR_CLIENTNAME = "clientName";
theClass.ATTR_ACCOUNTMANAGER = "accountManager";
theClass.ATTR_ACCOUNT = "account";
theClass.ATTR_CONTRACTOR = "contractor";
theClass.ATTR_LOCATION = "location";
theClass.ATTR_REGIONVIEW = "regionView";
theClass.ATTR_FLOOR = "floor";
theClass.ATTR_CLIENTID = "clientID";
theClass.ATTR_SERVICETYPE = "serviceType";
theClass.ATTR_GPSCOORDINATES = "GPSCoordinates";
theClass.ATTR_BANDWIDTHUPDOWN = "bandwidthupdown";
theClass.ATTR_TECHNOLOGY = "technology";
theClass.ATTR_SERVICESTATUS = "serviceStatus";
theClass.ATTR_BUILDINGNAME = "buildingName";
theClass.ATTR_BUILDINGID = "buildingID";
theClass.ATTR_CONTACTPERSON = "contactPerson";
theClass.ATTR_MOBILE = "mobile";
theClass.ATTR_SECTOR = "sector";
theClass.ATTR_EMAIL = "email";
theClass.ATTR_SERVICESTART = "serviceStart";
theClass.ATTR_SERVICEEND = "serviceEnd";
theClass.ATTR_REQUESTDATE = "requestDate";
theClass.ATTR_INSTALLDATE = "installDate";
theClass.ATTR_NOTESCOMMENTS = "notesComments";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_SIEBELCIRCUITID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROJECTMANAGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CLIENTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ACCOUNTMANAGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ACCOUNT] = {type:"com.sfc.fosImpl.dataModel.AccountType", baseType:"com.sfc.fosImpl.dataModel.AccountType", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CONTRACTOR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LOCATION] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_REGIONVIEW] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FLOOR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CLIENTID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SERVICETYPE] = {type:"com.sfc.fosImpl.dataModel.ServiceType", baseType:"com.sfc.fosImpl.dataModel.ServiceType", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GPSCOORDINATES] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BANDWIDTHUPDOWN] = {type:"com.sfc.fosImpl.dataModel.Bandwidth", baseType:"com.sfc.fosImpl.dataModel.Bandwidth", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TECHNOLOGY] = {type:"com.sfc.fosImpl.dataModel.TechnologyList", baseType:"com.sfc.fosImpl.dataModel.TechnologyList", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SERVICESTATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BUILDINGNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BUILDINGID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CONTACTPERSON] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MOBILE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SECTOR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EMAIL] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SERVICESTART] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SERVICEEND] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_REQUESTDATE] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_INSTALLDATE] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_NOTESCOMMENTS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_PROJECTMANAGER, theClass.ATTR_CLIENTNAME, theClass.ATTR_ACCOUNTMANAGER, theClass.ATTR_ACCOUNT, theClass.ATTR_CONTRACTOR, theClass.ATTR_LOCATION, theClass.ATTR_REGIONVIEW, theClass.ATTR_FLOOR, theClass.ATTR_CLIENTID, theClass.ATTR_SERVICETYPE, theClass.ATTR_GPSCOORDINATES, theClass.ATTR_BANDWIDTHUPDOWN, theClass.ATTR_TECHNOLOGY, theClass.ATTR_SERVICESTATUS, theClass.ATTR_BUILDINGNAME, theClass.ATTR_BUILDINGID, theClass.ATTR_CONTACTPERSON, theClass.ATTR_MOBILE, theClass.ATTR_SECTOR, theClass.ATTR_EMAIL, theClass.ATTR_SERVICESTART, theClass.ATTR_SERVICEEND, theClass.ATTR_REQUESTDATE, theClass.ATTR_INSTALLDATE, theClass.ATTR_NOTESCOMMENTS];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_PROJECTMANAGER, theClass.ATTR_CLIENTNAME, theClass.ATTR_ACCOUNTMANAGER, theClass.ATTR_ACCOUNT, theClass.ATTR_CONTRACTOR, theClass.ATTR_LOCATION, theClass.ATTR_REGIONVIEW, theClass.ATTR_FLOOR, theClass.ATTR_CLIENTID, theClass.ATTR_SERVICETYPE, theClass.ATTR_GPSCOORDINATES, theClass.ATTR_BANDWIDTHUPDOWN, theClass.ATTR_TECHNOLOGY, theClass.ATTR_SERVICESTATUS, theClass.ATTR_BUILDINGNAME, theClass.ATTR_BUILDINGID, theClass.ATTR_CONTACTPERSON, theClass.ATTR_MOBILE, theClass.ATTR_SECTOR, theClass.ATTR_EMAIL, theClass.ATTR_SERVICESTART, theClass.ATTR_SERVICEEND, theClass.ATTR_REQUESTDATE, theClass.ATTR_INSTALLDATE, theClass.ATTR_NOTESCOMMENTS];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.ProvisioningDataModel";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.ProvisioningDataModel");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel");
};

theClass.prototype.getSiebelCircuitID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SIEBELCIRCUITID, useInternal);
};

theClass.prototype.setSiebelCircuitID = function(siebelCircuitID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SIEBELCIRCUITID, siebelCircuitID);
};


theClass.prototype.getProjectManager = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_PROJECTMANAGER, useInternal);
};

theClass.prototype.setProjectManager = function(projectManager) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_PROJECTMANAGER, projectManager);
};


theClass.prototype.getClientName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CLIENTNAME, useInternal);
};

theClass.prototype.setClientName = function(clientName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CLIENTNAME, clientName);
};


theClass.prototype.getAccountManager = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_ACCOUNTMANAGER, useInternal);
};

theClass.prototype.setAccountManager = function(accountManager) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_ACCOUNTMANAGER, accountManager);
};


theClass.prototype.getAccount = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_ACCOUNT, useInternal);
};

theClass.prototype.setAccount = function(account) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_ACCOUNT, account);
};


theClass.prototype.getContractor = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CONTRACTOR, useInternal);
};

theClass.prototype.setContractor = function(contractor) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CONTRACTOR, contractor);
};


theClass.prototype.getLocation = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_LOCATION, useInternal);
};

theClass.prototype.setLocation = function(location) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_LOCATION, location);
};


theClass.prototype.getRegionView = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_REGIONVIEW, useInternal);
};

theClass.prototype.setRegionView = function(regionView) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_REGIONVIEW, regionView);
};


theClass.prototype.getFloor = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_FLOOR, useInternal);
};

theClass.prototype.setFloor = function(floor) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_FLOOR, floor);
};


theClass.prototype.getClientID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CLIENTID, useInternal);
};

theClass.prototype.setClientID = function(clientID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CLIENTID, clientID);
};


theClass.prototype.getServiceType = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICETYPE, useInternal);
};

theClass.prototype.setServiceType = function(serviceType) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICETYPE, serviceType);
};


theClass.prototype.getGPSCoordinates = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_GPSCOORDINATES, useInternal);
};

theClass.prototype.setGPSCoordinates = function(GPSCoordinates) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_GPSCOORDINATES, GPSCoordinates);
};


theClass.prototype.getBandwidthupdown = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_BANDWIDTHUPDOWN, useInternal);
};

theClass.prototype.setBandwidthupdown = function(bandwidthupdown) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_BANDWIDTHUPDOWN, bandwidthupdown);
};


theClass.prototype.getTechnology = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_TECHNOLOGY, useInternal);
};

theClass.prototype.setTechnology = function(technology) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_TECHNOLOGY, technology);
};


theClass.prototype.getServiceStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICESTATUS, useInternal);
};

theClass.prototype.setServiceStatus = function(serviceStatus) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICESTATUS, serviceStatus);
};


theClass.prototype.getBuildingName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_BUILDINGNAME, useInternal);
};

theClass.prototype.setBuildingName = function(buildingName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_BUILDINGNAME, buildingName);
};


theClass.prototype.getBuildingID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_BUILDINGID, useInternal);
};

theClass.prototype.setBuildingID = function(buildingID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_BUILDINGID, buildingID);
};


theClass.prototype.getContactPerson = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CONTACTPERSON, useInternal);
};

theClass.prototype.setContactPerson = function(contactPerson) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_CONTACTPERSON, contactPerson);
};


theClass.prototype.getMobile = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_MOBILE, useInternal);
};

theClass.prototype.setMobile = function(mobile) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_MOBILE, mobile);
};


theClass.prototype.getSector = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SECTOR, useInternal);
};

theClass.prototype.setSector = function(sector) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SECTOR, sector);
};


theClass.prototype.getEmail = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_EMAIL, useInternal);
};

theClass.prototype.setEmail = function(email) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_EMAIL, email);
};


theClass.prototype.getServiceStart = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICESTART, useInternal);
};

theClass.prototype.setServiceStart = function(serviceStart) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICESTART, serviceStart);
};


theClass.prototype.getServiceEnd = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICEEND, useInternal);
};

theClass.prototype.setServiceEnd = function(serviceEnd) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_SERVICEEND, serviceEnd);
};


theClass.prototype.getRequestDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_REQUESTDATE, useInternal);
};

theClass.prototype.setRequestDate = function(requestDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_REQUESTDATE, requestDate);
};


theClass.prototype.getInstallDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_INSTALLDATE, useInternal);
};

theClass.prototype.setInstallDate = function(installDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_INSTALLDATE, installDate);
};


theClass.prototype.getNotesComments = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_NOTESCOMMENTS, useInternal);
};

theClass.prototype.setNotesComments = function(notesComments) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.ProvisioningDataModel").ATTR_NOTESCOMMENTS, notesComments);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.ProvisioningDataModel"]();
