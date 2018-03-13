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

theClass.prototype.SUPPORTED_CLASSES = ["com.sfc.fosImpl.dataModel.ProvisioningDataModel", "com.sfc.fosImpl.dataModel.SystemParameters", "com.sfc.fosImpl.dataModel.SLA_Configuration", "com.sfc.fosImpl.dataModel.TechnicalInformation", "com.sfc.fosImpl.dataModel.EquipmentDetails", "com.sfc.fosImpl.dataModel.ContractorGroups", "com.sfc.fosImpl.dataModel.CommentData", "com.sfc.fosImpl.dataModel.CommentDataCase", "com.sfc.fosImpl.dataModel.LookupTable", "com.sfc.fosImpl.dataModel.ProcessNameAndSteps", "com.sfc.fosImpl.dataModel.DecommissionExecutionRequest", "com.sfc.fosImpl.dataModel.Header", "com.sfc.fosImpl.dataModel.planItem", "com.sfc.fosImpl.dataModel.UserDefinedFields", "com.sfc.fosImpl.dataModel.BussinessUsers", "com.sfc.fosImpl.dataModel.ActivationExecutionRequest", "com.sfc.fosImpl.dataModel.Process_Logging", "com.sfc.fosImpl.dataModel.MaterialBreakdown"];

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
    
theClass.prototype.createTechnicalInformation = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.TechnicalInformation", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateTechnicalInformation = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.TechnicalInformation", this.context);
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
    
theClass.prototype.createLookupTable = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.LookupTable", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateLookupTable = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.LookupTable", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createProcessNameAndSteps = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ProcessNameAndSteps", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateProcessNameAndSteps = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ProcessNameAndSteps", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createDecommissionExecutionRequest = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.DecommissionExecutionRequest", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateDecommissionExecutionRequest = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.DecommissionExecutionRequest", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createHeader = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.Header", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateHeader = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.Header", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createPlanItem = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.planItem", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePlanItem = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.planItem", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createUserDefinedFields = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.UserDefinedFields", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateUserDefinedFields = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.UserDefinedFields", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createBussinessUsers = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.BussinessUsers", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateBussinessUsers = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.BussinessUsers", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createActivationExecutionRequest = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ActivationExecutionRequest", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateActivationExecutionRequest = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.ActivationExecutionRequest", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createProcess_Logging = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.Process_Logging", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateProcess_Logging = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.Process_Logging", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createMaterialBreakdown = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.MaterialBreakdown", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateMaterialBreakdown = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.dataModel.MaterialBreakdown", this.context);
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
