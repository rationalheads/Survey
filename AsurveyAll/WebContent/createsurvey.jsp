<!DOCTYPE HTML>
<%@page import="com.rh.surveydto.CampaignInfo"%>
<%@ page import="com.rh.surveydto.CustomerRecord" session="true" contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="/errorpage.jsp" %>
<% String cid=session.getAttribute("cid").toString();

if(cid != null) {
%>
<%
 // CustomerRecord customerRecord=(CustomerRecord)request.getAttribute("CDATA"); 
 CampaignInfo campaignInfo=(CampaignInfo)request.getAttribute("CAMP_DATA");
 
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create Survey</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
</head>
<script type="text/javascript">
$(document).ready(function(){
$("#level").hide();
$("#qualification").hide();
$("#qualification1").hide();
$("#qualification2").hide();

$("input[name='level_flag']").click(setDisplay);
$("input[name='qualify_cretirion']").click(setDisplay1);
$("button[type='reset']").click(function() {
    setTimeout(setDisplay, 1);  // setDisplay after the form is reset
    setTimeout(setDisplay1, 1);  // setDisplay after the form is reset
    $("img").attr('src','');
});

function setDisplay() {
    var val = $("input:radio[name=level_flag]:checked").val();
    if (val === '1') {
        $("#level").show();
    } else if (!val || val === '0') {
        $("#level").hide();
    }
}

function setDisplay1() {
    var val = $("input:radio[name=qualify_cretirion]:checked").val();  
    if (val === '1') {
    	$("#qualification").show();
        $("#qualification1").show();
        $("#qualification2").show();
	} else if (!val || val === '0') {
		$("#qualification").hide();
        $("#qualification1").hide();
        $("#qualification2").hide();
	}
}
});
</script>
<body>
	<div id="header">
		<div>
			<div class="logo">
				<a href="index.html">Create Survey</a>
			</div>
			<ul id="navigation">
				<li class="active">
					<a href="index.html">Home</a>
				</li>
				<li>
					<a href="surveys.html">Surveys</a>
				</li>
				<li>
					<a href="news.html">Manage</a>
				</li>
				<li>
					<a href="about.html">About</a>
				</li>
				<li>
					<a href="contact.html">Contact</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="contents">
	<form  method="post" action="http://192.168.0.108:8080/survey_rh/CreateSurveyController" enctype="multipart/form-data">
	<h2>Create Survey</h2>
		<div id="content-container1">
          <div class="wrapper">
            
            <table style="width: 98%">
            <tr><td><label>Customer Id</label>
            </td><td><input type="text" readonly="readonly" value="<%= campaignInfo.getCust_id()%>"/></td></tr>
            
            <tr><td><label>Campaign Name</label></td>
            <td><input type="text" name="camp_name" id="name" placeholder="campaign name" maxlength="5"/></td></tr>
            
            <tr><td style="padding-bottom: 9%;"><label>Campaign Image</label></td>
            <td><img src="" height="100" width="200" alt="Image Preview"><br>
            <input type="file" name="camp_image" id="name" onchange="previewFile()">
            </td></tr>
            
            <tr><td><label>Campaign Id</label><br></td></tr>
            
            <tr><td><label>Start Page Text</label><br></td>
            <td><textarea onKeyDown="textCounter(this,255);" onKeyUp="textCounter(this,'startpage' ,255)"
            class="scanwid" name="camp_st_page_text" id="start" rows="2" cols="58" maxlength="255"></textarea>
            <input readonly type="text" id='startpage' name="startpage" size="3" maxlength="3" value="255"></td></tr>
            
            <tr><td><label>Campaign Type</label></td>
            <td><select name="camp_type">
                      <option value="volvo">Market Survey</option>
                      <option value="saab">Education Survey</option>
                      <option value="opel">Employee Survey</option>
                      <option value="audi">Empty Survey</option></select><br></td></tr>
                      
            <tr ><td><label>Level Flag</label><br></td>
            <td><label><input type="radio" value="1" id="radioOne" name="level_flag" onclick="" />Yes</label>
            <label><input type="radio" value="0" id="radioTwo" name="level_flag" onclick="" checked="checked" />No</label></td></tr> 
            
			<tr id="level"><td><label>Default Level</label></td>
			<td><input type="number" name="default_level" max="5" min="1"/></td></tr>
			
			<tr><td><label>Qualification Criterion</label><br></td>
            <td><label><input type="radio" value="1" id="radioOne" name="qualify_cretirion" onchange=""/>Yes</label> 
			<label><input type="radio" value="0" id="radioTwo" name="qualify_cretirion" onchange="" checked/>No</label></td></tr>
			
			<tr id="qualification" ><td><label>Qualification Level</label></td>
			<td><input type="number" name="qualify_q_count" max="5" min="1"/></td></tr>
			
			<tr id="qualification1" ><td><label>Success Text</label></td>
			<td><textarea onKeyDown="textCounter(this,255);" onKeyUp="textCounter(this,'successtext' ,255)"
            class="scanwid" name="success_text" id="success" rows="2" cols="58" maxlength="255"></textarea>
            <input readonly type="text" id='successtext' name="successtext" size="3" maxlength="3" value="255"></td></tr>
            
			<tr id="qualification2" ><td><label>Failure Text</label></td>
			<td><textarea onKeyDown="textCounter(this,255);" onKeyUp="textCounter(this,'failuretext' ,255)"
            class="scanwid" name="failure_text" id="failure" rows="2" cols="58" maxlength="255"></textarea>
            <input readonly type="text" id='failuretext' name="failuretext" size="3" maxlength="3" value="255"></td></tr>
			
             </table>
          </div>
          </div>
          <div class="btn">
           <a href="sections.jsp"><button type="submit" class="submit" value="Save">Save</button></a>
           <button type="reset" class="submit" value="Reset" onclick="">Reset</button>
           <button type="submit" class="submit" value="Cancel">Cancel</button>
           </div>
	</form>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div id="connect">
				<a href="#" class="facebook"></a><a href="#" class="googleplus"></a><a href="#" class="twitter"></a><a href="#" class="tumbler"></a>
			</div>
			<p>
				© 2014 RationalHeads. All Rights Reserved.
			</p>
		</div>
	</div>
</body>
<script>
   function previewFile(){
       var preview = document.querySelector('img'); //selects the query named img
       var file    = document.querySelector('input[type=file]').files[0]; //sames as here
       var reader  = new FileReader();

       reader.onloadend = function () {
           preview.src = reader.result;
       }

       if (file) {
           reader.readAsDataURL(file); //reads the data as a URL
       } else {
           preview.src = "";
       }
  }

  previewFile();  //calls the function named previewFile()*
  
  function textCounter(field,cnt, maxlimit) {
		var cntfield = document.getElementById(cnt);
	     if (field.value.length > maxlimit) // if too long...trim it!
			field.value = field.value.substring(0, maxlimit);
			// otherwise, update 'characters left' counter
			else
			cntfield.value = maxlimit - field.value.length;
	}
  </script>
</html>
<%
}
else
{
 response.sendRedirect("./SurveyCustInfoController?action=log");
}
%>