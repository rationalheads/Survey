<!DOCTYPE html>
<html>
<head>
<title>Login and registration</title>
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<script src="js/jquery-1.11.1.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script type="text/javascript" src="js/countries.js"></script>
<script>
	$(function() {
		$("#tabs").tabs();
	});
</script>
<script type="text/javascript">
$(document).ready(function(){

$("#corporate").hide();


$("input[name='acc_type']").click(setDisplay);

function setDisplay() {
    var val = $("input:radio[name=acc_type]:checked").val();
    if (val === 'I') {
        $("#marit_status").show();
        $("#corporate").hide();
        } else if (!val || val === 'C') {
        $("#marit_status").hide();
        $("#corporate").show();
    }
}

});
</script>
<script type="text/javascript">
function confirmForm(form){

  /*  var patt1 = /^[a-zA-Z]{2,}$/;
	if(!patt1.test(form.first.value)) {
	//if(!(form.first.value.match(/^[a-zA-Z]{2,}$/))) {
        alert("Invalid First Name");
        form.first.focus();
            return false;
    }
	
	 var patt2 = /^[a-zA-Z]{2,}$/;
	if(!patt2.test(form.last.value)) {
    //if(!(form.last.value.match(/^[a-zA-Z]{2,}$/))) {
        alert("Invalid Last Name");
        form.last.focus();
        return false;
    } 

	var patt4 = /^[1-9]{1,3}$/;
    if(!patt4.test(form.age.value)) {
	
    //if(!(form.age.value.match(/^[1-9]{1,3}$/))){
        alert("Invalid Age");
        form.age.focus
        return false
    } 

	var patt5 = /^\w{5,}$/;
    if(!patt5.test(form.user.value)) {
	 
    //if(!(form.user.value.match(/^\w{5,}$/))) {
        alert("Invalid Username + suman bogati");
        form.user.focus();
        return false;
    } 
*/

    var patt3 = /^\w.+\@+[a-z]+\.[a-z]{2,7}$/;
    if(!patt3.test(form.emailid.value)) {
        alert("Invalid Email");
        form.emailid.focus();
        return false;
    }

	var patt6 = /^\w{5,}$/;
    if(!patt6.test(form.password.value)) {
	
 //   if(!(form.pword.value.match(/^.\w{5,}$/))){
        alert("Invalid Password");
        form.password.focus();
        return false;
    }
	
	if(!(form.cnfpassword.value == form.password.value)){
        alert("Password must be the same");
        form.cnfpassword.focus();
        return false;
    }else {
        return true;
    }
}
</script>
</head>
<body>
	<div id="header">
		<div>
			<div class="logo">
				<a href="index.html">Create Survey</a>
			</div>
			<ul id="navigation">
				<li class="active"><a href="index.html">Home</a></li>
				<li><a href="surveys.html">Surveys</a></li>
				<li><a href="login.html">Manage</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
		</div>
	</div>
	<div id="contents">
	<div class="wrapper">
		<div class="container">
			<div id="tabs">
				<ul>
					<li><a href="#login">Login</a></li>
					<li><a href="#register">Sign up</a></li>
				</ul>
	<div id="login">
					<%
						if ("Invalid Email or password".equals((String) session
								.getAttribute("error"))) {
					%>
					<h6>Invalid Email or password. Please try again.</h6>
					<%
						}
					%>
	<form  method="post" action="SurveyCustInfoController?action=log">
	<label for="email">Email:</label> <br /> 
	<input type="email" name="f_name" id="email" pattern="\w.*+\@+[a-z]+\.[a-z]{2,7}" title="Example:abc@yahoo.com"/><br/> 
	<label for="password">Password:</label><br/> 
	<input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{5,}" id="password" /> <br />
	<p style="font-size: small;;"><a href="forgotpassword.html">forgot password?</a></p>
	<input type="submit" value="Login">
	</form>
	</div>
		<div id="register">
		<form id="registration" method="post" action="SurveyCustInfoController?action=reg" 
					onsubmit="return confirmForm(this);" >
					
		<div class="accounttype">
			<input type="radio" value="I" id="radioOne" name="acc_type" checked />
			<label for="radioOne" class="radio">Individual</label> 
			<input type="radio" value="C" id="radioTwo" name="acc_type" /> 
			<label for="radioTwo" class="radio">Corporate</label>
		</div>
		<hr>
		<div class="account_info" >
			<h2>Account Info</h2>
			<label id="icon">Email: </label><br>
			<input type="email" name="emailid" id="emailid" pattern="\w.*+\@+[a-z]+\.[a-z]{2,7}" title="Example:abc@yahoo.com" required/><br> 
			<label id="icon">Password:</label><br>
			<input type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{5,}" name="password"
			       title="Must have at least 5 characters, including UPPER/lowercase letters and number" id="password" required/><br>
			<label id="icon" for="name">Confirm Password:</label><br>
			<input type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{5,}" name="cfmpassword"
			       title="Must be the same password as above" id="cfmpassword" required />
		</div>
		<hr>
		<div class="contact_info">
			<h2>Contact Info</h2><br>
			<input type="radio" value="M" id="male" name="gender" checked />
			<label for="male" class="radio">Male</label> <input type="radio" value="F" id="female" name="gender" />
			 <label for="female" class="radio">Female</label><br><br>
				
			 <label id="icon">First Name:</label> <br>
				<input type="text" name="f_name" id="name" required /><br>
				<label id="icon">Last Name:</label><br> 
				<input type="text" name="l_name" id="name" required /> <br>
				<label id="icon">Phone No. </label><br>
				<input type="text" name="msisdn" id="phone_no" pattern="[789][0-9]{9}" title="Numeric value must be used"  required /><br>
				<div id="corporate">
				<label id="icon">Company Name:</label><br>
				 <input type="text" name="company_name" id="name" /><br>
				 <label id="icon">Designation:</label><br>
				 <input type="text" name="designation" id="name"  /><br>
				 <label id="icon">Business Type:</label><br>
				 <input type="text" name="business_type" id="name"  /><br>
				 </div>
				 <div id="marit_status">
				<label>Marital Status:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
				<select id="marital_status">
				<option>Single</option>
				<option>Married</option>
				<option>Divorced</option>
				</select><br>
				</div>
		</div>
		<hr>
		<div class="address_info">
		<h2>Address Info</h2>
		   <label id="icon">Address 1:</label><br>
				 <input type="text" name="address_1" id="name" required /><br>
				 <label id="icon">Address 2:</label><br>
				 <input type="text" name="address_2" id="name" /><br>
				 <label>Country:</label><br>
				 <select id="country" name="country" ></select><br>
				 <label>State:</label><br>
				 <select name="city" id="state" ></select><br>
				 <label id="icon">PIN/ZIP:</label><br>
				 <input type="text" name="pin_code" id="name" size="10" maxlength="10" required /><br>
		</div>
		<br>
		<p style="font-size: x-small;">By clicking on register you accept to our <a href="">Terms and Conditions</a></p>
		<input type="submit" value="Register">
					</form>
				</div>
			</div>
		</div>
	</div>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div id="connect">
				<a href="http://freewebsitetemplates.com/go/facebook/" target="_blank" class="facebook"></a><a href="http://freewebsitetemplates.com/go/googleplus/" target="_blank" class="googleplus"></a><a href="http://freewebsitetemplates.com/go/twitter/" target="_blank" class="twitter"></a><a href="http://www.freewebsitetemplates.com/misc/contact/" target="_blank" class="tumbler"></a>
			</div>
			<p>
				© 2023 Zerotype. All Rights Reserved.
			</p>
		</div>
	</div>
</body>
<script>
    populateCountries("country", "state");
</script>
</html>