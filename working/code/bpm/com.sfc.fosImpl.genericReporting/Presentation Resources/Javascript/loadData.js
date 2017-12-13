function ldPrcNames(control,logger,url,funcName) {
	try {
		var tmpURL = url+funcName;
		var xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.ResponseText;
				var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
				xmlDoc.async = false; 
				xmlDoc.loadXML(xm);
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
		alert("Catch: Error: Please contact System Administrator");
	}
}

function ldPrcData(factory,pane,control,logger,url,funcName) {
	try {
		var tmpURL = url+funcName;
		var xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.open('GET',tmpURL,true);
		xmlhttp.onreadystatechange=function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200)	{		
				var xm = xmlhttp.ResponseText;
				var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
				xmlDoc.async = false; 
				xmlDoc.loadXML(xm);
				logger.info(xm);
				
				var recordSet = xmlDoc.getElementsByTagName("Record");
				var lngth = recordSet.length;
				logger.info("Lengh of the incoming array for Records: "+lngth);
				
				var lstPrcNames = new Array();
				
				pane.CancelledInstances.getValue().clear();
				pane.StartedInstances.getValue().clear();
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
					
					if(record.getStatus()=="pi_cancelled") {
						pane.CancelledInstances.getValue().add(record);
					}
					else if(record.getStatus()=="pi_started") {
						pane.StartedInstances.getValue().add(record);
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


	/*
function loadProcessnames()
{
	var getProcessnames = $.post('http://stalewar-t470:9801/getProcessnames');
			getProcessnames.done(function(data){
			var xmlData=data;
				console.log(xmlData);
				var optionvalues="";

				parser = new DOMParser();
				xmlDoc = parser.parseFromString(xmlData,"text/xml");
				console.log(xmlDoc);
				var x=xmlDoc.getElementsByTagName("process");
				console.log(x.length);
				if(x.length==0){

					alert("No data Found");
					return false;
				}
				else{
				for (i = 0; i <x.length; i++) { 
					optionvalues += "<option value="+x[i].getElementsByTagName('name')[0].childNodes[0].nodeValue+"'>"+x[i].getElementsByTagName('name')[0].childNodes[0].nodeValue+"</option>";
				}
		document.getElementById("getProcessoption").innerHTML = optionvalues;

			}
			})
			}		
document.getElementById("button").click()
    $(document).ready(function(){
    $("#completecheckbox").change(function(event) {
			event.preventDefault();
       $("#searchresultdata").hide();
          if($(this).is(':checked'))
		  $("#pi_completed").show();
		  else
		  $("#pi_completed").hide();
    })
	    
       $("#startcheckbox").change(function(event) {
			event.preventDefault();
        $("#searchresultdata").hide();
          if($(this).is(':checked'))
		  $("#pi_started").show();
		  else
		  $("#pi_started").hide();
    })
	    
		   $("#haltcheckbox").change(function(event) {
			event.preventDefault();
        $("#searchresultdata").hide();
          if($(this).is(':checked'))
		  $("#pi_halted").show();
		  else
		  $("#pi_halted").hide();
    })
	    
		$("#cancelcheckbox").change(function(event) {
			 event.preventDefault();
			 $("#searchresultdata").hide();
       
          if($(this).is(':checked'))
		  $("#pi_cancelled").show();
		  else
		  $("#pi_cancelled").hide();
		  
    })
	    
	
	});
function searchFilter(){
 $("#searchresultdata").show();
$('#completecheckbox').prop('checked', false);
$('#startcheckbox').prop('checked', false);
$('#haltcheckbox').prop('checked', false);
$('#cancelcheckbox').prop('checked', false);
$("#searchresult-Form").show();
  $("#pi_cancelled").hide();
	$("#pi_halted").hide();
	$("#pi_started").hide();
	$("#pi_completed").hide();
	var selectedsearchby=$('#searchby :selected').val();
	var selectedsearchvalue=$('#searchinput').val();
	var selectedprocessnamevalue=$('#getProcessoption :selected').text();
	//alert(selectedsearchby);
	if(selectedsearchby=="select")
	{
	alert("Please Select the Search Type");
	return false;
	}
	
	event.preventDefault();
	
	
	
	var getProcessInstancesvalues = $.post('http://stalewar-t470:9801/searchBy',{'processname' : selectedprocessnamevalue,'searchby':selectedsearchby,'searchvalue':selectedsearchvalue});
	getProcessInstancesvalues.done(function(data){
			var xmlData=data;
			var table="<div class='col-lg-12'><div class='row'><table border='1' class='table table-bordered table-striped'><tr><th>Sr.No.</th><th>Instance Name</th><th>Customer Name</th><th>Sibel Circuit Id</th><th>Project Manager</th><th>Current Activity</th><th>Status</th><th>Exec_mills</th></tr>";
				
				console.log(xmlData);
					

				parser = new DOMParser();
				xmlDoc = parser.parseFromString(xmlData,"text/xml");
				console.log(xmlDoc);
				var x=xmlDoc.getElementsByTagName("ns0:searchrecord");
				console.log(x.length);
			
					if(x.length==0){
					//alert("No data Found");
					document.getElementById("searchresultdata").innerHTML = "<p class='text-danger'>No Data Found For Given Input!!!</p>";
					
					return false;
				}
				else{
				
				var j=1;
				var k=1;
				
				for (i = 0; i <x.length; i++) { 
				
					table += "<tr value='"+x[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue+"'><td>"+j+"</td><td>"+
					x[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue +
					"</td><td>" +
					x[i].getElementsByTagName("ns0:customer_name")[0].childNodes[0].nodeValue +
					"</td><td>" +
					x[i].getElementsByTagName("ns0:sibelcircuit_id")[0].childNodes[0].nodeValue +
					"</td><td>"+
					x[i].getElementsByTagName("ns0:projectmanager")[0].childNodes[0].nodeValue +
					"</td><td>"+
					x[i].getElementsByTagName("ns0:cur_activity")[0].childNodes[0].nodeValue +
					"</td><td>"+
					x[i].getElementsByTagName("ns0:status")[0].childNodes[0].nodeValue +
					"</td><td>"+
					x[i].getElementsByTagName("ns0:exec_mills")[0].childNodes[0].nodeValue +
					"</td></tr>";	
					j++;	
					
				}
				}
		table+="</table></div></div>";
		document.getElementById("searchresultdata").innerHTML = table;
})
//console.log("xmldata"+xmlData);
	}	
		
	
	function getdetails(event){
	event.preventDefault();
	alert(1);
	
	var selectedvalue=$('#getProcessoption :selected').text();
		var getProcessInstancesvalues = $.post('http://stalewar-t470:9801/getProcessnameswithstatus',{'processname' : selectedvalue});
		getProcessInstancesvalues.done(function(data){
		var xmlData=data;	
			parser = new DOMParser();
			xmlDoc = parser.parseFromString(xmlData,"text/xml");
			console.log(xmlDoc);
			var CompletedTable="<div class='col-lg-12'><div class='row'><table border='1' class='table table-bordered table-striped'><tr><th>Sr.No.</th><th>Instance Name</th><th>Customer Name</th><th>Sibel Circuit Id</th><th>Project Manager</th><th>Current Activity</th><th>Status</th><th>Exec_mills</th></tr>";
	
			var StartedTable="<div class='col-lg-12'><div class='row'><table border='1' class='table table-bordered table-striped'><tr><th>Sr.No.</th><th>Instance Name</th><th>Customer Name</th><th>Sibel Circuit Id</th><th>Project Manager</th><th>Current Activity</th><th>Status</th><th>Exec_mills</th></tr>";
	
			var HaltedTable="<div class='col-lg-12'><div class='row'><table border='1' class='table table-bordered table-striped'><tr><th>Sr.No.</th><th>Instance Name</th><th>Customer Name</th><th>Sibel Circuit Id</th><th>Project Manager</th><th>Current Activity</th><th>Status</th><th>Exec_mills</th></tr>";
	
			var CancelledTable="<div class='col-lg-12'><div class='row'><table border='1' class='table table-bordered table-striped'><tr><th>Sr.No.</th><th>Instance Name</th><th>Customer Name</th><th>Sibel Circuit Id</th><th>Project Manager</th><th>Current Activity</th><th>Status</th><th>Exec_mills</th></tr>";
			var completed=xmlDoc.getElementsByTagName("ns0:pi_completed");
			var completedcount=completed.length;
				
			var started=xmlDoc.getElementsByTagName("ns0:pi_started");
			var startedcount=started.length;
				
			var cancelled=xmlDoc.getElementsByTagName("ns0:pi_cancelled");
			var cancelledcount=cancelled.length;
				
			var halted=xmlDoc.getElementsByTagName("ns0:pi_halted");
			var haltcount=halted.length;
			document.getElementById("completecount").innerHTML=completedcount;
			document.getElementById("startcount").innerHTML=startedcount;
			document.getElementById("cancelcount").innerHTML=cancelledcount;
			document.getElementById("haltcount").innerHTML=haltcount;
				console.log(haltcount);
				if(completedcount==0){
				document.getElementById("pi_completeddata").innerHTML="<center>No Completed Instances Found</center>";
				}
				else{
				var index=1;
				for (i = 0; i <completedcount; i++) {
				CompletedTable+= "<tr value='"+completed[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue+"'><td>"+index+"</td><td>"+
					completed[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue +
					"</td><td>" +
					completed[i].getElementsByTagName("ns0:customer_name")[0].childNodes[0].nodeValue +
					"</td><td>" +
					completed[i].getElementsByTagName("ns0:sibelcircuit_id")[0].childNodes[0].nodeValue +
					"</td><td>"+
					completed[i].getElementsByTagName("ns0:projectmanager")[0].childNodes[0].nodeValue +
					"</td><td>"+
					completed[i].getElementsByTagName("ns0:cur_activity")[0].childNodes[0].nodeValue +
					"</td><td>"+
					completed[i].getElementsByTagName("ns0:status")[0].childNodes[0].nodeValue +
					"</td><td>"+
					completed[i].getElementsByTagName("ns0:exec_mills")[0].childNodes[0].nodeValue +
					"</td>";	
					CompletedTable+="</tr>";
					index++;
					}	
					CompletedTable+="</table></div></div>";
					console.log(CompletedTable);
					document.getElementById("pi_completeddata").innerHTML=CompletedTable;					
				}
				
				if(startedcount==0){
				document.getElementById("pi_starteddata").innerHTML="<center>No Started Instances Found</center>";
				}
				else{
				var index=1;
				for (i = 0; i <startedcount; i++) {
				StartedTable+= "<tr value='"+started[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue+"'><td>"+index+"</td><td>"+
					started[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue +
					"</td><td>" +
					started[i].getElementsByTagName("ns0:customer_name")[0].childNodes[0].nodeValue +
					"</td><td>" +
					started[i].getElementsByTagName("ns0:sibelcircuit_id")[0].childNodes[0].nodeValue +
					"</td><td>"+
					started[i].getElementsByTagName("ns0:projectmanager")[0].childNodes[0].nodeValue +
					"</td><td>"+
					started[i].getElementsByTagName("ns0:cur_activity")[0].childNodes[0].nodeValue +
					"</td><td>"+
					started[i].getElementsByTagName("ns0:status")[0].childNodes[0].nodeValue +
					"</td><td>"+
					started[i].getElementsByTagName("ns0:exec_mills")[0].childNodes[0].nodeValue +
					"</td>";					
					StartedTable+="</tr>";
					index++;
					}	
					StartedTable+="</table></div></div>";
					console.log(StartedTable);
					document.getElementById("pi_starteddata").innerHTML=StartedTable;					
				}
				
				if(haltcount==0){
				document.getElementById("pi_halteddata").innerHTML="<center>No Halted Instances Found</center>";
				}
				else{
				var index=1;
				for (i = 0; i <haltcount; i++) {
				HaltedTable+= "<tr value='"+halted[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue+"'><td>"+index+"</td><td>"+
					halted[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue +
					"</td><td>" +
					halted[i].getElementsByTagName("ns0:customer_name")[0].childNodes[0].nodeValue +
					"</td><td>" +
					halted[i].getElementsByTagName("ns0:sibelcircuit_id")[0].childNodes[0].nodeValue +
					"</td><td>"+
					halted[i].getElementsByTagName("ns0:projectmanager")[0].childNodes[0].nodeValue +
					"</td><td>"+
					halted[i].getElementsByTagName("ns0:cur_activity")[0].childNodes[0].nodeValue +
					"</td><td>"+
					halted[i].getElementsByTagName("ns0:status")[0].childNodes[0].nodeValue +
					"</td><td>"+
					halted[i].getElementsByTagName("ns0:exec_mills")[0].childNodes[0].nodeValue +
					"</td>";					
					HaltedTable+="</tr>";
					index++;
					}	
					HaltedTable+="</table></div></div>";
					console.log(HaltedTable);
					document.getElementById("pi_halteddata").innerHTML=HaltedTable;					
				}
				
				if(cancelledcount==0){
				document.getElementById("pi_cancelleddata").innerHTML="<center>No Cancelled Instances Found</center>";
				}
				else{
				var index=1;
				for (i = 0; i <cancelledcount; i++) {
				CancelledTable+= "<tr value='"+cancelled[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue+"'><td>"+index+"</td><td>"+
					cancelled[i].getElementsByTagName("ns0:process_instance")[0].childNodes[0].nodeValue +
					"</td><td>" +
					cancelled[i].getElementsByTagName("ns0:customer_name")[0].childNodes[0].nodeValue +
					"</td><td>" +
					cancelled[i].getElementsByTagName("ns0:sibelcircuit_id")[0].childNodes[0].nodeValue +
					"</td><td>"+
					cancelled[i].getElementsByTagName("ns0:projectmanager")[0].childNodes[0].nodeValue +
					"</td><td>"+
					cancelled[i].getElementsByTagName("ns0:cur_activity")[0].childNodes[0].nodeValue +
					"</td><td>"+
					cancelled[i].getElementsByTagName("ns0:status")[0].childNodes[0].nodeValue +
					"</td><td>"+
					cancelled[i].getElementsByTagName("ns0:exec_mills")[0].childNodes[0].nodeValue +
					"</td>";					
					CancelledTable+="</tr>";
					index++;
					}	
					CancelledTable+="</table></div></div>";
					console.log(CancelledTable);
					document.getElementById("pi_cancelleddata").innerHTML=CancelledTable;					
				}				
	});
	$("#pi_cancelled").hide();
	$("#pi_halted").hide();
	$("#pi_started").hide();
	$("#pi_completed").hide();

		}
function checkboxValues() {         
     var allVals = [];
	 $("input:checkbox[name=type]:checked").each(function(){
    allVals.push($(this).val());
});
     return allVals; // process the array as you wish in the function so it returns what you need serverside
  }
  
$("#statusoptions").submit(function(event){
$("#searchresult-Form").hide();
event.preventDefault();
var allVals = [];
allVals=checkboxValues();
$("#pi_cancelled").hide();
	$("#pi_halted").hide();
	$("#pi_started").hide();
	$("#pi_completed").hide();
for(var index=0;index<allVals.length;index++)
{

var currentchekboxvalue=allVals[index];
if(currentchekboxvalue=="completed")
{
	$("#pi_completed").show();
}
if(currentchekboxvalue=="started")
{
	$("#pi_started").show();
}
if(currentchekboxvalue=="halted")
{
	$("#pi_halted").show();
}
if(currentchekboxvalue=="cancelled")
{
	$("#pi_cancelled").show();
}
}
});		

*/