<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
<meta charset="UTF-8">
<title>Create Survey</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script type="text/javascript">
jQuery(document).ready(function() {
    jQuery('.tabs .tab-links a').on('click', function(e)  {
        var currentAttrValue = jQuery(this).attr('href');
 
        // Show/Hide Tabs
        jQuery('.tabs ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        jQuery(this).parent('li').addClass('active').siblings().removeClass('active');
 
        e.preventDefault();
    });
});
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
				<li><a href="news.html">Manage</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
		</div>
	</div>
	<div id="contents">
		<h2>Save Campaign</h2>
		<div id="content-container1">
			<div id="section-navigation">
				<table style="width: 160px; height:">
				    <tr><td>Section 1</td></tr>
					<tr><td>Section 2</td></tr>
					<tr><td>Section 3</td></tr>
					<tr><td>Section 4</td></tr>
				</table>
					</div>
					<div id="content">
						<label>Campaign Name</label><br>
						<label>Campaign Id</label><br>
						<div id="preview">
							<p>Section 1 content goes here!</p>
							<p>Donec pulvinar neque sed semper lacinia. Curabitur lacinia
								ullamcorper nibh; quis imperdiet velit eleifend ac. Donec
								blandit mauris eget aliquet lacinia! Donec pulvinar massa
								interdum risus ornare mollis.</p>
						
							<p style="display: none;">Section 2 content goes here!</p>
							<p style="display: none;">Donec pulvinar neque sed semper lacinia. Curabitur lacinia
								ullamcorper nibh; quis imperdiet velit eleifend ac. Donec
								blandit mauris eget aliquet lacinia! Donec pulvinar massa
								interdum risus ornare mollis. In hac habitasse platea dictumst.
								Ut euismod tempus hendrerit. Morbi ut adipiscing nisi. Etiam
								rutrum sodales gravida! Aliquam tellus orci, iaculis vel.</p>
						
							<p style="display: none;">Section 3 content goes here!</p>
							<p style="display: none;">Donec pulvinar neque sed semper lacinia. Curabitur lacinia
								ullamcorper nibh; quis imperdiet velit eleifend ac. Donec
								blandit mauris eget aliquet lacinia! Donec pulvinar massa
								interdum ri.</p>
						
							<p style="display: none;">Section 4 content goes here!</p>
							<p style="display: none;">Donec pulvinar neque sed semper lacinia. Curabitur lacinia
								ullamcorper nibh; quis imperdiet velit eleifend ac. Donec
								blandit mauris eget aliquet lacinia! Donec pulvinar massa
								interdum risus ornare mollis. In hac habitasse platea dictumst.
								Ut euismod tempus hendrerit. Morbi ut adipiscing nisi. Etiam
								rutrum sodales gravida! Aliquam tellus orci, iaculis vel.</p>
						</div>
						</div>
		</div>
		<div class="btn" style="margin-bottom: 0px;">
			<button type="submit" value="Cancel">Delete</button>
			&nbsp;&nbsp;&nbsp; <a href="launchcampaign.html"><button type="submit"
					value="Next">Save</button></a>
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
</html>