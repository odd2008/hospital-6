<!DOCTYPE html>
<html>
<head>
<title>Services</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Medical Clinic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Archivo+Narrow:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
</head>
	
<body>
<!-- banner -->
	<div class="banner1">
		<div class="container">
<!-- header -->
		<!-- header -->
			<div class="header">	
					<div class="logo">
					   <a href="index.html"><i class="glyphicon glyphicon-plus" aria-hidden="true"></i>Self-service registration<span>We Work For Your Health</span></a>
					</div>
					<div class="top-nav">
						<span class="menu"><img src="images/menu.png" alt=" " /></span>
						<ul class="nav">
							<li class="active"><a href="index.html">Home</a></li>
							<li><a href= #searchthings>Sear&Recom</a></li>
							<li><a href="gallery.html">SelfManage</a></li>
							<li><a href="contact.html">Appointment</a></li>
							<li><a data-toggle="modal" data-target="#BModal" href="">Sign In</a>
							<div class="modal fade" id="BModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							  <div class="modal-dialog">
							    <div class="modal-content">
							      <div class="modal-header">
							        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
							        <h4 class="modal-title" id="myModalLabel">登录</h4>
							      </div>
							      <div class="modal-body">
							        <form role="form">
									  <div class="form-group">
									    <label for="inputPatientID">用户名:</label>
									    <input type ="text" class="form-control" id="inputPatientID" placeholder="请输入用户名：">
									  </div>
									  <div class="form-group">
									    <label for="inputPkey">密码:</label>
									    <input type="password" class="form-control" id="inputPkey" placeholder="请输入密码">
									  </div>
									  <button type="button" class="btn btn-default active" onclick="patientlog(this);">登录</button>
									</form>
							      </div>
							      <div class="modal-footer">
							      <a href="register.jsp">立即注册</a>
							      </div>
							    </div>
							  </div>
							</div>
							</li>
						</ul>
								<!-- script-for-menu -->
								 <script>
								   $( "span.menu" ).click(function() {
									 $( "ul.nav" ).slideToggle( 300, function() {
									 // Animation complete.
									  });
									 });
								</script>
								<!-- /script-for-menu -->
					</div>
					<div class="clearfix"> </div>
			</div>
<!-- //header -->
<!-- //header -->	
		</div>
	</div>
<!-- //banner -->
<!--typography-page -->
	<div class="typo">
		<div class="container">
			<h3 class="title"><s:property value="dc.DoctorName" />'s Information</h3>
			<p class="et">self information</p>
			<div >
				<h3>医生信息</h3>
				<div class="col-md-12">
					<p>Add modifier classes to change the appearance of a badge.</p>
					<br>
					<table class="table table-hover table-bordered">
					<tbody>
						<tr>
							<td>
								医生ID（DoctorID）
							</td>
							<td>
								<p id="doctorid"><s:property value="dc.DoctorID"/></p>
							</td>
						</tr>
						<tr class="danger">
							<td>
								姓名(DoctorName)
							</td>
							<td>
								<p id="doctorname"><s:property value="dc.DoctorName" />
							</td>
						</tr>
						<tr>
							<td>
								年龄(DoctorAge)
							</td>
							<td>
								<p id="doctorage"><s:property value="dc.DoctorAge" /></p>
							</td>
						</tr>
						<tr class="danger">
							<td>
								科室(Department)
							</td>
							<td>
								<p id="department"><s:property value="dc.Department" /></p>
							</td>
						</tr>
						<tr>
							<td>
								主治领域(Area)
							</td>
							<td>
								<p id="area"><s:property value="dc.Area" /></p>
							</td>
						</tr>
						<tr class="danger">
							<td>
								职位(Position)
							</td>
							<td>
								<p id="position"><s:property value="dc.Position" /></p>
							</td>
						</tr>
						<tr>
							<td>
								办公室(Office)
							</td>
							<td>
								<p id="office"><s:property value="dc.Office" /></p>
							</td>
						</tr>
						<tr class="danger">
							<td>
								联系方式(Contact)
							</td>
							<td>
								<p id="contact"><s:property value="dc.Contact" /></p>
							</td>
						</tr>
						<tr>
							<td>
								详细信息(Detailinfo)
							</td>
							<td>
								<p id="detailinfo"><s:property value="dc.Detailinfo" /></p>
							</td>
						</tr>
					</tbody>
				</table>                   
				</div>
			   <div class="clearfix"> </div>
			</div>	 
		</div>
	</div>
<!-- //typography-page -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid">
					<h3>patients & Visitors</h3>
					<ul>
						<li><a href="#">Find a Doctor</a></li>
						<li><a href="#">Information For patients</a></li>
						<li><a href="#">Information For visitors</a></li>
						<li><a href="#">Pay Hospital Bills In Online</a></li>
						<li><a href="#">Financial Services</a></li>
						<li><a href="#">Our Commitment to</a></li>
						<li><a href="#">Quality Care</a></li>
						<li><a href="#">Events</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h3>research</h3>
					<ul>
						<li><a href="#">Reaserch Highlights</a></li>
						<li><a href="#">Resources For Professionals</a></li>
						<li><a href="#">Finding Opportunities</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h3>education & Training</h3>
					<ul>
						<li><a href="#">Patient Health Library</a></li>
						<li><a href="#">Residency & Fellowship</a></li>
						<li><a href="#">Information</a></li>
						<li><a href="#">Nursing Professional</a></li>
						<li><a href="#">Development</a></li>
						<li><a href="#">Professional Training</a></li>
						<li><a href="#">Professional Development</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h3>community</h3>
					<ul>
						<li><a href="#">Community Health & Wellness</a></li>
						<li><a href="#">Community Relations</a></li>
						<li><a href="#">Community Services & Resources</a></li>
						<li><a href="#">Community Reports</a></li>
						<li><a href="#">News & Events</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="footer-grds">
				<div class="footer-grds-left">
					<ul>
						<li><a href="#">Privacy Policy |</a></li>
						<li><a href="contact.html">Sitemap |</a></li>
						<li><a href="#">Terms of Use</a></li>
					</ul>
					<p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
				</div>
				<div class="footer-grds-right">
					<ul>
						<li><a href="#" class="fa"></a></li>
						<li><a href="#" class="fb"></a></li>
						<li><a href="#" class="fc"></a></li>
						<li><a href="#" class="fd"></a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //footer -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"> </script>
<!-- //for bootstrap working -->
</body>
</html>