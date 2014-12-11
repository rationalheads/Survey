<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
<meta charset="UTF-8">
<title>Create Survey</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="stylesheet" href="css/tabs.css" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script type="text/javascript" src="js/countries.js"></script>
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
				<li><a href="news.html">Manage</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
		</div>
	</div>
	<div id="contents">
		<h2>Launch Campaign</h2>
		<div id="content-container1">
			<div class="campaigntype">
				<h3>Campaign Details</h3>
				<table>
					<tr>
						<td>Campaign Name</td>
						<td></td>
					</tr>
					<tr>
						<td>Campaign Id</td>
						<td></td>
					</tr>
					<tr>
						<td>Duration</td>
						<td></td>
						<td>Start<input type="date" name="start" required="required"/></td>
						<td>End<input type="date" name="end" required="required"/></td>
					</tr>
				</table>
				<h3>Target Audience Info</h3>
				<table>
					<tr>
						<td>Gender</td>
						<td><label><input type="radio" name="gender" />Male</label></td>
						<td><label><input type="radio" name="gender" />Female</label></td>
						<td><label><input type="radio" name="gender" />All</label></td>
					</tr>
					</table>
					<table>
					<tr>
						<td>Age</td>
						<td><label><input type="checkbox" name="age">Upto
								20</label></td>
						<td><label><input type="checkbox" name="age" />20-25</label></td>
						<td><label><input type="checkbox" name="age" />25-35</label></td>
						<td><label><input type="checkbox" name="age" />Over 35</label></td>
					</tr>
					</table>
					<table>
					<tr>
						<td><label>Occupation</label></td>
						<td><select required="required"><option>Occupation</option></select></td>
					</tr>
					</table>
					<table>
					<tr>
					    <td>Annual Income</td>
					    <td><select required="required">
					    <option>below 1 lacs</option>
					    <option>1-2.5 lacs</option>
					    <option>2.5-5 lacs</option>
					    <option>5-10 lacs</option>
					    <option>10-20 lacs</option>
					    <option>20-30 lacs</option>
					    <option>above 30 lacs</option>
					    </select></td>
					</tr>
					</table>
					<h4 style="padding-left: 15px; padding-bottom:0px ; margin: 0px;">Address</h4>
					<table>
					<tr>
						<td>Country</td>
						<td><select id="country" name="country"></select></td>
						<td>State</td>
						<td><select name="state" id="state"></select></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="btn" style="margin-bottom: 0px;">
		<a href="#"><button type="submit" value="reset">Reset</button></a>
			<button type="submit" value="Cancel">Cancel</button>
			&nbsp;&nbsp;&nbsp; <a href="index.html"><button type="submit"
					value="Next">Ok</button></a>
		</div>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div id="connect">
				<a href="#" class="facebook"></a><a href="#" class="googleplus"></a><a
					href="#" class="twitter"></a><a href="#" class="tumbler"></a>
			</div>
			<p>© 2014 RationalHeads. All Rights Reserved.</p>
		</div>
	</div>
</body>
<script>
	populateCountries("country", "state");
</script>
</html>