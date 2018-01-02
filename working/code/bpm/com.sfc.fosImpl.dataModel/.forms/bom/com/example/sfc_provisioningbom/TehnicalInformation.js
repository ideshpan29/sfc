/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.sfc_provisioningbom.TehnicalInformation. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.example.sfc_provisioningbom.EquipmentDetails");

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioningbom.TehnicalInformation"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.sfc_provisioningbom.TehnicalInformation");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_CARRIERVLAN = "carrierVLAN";
theClass.ATTR_CARRIERIP = "carrierIP";
theClass.ATTR_AGGPOINT = "aggPoint";
theClass.ATTR_PORT = "port";
theClass.ATTR_CLIENTVLAN = "clientVLAN";
theClass.ATTR_CLIENTIP = "clientIP";
theClass.ATTR_SFCPOPPE = "SFCPOPPE";
theClass.ATTR_PORTTYPE = "portType";
theClass.ATTR_EQUIPMENT = "equipment";
theClass.ATTR_MODIFIEDBY = "modifiedBy";
theClass.ATTR_MODIFIEDDATE = "modifiedDate";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_CARRIERVLAN] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CARRIERIP] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_AGGPOINT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PORT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CLIENTVLAN] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CLIENTIP] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SFCPOPPE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PORTTYPE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EQUIPMENT] = {type:"com.example.sfc_provisioningbom.EquipmentDetails", baseType:"com.example.sfc_provisioningbom.EquipmentDetails", primitive:false, multivalued:true, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MODIFIEDBY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MODIFIEDDATE] = {type:"BomPrimitiveTypes.Date", baseType:"BomPrimitiveTypes.Date", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_CARRIERVLAN, theClass.ATTR_CARRIERIP, theClass.ATTR_AGGPOINT, theClass.ATTR_PORT, theClass.ATTR_CLIENTVLAN, theClass.ATTR_CLIENTIP, theClass.ATTR_SFCPOPPE, theClass.ATTR_PORTTYPE, theClass.ATTR_MODIFIEDBY, theClass.ATTR_MODIFIEDDATE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_EQUIPMENT];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_CARRIERVLAN, theClass.ATTR_CARRIERIP, theClass.ATTR_AGGPOINT, theClass.ATTR_PORT, theClass.ATTR_CLIENTVLAN, theClass.ATTR_CLIENTIP, theClass.ATTR_SFCPOPPE, theClass.ATTR_PORTTYPE, theClass.ATTR_EQUIPMENT, theClass.ATTR_MODIFIEDBY, theClass.ATTR_MODIFIEDDATE];

theClass.getName = function() {
    return "com.example.sfc_provisioningbom.TehnicalInformation";
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
		throw("Attribute " + attName + " not recognized for class com.example.sfc_provisioningbom.TehnicalInformation");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation");
};

theClass.prototype.getCarrierVLAN = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CARRIERVLAN, useInternal);
};

theClass.prototype.setCarrierVLAN = function(carrierVLAN) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CARRIERVLAN, carrierVLAN);
};


theClass.prototype.getCarrierIP = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CARRIERIP, useInternal);
};

theClass.prototype.setCarrierIP = function(carrierIP) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CARRIERIP, carrierIP);
};


theClass.prototype.getAggPoint = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_AGGPOINT, useInternal);
};

theClass.prototype.setAggPoint = function(aggPoint) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_AGGPOINT, aggPoint);
};


theClass.prototype.getPort = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_PORT, useInternal);
};

theClass.prototype.setPort = function(port) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_PORT, port);
};


theClass.prototype.getClientVLAN = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CLIENTVLAN, useInternal);
};

theClass.prototype.setClientVLAN = function(clientVLAN) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CLIENTVLAN, clientVLAN);
};


theClass.prototype.getClientIP = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CLIENTIP, useInternal);
};

theClass.prototype.setClientIP = function(clientIP) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_CLIENTIP, clientIP);
};


theClass.prototype.getSFCPOPPE = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_SFCPOPPE, useInternal);
};

theClass.prototype.setSFCPOPPE = function(SFCPOPPE) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_SFCPOPPE, SFCPOPPE);
};


theClass.prototype.getPortType = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_PORTTYPE, useInternal);
};

theClass.prototype.setPortType = function(portType) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_PORTTYPE, portType);
};


theClass.prototype.getEquipment = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_EQUIPMENT);
};

theClass.prototype.setEquipment = function(equipment) {
    throw("unsupported array attribute: equipment");
};


theClass.prototype.getModifiedBy = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_MODIFIEDBY, useInternal);
};

theClass.prototype.setModifiedBy = function(modifiedBy) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_MODIFIEDBY, modifiedBy);
};


theClass.prototype.getModifiedDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_MODIFIEDDATE, useInternal);
};

theClass.prototype.setModifiedDate = function(modifiedDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.sfc_provisioningbom.TehnicalInformation").ATTR_MODIFIEDDATE, modifiedDate);
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

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioningbom.TehnicalInformation"]();
