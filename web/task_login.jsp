<%-- 
    Document   : task_login
    Created on : Sep 28, 2014, 10:04:11 PM
    Author     : visheshtalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome to crib!</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	  
    <![endif]-->
	
	<style type="text/css">
	
		@media (max-width: 480px) { 
			#login_carousel {
		
				width: 100%;
				height: 100%;
				border:none;
				box:none;
				
			}

			#form {
				width: 100%;
				height: 100%;
				padding: 2%;
			}
		}
		
		.carousel .item {
			-webkit-transition: opacity 0.65s;
			-moz-transition: opacity 0.65s;
			-ms-transition: opacity 0.65s;
			-o-transition: opacity 0.65s;
			transition: opacity 0.65s;
		}
		
		
		.carousel .active.left, .carousel .active.right {
			left:0;
			opacity:0;
			z-index:2;
		}
		.carousel .next, .carousel .prev {
			left:0;
			opacity:1;
			z-index:1;
		}
		
		.item {
			padding-top:2em;
                        padding-left:1em;
                        padding-right:1em;
			text-align:center;
		}
	
		#form {
			
			width: 100%;
			height: 100%;
			
		}
		
		#login_carousel {
		
			height:100%;width:100%;
			border:1px solid;
			border-radius:20px;
			box-shadow: 2px #888888;
			background-color:white;
			
		}
		
		.btn-primary  {
			
			background-color:#336699;
			border-color:#336699;
	
		}
			
		body {
		  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */
		  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */
		}
		
	html {height:100%;width:100%;padding-top:10%}
	</style>
	
  </head>
  
  <body>
	<div class="row" ></div>
	<div class="row">
	
		<div class="col-md-4"></div>
		<div class="col-md-4">
		
			<div id="login_carousel" class="carousel slide" data-ride="carousel" data-interval="false">
	 
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner">
				<div class="item active" id="one">
				  
					<div id="form">
						<img src="img/logo.png" style="height:20%;"/><br><br>
                                                <form method="get" action="Login" role="form" class="form-inline">
						  <div class="form-group">
							<input type="username" name="username" class="form-control" id="exampleInputEmail1" placeholder="Username">
						  </div><br><br>
						  <div class="form-group">
							<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
						  </div><br><br>
						  <button class="btn btn-primary">Login</button><br><br>
						 <a  href="#login_carousel" role="button" data-slide="prev">
							Need an account? Sign up!
						 </a>
						<br><br><br>
						</form>
					</div>
				  
				</div>
				<div class="item" id="two">
					
					<div id="form" style="height:100%;width:100%;">
						<img src="img/logo.png" style="height:20%;"/><br><br>
						<form method="get" action="Registration" role="form" class="form-inline">
						  <div class="form-group">
							<input type="fname" name="fname" class="form-control" id="exampleInputEmail1" placeholder="First Name">
						  </div>
						  <div class="form-group">
							<input type="lname" name="lname" class="form-control" id="exampleInputEmail1" placeholder="Last Name">
						  </div><br><br>
						  <div class="form-group">
							<input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Email address">
						  </div>
						  <div class="form-group">
							<input type="username" name="username" class="form-control" id="exampleInputEmail1" placeholder="Username">
						  </div><br><br>
						  <div class="form-group">
							<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
						  </div>
						  <div class="form-group">
							<input type="password" name="cpassword" class="form-control" id="exampleInputPassword1" placeholder="Confirm Password">
						  </div><br><br>
						  <button class="btn btn-primary">Sign up</button><br><br>
						  <a  href="#login_carousel" role="button" data-slide="next">
							Have an account? Login!
						  </a>
						</form>
					</div>
				  
				</div>
			  </div>


			</div>
		
		</div>
		
	</div>

	

  

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	
	<script>
	
		
		
	</script>
  </body>
</html>