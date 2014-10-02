<%-- 
    Document   : faulty_login
    Created on : Sep 29, 2014, 8:55:34 PM
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
			padding:2em;
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
                    <h1>Welcome <%=request.getAttribute("Name")%></h1>
			
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
