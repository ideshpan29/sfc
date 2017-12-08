/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.XsdFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.XsdFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.XsdFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.requestType", "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.responseType", "com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.XsdFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createRequestType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.requestType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateRequestType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.requestType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createResponseType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.responseType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateResponseType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.responseType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createRootType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateRootType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.rootType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.Processes.FOSBPMInterface.Adapter.FOSBPMInterface.SubProcesses.ResourceCreationAndMapping.Schemas.Schema4.xsd.XsdFactory"]();
