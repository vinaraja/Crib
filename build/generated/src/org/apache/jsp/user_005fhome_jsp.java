package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public final class user_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    \r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Crib</title>\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://bsdp-assets.blackcherry.us/1.3.0/datepicker.min.css\">\r\n");
      out.write("\t<!-- BootstrapValidator CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/bootstrapValidator.min.css\"/>\r\n");
      out.write("    \r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.datepicker{z-index:1151 !important;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.btn-primary  {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tbackground-color:#336699;\r\n");
      out.write("\t\t\tborder-color:#336699;\r\n");
      out.write("\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#break-inverse {display:none;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t@media (max-width: 480px) { \r\n");
      out.write("\t\t\t#break-inverse {display:initial;}\r\n");
      out.write("\t\t\t#break { display:none;}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */\r\n");
      out.write("\t\t  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\thtml {height:100%}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("        \r\n");
      out.write("        ::-webkit-scrollbar { \r\n");
      out.write("                    display: none; \r\n");
      out.write("                }\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <div class=\"col-md-2\"></div>\r\n");
      out.write("  <div class=\"col-md-8 col-xs-12\" style='padding: 0'>\r\n");
      out.write("\t<div style =\"height:100vh;background-color: white;padding: 2em\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\" role=\"navigation\" style=\"border:hidden ;background-color:#7F7F7F;width: 100%;margin: -1\">\r\n");
      out.write("\t\t  <div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\" style=\"background-color:white;\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\" style=\"background-color:white;\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\" style=\"background-color:white;\"></span>\r\n");
      out.write("\t\t\t  </button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <a class=\"navbar-brand\" href=\"user_home.jsp\" style=\"padding-top:0px;\"><img  src=\"img/logo_nav.jpg\" style=\"height:140%;width:50%;\"/></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\" >\r\n");
      out.write("\t\t\t\t\t\t<li id=\"group\"><a id=\"showaddtaskmodal\" href=\"#addtaskmodal\" class=\"btn-group-sm\" data-toggle=\"modal\"  style=\"color:white\">Add a Task</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"friend\"><a id=\"showaddfriendmodal\" href=\"#addfriendmodal\" class=\"btn-group-sm\" data-toggle=\"modal\" style=\"color:white\">Add a Friend</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"task_login.jsp\" class=\"btn-group-sm\" style=\"color:white\">Log Out</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> \r\n");
      out.write("\t\t\t</div><!-- /.navbar-collapse -->\r\n");
      out.write("\t\t  </div><!-- /.container-fluid -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("      <h1>Welcome ");
      out.print(request.getAttribute("Name"));
      out.write("</h1><br>\r\n");
      out.write("      <table>\r\n");
      out.write("            ");

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
              
              
              while(rs2.next()){
                  sql = "SELECT * FROM WTFtasks where TASKID ="+rs2.getInt("TASKID");
                  ResultSet rs = s.executeQuery(sql);
              while (rs.next()) {
                  String sql2 ="SELECT FIRSTNAME,LASTNAME FROM WTFuser WHERE USERNAME='"+rs.getString("OWNER")+"'";                       
                  ResultSet rs1 = s1.executeQuery(sql2);
                        rs1.next();
                        out.println("<div class='row'>");
                        out.println("<div class='col-sm-6 col-md-4'>");
                        out.println("<div class='thumbnail'>");
                        out.println("<div class='caption'>");
                        out.println("<h3>"+rs.getString("TASKNAME")+"</h3>");
                        out.println("<p>Points: "+rs.getString("TASKPOINTS")+"<br>OWNER: "+rs1.getString("FIRSTNAME")+" "+rs1.getString("LASTNAME")+"<br>DUE-DATE: "+rs.getString("DUEDATE")+"</p>");
                 
                        out.println("<p><a href='#' class='btn btn-primary' role='button'>Wrap Up</a></p>");
                        out.println("</div></div></div></div>");
                        
                        
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
    
     
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("        </div> \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-md-2\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"addfriendmodal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" style=\"border-radius:20px;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button><br><br>\r\n");
      out.write("\t\t\t\t\t<h3 class=\"modal-title\" align=\"center\">Add a Friend</h4></br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                                        <form id =\"searchForm\" class=\"form-inline\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-xs-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"searchname\" id=\"searchname\" class=\"form-control input-md\" Placeholder=\"Search...\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                     \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 col-xs-1\" style=\"padding-top:2px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"SearchButton\" type=\"button\">Add </button> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                    \r\n");
      out.write("\t\t\t\t\t\t</div><br><br>\r\n");
      out.write("                                                 \r\n");
      out.write("                                                 <div id=\"searchUpdate\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a align=\"center\" id=\"Invite\" href=\"#\" >Can't find your friend? Invite them!</a>  \r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form id=\"inviteForm\" class=\"form-inline\" align=\"center\" method=\"get\" action = \"Add_Friend\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"firstname\" Placeholder=\"First name\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"lastname\" Placeholder=\"Last name\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" Placeholder=\"Email address\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                            <input type=\"hidden\" class=\"form-control input-md\" name = \"user\" value=\"");
      out.print(request.getAttribute("Name"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<button id=\"login\" href=\"#\" class=\"btn btn-primary\" align=\"center\">Invite</button>\r\n");
      out.write("\t\t\t\t\t\t</div><br>\r\n");
      out.write("\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"addtaskmodal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel1\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button><br><br>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"modal-title\" align=\"center\">Add a task</h4></br>\r\n");
      out.write("\t\t\t\t\t\t<form id=\"addtaskForm\" class=\"form-inline\" align=\"center\" method=\"get\" action=\"Add_Task\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"taskname\" Placeholder=\"Task name\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                        </div><br>\r\n");
      out.write("                                                        <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Points\" name=\"taskpoints\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                        </div><br>\r\n");
      out.write("                                                        <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\"  name=\"user\" value = \"");
      out.print(request.getAttribute("username"));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                        </div><br>\r\n");
      out.write("                                                        <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\"  name=\"Name\" value = \"");
      out.print(request.getAttribute("Name"));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                        </div><br>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                                    <div class=\"col-lg-12 col-xs-12\">\r\n");
      out.write("                                                                        <div class=\"input-group date\" >\r\n");
      out.write("                                                                            <input type=\"text\" class=\"form-control\"  id=\"duedate\" name=\"duedate\" Placeholder=\"Due date\" />\r\n");
      out.write("                                                                            <span class=\"input-group-addon\">\r\n");
      out.write("                                                                                <span class=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("                                                                            </span>\r\n");
      out.write("                                                                        </div>  \r\n");
      out.write("                                                                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-9 col-xs-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" Placeholder=\"Add friends...\" id=\"addedfriend\" name=\"addedfriend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-xs-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"add\" type=\"button\" class=\"btn btn-success\" onclick=\"showFriend()\"> Add</button>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"break-inverse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"content\"></div><br>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                            <button class=\"btn btn-primary\">Add task</button><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t</div><br>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("                                                              \r\n");
      out.write("     \r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"http://bsdp-assets.blackcherry.us/1.3.0/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\t\t<!-- BootstrapValidator JS -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"dist/js/bootstrapValidator.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("\ti = 0;\r\n");
      out.write("\t\r\n");
      out.write("\t $(function () {\r\n");
      out.write("                $(\"#duedate\").datepicker();\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("\t$(\"#SearchButton\").click(function(){\r\n");
      out.write("           // alert(\"button\");\r\n");
      out.write("           $.get('Search',$(\"#searchname\"),function(ResponseText){  \r\n");
      out.write("              if(ResponseText===\"true\") \r\n");
      out.write("              {\r\n");
      out.write("                   $(\"#searchUpdate\").text(\"User Found\");\r\n");
      out.write("              }\r\n");
      out.write("              else\r\n");
      out.write("              {\r\n");
      out.write("                  $(\"#searchUpdate\").text(\"User not Found\");\r\n");
      out.write("              }\r\n");
      out.write("           });\r\n");
      out.write("        });\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("\t\r\n");
      out.write("\tfunction showFriend() {\r\n");
      out.write("\t\ti = i + 1;\r\n");
      out.write("\t\tvar name = document.getElementById(\"addedfriend\").value;\r\n");
      out.write("\t\tstring = \"<div id='here\"+i+\"' onClick='removeFriend(this)' ><input type='text' style='border:none' name='list'  value='\"+name+\"' />\"+\"&nbsp;<span class='glyphicon glyphicon-remove' style='color:blue;'></span><br></div>\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#content\").append(string);\r\n");
      out.write("\t\t$(\"#addedfriend\").val('');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeFriend(item) {\r\n");
      out.write("\t\t$(item).remove();\r\n");
      out.write("\t}\t\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t$(\"#inviteForm\").hide();\r\n");
      out.write("\t\r\n");
      out.write("        \r\n");
      out.write("        $(\"#showaddtaskmodal\").click(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("                document.forms[\"addtaskForm\"].reset();\r\n");
      out.write("\t});\r\n");
      out.write("        \r\n");
      out.write("        $(\"#showaddfriendmodal\").click(function(){\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#searchForm\").show();\r\n");
      out.write("\t\t$(\"#inviteForm\").hide();\r\n");
      out.write("                document.forms[\"searchForm\"].reset();\r\n");
      out.write("                document.forms[\"inviteForm\"].reset();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("        $(\"#Invite\").click(function(){\r\n");
      out.write("\t\t$(\"#searchForm\").hide();\r\n");
      out.write("\t\t$(\"#inviteForm\").show();\r\n");
      out.write("                document.forms[\"searchForm\"].reset();\r\n");
      out.write("                document.forms[\"inviteForm\"].reset();\r\n");
      out.write("\t});\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
