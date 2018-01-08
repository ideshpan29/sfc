
function abc(a,b)
{
alert("done");
}

function ldPrcNames(control,logger,url,funcName) 
{
	try {
			var tmpURL = url+funcName;
		
				
   					 // code for modern browsers
   					  var xmlhttp = new XMLHttpRequest();
				
				
				
		//var xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
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
				
				var recordSet = xmlDoc.getElementsByTagName("process");
				var lngth = recordSet.length;
				
				var lstPrcNames = new Array();
				
				for(var i=0;i<lngth;i++) {
					recordSet = xmlDoc.getElementsByTagName("name");
					if(recordSet[i].childNodes[0]!=null)
					{			
						lstPrcNames[i] = recordSet[i].childNodes[0].nodeValue;
					}
				}
				control.optnSelectProcess.setOptions(lstPrcNames,lstPrcNames);
			}
			else {
				//alert("Else: Error: Please contact System Administrator");
			}
		};
		result = xmlhttp.send();
	}
	catch (e) {
		alert("Catch: Error: Please contact System Administrator"+e);
	}
}




function ldPrcData(factory,pane,control,logger,url,funcName, flag, loginName) {
	try {
		var tmpURL = url+funcName;
		  var xmlhttp = new XMLHttpRequest();
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.responseText;
				
				
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
				
				var recordSet = xmlDoc.getElementsByTagName("Record");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
				var lstPrcNames = new Array();
				
				pane.CancelledInstances.getValue().clear();
				pane.StartedInstances.getValue().clear();
				pane.HaltedInstances.getValue().clear();
				pane.CompletedInstances.getValue().clear();
				
						
						
				for(var i=0;i<lngth;i++) {
					var record = factory.com_sfc_fosImpl_genericReporting.createRecord();
					recordSet = xmlDoc.getElementsByTagName("process_template");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProcessTemplate(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("process_instance");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProcessInstance(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("status");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setStatus(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("time");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setTime(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("SibelCircuitId");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setSiebelCircuitID(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ClientName");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setClientName(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ProjectManager");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProjectName(recordSet[i].childNodes[0].nodeValue);
					}
					
					
					
					if(flag=="true")
					{
					
					if(record.getStatus()=="pi_cancelled") {
						pane.CancelledInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_started") {
						pane.StartedInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_halted"){
						pane.HaltedInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_completed") {
						pane.CompletedInstances.getValue().add(record);
					}
					
					
					
					}
					else
					{
					
					if((record.getStatus()=="pi_cancelled") && (record.getProjectName()==loginName)) {
						pane.CancelledInstances.getValue().add(record);
					}
					else if((record.getStatus()=="pi_started") && (record.getProjectName()==loginName)) {
						pane.StartedInstances.getValue().add(record);
					}
					else if((record.getStatus()=="pi_halted") && (record.getProjectName()==loginName)){
						pane.HaltedInstances.getValue().add(record);
					}
					else if((record.getStatus()=="pi_completed")&& (record.getProjectName()==loginName)) {
						pane.CompletedInstances.getValue().add(record);
					}
					}
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

		
function ldTskData(factory,pane,control,logger,url,funcName) {
		try {
logger.info("in task analysis"+url+funcName);

var tmpURL = url+funcName;
		  var xmlhttp = new XMLHttpRequest();
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.responseText;
				
				
				
				if (window.XMLHttpRequest) {
    // code for modern browsers
    parser=new DOMParser();
    xmlDoc = parser.parseFromString(xm,"text/xml");
  } 
  else {
    // code for old IE browsers
    xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
  
    xmlDoc.loadXML(xm);
}
				//var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
				
				logger.info(xm);
				xmlDoc.async = false; 
				
				
				
				var recordSet = xmlDoc.getElementsByTagName("param");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
				
				
				pane.TaskList.getValue().clear();
				
							
				for(var i=0;i<lngth;i++) {
					logger.info("in for");
					 var record = factory.com_sfc_fosImpl_genericReporting.createTask();
					 
					 
					 
					recordSet = xmlDoc.getElementsByTagName("first_time_offer");
					if(recordSet[i].childNodes[0]!=null)	{	
					
					
 					//var mydate = new Date(recordSet[i].childNodes[0].nodeValue).toString();		
						//record.setFirstOfferTime(recordSet[i].childNodes[0].nodeValue);
						logger.info("New date inside"+new Date(recordSet[i].childNodes[0].nodeValue));
						record.setFirstOfferTime(new Date(recordSet[i].childNodes[0].nodeValue).toString());
						
						//logger.info("old dateeeee"+record.getFirstOfferTime());
						
					}
					else{
					logger.info("in rewcord add"+record.getFirstTimeOffer());
					}
					 
					 recordSet = xmlDoc.getElementsByTagName("process_instance");
					 
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProcessInstance(recordSet[i].childNodes[0].nodeValue);
						logger.info("in rewcord add insytnace"+record.getProcessInstance());
					}
					
					
					
					recordSet = xmlDoc.getElementsByTagName("activity_name");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setTaskName(recordSet[i].childNodes[0].nodeValue);
						
						logger.info("in rewcord add taskname"+record.getProcessInstance());
					}
					
					
					
					
					recordSet = xmlDoc.getElementsByTagName("activity_dur");
					if(recordSet[i].childNodes[0]!=null)	{	
							
							
						record.setTaskDuration(Math.ceil((recordSet[i].childNodes[0].nodeValue)/60000).toString());
						logger.info("in rewcord add activity duration"+record.getProcessInstance());
					}
					
					
					
					recordSet = xmlDoc.getElementsByTagName("wait_dur");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setWaitDuration(Math.ceil((recordSet[i].childNodes[0].nodeValue)/60000).toString());
						logger.info("in rewcord add waitduration"+record.getProcessInstance());
						
					}
					
					recordSet = xmlDoc.getElementsByTagName("work_time_dur");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setWorkDuration(Math.ceil((recordSet[i].childNodes[0].nodeValue)/60000).toString());
						logger.info("in workduration"+record.getProcessInstance());
					}
					
					recordSet = xmlDoc.getElementsByTagName("status");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setStatus(recordSet[i].childNodes[0].nodeValue);
						
						logger.info("status"+record.getProcessInstance());
					}
					
					logger.info("satish"+record);
						pane.TaskList.getValue().add(record);
						
				}
				
				
			}
				};
		result = xmlhttp.send();
	}
	catch (e) {
		alert("Catch: Error: Please contact System Administrator");
	}



}


