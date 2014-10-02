package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
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
      out.write("\t\t\tpadding:2em;\n");
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
      out.write("                    <h1>Welcome ");
      out.print(request.getAttribute("Name"));
      out.write("</h1>\n");
      out.write("\t\t\t\n");
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
      out.write("</html>\n");
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
