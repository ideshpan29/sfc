/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType", "com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createCreateresourceType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateresourceType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCreateresourceinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateresourceinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCreateresourceoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateresourceoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createFaultType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateFaultType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createFetchresourceType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateFetchresourceType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createFetchresourceinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateFetchresourceinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createFetchresourceoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateFetchresourceoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createResourceType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateResourceType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createGetprocessinstancesType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGetprocessinstancesType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createGetprocessinstancesinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGetprocessinstancesinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createGetprocessinstancesoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGetprocessinstancesoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createPi_completeType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePi_completeType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createPi_startedType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePi_startedType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createPi_haltedType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePi_haltedType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createPi_cancelledType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePi_cancelledType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createLdapentryType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateLdapentryType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createLdapentryinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateLdapentryinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createLdapentryinputrepeatType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateLdapentryinputrepeatType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createInputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateInputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createParsecsvType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateParsecsvType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createUsersType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateUsersType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createReesourcecreationandmappingType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateReesourcecreationandmappingType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createReportgenerationType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateReportgenerationType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSearchprocessinstancesType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSearchprocessinstancesType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSearchprocessinstancesinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSearchprocessinstancesinputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSearchprocessinstancesoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSearchprocessinstancesoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSearchrecordType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSearchrecordType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createRootType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateRootType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createWorkitemcompletionType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateWorkitemcompletionType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createWorkitemcompletioninputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateWorkitemcompletioninputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createWorkitemcompletionoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateWorkitemcompletionoutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory"]();
