/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.sfc.fosImpl.genericReporting.GenericReportingFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.genericReporting.GenericReportingFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.sfc.fosImpl.genericReporting.GenericReportingFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.sfc.fosImpl.genericReporting.Record", "com.sfc.fosImpl.genericReporting.Task"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.sfc.fosImpl.genericReporting.GenericReportingFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createRecord = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.genericReporting.Record", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateRecord = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.genericReporting.Record", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createTask = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.genericReporting.Task", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateTask = function(jsonData) {
    var classObject = this.loader.newInstance("com.sfc.fosImpl.genericReporting.Task", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.genericReporting.GenericReportingFactory"]();
