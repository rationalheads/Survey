<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Create Survey</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>    
</head>
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
	<form method="post" action="">
	   <h2>Sections</h2>
			<div id="content-container1">
			<table>
					<tr><td><label>Campaign Id</label></td><td></td></tr></table>
					<table class="wrapper" id="myDiv">
					<tr><td><label>Section Id</label></td><td></td><td></td><td></td>
					<td><input type="hidden" id="theValue" value="0"/>
					<a class="myButton" onclick="add()">Add</a>
					<a class="myButton" onclick="removeEl(this)">Remove</a></td></tr>
					<tr><td><label>Section Name</label></td>
					<td><input type="text" name="section_name" placeholder="section name"/></td><td></td><td></td><td></td></tr>
					<tr><td style="padding-bottom: 75px"><label>Section Image</label></td>
					<td><input type="file" name="section_image" id="name" onchange="readURL(this, 'image')">
					<img src="" id="image" height="100" width="200"  alt="Image Preview"></td>
					<td></td><td></td><td></td></tr>
					</table>
					</div>
						<div class="btn" style="margin-bottom: 0px;">
					<button type="submit" value="Cancel">Cancel</button>&nbsp;&nbsp;&nbsp;
					<a href="questions.html"><button type="submit" value="Next">Next</button></a>
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

var i=0;

		function add() {

			var ni = document.getElementById('myDiv');

			var numi = document.getElementById('theValue');

			var num = (document.getElementById('theValue').value - 1) + 2;

			numi.value = num;

			var newdiv = document.createElement('tr');

			var divIdName = 'my' + num + 'Div';

			//newdiv.setAttribute('id', divIdName);

			newdiv.innerHTML = '<td><label>Section Id</label></td><td></td>'
				+ '</td><td></td><td></td>'
				+ '<td><input type="hidden" id="theValue" value="0"/>'
				+ '<a class="myButton" onclick="add()">Add</a>'
				+ '<a class="myButton" onclick="removeEl(this)">Remove</a></td>';

			ni.appendChild(newdiv);

			var newdiv1 = document.createElement('tr');

			newdiv1.innerHTML = '<td><label>Section Name</label></td>'
			+ '<td><input type="text" name="section_name" placeholder="section name"/></td><td></td><td></td><td></td>';

			ni.appendChild(newdiv1);
			
			var newdiv2 = document.createElement('tr');
				
			newdiv2.innerHTML = '<td style="padding-bottom: 75px"><label>Section Image</label></td>'
				+ '<td><input type="file" name="section_image" id="name" onchange="readURL(this, \''+divIdName+'\')">'
				+ '<img src="" id="'+divIdName+'" height="100" width="200"  alt="Image Preview"></td>'
				+ '<td></td><td></td><td></td>';

			ni.appendChild(newdiv2);
			i++;
		}
	</script>
	<script>
		function removeEl(divNum) {

			var d = document.getElementById('myDiv');

			d.removeChild(divNum.parentNode);

		}
		
		function readURL(input, id) {
			var id_input = '#' + id;
		      if (input.files && input.files[0]) {
		       var reader = new FileReader();
		       reader.onload = function(e) {
		           $(id_input).attr('src', e.target.result);
		       }
		       reader.readAsDataURL(input.files[0]);
		       }
		       }
		 // previewFile();
	</script>
</html>