<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
<meta charset="UTF-8">
<title>Questions</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script type="text/javascript" src="js/questions.js"></script>
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
	<form action="#" method="post">
	<div id="contents">
	<h2>Questions</h2>
	    <div id="content-container1">
			<div id="section-navigation">
			<table style="width: 160px; table-layout: auto;">
				<tr><td><div id="lists">
					<h4 onclick="openList(1)" id="this">Section&nbsp;Id</h4>
					<div id="ollist1" style="display: none;">
						<label><input type="radio" name="mandatory" value="1" />1</label><br> 
						<label><input type="radio" name="mandatory" value="2">2</label><br>
						<label><input type="radio" name="mandatory" value="3" />3</label><br>
						<label><input type="radio" name="mandatory" value="4">4</label><br>
						<label><input type="radio" name="mandatory" value="5" />5</label><br>
					</div>
				</div></td></tr>
				<tr><td><div id="lists">
					<h4 onclick="openList(2)" id="this">Question&nbsp;Type</h4>
					<div id="ollist2" style="display: none;">
					    <label><input type="radio" name="questiontype" value="1" onclick="qtSingle2();openM();"/>Single</label><br> 
						<label><input type="radio" name="questiontype" value="2" onclick="qtMultiple2();openM();"/>Multiple</label><br> 
						<label><input type="radio" name="questiontype" value="3" onclick="qtDescriptive2();openM();"/>Descriptive</label><br>
						<label><input type="radio" id="matrix" name="questiontype" value="4" onclick="qtMatrix2();openM()"/>Matrix</label><br>
						<div id="ollist8" style="display: none; margin-left: 15px;">
						<label><input type="radio" name="choicetype" value="1" onclick="qtMatrix1()"/>Single</label><br> 
						<label><input type="radio" name="choicetype" value="2" onclick="qtMatrix1()">Multiple</label><br> 
						<!-- <label><input type="radio" name="choicetype" value="3" onclick="qtMatrix1()"/>Descriptive</label><br> -->
						</div>
						<label><input type="radio" name="questiontype" value="5" onclick="qtDandD2();openM();"/>Drag and Drop</label><br>
						<label><input type="radio" name="questiontype" value="6" onclick="qtCSum2();openM();"/>Constant Sum</label><br>
						<label><input type="radio" name="questiontype" value="7" onclick="qtRating2();openM();"/>Rating</label><br> 
						<label><input type="radio" name="questiontype" value="8" onclick="qtRanking2();openM();"/>Ranking</label><br>
					</div>
				</div></td></tr>
				<tr><td><div id="lists">
					<h4 onclick="openList(3)" id="this">Option&nbsp;Type</h4>
					<div id="ollist3" style="display: none;">
						<label><input type="radio" name="optiontype" value="1" checked="checked" onclick="chooseoptiontype()"/>Text</label><br> 
						<label><input type="radio" name="optiontype" value="2" onclick="chooseoptiontype()">Image</label><br> 
					</div>
				</div></td></tr>
				<tr><td><div id="lists">
					<h4 onclick="openList(4)" id="this" >Level</h4>
					<div id="ollist4" style="display: none;">
						<label><input type="radio" name="level" value="1" />1</label><br>
						<label><input type="radio" name="level" value="2">2</label><br>
						<label><input type="radio" name="level" value="3" />3</label><br>
						<label><input type="radio" name="level" value="4">4</label><br>
					</div>
				</div></td></tr>
				<tr><td><div id="lists">
					<h4 onclick="openList(5)" id="this">Mandatory</h4>
					<div id="ollist5" style="display: none;">
						<label><input type="radio" name="mandatory" value="1" />Yes</label>
						<label><input type="radio" name="mandatory" value="2" checked="checked"/>No</label>
					</div>
				</div></td></tr>
				<tr><td><div id="lists">
					<h4 onclick="openList(6)" id="this">Conditional&nbsp;Path</h4>
					<div id="ollist6" style="display: none;">
						<label><input type="radio" name="condition" value="1" />Yes</label>
						<label><input type="radio" name="condition" value="2" checked="checked" />No</label>
					</div>
				</div></td></tr></table>
			</div>
			
			<div id="content">
			<input type="hidden" value="0" id="theValue" />
			<label style="font-weight: bolder;">Campaign&nbsp;Id</label><br>
			<label style="font-weight: bolder;">Campaign&nbsp;Name</label><br>
			<div class="btn">
			<button id="myButton" value="Add" onclick="reset()">Add Question</button>
			</div>
			<div id="mainDiv">
			<p>Add your question here choose the options from the side pane</p>
			</div>
			<table id="myDiv" style="width: 750px">
			</table>
			</div>
			</div>
			<div class="btn" style="margin-bottom: 0px;">
					<button type="submit" value="Cancel">Cancel</button>&nbsp;&nbsp;&nbsp;
					<a href="savecampaign.html"><button type="submit" value="Next">Next</button></a>
				</div>
		</div>
	</form>
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
</html>