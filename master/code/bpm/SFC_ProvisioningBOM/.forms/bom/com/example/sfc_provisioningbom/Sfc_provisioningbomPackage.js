/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the package class com.example.sfc_provisioningbom.Sfc_provisioningbomPackage.
 */

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioningbom.Sfc_provisioningbomPackage"] = function() {

/**
 * Constructor.
 */
var theClass = function() {
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.sfc_provisioningbom.Sfc_provisioningbomPackage");

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
theClass.EmailRecipient = ["NONE", "GROUP", "PERSON"];
theClass.EmailRecipient.NONE = "NONE";
theClass.EmailRecipient.GROUP = "GROUP";
theClass.EmailRecipient.PERSON = "PERSON";
theClass.getEmailRecipient = function() {
    return this.EmailRecipient;
};
theClass.TaskRecipient = ["NONE", "GROUP", "PERSON"];
theClass.TaskRecipient.NONE = "NONE";
theClass.TaskRecipient.GROUP = "GROUP";
theClass.TaskRecipient.PERSON = "PERSON";
theClass.getTaskRecipient = function() {
    return this.TaskRecipient;
};

// Load the classes defined by this package.
com.tibco.data.Loader.currentLoader.load("com.example.sfc_provisioningbom.ProvisioningDataModel");
com.tibco.data.Loader.currentLoader.load("com.example.sfc_provisioningbom.SystemParameters");
com.tibco.data.Loader.currentLoader.load("com.example.sfc_provisioningbom.Case1");

// Load the associated factory.
com.tibco.data.Loader.currentLoader.load("com.example.sfc_provisioningbom.Sfc_provisioningbomFactory");

};

com.tibco.data.Loader.classDefiner["com.example.sfc_provisioningbom.Sfc_provisioningbomPackage"]();
