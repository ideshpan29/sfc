/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.example.sfc_provisioningbom.Sfc_provisioningbomFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioningbom.Sfc_provisioningbomFactory"] = function() {

/**
 * Constructor.
 */
var theClass = function(form) {
    this.context = new Object();
    this.context.form = form;
    this.context.dataStore = form.getDataStore();
    this.context.logger = form.getLogger();
    this.context.item = null;
    this.context.id = null;
    this.loader = form._loader;
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.sfc_provisioningbom.Sfc_provisioningbomFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.example.sfc_provisioningbom.ProvisioningDataModel", "com.example.sfc_provisioningbom.SystemParameters", "com.example.sfc_provisioningbom.SLA_Configuration", "com.example.sfc_provisioningbom.TehnicalInformation", "com.example.sfc_provisioningbom.EquipmentDetails"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.example.sfc_provisioningbom.Sfc_provisioningbomFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createProvisioningDataModel = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.ProvisioningDataModel", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateProvisioningDataModel = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.ProvisioningDataModel", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSystemParameters = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.SystemParameters", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSystemParameters = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.SystemParameters", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSLA_Configuration = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.SLA_Configuration", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSLA_Configuration = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.SLA_Configuration", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createTehnicalInformation = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.TehnicalInformation", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateTehnicalInformation = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.TehnicalInformation", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createEquipmentDetails = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.EquipmentDetails", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateEquipmentDetails = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.sfc_provisioningbom.EquipmentDetails", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioningbom.Sfc_provisioningbomFactory"]();
