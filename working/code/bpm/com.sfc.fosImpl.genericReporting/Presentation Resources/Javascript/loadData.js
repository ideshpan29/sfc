
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
				var lstPrcNameValue = new Array();
				
				for(var i=0;i<lngth;i++) {
					recordSet = xmlDoc.getElementsByTagName("name");
					if(recordSet[i].childNodes[0]!=null)
					{			
						if(recordSet[i].childNodes[0].nodeValue == "comsfcfosImplremoval_tobeRemoval") {
							lstPrcNames[0] = recordSet[i].childNodes[0].nodeValue;
							lstPrcNameValue[0] = recordSet[i].childNodes[0].nodeValue;
							lstPrcNames[0] = "Decomissioning";
						}
					}
				}
				
				control.optnSelectProcess.setOptions(lstPrcNameValue,lstPrcNames);
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
		var tmpURL = url+funcName+"&random="+(Math.random(999)*10000);
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
					
					var time=(recordSet[i].childNodes[0].nodeValue);
					
					if(time.indexOf("P")==0)
					{
					
					var Pindex=time.indexOf("P");
					var Dindex=time.indexOf("D");
					var Hindex=time.indexOf("H");
					var Mindex=time.indexOf("M");
					var Sindex=time.indexOf("S");
					var Tindex=time.indexOf("T");
					
					var DAYS=0;
					var HOURS=0;
					var MINUTES=0;
					var SECONDS=0;
					
					if(Dindex!=-1)
					{
					DAYS=parseFloat(time.substring(Pindex+1,Dindex));
					}
					
					
					
					if(Hindex!=-1)
					{
					HOURS=parseFloat(time.substring(Tindex+1,Hindex));
					}
					
					
					
					if(Mindex!=-1 && Hindex!=-1)
					{
					MINUTES=parseFloat(time.substring(Hindex+1,Mindex));
					}
					if(Mindex!=-1 && Hindex==-1)
					{
					MINUTES=parseFloat(time.substring(Tindex+1,Mindex));
					}
					
					
					if(Sindex!=-1)
					{
					if(Mindex!=-1)
					{
					SECONDS=parseFloat(time.substring(Mindex+1,Sindex));
					}
					
					if(Mindex==-1 && Hindex!=-1)
					{
					SECONDS=parseFloat(time.substring(Hindex+1,Sindex));
					}
					
					if(Mindex==-1 && Hindex==-1)
					{
					SECONDS=parseFloat(time.substring(Tindex+1,Sindex));
					}
					
					}
					
									
					
					
					
					var timeValue=DAYS+" Days  "+HOURS+" Hours  "+MINUTES+" Minutes  "+SECONDS+" Seconds.";
					//record.setTime(((DAYS*1440)+(HOURS*60)+(SECONDS/60)+(MINUTES)).toFixed(2)+" minutes");
					record.setTime(timeValue);
					}
					else
					{
					
						//record.setTime(time);
						
						var ms=(recordSet[i].childNodes[0].nodeValue);
						
						var days = Math.floor(ms / (24*60*60*1000));
    					var daysms=ms % (24*60*60*1000);
   						var hours = Math.floor((daysms)/(60*60*1000));
    					var hoursms=ms % (60*60*1000);
   						var minutes = Math.floor((hoursms)/(60*1000));
    					var minutesms=ms % (60*1000);
 					    var sec = Math.floor((minutesms)/(1000));
 					    
						var timeValue=days+" Days  "+hours+" Hours  "+minutes+" Minutes  "+sec+" Seconds.";
						
						//record.setTime(parseFloat(((recordSet[i].childNodes[0].nodeValue)/60000)).toFixed(2)+" minutes");
						record.setTime(timeValue);
					}
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
					
					 var record = factory.com_sfc_fosImpl_genericReporting.createTask();
					 
					 
					 
					recordSet = xmlDoc.getElementsByTagName("first_time_offer");
					if(recordSet[i].childNodes[0]!=null)	{	
					
					
					var abc=new Date(recordSet[i].childNodes[0].nodeValue).toString();
					abc=abc.substring(0,abc.indexOf("G"));
					
						record.setFirstOfferTime(abc);
						
						
						
					}
					else{
					logger.info("in rewcord add"+record.getFirstTimeOffer());
					}
					 
					 recordSet = xmlDoc.getElementsByTagName("process_instance");
					 
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setProcessInstance(recordSet[i].childNodes[0].nodeValue);
						
					}
					
					
					
					recordSet = xmlDoc.getElementsByTagName("activity_name");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setTaskName(recordSet[i].childNodes[0].nodeValue);
						
						
					}
					
					
					
					
					recordSet = xmlDoc.getElementsByTagName("activity_dur");
					if(recordSet[i].childNodes[0]!=null)	{	
							
					var time=(recordSet[i].childNodes[0].nodeValue);
					
					if(time.indexOf("P")==0)
					{
					
					var Pindex=time.indexOf("P");
					var Dindex=time.indexOf("D");
					var Hindex=time.indexOf("H");
					var Mindex=time.indexOf("M");
					var Sindex=time.indexOf("S");
					var Tindex=time.indexOf("T");
					
					var DAYS=0;
					var HOURS=0;
					var MINUTES=0;
					var SECONDS=0;
					
					if(Dindex!=-1)
					{
					DAYS=parseFloat(time.substring(Pindex+1,Dindex));
					}
					
					
					
					if(Hindex!=-1)
					{
					HOURS=parseFloat(time.substring(Tindex+1,Hindex));
					}
					
					
					
					if(Mindex!=-1 && Hindex!=-1)
					{
					MINUTES=parseFloat(time.substring(Hindex+1,Mindex));
					}
					if(Mindex!=-1 && Hindex==-1)
					{
					MINUTES=parseFloat(time.substring(Tindex+1,Mindex));
					}
					
					
					if(Sindex!=-1)
					{
					if(Mindex!=-1)
					{
					SECONDS=parseFloat(time.substring(Mindex+1,Sindex));
					}
					
					if(Mindex==-1 && Hindex!=-1)
					{
					SECONDS=parseFloat(time.substring(Hindex+1,Sindex));
					}
					
					if(Mindex==-1 && Hindex==-1)
					{
					SECONDS=parseFloat(time.substring(Tindex+1,Sindex));
					}
					
					}
					
									
					
									
					
					
					
					
					
						var timeValue=DAYS+" Days  "+HOURS+" Hours  "+MINUTES+" Minutes  "+SECONDS+" Seconds.";
						
					//record.setTaskDuration(((DAYS*1440)+(HOURS*60)+(SECONDS/60)+(MINUTES)).toFixed(2)+" minutes");
					record.setTaskDuration(timeValue);
					}
					else
					{
						
						
						var ms=(recordSet[i].childNodes[0].nodeValue);
						
						var days = Math.floor(ms / (24*60*60*1000));
    					var daysms=ms % (24*60*60*1000);
   						var hours = Math.floor((daysms)/(60*60*1000));
    					var hoursms=ms % (60*60*1000);
   						var minutes = Math.floor((hoursms)/(60*1000));
    					var minutesms=ms % (60*1000);
 					    var sec = Math.floor((minutesms)/(1000));
 					    
						var timeValue=days+" Days  "+hours+" Hours  "+minutes+" Minutes  "+sec+" Seconds.";
						
						//record.setTime(parseFloat(((recordSet[i].childNodes[0].nodeValue)/60000)).toFixed(2)+" minutes");
						record.setTaskDuration(timeValue);
						
						
						//record.setTaskDuration(parseFloat(((recordSet[i].childNodes[0].nodeValue)/60000)).toFixed(2)+" minutes");
					}
						
						
					}
					
					
					
					recordSet = xmlDoc.getElementsByTagName("wait_dur");
					if(recordSet[i].childNodes[0]!=null)	{	
					var time=(recordSet[i].childNodes[0].nodeValue);
					if(time!="NA")
					{
					
					var ms=time
						
						var days = Math.floor(ms / (24*60*60*1000));
    					var daysms=ms % (24*60*60*1000);
   						var hours = Math.floor((daysms)/(60*60*1000));
    					var hoursms=ms % (60*60*1000);
   						var minutes = Math.floor((hoursms)/(60*1000));
    					var minutesms=ms % (60*1000);
 					    var sec = Math.floor((minutesms)/(1000));
 					    
						time=days+" Days  "+hours+" Hours  "+minutes+" Minutes  "+sec+" Seconds.";
						
						//record.setTime(parseFloat(((recordSet[i].childNodes[0].nodeValue)/60000)).toFixed(2)+" minutes");
						//record.setTaskDuration(timeValue);
					}
							
						record.setWaitDuration(time);
					
						
					}
					
					recordSet = xmlDoc.getElementsByTagName("work_time_dur");
					if(recordSet[i].childNodes[0]!=null)	{	
					
					var time=(recordSet[i].childNodes[0].nodeValue);		
					
					if(time!="NA")
					{
					
					var ms=time
						
						var days = Math.floor(ms / (24*60*60*1000));
    					var daysms=ms % (24*60*60*1000);
   						var hours = Math.floor((daysms)/(60*60*1000));
    					var hoursms=ms % (60*60*1000);
   						var minutes = Math.floor((hoursms)/(60*1000));
    					var minutesms=ms % (60*1000);
 					    var sec = Math.floor((minutesms)/(1000));
 					    
						time=days+" Days  "+hours+" Hours  "+minutes+" Minutes  "+sec+" Seconds.";
						
						//record.setTime(parseFloat(((recordSet[i].childNodes[0].nodeValue)/60000)).toFixed(2)+" minutes");
						//record.setTaskDuration(timeValue);
					}
					
					
					
					
					
							
						record.setWorkDuration(time);
											}
					
					recordSet = xmlDoc.getElementsByTagName("status");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setStatus(recordSet[i].childNodes[0].nodeValue);
						
						
					}
					
				
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


