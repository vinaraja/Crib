<%--
    Document   : task_login
    Created on : Sep 28, 2014, 10:04:11 PM
    Author     : firewaterthunder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome to crib!</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="dist/css/bootstrapValidator.min.css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	  
    <![endif]-->
	
	<style type="text/css">
		
		@media (max-width: 480px) { 

			.win {
				padding:2em;
			}
			
			html {height:100%;}
			
			#break 
			{display:none;}
			
			background-repeat:no-repeat;
		}
		
		.win {
			background-color:white;
			text-align:center;
			border-radius:20px;
			border:2px solid;
		}
			
		body {
		  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */
		  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */
		  background-repeat:no-repeat;
		}
		
		html {height:100%;padding-top:5%;padding-bottom:10%;}
		
		::-webkit-scrollbar { 
                    display: none; 
                }

	</style>
	
  </head>
  
  <body>
	
	
		<div class="col-md-4"></div>
		<div class="col-md-4">
		
            <% if ((String)request.getAttribute("logon")=="fail")
            {
                out.println("<div class='alert alert-danger alert-dismissible' role='alert'>");
                out.println("<button type='button' class='close' data-dismiss='alert'><span aria-hidden='true'>&times;</span><span class='sr-only'>Close</span></button>");
                out.println("<strong>The entered username or password is incorrect</strong>");
                out.println("</div>");
            }%>
		
					<div class="win" id="log">
						<img src="img/logo.jpg" style="height:20%;"/><br><br>
                                                <form role="form" id="login_form" class="form-inline" method="get" action="Login">
						  <div class="form-group">
							<input type="text" name="username" class="form-control" id="exampleInputEmail1" placeholder="Username">
						  </div>
						  <div id="break">
							<br>
						  </div>
						  <div class="form-group">
							<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
						  </div>
						  <div id="break">
							<br>
						  </div>
						  <button type="submit" class="btn btn-primary">Login</button><br><br>
						 <a  class="formNotice" href="#" role="button">
							Need an account? Sign up!
						 </a>
						<div id="break">
							<br>
						  </div>
						</form>
					</div>
		
					<div class="win" id="reg">
						<img src="img/logo.jpg" style="height:20%;"/><br><br>
						<form role="form" class="form-inline" method="get" action="Registration" id="reg_form">
						  <div class="form-group">
							<input type="text" name="fname" class="form-control" id="exampleInputEmail1" placeholder="First Name">
						  </div>
						  <div class="form-group">
							<input type="text" name="lname" class="form-control" id="exampleInputEmail1" placeholder="Last Name">
						  </div>
						  <div id="break">
							<br>
						  </div>
						  <div class="form-group">
							<input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Email address">
						  </div>
						  <div class="form-group">
							<input type="text" name="username" class="form-control" id="exampleInputEmail1" placeholder="Username">
						  </div>
						  <div id="break">
							<br>
						  </div>
						  <div class="form-group">
							<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
						  </div>
						  <div class="form-group">
							<input type="password" name="cpassword" class="form-control" id="exampleInputPassword1" placeholder="Confirm Password">
						  </div>
						  <div id="break">
							<br>
						  </div>
						  <button class="btn btn-primary">Sign up</button><br><br>
						  <a  class="formNotice" href="#" role="button">
							Have an account? Login!
						  </a>
						  <div id="break">
							<br>
						  </div>
						</form>
					</div>

			</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="dist/js/bootstrapValidator.min.js"></script>
	
	<script>

				$(document).ready(function() {
					$('#reg').hide();
					$('.formNotice').click(function() {
						$("#log").toggle();
						$("#reg").toggle();
					});						
				
                                
                                    $('login_form').bootstrapValidator({
					// To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
					container:'tooltip',
                                        feedbackIcons: {
						valid: 'glyphicon glyphicon-ok',
						invalid: 'glyphicon glyphicon-remove',
						validating: 'glyphicon glyphicon-refresh'
					},
					fields: {
						username: {
							
							validators: {
								notEmpty: {
									message: 'Username required'
								},
								regexp: {
									regexp: /^[a-zA-Z]+$/,
									message: 'Alphabets only'
								},
								}
						},
						password: {
						   
							validators: {
								
								notEmpty: {
									message: 'Password required'
								},
								regexp: {
									regexp: /^[a-zA-Z0-9]+$/,
									message: 'Alphabets and numbers only'
								},
								}
						}
						
					}
                                    });
                                    $('reg_form').bootstrapValidator({
					// To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
					container:'tooltip',
                                        feedbackIcons: {
						valid: 'glyphicon glyphicon-ok',
						invalid: 'glyphicon glyphicon-remove',
						validating: 'glyphicon glyphicon-refresh'
					},
					fields: {
                                                username: {
							
							validators: {
								notEmpty: {
									message: 'Username required'
								},
								regexp: {
									regexp: /^[a-zA-Z]+$/,
									message: 'Alphabets only'
								},
								}
						},
                                                firstname: {
							
							validators: {
								notEmpty: {
									message: 'First name required'
								},
								regexp: {
									regexp: /^[a-zA-Z]+$/,
									message: 'Alphabets only'
								},
								}
						},
						lastname: {
							
							validators: {
								notEmpty: {
									message: 'Last name required'
								},
								regexp: {
									regexp: /^[a-zA-Z]+$/,
									message: 'Alphabets only'
								},
								}
						},
						password: {
						   
							validators: {
								
								notEmpty: {
									message: 'Password required'
								},
								regexp: {
									regexp: /^[a-zA-Z0-9]+$/,
									message: 'Alphabets and numbers only'
								},
								}
						},
                                                cpassword: {
						   
							validators: {
								
								notEmpty: {
									message: 'Retype password'
								},
								regexp: {
									regexp: /^[a-zA-Z0-9]+$/,
									message: 'Alphabets and numbers only'
								},
								}
						},
                                                email: {
                                                        validators: {
                                                                notEmpty: {
                                                                        message: 'Email is required'
                                                                },
                                                                regexp: {
                                                                        regexp: /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/,
                                                                        message: 'Email is invalid'
                                                                },
                                                        }
                                                },
						
					}
				});
                                });
	</script>

  </body>
</html>