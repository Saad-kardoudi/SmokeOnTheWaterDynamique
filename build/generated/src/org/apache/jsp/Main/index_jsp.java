package org.apache.jsp.Main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Smoke on Water</title>\r\n");
      out.write("        <meta name=\"description\" content=\"Smoke on water The number 1 medical marijuana dispensary on Vespucci Beach. All 100% legal and purely for medical purposes!\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet/less\" type=\"text/css\" href=\"../style.less\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"imgs/canalogo.png\" />\r\n");
      out.write("        <script src=\"../libs/less.min.js\" ></script>\r\n");
      out.write("        <script src=\"../libs/jquery-3.5.0.js\" ></script>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"banner-top\">\r\n");
      out.write("            <div class=\"banner-container\">\r\n");
      out.write("                <a href=\"index.jsp\"><img src=\"../imgs/logo.webp\"></a>\r\n");
      out.write("                <div class=\"banner-listbtn\">\r\n");
      out.write("                    <a href=\"login.jsp\"><button>Login</button></a>\r\n");
      out.write("                    <a href=\"register.jsp\"><button>Sign Up</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class='whystw'>\r\n");
      out.write("                <center><h2>Why Smoke on the water</h2>\r\n");
      out.write("                <p>We’re the world’s leading destination to learn about, find about cannabis.</p>\r\n");
      out.write("                <div class=\"listitem\">\r\n");
      out.write("                    <img src=\"../imgs/search.png\">\r\n");
      out.write("                    <h3>Learn</h3>\r\n");
      out.write("                    <p>Start at the top or dive deep into strain effects and reviews.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"listitem\">\r\n");
      out.write("                    <img src=\"../imgs/cana.png\">\r\n");
      out.write("                    <h3>Find</h3>\r\n");
      out.write("                    <p>Start at the top or dive deep into strain effects and reviews.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"aboutus\">\r\n");
      out.write("                <h2>About Us</h2>\r\n");
      out.write("                <img src=\"../imgs/storepic.jpg\">\r\n");
      out.write("                <p>The number 1 medical marijuana dispensary on Vespucci Beach. All 100% legal and purely for medical purposes! <strong>VOTE YES FOR MEDICAL WEED</strong></p>\r\n");
      out.write("                <p>Smoke on the Water is a pharmacy located on the Vespucci Beach Sidewalk, Vespucci Beach in Los Santos. It sells prescription marijuana for \"medical\" purposes.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"footer-container\">\r\n");
      out.write("                <center>\r\n");
      out.write("                        <img src=\"../imgs/logo.webp\">\r\n");
      out.write("                        <div><p>\r\n");
      out.write("                        <a href=\"https://www.instagram.com/ilyaslezwin\">Instagram</a> - <a href=\"https://www.facebook.com/ilyas.Benhssine/\">Facebook</a> - <a href=\"https://github.com/IlyasDiker\">Github</a></p>\r\n");
      out.write("                        <p>© 2020 Smoke On The Water Inc. STW and the STW logo are registered trademarks of Take Two Interactive, Inc. All Rights Reserved.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