function ldPrcSearchData(factory,pane,control,logger,url,funcName, flag, loginName) {
	try {
		var tmpURL = url+funcName;
		  var xmlhttp = new XMLHttpRequest();
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.responseText;
				
				
				
				if (window.XMLHttpRequest) {
    // code for modern browsers
    parser=new DOMParser();
    xmlDoc = parser.parseFromString(xm,"text/xml");
  } 
  else {
    // code for old IE browsers
    xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
  
    xmlDoc.loadXML(xm);
}
				//var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
				
				logger.info(xm);
    			
			
				xmlDoc.async = false; 
				
				logger.info(xm);
				
				
				
				var recordSet = xmlDoc.getElementsByTagName("ns0:searchrecord");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
				var lstPrcNames = new Array();
				
				pane.CancelledInstances.getValue().clear();
				pane.StartedInstances.getValue().clear();
				pane.HaltedInstances.getValue().clear();
				pane.CompletedInstances.getValue().clear();
				
						
						
				for(var i=0;i<lngth;i++) {
					var record = factory.com_sfc_fosImpl_genericReporting.createRecord();
					
					
					recordSet = xmlDoc.getElementsByTagName("ns0:process_instance");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProcessInstance(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ns0:status");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setStatus(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ns0:exec_mills");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setTime(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ns0:sibelcircuit_id");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setSiebelCircuitID(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ns0:customer_name");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setClientName(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("ns0:projectmanager");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProjectName(recordSet[i].childNodes[0].nodeValue);
					}
					
					
					
							
						record.setProcessTemplate(control.optnSelectProcess.getValue());
					
					
					if(flag=="true")
					{
					
					if(record.getStatus()=="pi_cancelled") {
						pane.CancelledInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_started") {
						pane.StartedInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_halted"){
						pane.HaltedInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_completed") {
						pane.CompletedInstances.getValue().add(record);
					}
					
					
					
					}
					else
					{
					
					if((record.getStatus()=="pi_cancelled") && (record.getProjectName()==loginName)) {
						pane.CancelledInstances.getValue().add(record);
					}
					else if((record.getStatus()=="pi_started") && (record.getProjectName()==loginName)) {
						pane.StartedInstances.getValue().add(record);
					}
					else if((record.getStatus()=="pi_halted") && (record.getProjectName()==loginName)){
						pane.HaltedInstances.getValue().add(record);
					}
					else if((record.getStatus()=="pi_completed")&& (record.getProjectName()==loginName)) {
						pane.CompletedInstances.getValue().add(record);
					}
					}
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




