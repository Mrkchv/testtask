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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=on\">\n");
      out.write("    <title>\n");
      out.write("        Test task\n");
      out.write("    </title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar bg-primary\">\n");
      out.write("        <img class=\"ml-5\" width=\"30\" height=\"30\" src=\"img/Logo.png\" alt=\"logo\">\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row my-4\">\n");
      out.write("                <div class=\"col-md text-center\">\n");
      out.write("                    <div class=\"d-flex h-100 justify-content-center align-items-center\" style=\"color: #007bff;\"> \n");
      out.write("                        Welcom<br>Please, Log in to access your page<br>Or Sign up, if you don`t have an account\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"border-left col-md-4 col-lg-3\">\n");
      out.write("                    \n");
      out.write("                    <form method=\"GET\" action=\"login\" class=\"formLogin\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Login</label>\n");
      out.write("                            <div class=\"d-flex justify-content-center\" style=\"color:red;\">\n");
      out.write("                                <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\n");
      out.write("                            </div>\n");
      out.write("                            <input class=\"form-control field login\" type=\"text\" name=\"login\" placeholder=\"login\">\n");
      out.write("                            <small class=\"text-muted\">Please, enter your login</small>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <input class=\"form-control field password\" type=\"password\" name=\"password\" placeholder=\"password\">\n");
      out.write("                            <small class=\"text-muted\">Please, enter your password</small>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-success loginBtn\" type=\"submit\" name=\"loginsub\">Log in</button>  \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row mb-4\">\n");
      out.write("                <div class=\"border-right col-md-4 col-lg-3\">\n");
      out.write("                    <form method=\"GET\" action=\"signin\" class=\"formSignin\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                            <label for=\"firstnameEnter\">Firstname</label>\n");
      out.write("                            <input class=\"form-control field\" type=\"text\" name=\"firstname\" placeholder=\"firstname\">\n");
      out.write("                            <small class=\"text-muted\">Please, enter your firstname<br>Don`t use special characters</small>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                            <label for=\"lastnameEnter\">Lastname</label>\n");
      out.write("                            <input class=\"form-control field\" type=\"text\" name=\"lastname\" placeholder=\"lastname\">\n");
      out.write("                            <small class=\"text-muted\">Please, enter your lastname<br>Don`t use special characters</small>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        <div class=\"d-flex justify-content-center\" style=\"color:red;\">\n");
      out.write("                            <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messageSignin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\n");
      out.write("                        </div>   \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"loginEnter\">Login</label>\n");
      out.write("                            <input class=\"form-control field\" type=\"text\" name=\"login\" placeholder=\"login\">\n");
      out.write("                            <small class=\"text-muted\">Please, enter login<br>Don`t use special characters</small>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                            <label for=\"passwordEnter\">Password</label>\n");
      out.write("                            <input class=\"form-control field\" type=\"password\" name=\"password\" id=\"passwordEnter\" placeholder=\"password\">\n");
      out.write("                            <small class=\"text-muted\">Please, enter your password<br>Don`t use special characters</small>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"passwordEnter\">Confirm password</label>\n");
      out.write("                            <input class=\"form-control field\" type=\"password\" name=\"confirmPassword\" id=\"confirmPasswordEnter\" placeholder=\"confirm password\">\n");
      out.write("                            <small class=\"text-muted\">Please, confirm password</small>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button class=\"btn btn-success signinBtn\" type=\"submit\" name=\"registersub\">Sign in</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col text-center\" style=\"color: #007bff;\">\n");
      out.write("                    <div class=\"d-flex h-30 justify-content-center mt-4\">Join<br>And be with us</div>\n");
      out.write("                    <div class=\"d-flex h-80 justify-content-end align-items-center mt-3\">\n");
      out.write("                        <img class=\"w-80\" src=\"img/start.png\">  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>              \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/js/bootstrap.min.js\" integrity=\"sha384-7aThvCh9TypR7fIc2HV4O/nFMVCBwyIUKL8XCtKE+8xgCgl/PQGuFsvShjr74PBp\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/validation.js\"></script>\n");
      out.write("</body>\n");
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
