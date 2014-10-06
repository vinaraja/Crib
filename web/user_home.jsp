<%-- 
    Document   : faulty_login
    Created on : Sep 29, 2014, 8:55:34 PM
    Author     : visheshtalreja
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
    <title>Crib</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="http://bsdp-assets.blackcherry.us/1.3.0/datepicker.min.css">
	<!-- BootstrapValidator CSS -->
    <link rel="stylesheet" href="dist/css/bootstrapValidator.min.css"/>
    
	<style type="text/css">
		
		.datepicker{z-index:1151 !important;}
		
		.btn-primary  {
			
			background-color:#336699;
			border-color:#336699;
	
		}
		#break-inverse {display:none;}
		
		@media (max-width: 480px) { 
			#break-inverse {display:initial;}
			#break { display:none;}
		}
			
		body {
		  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */
		  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */
		 background-repeat: no-repeat;
		}
		
	html {height:100%}
	
	
        
        ::-webkit-scrollbar { 
                    display: none; 
                }
	
	</style>
    
	
  </head>
  <body>
  <div class="col-md-2"></div>
  <div class="col-md-8 col-xs-12" style='padding: 0'>
	<div style ="height:100vh;background-color: white;padding: 2em">
	
		<nav class="navbar navbar-default" role="navigation" style="border:hidden ;background-color:#7F7F7F;width: 100%;margin: -1">
		  <div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
			  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar" style="background-color:white;"></span>
				<span class="icon-bar" style="background-color:white;"></span>
				<span class="icon-bar" style="background-color:white;"></span>
			  </button>

			  <div class="navbar-brand" style="padding-top:0px;"><img  src="img/logo_nav.jpg" style="height:140%;width50%;"/></div>

			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right" >
						<li id="group"><a id="showaddtaskmodal" href="#addtaskmodal" class="btn-group-sm" data-toggle="modal"  style="color:white">Add a Task</a></li>
						<li id="friend"><a id="showaddfriendmodal" href="#addfriendmodal" class="btn-group-sm" data-toggle="modal" style="color:white">Add a Friend</a></li>
						<li ><a href="task_login.jsp" class="btn-group-sm" style="color:white">Log Out</a></li>
					</ul> 
			</div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
      <h1>Welcome <%=request.getAttribute("Name")%></h1><br>
      
      <div class="col-md-2"></div>
	<div class="col-md-8">
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="height:35vh">
	  <!-- Indicators -->
	  <ul style="display:none">
		<li data-target="#carousel-example-generic" data-slide-to="0"></li>
		
		
	  </ul>

	  <!-- Wrapper for slides -->
	  <div class="carousel-inner" >
              <%
            //out.println("<button type = 'button 'class = 'btn btn-primary'>Add</button>");
            request.setAttribute("Name", request.getAttribute("Name"));
          //String user ="vinaraja"; 
          String user = (String)request.getAttribute("username");
          String sql,sql3;
          String connectionURL="jdbc:derby://localhost:1527/WTFtask";
            sql3 ="SELECT TASKID FROM WTFtaskallocation where USERNAME = '"+user+"'";
            
          
          try {
              Connection conn = DriverManager.getConnection(connectionURL, "IS2560","IS2560");
              Statement s = conn.createStatement();
              Statement s1 = conn.createStatement();
              Statement s2 = conn.createStatement();
              ResultSet rs2 = s2.executeQuery(sql3);
              int count = 0;
              
              while(rs2.next()){
                  sql = "SELECT * FROM WTFtasks where TASKID ="+rs2.getInt("TASKID");
                  ResultSet rs = s.executeQuery(sql);
              while (rs.next()) {
                  String sql2 ="SELECT FIRSTNAME,LASTNAME FROM WTFuser WHERE USERNAME='"+rs.getString("OWNER")+"'";                       
                  ResultSet rs1 = s1.executeQuery(sql2);
                        rs1.next();
                        if(count==0)
                        {    
                        out.println("<div class='item active' style = 'padding-top:3%'>");
                        }
                        else
                        {
                           out.println("<div class='item' style = 'padding-top:3%'>"); 
                        }
                        out.println("<div class='col-md-3'></div>");
                        out.println("<div class='col-sm-6 col-md-6' align = 'center'>");
                        out.println("<div class='thumbnail' style = 'background-color:#E6E6E6;color:white;height:30vh'>");
                        out.println("<div class='caption'>");
                        out.println("<h3>"+rs.getString("TASKNAME")+"</h3>");
                        out.println("<p>POINTS: "+rs.getString("TASKPOINTS")+"<br>OWNER: "+rs1.getString("FIRSTNAME")+" "+rs1.getString("LASTNAME")+"<br>DUE-DATE: "+rs.getString("DUEDATE")+"</p>");
                        out.println("<p><a href='#' class='btn btn-primary' role='button'>Wrap Up</a></p>");
                        out.println("</div></div></div></div>");
                        count++;
                        
                        /*out.println("<TR>");
                        out.println("<TD>" + rs.getString("TASKNAME") + "</TD>");
                        out.println("<TD>" + rs.getString("TASKPOINTS") + "</TD>");
                        out.println("<TD>" + rs1.getString("FIRSTNAME")+" "+rs1.getString("LASTNAME") + "</TD>");
                        out.println("<TD>" + rs.getString("DUEDATE") + "</TD>");
                        out.println("</TR>");*/
                        rs1.close();
              }
              rs.close();
              }
              
              s.close();
              s1.close();
              s2.close();
              conn.close();
          }
          catch (SQLException e) {
          }
       catch (Exception e) {
       }
    
     %>
	  </div>

	  <!-- Controls -->
	  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		<span class="glyphicon glyphicon-chevron-left"></span>
	  </a>
	  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		<span class="glyphicon glyphicon-chevron-right"></span>
	  </a>
	</div>
	</div>
      
        </div> 
  
  </div>
  <div class="col-md-2"></div>

	<div id="addfriendmodal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="border-radius:20px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button><br><br>
					<h3 class="modal-title" align="center">Add a Friend</h4></br>
				

                                        <form id ="searchForm" class="form-inline" align="center">

						<div class="form-group">
							<div class="col-md-10 col-xs-10">
								<input type="text" name="searchname" id="searchname" class="form-control input-md" Placeholder="Search..." required>
							</div>
                                                     
							<div class="col-md-1 col-xs-1" style="padding-top:2px;">
								<button id="SearchButton" type="button">Add </button> 
							</div>
                                                    
						</div><br><br>
                                                 
                                                 <div id="searchUpdate"></div>
						<a align="center" id="Invite" href="#" >Can't find your friend? Invite them!</a>  
					</form>
					
					<form id="inviteForm" class="form-inline" align="center" method="get" action = "Add_Friend" >
						
						<div class="form-group">
							<input type="text" class="form-control" name="firstname" Placeholder="First name" />
						</div>
						<div id="break">
							<br>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="lastname" Placeholder="Last name"/>
						</div>
						<div id="break">
							<br>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="email" Placeholder="Email address"/>
						</div>
                                                <div class="form-group">
                                                            <input type="hidden" class="form-control input-md" name = "user" value="<%=request.getAttribute("Name")%>">
						</div>
						<div id="break">
							<br>
						</div>
						<div class="form-group">
							<button type="submit" id="login" href="#" class="btn btn-primary" align="center">Invite</button>
						</div><br>
					</form>	
				</div>
			</div>
		</div>
	</div>
	
	<div id="addtaskmodal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1" aria-hidden="true">
        <div class="modal-dialog">
		<div class="modal-content">
				<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button><br><br>
						<h3 class="modal-title" align="center">Add a task</h4></br>
						<form id="addtaskForm" class="form-inline" align="center" method="get" action="Add_Task">
							<div class="form-group">
								<input type="text" class="form-control" name="taskname" Placeholder="Task name" />
								
								<div id="break">
									<br>
								</div>
                                                        </div><br>
                                                        <div class="form-group">
								
								<input type="text" class="form-control" placeholder="Points" name="taskpoints"/>
								<div id="break">
									<br>
								</div>
                                                        </div><br>
                                                        <div class="form-group">
								
								<input type="hidden" class="form-control"  name="user" value = "<%=request.getAttribute("username")%>"/>
								<div id="break">
									<br>
								</div>
                                                        </div><br>
                                                        <div class="form-group">
								
								<input type="hidden" class="form-control"  name="Name" value = "<%=request.getAttribute("Name")%>"/>
								<div id="break">
									<br>
								</div>
                                                        </div><br>
							<div class="form-group">
                                                                    <div class="col-lg-12 col-xs-12">
                                                                        <div class="input-group date" >
                                                                            <input type="text" class="form-control"  id="duedate" name="duedate" Placeholder="Due date" />
                                                                            <span class="input-group-addon">
                                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                                            </span>
                                                                        </div>  
                                                                    </div>
							</div>
							<br>
							<div id="break">
								<br>
							</div>
							<div class="form-group">
								<div class="col-md-9 col-xs-9">
									<input type="text" class="form-control" Placeholder="Add friends..." id="addedfriend" name="addedfriend">
								</div>
								<div class="col-md-3 col-xs-3">
									<button id="add" type="button" class="btn btn-success" onclick="showFriend()"> Add</button>	
								</div>
							</div>
                                                        <div id="somediv"></div>
							<div id="break">
								<br>
							</div>
							<div id="break-inverse">
								<br><br>
                                                        </div>
                                                        <div id="content" style="color:red;"></div><br>
							<div class="form-group">
                                                            <button type="submit" class="btn btn-primary">Add task</button><br><br>
							</div><br>
						</form>
				</div>
			</div>
        </div>
    </div>
                                                              
     
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="http://bsdp-assets.blackcherry.us/1.3.0/bootstrap-datepicker.min.js"></script>
		<!-- BootstrapValidator JS -->
    <script type="text/javascript" src="dist/js/bootstrapValidator.min.js"></script>

    <script>

	i = 0;
	
	 $(function () {
                $("#duedate").datepicker();
            });
            
	$("#SearchButton").click(function(){
           // alert("button");
           $.get('Search',$("#searchname"),function(ResponseText){  
              if(ResponseText==="true") 
              {
                   $("#searchUpdate").text("User Found");
              }
              else
              {
                  $("#searchUpdate").text("User not Found");
              }
           });
        });
	
        
        function showFriend() {
               
		$.get('Validate_Assignee', $("#addedfriend"), function(responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                       if (responseText === "true") {
                           $("#somediv").text("");
                           i = i + 1;
                           var name = document.getElementById("addedfriend").value;
                           string = "<div id='here"+i+"' onClick='removeFriend(this)' ><input type='text' style='border:none' name='list'  value='"+name+"' />"+"&nbsp;<span class='glyphicon glyphicon-remove' style='color:#7F7F7F;'></span><br></div>";
                           $("#content").append(string);
                           $("#addedfriend").val('');
                        }
                        else {
                           $("#somediv").text("No such user");
                           $("#addedfriend").val('');
                        }
                    });
        
	}
        
	function removeFriend(item) {
		$(item).remove();
	}	
        
	$("#inviteForm").hide();
	
        
        $("#showaddtaskmodal").click(function(){
		
                document.forms["addtaskForm"].reset();
                $("#somediv").text("");
                $("#content").text("");
	});
        
        $("#showaddfriendmodal").click(function(){

		$("#searchForm").show();
		$("#inviteForm").hide();
                document.forms["searchForm"].reset();
                document.forms["inviteForm"].reset();
	});
	
	
        $("#Invite").click(function(){
		$("#searchForm").hide();
		$("#inviteForm").show();
                document.forms["searchForm"].reset();
                document.forms["inviteForm"].reset();
	});
        
        $(document).ready(function() {
            $('#addtaskForm').bootstrapValidator({
                    container:'tooltip',
                    feedbackIcons: {		
                    valid: 'glyphicon glyphicon-ok',
                    invalid: 'glyphicon glyphicon-remove',
                    validating: 'glyphicon glyphicon-refresh'
                    },
                    fields: {
			taskname: {
                        	validators: {
				notEmpty: {
                                    message: 'Task name is required'
                                },
                                regexp: {
                                    regexp: /^[a-zA-Z]+$/,
                                    message: 'Alphabets only'
                                },
                                }
                        },
                        taskpoints: {
                            validators: {
				notEmpty: {
                                    message: 'Task points are required'
				},
				regexp: {
                                    regexp: /^[0-9]+$/,
                                    message: 'Numbers only'
				},
                            }
                        },
			duedate: {
                            validators: {
				notEmpty: {
                                    message: 'Due date is required'
                            	},
                                date: {
                                    format: 'MM/DD/YYYY'
                                }
                            }
                        },
                    }
            });
                                
            $('#inviteForm').bootstrapValidator({
		// To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
                container:'tooltip',
		feedbackIcons: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
                    	validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			firstname: {
				validators: {
                            		notEmpty: {
                                            message: 'First name is required'
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
						message: 'Last name is required'
					},
					regexp: {
						regexp: /^[a-zA-Z]+$/,
						message: 'Alphabets only'
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




