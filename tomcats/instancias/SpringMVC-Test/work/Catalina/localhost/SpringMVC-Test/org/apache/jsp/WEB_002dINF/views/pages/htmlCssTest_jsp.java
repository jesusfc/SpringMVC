/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.29
 * Generated at: 2019-12-19 11:10:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class htmlCssTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.7.RELEASE.jar", Long.valueOf(1560852264000L));
    _jspx_dependants.put("jar:file:/home/pmiinf61/MisPruebas/WorkSpace/SpringMVC-Test/target/SpringMVC-Test-0.0.1-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("jar:file:/home/pmiinf61/MisPruebas/WorkSpace/SpringMVC-Test/target/SpringMVC-Test-0.0.1-SNAPSHOT/WEB-INF/lib/spring-webmvc-5.0.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1528807446000L));
    _jspx_dependants.put("jar:file:/home/pmiinf61/MisPruebas/WorkSpace/SpringMVC-Test/target/SpringMVC-Test-0.0.1-SNAPSHOT/WEB-INF/lib/tiles-jsp-3.0.8.jar!/META-INF/tld/tiles-jsp.tld", Long.valueOf(1506798484000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1560147076000L));
    _jspx_dependants.put("/WEB-INF/lib/tiles-jsp-3.0.8.jar", Long.valueOf(1560852264000L));
    _jspx_dependants.put("jar:file:/home/pmiinf61/MisPruebas/WorkSpace/SpringMVC-Test/target/SpringMVC-Test-0.0.1-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("jar:file:/home/pmiinf61/MisPruebas/WorkSpace/SpringMVC-Test/target/SpringMVC-Test-0.0.1-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("/WEB-INF/views/defs/taglibs.jsp", Long.valueOf(1511777262000L));
    _jspx_dependants.put("jar:file:/home/pmiinf61/MisPruebas/WorkSpace/SpringMVC-Test/target/SpringMVC-Test-0.0.1-SNAPSHOT/WEB-INF/lib/spring-webmvc-5.0.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1528807446000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\tbody {background-color: powderblue;}\n");
      out.write("\th1   {color: blue;}\n");
      out.write("\tp    {color: red;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<h1 style=\"color:red !important;\">htmlCssTest.jsp</h1> \t\n");
      out.write("<h1>-------------------------------------------------------------------------------------</h1>\n");
      out.write("\n");
      out.write("<div class=\"\" id=\"search\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li class=\"\">Elemento li de la lista</li>\t\n");
      out.write("\t\t<li class=\"\">\t        \t     \t        \t               \t        \t       \n");
      out.write("        \t\n");
      out.write("        \t<div class=\"\">\n");
      out.write("               <label class=\"\"><strong>Send voucher to the excursion provider</strong></label>\n");
      out.write("               <br> \n");
      out.write("               <div>\n");
      out.write("                   <label class=\"label\">E-mail Contact</label>\n");
      out.write("                   <input type=\"text\" value=\"\" disabled=\"disabled\" class=\"text\" name=\"emailsToJOLSendVoucher\" id=\"emailsToJOLSendVoucher\" aria-required=\"true\">\n");
      out.write("                   <input type=\"radio\" value=\"true\" checked=\"checked\" class=\"radio\" name=\"sendingVoucherFromJOL\" id=\"sendingVoucherFromJOL1\">\n");
      out.write("                   <label class=\"label\"><strong>Yes</strong></label>\n");
      out.write("                   <input type=\"radio\" checked=\"checked\" value=\"false\" class=\"radio\" name=\"sendingVoucherFromJOL\" id=\"sendingVoucherFromJOL2\">\n");
      out.write("                   <label class=\"label\"><strong>No</strong></label>\n");
      out.write("               </div>\t               \n");
      out.write("            </div>\t                        \t                                            \n");
      out.write("        </li>\t\n");
      out.write("\t\t<li class=\"\">Elemento li de la lista</li>\n");
      out.write("\t</ul>\t  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>-------------------------------------------------------------------------------------</h1>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