function ldResourceData(factory,pane,control,logger,url,funcName,groupName)
{
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
				
				
				
				var recordSet = xmlDoc.getElementsByTagName("Record");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
				
				pane.ResourceList.getValue().clear();
				
				
				
							
				for(var i=0;i<lngth;i++) {
					
					
					 
					var record=factory.com_sfc_fosImpl_genericReporting.createResourceDetails(); 
					 
					
					recordSet = xmlDoc.getElementsByTagName("resourceName");
					if(recordSet[i].childNodes[0]!=null)	{
							
						record.setResourceName(recordSet[i].childNodes[0].nodeValue);
						
					}
					
					recordSet = xmlDoc.getElementsByTagName("resourceEntity");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setResourceEntity(recordSet[i].childNodes[0].nodeValue);
					}
					
					recordSet = xmlDoc.getElementsByTagName("count");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setCaseCount(recordSet[i].childNodes[0].nodeValue);
					}
					
					
					
					if(record.getResourceEntity()==groupName)
						pane.ResourceList.getValue().add(record);
						
						
				}
				
				
			}
				};
		result = xmlhttp.send();
	}
	catch (e) {
		alert("Catch: Error: Please contact System Administrator");
	}
	
}





function ldCurrentProcessStateData(factory,pane,control,logger,url,funcName)
{

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
				
				
				
				var recordSet = xmlDoc.getElementsByTagName("Record");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
			pane.ActivityList.getValue().clear(); 
				
				
				
							
				for(var i=0;i<lngth;i++) {
					
					
					 
					var record=factory.com_sfc_fosImpl_genericReporting.createActivity();
	
			
					 
					
					recordSet = xmlDoc.getElementsByTagName("activityName");
					if(recordSet[i].childNodes[0]!=null)	{
							
						record.setActivityName(recordSet[i].childNodes[0].nodeValue);
						
					}
					
					recordSet = xmlDoc.getElementsByTagName("activityCount");
					if(recordSet[i].childNodes[0]!=null)	{			
						record.setActivityCount(recordSet[i].childNodes[0].nodeValue);
					}
					
					
					pane.ActivityList.getValue().add(record);
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
		var tmpURL = url+funcName+"&random="+(Math.random(999)*10000);
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
					
					var time=(recordSet[i].childNodes[0].nodeValue);
					
					if(time.indexOf("P")==0)
					{
					
					var Pindex=time.indexOf("P");
					var Dindex=time.indexOf("D");
					var Hindex=time.indexOf("H");
					var Mindex=time.indexOf("M");
					var Sindex=time.indexOf("S");
					var Tindex=time.indexOf("T");
					
					var DAYS=0;
					var HOURS=0;
					var MINUTES=0;
					var SECONDS=0;
					
					if(Dindex!=-1)
					{
					DAYS=parseFloat(time.substring(Pindex+1,Dindex));
					}
					
					
					
					if(Hindex!=-1)
					{
					HOURS=parseFloat(time.substring(Tindex+1,Hindex));
					}
					
					
					
					if(Mindex!=-1 && Hindex!=-1)
					{
					MINUTES=parseFloat(time.substring(Hindex+1,Mindex));
					}
					if(Mindex!=-1 && Hindex==-1)
					{
					MINUTES=parseFloat(time.substring(Tindex+1,Mindex));
					}
					
					
					if(Sindex!=-1)
					{
					if(Mindex!=-1)
					{
					SECONDS=parseFloat(time.substring(Mindex+1,Sindex));
					}
					
					if(Mindex==-1 && Hindex!=-1)
					{
					SECONDS=parseFloat(time.substring(Hindex+1,Sindex));
					}
					
					if(Mindex==-1 && Hindex==-1)
					{
					SECONDS=parseFloat(time.substring(Tindex+1,Sindex));
					}
					
					}
					
									
					
					
					
					var timeValue=DAYS+" Days  "+HOURS+" Hours  "+MINUTES+" Minutes  "+SECONDS+" Seconds.";
					//record.setTime(((DAYS*1440)+(HOURS*60)+(SECONDS/60)+(MINUTES)).toFixed(2)+" minutes");
					record.setTime(timeValue);
					}
					else
					{
					
						//record.setTime(time);
						
						var ms=(recordSet[i].childNodes[0].nodeValue);
						
						var days = Math.floor(ms / (24*60*60*1000));
    					var daysms=ms % (24*60*60*1000);
   						var hours = Math.floor((daysms)/(60*60*1000));
    					var hoursms=ms % (60*60*1000);
   						var minutes = Math.floor((hoursms)/(60*1000));
    					var minutesms=ms % (60*1000);
 					    var sec = Math.floor((minutesms)/(1000));
 					    
						var timeValue=days+" Days  "+hours+" Hours  "+minutes+" Minutes  "+sec+" Seconds.";
						
						//record.setTime(parseFloat(((recordSet[i].childNodes[0].nodeValue)/60000)).toFixed(2)+" minutes");
						record.setTime(timeValue);
					}
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




