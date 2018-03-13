/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.sfc.fosImpl.dataModel.MaterialBreakdown. 
 */ 


com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.MaterialBreakdown"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.sfc.fosImpl.dataModel.MaterialBreakdown");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_SIEBELCIRCUITID = "siebelCircuitID";
theClass.ATTR_MATERIALDESCRIPTION = "materialDescription";
theClass.ATTR_UDM = "UDM";
theClass.ATTR_QTY = "qty";
theClass.ATTR_AMOUNT = "amount";
theClass.ATTR_UNITPRICE = "unitPrice";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_SIEBELCIRCUITID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MATERIALDESCRIPTION] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_UDM] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_QTY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_AMOUNT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_UNITPRICE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_MATERIALDESCRIPTION, theClass.ATTR_UDM, theClass.ATTR_QTY, theClass.ATTR_AMOUNT, theClass.ATTR_UNITPRICE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_SIEBELCIRCUITID, theClass.ATTR_MATERIALDESCRIPTION, theClass.ATTR_UDM, theClass.ATTR_QTY, theClass.ATTR_AMOUNT, theClass.ATTR_UNITPRICE];

theClass.getName = function() {
    return "com.sfc.fosImpl.dataModel.MaterialBreakdown";
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
		throw("Attribute " + attName + " not recognized for class com.sfc.fosImpl.dataModel.MaterialBreakdown");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown");
};

theClass.prototype.getSiebelCircuitID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_SIEBELCIRCUITID, useInternal);
};

theClass.prototype.setSiebelCircuitID = function(siebelCircuitID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_SIEBELCIRCUITID, siebelCircuitID);
};


theClass.prototype.getMaterialDescription = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_MATERIALDESCRIPTION, useInternal);
};

theClass.prototype.setMaterialDescription = function(materialDescription) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_MATERIALDESCRIPTION, materialDescription);
};


theClass.prototype.getUDM = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_UDM, useInternal);
};

theClass.prototype.setUDM = function(UDM) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_UDM, UDM);
};


theClass.prototype.getQty = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_QTY, useInternal);
};

theClass.prototype.setQty = function(qty) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_QTY, qty);
};


theClass.prototype.getAmount = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_AMOUNT, useInternal);
};

theClass.prototype.setAmount = function(amount) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_AMOUNT, amount);
};


theClass.prototype.getUnitPrice = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_UNITPRICE, useInternal);
};

theClass.prototype.setUnitPrice = function(unitPrice) {
    this._setPrimitiveAttribute(this.loader.getClass("com.sfc.fosImpl.dataModel.MaterialBreakdown").ATTR_UNITPRICE, unitPrice);
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

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.MaterialBreakdown"]();
