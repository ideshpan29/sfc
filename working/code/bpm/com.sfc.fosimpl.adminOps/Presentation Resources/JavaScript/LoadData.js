function abc(a,b)
{
alert("all ok");
}



function ldTechnicalInfo(factory,pane,control,logger,url,funcName)
 {
	try
	 {
			var tmpURL = url+funcName;
		
				
   					 // code for modern browsers
   					  var xmlhttp = new XMLHttpRequest();
				
				
				
		//var xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			logger.info(xmlhttp.status);		
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.responseText;
			
			var xmlDoc="";	
				if (window.XMLHttpRequest) {
    // code for modern browsers
    parser=new DOMParser();
    xmlDoc = parser.parseFromString(xm,"text/xml");
   
 } else {
    // code for old IE browsers
    xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
   
    xmlDoc.loadXML(xm);
}
				
				
				logger.info(xm);
    			
				xmlDoc.async = false; 
				
				logger.info(xm);
				
				var recordSet = xmlDoc.getElementsByTagName("model:Technical_InformationElement");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
		
	
				
				
				
							
				for(var i=0;i<lngth;i++) {
					
					
					 
			var record=factory.com_sfc_fosImpl_bizData_dataModel.createTechnical_Information();
					 
					
					recordSet = xmlDoc.getElementsByTagName("carrierVLAN");
					if(recordSet[i].childNodes[0]!=null)	{
						
						pane.TechnicalInformation.getValue().setCarrierVLAN(recordSet[i].childNodes[0].nodeValue);

					}
				
				recordSet = xmlDoc.getElementsByTagName("carrierIP");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.TechnicalInformation.getValue().setCarrierIP(recordSet[i].childNodes[0].nodeValue);
						
					}
					
					recordSet = xmlDoc.getElementsByTagName("aggPoint");
					if(recordSet[i].childNodes[0]!=null)	{
							
						pane.TechnicalInformation.getValue().setAggPoint(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("port");
					if(recordSet[i].childNodes[0]!=null)	{
							
				
						pane.TechnicalInformation.getValue().setPort(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("clientVLAN");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.TechnicalInformation.getValue().setClientVLAN(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("clientIP");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.TechnicalInformation.getValue().setClientIP(recordSet[i].childNodes[0].nodeValue);
					
					}
					recordSet = xmlDoc.getElementsByTagName("SFCPOPPE");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.TechnicalInformation.getValue().setSFCPOPPE(recordSet[i].childNodes[0].nodeValue);
					
					}
					recordSet = xmlDoc.getElementsByTagName("portType");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.TechnicalInformation.getValue().setPortType(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("modifiedBy");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.TechnicalInformation.getValue().setModifiedBy(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("siebelCircuitID");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.TechnicalInformation.getValue().setSiebelCircuitID(recordSet[i].childNodes[0].nodeValue);
					
					}
					
					
					
					
				}

logger.info("ckeck start");					




	pane.TechnicalInformation_equipment.getValue().clear();
				
				



var EquipmentSet = xmlDoc.getElementsByTagName("equipment");
logger.info("gotValue");
				var EquipmentLngth = EquipmentSet.length;
				logger.info("Lengh of the incoming array for Records: "+EquipmentLngth);




				
				
				for(var i=0;i<EquipmentLngth;i++) {
					
					
					logger.info("in for"); 
			var equipmentRecord=factory.com_sfc_fosImpl_bizData_dataModel.createEquipment_Details();
					 
					
					EquipmentSet = xmlDoc.getElementsByTagName("type");
					if(EquipmentSet[i].childNodes[0]!=null)	{
							
						equipmentRecord.setType(EquipmentSet[i].childNodes[0].nodeValue);
						logger.info(EquipmentSet[i].childNodes[0].nodeValue);
					}
					
					EquipmentSet = xmlDoc.getElementsByTagName("address");
					if(EquipmentSet[i].childNodes[0]!=null)	{
							
						equipmentRecord.setAddress(EquipmentSet[i].childNodes[0].nodeValue);
						logger.info(EquipmentSet[i].childNodes[0].nodeValue);
					}
					EquipmentSet = xmlDoc.getElementsByTagName("VLAN");
					if(EquipmentSet[i].childNodes[0]!=null)	{
							
						equipmentRecord.setVLAN(EquipmentSet[i].childNodes[0].nodeValue);
						logger.info(EquipmentSet[i].childNodes[0].nodeValue);
					}
					
					
					pane.TechnicalInformation_equipment.getValue().add(equipmentRecord);
					
					}






				
		logger.info("end");				
						

	
				}	
			
			
			else {
				//alert("Else: Error: Please contact System Administrator");
			}
		};
		result = xmlhttp.send();
	}
	catch (e) {
		alert("Catch: Error: Please contact System Administrator");
	}
}


	
function ldCustomerInfo(factory,pane,control,logger,url,funcName)
 {
	try
	 {
			var tmpURL = url+funcName;
		
				
   					 // code for modern browsers
   					  var xmlhttp = new XMLHttpRequest();
				
				
				
		//var xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			logger.info(xmlhttp.status);		
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.responseText;
			
			var xmlDoc="";	
				if (window.XMLHttpRequest) {
    // code for modern browsers
    parser=new DOMParser();
    xmlDoc = parser.parseFromString(xm,"text/xml");
   
 } else {
    // code for old IE browsers
    xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
   
    xmlDoc.loadXML(xm);
}
				//var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
				
				logger.info(xm);
    			
			
				xmlDoc.async = false; 
				
				logger.info(xm);
				
				var recordSet = xmlDoc.getElementsByTagName("model:Customer_InformationElement");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
			
				
				
				
							
				for(var i=0;i<lngth;i++) {
					
					
					 
					var record=factory.com_sfc_fosImpl_bizData_dataModel.createCustomer_Information();
					 
					
					recordSet = xmlDoc.getElementsByTagName("siebelCircuitID");
					if(recordSet[i].childNodes[0]!=null)	{
						pane.CustomerInformation.getValue().setSiebelCircuitID(recordSet[i].childNodes[0].nodeValue);	
						
						
					}
				
				recordSet = xmlDoc.getElementsByTagName("projectManager");
					if(recordSet[i].childNodes[0]!=null)	{
						pane.CustomerInformation.getValue().setProjectManager(recordSet[i].childNodes[0].nodeValue);	
												
					}
					
					recordSet = xmlDoc.getElementsByTagName("clientName");
					if(recordSet[i].childNodes[0]!=null)	{
					
						pane.CustomerInformation.getValue().setClientName(recordSet[i].childNodes[0].nodeValue);	
				
						
					}
					recordSet = xmlDoc.getElementsByTagName("accountManager");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setAccountManager(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("account");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setAccount(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("projectManager");
					if(recordSet[i].childNodes[0]!=null)	{
							
				
						pane.CustomerInformation.getValue().setProjectManager(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("contractor");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
							pane.CustomerInformation.getValue().setContractor(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("location");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setLocation(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("regionView");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setRegionView(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("floor");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.CustomerInformation.getValue().setFloor(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("clientID");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.CustomerInformation.getValue().setClientID(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("serviceType");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.CustomerInformation.getValue().setServiceType(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("GPSCoordinates");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.CustomerInformation.getValue().setGPSCoordinates(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("bandwidthupdown");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setBandwidthupdown(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("technology");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setTechnology(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("serviceStatus");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setServiceStatus(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("buildingName");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setBuildingName(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("buildingID");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setBuildingID(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("contactPerson");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.CustomerInformation.getValue().setContactPerson(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("mobile");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setMobile(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("sector");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setSector(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("email");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setEmail(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("serviceStart");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setServiceStart(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("serviceEnd");
					if(recordSet[i].childNodes[0]!=null)	{
							
					
						pane.CustomerInformation.getValue().setServiceEnd(recordSet[i].childNodes[0].nodeValue);
						
					}
					recordSet = xmlDoc.getElementsByTagName("requestDate");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setRequestDate(recordSet[i].childNodes[0].nodeValue);
						
					}
					
					recordSet = xmlDoc.getElementsByTagName("installDate");
					if(recordSet[i].childNodes[0]!=null)	{
							
						
						pane.CustomerInformation.getValue().setInstallDate(recordSet[i].childNodes[0].nodeValue);
						
					}
					logger.info("Customer Info Added");
						
						
	
				}	
			
			}
			else {
				//alert("Else: Error: Please contact System Administrator");
			}
		};
		result = xmlhttp.send();
	}
	catch (e) {
		alert("Catch: Error: Please contact System Administrator");
	}
}




function ldCommentsHist(factory,pane,control,logger,url,funcName)
 {
	try
	 {
			var tmpURL = url+funcName;
		
				
   					 // code for modern browsers
   					  var xmlhttp = new XMLHttpRequest();
				
				
				
		//var xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			logger.info(xmlhttp.status);		
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.responseText;
			
			var xmlDoc="";	
				if (window.XMLHttpRequest) {
    // code for modern browsers
    parser=new DOMParser();
    xmlDoc = parser.parseFromString(xm,"text/xml");
   
 } else {
    // code for old IE browsers
    xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
   
    xmlDoc.loadXML(xm);
}
				
				xmlDoc.async = false; 
				logger.info(xm);
				
				var recordSet = xmlDoc.getElementsByTagNameNS("http://fosImpl.sfc.com/dataModel","CommentDataCaseElement");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
				pane.CommentsHistory.getValue().clear();
					
					for(var i=0;i<lngth;i++) {
						
						var record=factory.com_sfc_fosImpl_dataModel.createCommentDataCase();
					recordSet = xmlDoc.getElementsByTagName("comment_Id");
					if(recordSet[i].childNodes[0]!=null)	{
						
						record.setComment_Id(recordSet[i].childNodes[0].nodeValue);
						logger.info(recordSet[i].childNodes[0].nodeValue);
					}
					recordSet = xmlDoc.getElementsByTagName("comments");
					if(recordSet[i].childNodes[0]!=null)	{
						
						record.setComments(recordSet[i].childNodes[0].nodeValue);
						logger.info(recordSet[i].childNodes[0].nodeValue);
					}
					recordSet = xmlDoc.getElementsByTagName("siebelCircuitID");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setSiebelCircuitID(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("taskName");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setTaskName(recordSet[i].childNodes[0].nodeValue);
					}
					recordSet = xmlDoc.getElementsByTagName("addedby");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setAddedby(recordSet[i].childNodes[0].nodeValue);
					}
					recordSet = xmlDoc.getElementsByTagName("time");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setTime(recordSet[i].childNodes[0].nodeValue);
					}
					
					pane.CommentsHistory.getValue().add(record);
					
					}
					
					logger.info("comments Info Added");
						
						
	
					
			
			}
			else {
				//alert("Else: Error: Please contact System Administrator");
			}
		};
		result = xmlhttp.send();
	}
	catch (e) {
		alert("Catch: Error: Please contact System Administrator");
	}
}
