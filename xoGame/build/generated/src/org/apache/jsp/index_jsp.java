package org.apache.jsp;

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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Test</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: #303030;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #tictactoe {\n");
      out.write("                color: #fff;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .box {\n");
      out.write("                width: 100px;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("            .box1:nth-child(1) {\n");
      out.write("                border-right: 1px solid #fff;\n");
      out.write("                border-bottom: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box1:nth-child(2) {\n");
      out.write("                border-left: 1px solid #fff;\n");
      out.write("                border-right: 1px solid #fff;\n");
      out.write("                border-bottom: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box1:nth-child(3) {\n");
      out.write("                border-left: 1px solid #fff;\n");
      out.write("                border-bottom: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box2:nth-child(1) {\n");
      out.write("                border-top: 1px solid #fff;\n");
      out.write("                border-right: 1px solid #fff;\n");
      out.write("                border-bottom: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box2:nth-child(2) {\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box2:nth-child(3) {\n");
      out.write("                border-top: 1px solid #fff;\n");
      out.write("                border-left: 1px solid #fff;\n");
      out.write("                border-bottom: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box3:nth-child(1) {\n");
      out.write("                border-right: 1px solid #fff;\n");
      out.write("                border-top: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box3:nth-child(2) {\n");
      out.write("                border-left: 1px solid #fff;\n");
      out.write("                border-right: 1px solid #fff;\n");
      out.write("                border-top: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            .box3:nth-child(3) {\n");
      out.write("                border-left: 1px solid #fff;\n");
      out.write("                border-top: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section id=\"tictactoe\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"header text-center\">\n");
      out.write("                        <h1>Tic Tac Toe Game</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div id=\"R1_C1\" class=\"box box1\"></div>\n");
      out.write("                    <div id=\"R1_C2\" class=\"box box1\"></div>\n");
      out.write("                    <div id=\"R1_C3\" class=\"box box1\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div id=\"R2_C1\" class=\"box box2\"></div>\n");
      out.write("                    <div id=\"R2_C2\" class=\"box box2\"></div>\n");
      out.write("                    <div id=\"R2_C3\" class=\"box box2\"</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div id=\"R3_C1\" class=\"box box3\"></div>\n");
      out.write("                    <div id=\"R3_C2\" class=\"box box3\"></div>\n");
      out.write("                    <div id=\"R3_C3\" class=\"box box3\"></div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-4 text-center\">\n");
      out.write("                        <p>Player 1</p>\n");
      out.write("                        <p id=\"player1Score\"></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4 text-center\">\n");
      out.write("                        <p>Tie</p>\n");
      out.write("                        <p id=\"tieScore\"></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4 text-center\">\n");
      out.write("                        <p>Player 2</p>\n");
      out.write("                        <p id=\"player2Score\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
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
