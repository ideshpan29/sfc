/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.sfc.fosImpl.bizData.dataModel.DataModelFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.bizData.dataModel.DataModelFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.sfc.fosImpl.bizData.dataModel.DataModelFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.sfc.fosImpl.bizData.dataModel.Technical_Information", "com.sfc.fosImpl.bizData.dataModel.Equipment_Details"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.sfc.fosImpl.bizData.dataModel.DataModelFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createTechnical_Information = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.bizData.dataModel.Technical_Information", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateTechnical_Information = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.bizData.dataModel.Technical_Information", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createEquipment_Details = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.bizData.dataModel.Equipment_Details", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateEquipment_Details = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.bizData.dataModel.Equipment_Details", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.bizData.dataModel.DataModelFactory"]();
