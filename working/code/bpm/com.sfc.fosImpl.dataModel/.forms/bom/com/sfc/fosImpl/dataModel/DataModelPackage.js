/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the package class com.sfc.fosImpl.dataModel.DataModelPackage.
 */

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.DataModelPackage"] = function() {

/**
 * Constructor.
 */
var theClass = function() {
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.sfc.fosImpl.dataModel.DataModelPackage");

// Define the enumerations declared by this package.
theClass.AccountType = ["NEW", "MIGRATION"];
theClass.AccountType.NEW = "NEW";
theClass.AccountType.MIGRATION = "MIGRATION";
theClass.getAccountType = function() {
    return this.AccountType;
};
theClass.ServiceType = ["INTERNET", "FIBER", "WIMAX"];
theClass.ServiceType.INTERNET = "INTERNET";
theClass.ServiceType.FIBER = "FIBER";
theClass.ServiceType.WIMAX = "WIMAX";
theClass.getServiceType = function() {
    return this.ServiceType;
};
theClass.Bandwidth = ["FFB5"];
theClass.Bandwidth.FFB5 = "FFB5";
theClass.getBandwidth = function() {
    return this.Bandwidth;
};
theClass.TechnologyList = ["FIBER"];
theClass.TechnologyList.FIBER = "FIBER";
theClass.getTechnologyList = function() {
    return this.TechnologyList;
};
theClass.ServiceStatus = ["REGISTERED", "VERIFIED", "APPROVED", "COMPLETED"];
theClass.ServiceStatus.REGISTERED = "REGISTERED";
theClass.ServiceStatus.VERIFIED = "VERIFIED";
theClass.ServiceStatus.APPROVED = "APPROVED";
theClass.ServiceStatus.COMPLETED = "COMPLETED";
theClass.getServiceStatus = function() {
    return this.ServiceStatus;
};
theClass.EmailRecipient = ["NONE", "SPECIFIC", "PM"];
theClass.EmailRecipient.NONE = "NONE";
theClass.EmailRecipient.SPECIFIC = "SPECIFIC";
theClass.EmailRecipient.PM = "PM";
theClass.getEmailRecipient = function() {
    return this.EmailRecipient;
};
theClass.TaskRecipient = ["NONE", "SPECIFIC", "PM"];
theClass.TaskRecipient.NONE = "NONE";
theClass.TaskRecipient.SPECIFIC = "SPECIFIC";
theClass.TaskRecipient.PM = "PM";
theClass.getTaskRecipient = function() {
    return this.TaskRecipient;
};
theClass.ProcessName = ["PROVISIONING", "DECOMISSIONING"];
theClass.ProcessName.PROVISIONING = "PROVISIONING";
theClass.ProcessName.DECOMISSIONING = "DECOMISSIONING";
theClass.getProcessName = function() {
    return this.ProcessName;
};
theClass.EnableDisable = ["ENABLE", "DISABLE"];
theClass.EnableDisable.ENABLE = "ENABLE";
theClass.EnableDisable.DISABLE = "DISABLE";
theClass.getEnableDisable = function() {
    return this.EnableDisable;
};

// Load the classes defined by this package.
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.ProvisioningDataModel");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.SystemParameters");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.SLA_Configuration");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.TechnicalInformation");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.EquipmentDetails");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.ContractorGroups");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.CommentData");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.CommentDataCase");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.LookupTable");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.ProcessNameAndSteps");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.DecommissionExecutionRequest");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.Header");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.planItem");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.UserDefinedFields");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.BussinessUsers");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.ActivationExecutionRequest");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.Process_Logging");
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.MaterialBreakdown");

// Load the associated factory.
com.tibco.data.Loader.currentLoader.load("com.sfc.fosImpl.dataModel.DataModelFactory");

};

com.tibco.data.Loader.classDefiner["com.sfc.fosImpl.dataModel.DataModelPackage"]();
