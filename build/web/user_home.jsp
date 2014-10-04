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
		 
		}
		
	html {height:100%}
	
	
        
        ::-webkit-scrollbar { 
                    display: none; 
                }
	
	</style>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
  </head>
  <body>
  
  <div class="col-md-2"></div>
  <div class="col-md-8 col-xs-12">
	
	
		<nav class="navbar navbar-default" role="navigation" style="border:hidden ;background-color:#7F7F7F; border-radius:10px;">
		  <div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
			  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar" style="background-color:white;"></span>
				<span class="icon-bar" style="background-color:white;"></span>
				<span class="icon-bar" style="background-color:white;"></span>
			  </button>
			  <a class="navbar-brand" href="user_home.html" style="padding-top:0px;"><img  src="img/logo_nav.jpg" style="height:140%;width50%;"/></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right" >
						<li id="group"><a href="#addtaskmodal" class="btn-group-sm" data-toggle="modal"  style="color:white">Add a Task</a></li>
						<li id="friend"><a href="#addfriendmodal" class="btn-group-sm" data-toggle="modal" style="color:white">Add a Friend</a></li>
						<li ><a href="task_login.jsp" class="btn-group-sm" style="color:white">Log Out</a></li>
					</ul> 
			</div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
                
      <h1>Welcome <%=request.getAttribute("Name")%></h1><br>
                
  
  </div>
  <div class="col-md-2"></div>

	<div id="addfriendmodal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="border-radius:20px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button><br><br>
					<h3 class="modal-title" align="center">Add a Friend</h4></br>
				
					<form id="searchForm" class="form-inline" align="center">
						<div class="form-group">
							<div class="col-md-10 col-xs-10">
								<input type="text" class="form-control input-md" Placeholder="Search..." required>
							</div>
							<div class="col-md-1 col-xs-1" style="padding-top:7px;">
								<a class="glyphicon glyphicon-search" href="#" ></a>  
							</div>
						</div><br><br>
						
						<a align="center" id="Invite" href="#" >Can't find your friend? Invite them!</a>  
					</form>
					
					<form id="inviteForm" class="form-inline" align="center">
						
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
						<div id="break">
							<br>
						</div>
						<div class="form-group">
							<a id="login" href="#" class="btn btn-primary" align="center">Invite</a>
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
                                                                    <div class="col-lg-12 col-xs-12">
                                                                        <div class="input-group date" id="duedate">
                                                                            <input type="text" class="form-control" name="duedate" Placeholder="Due date" />
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
							<div id="break">
								<br>
							</div>
							<div id="break-inverse">
								<br><br>
							</div>
							<div id="content"></div><br>
							<div class="form-group">
                                                            <button class="btn btn-primary">Add task</button><br><br>
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
	
	function showFriend() {
		i = i + 1;
		var name = document.getElementById("addedfriend").value;
		string = "<div id='here"+i+"' onClick='removeFriend(this)' ><input type='text' style='border:none' name='list'  value='"+name+"' />"+"&nbsp;<span class='glyphicon glyphicon-remove' style='color:blue;'></span><br></div>";
              
		$("#content").append(string);
		$("#addedfriend").val('');
	}
	
	function removeFriend(item) {
		$(item).remove();
	}
		
	$("#friend").click(function(){
		$("#searchForm").show();
		$("#inviteForm").hide();
	});
	
	</script>
  </body>
</html>




