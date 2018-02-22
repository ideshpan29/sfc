function setupFontColor(ctrlID) {
	$(ctrlID).css('color', 'white');
}

function chngeBkGrndColor(ctrlID) {
	$(ctrlID).css("background-color", "rgb(235, 235, 228");
}

function disableMgmtIPFields() {
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_carrierVLAN]');
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_carrierIP]');
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_aggPoint]');
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_port]');
}
function disableServiceIPFields() {
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_clientVLAN]');
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_clientIP]');
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_SFCPOPPE]');
	chngeBkGrndColor('[id$=widget_control_TechnicalInfo_portType]');
}

function chngeBkGrndColorProvData() {
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_siebelCircuitID]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_projectManager]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_account]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_clientID]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_accountManager]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_clientName]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_contractor]');

chngeBkGrndColor('[id$=widget_control_Provisioning_Data_regionView]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_floor]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_GPSCoordinates]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_sector]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_buildingName]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_buildingID]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_serviceStatus]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_contactPerson]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_mobile]');
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_email]');
	
	
chngeBkGrndColor('[id$=widget_control_Provisioning_Data_serviceType]');
}