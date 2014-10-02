package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class task_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Welcome to crib!</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\t  \n");
      out.write("    <![endif]-->\n");
      out.write("\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t\t@media (max-width: 480px) { \n");
      out.write("\t\t\t#login_carousel {\n");
      out.write("\t\t\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\theight: 100%;\n");
      out.write("\t\t\t\tborder:none;\n");
      out.write("\t\t\t\tbox:none;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t#form {\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\theight: 100%;\n");
      out.write("\t\t\t\tpadding: 2%;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.carousel .item {\n");
      out.write("\t\t\t-webkit-transition: opacity 0.65s;\n");
      out.write("\t\t\t-moz-transition: opacity 0.65s;\n");
      out.write("\t\t\t-ms-transition: opacity 0.65s;\n");
      out.write("\t\t\t-o-transition: opacity 0.65s;\n");
      out.write("\t\t\ttransition: opacity 0.65s;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t.carousel .active.left, .carousel .active.right {\n");
      out.write("\t\t\tleft:0;\n");
      out.write("\t\t\topacity:0;\n");
      out.write("\t\t\tz-index:2;\n");
      out.write("\t\t}\n");
      out.write("\t\t.carousel .next, .carousel .prev {\n");
      out.write("\t\t\tleft:0;\n");
      out.write("\t\t\topacity:1;\n");
      out.write("\t\t\tz-index:1;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.item {\n");
      out.write("\t\t\tpadding-top:2em;\n");
      out.write("                        padding-left:1em;\n");
      out.write("                        padding-right:1em;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#form {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\theight: 100%;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t#login_carousel {\n");
      out.write("\t\t\n");
      out.write("\t\t\theight:100%;width:100%;\n");
      out.write("\t\t\tborder:1px solid;\n");
      out.write("\t\t\tborder-radius:20px;\n");
      out.write("\t\t\tbox-shadow: 2px #888888;\n");
      out.write("\t\t\tbackground-color:white;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.btn-primary  {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tbackground-color:#336699;\n");
      out.write("\t\t\tborder-color:#336699;\n");
      out.write("\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\tbody {\n");
      out.write("\t\t  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */\n");
      out.write("\t\t  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\thtml {height:100%;width:100%;padding-top:10%}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("\t<div class=\"row\" ></div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div id=\"login_carousel\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"false\">\n");
      out.write("\t \n");
      out.write("\t\t\t  <!-- Wrapper for slides -->\n");
      out.write("\t\t\t  <div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t<div class=\"item active\" id=\"one\">\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t\t<div id=\"form\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/logo.png\" style=\"height:20%;\"/><br><br>\n");
      out.write("                                                <form method=\"get\" action=\"Login\" role=\"form\" class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"username\" name=\"username\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t  </div><br><br>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t  </div><br><br>\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn btn-primary\">Login</button><br><br>\n");
      out.write("\t\t\t\t\t\t <a  href=\"#login_carousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\tNeed an account? Sign up!\n");
      out.write("\t\t\t\t\t\t </a>\n");
      out.write("\t\t\t\t\t\t<br><br><br>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item\" id=\"two\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div id=\"form\" style=\"height:100%;width:100%;\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/logo.png\" style=\"height:20%;\"/><br><br>\n");
      out.write("\t\t\t\t\t\t<form method=\"get\" action=\"Registration\" role=\"form\" class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"fname\" name=\"fname\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"First Name\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"lname\" name=\"lname\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Last Name\">\n");
      out.write("\t\t\t\t\t\t  </div><br><br>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Email address\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"username\" name=\"username\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t  </div><br><br>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"cpassword\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Confirm Password\">\n");
      out.write("\t\t\t\t\t\t  </div><br><br>\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn btn-primary\">Sign up</button><br><br>\n");
      out.write("\t\t\t\t\t\t  <a  href=\"#login_carousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\tHave an account? Login!\n");
      out.write("\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
