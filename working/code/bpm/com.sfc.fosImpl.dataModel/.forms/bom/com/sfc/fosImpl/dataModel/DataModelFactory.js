/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.sfc.fosImpl.dataModel.DataModelFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.DataModelFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.sfc.fosImpl.dataModel.DataModelFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.sfc.fosImpl.dataModel.ProvisioningDataModel", "com.sfc.fosImpl.dataModel.SystemParameters", "com.sfc.fosImpl.dataModel.SLA_Configuration", "com.sfc.fosImpl.dataModel.TehnicalInformation", "com.sfc.fosImpl.dataModel.EquipmentDetails", "com.sfc.fosImpl.dataModel.ContractorGroups", "com.sfc.fosImpl.dataModel.CommentData", "com.sfc.fosImpl.dataModel.CommentDataCase", "com.sfc.fosImpl.dataModel.TaskTable"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.sfc.fosImpl.dataModel.DataModelFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createProvisioningDataModel = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ProvisioningDataModel", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateProvisioningDataModel = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ProvisioningDataModel", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSystemParameters = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.SystemParameters", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSystemParameters = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.SystemParameters", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSLA_Configuration = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.SLA_Configuration", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSLA_Configuration = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.SLA_Configuration", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createTehnicalInformation = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.TehnicalInformation", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateTehnicalInformation = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.TehnicalInformation", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createEquipmentDetails = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.EquipmentDetails", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateEquipmentDetails = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.EquipmentDetails", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createContractorGroups = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ContractorGroups", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateContractorGroups = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ContractorGroups", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCommentData = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.CommentData", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCommentData = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.CommentData", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCommentDataCase = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.CommentDataCase", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCommentDataCase = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.CommentDataCase", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createTaskTable = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.TaskTable", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateTaskTable = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.TaskTable", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.DataModelFactory"]();
