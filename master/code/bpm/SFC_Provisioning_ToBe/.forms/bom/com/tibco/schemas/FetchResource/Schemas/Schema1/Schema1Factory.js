/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Factory. 
 */ 

com.tibco.data.Loader.classDefiner["com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Factory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Factory");

theClass.prototype.SUPPORTED_CLASSES = ["com.tibco.schemas.FetchResource.Schemas.Schema1.rootType", "com.tibco.schemas.FetchResource.Schemas.Schema1.resourcesType"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Factory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createRootType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.FetchResource.Schemas.Schema1.rootType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateRootType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.FetchResource.Schemas.Schema1.rootType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createResourcesType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.FetchResource.Schemas.Schema1.resourcesType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateResourcesType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.FetchResource.Schemas.Schema1.resourcesType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.tibco.schemas.FetchResource.Schemas.Schema1.Schema1Factory"]();
