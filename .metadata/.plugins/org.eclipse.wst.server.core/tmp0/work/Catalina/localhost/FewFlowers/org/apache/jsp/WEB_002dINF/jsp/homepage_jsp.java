/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.96
 * Generated at: 2020-03-22 11:19:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"static/images/huashao.png\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>FewFlowers-花少主题</title>\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css?family=Open+Sans:700');\r\n");
      out.write("body {\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\theight:100vh;\r\n");
      out.write("\twidth:100vw;\r\n");
      out.write("\tbackground:#000000;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("}\r\n");
      out.write("*{\r\n");
      out.write("\tbox-sizing:border-box;\r\n");
      out.write("}\r\n");
      out.write("#page{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("\tdisplay:flex;\r\n");
      out.write("\tjustify-content:center;\r\n");
      out.write("\talign-items:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#center {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tz-index:5;\r\n");
      out.write("   background-color: #ffff64;\t\r\n");
      out.write("\ttransition:0.25s;\r\n");
      out.write("\tanimation:float 1s infinite;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center .icon{\r\n");
      out.write("\tpadding:40px 0px;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tdisplay:flex;\r\n");
      out.write("\tflex-direction:column;\r\n");
      out.write("\tjustify-content:space-around;\r\n");
      out.write("\talign-items:center;\r\n");
      out.write("/* \ttransform: skew(-50deg); */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bar{\r\n");
      out.write("\theight:15px;\r\n");
      out.write("\twidth:50%;\r\n");
      out.write("/* \tborder-radius:25px; */\r\n");
      out.write("\tbackground:#000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn{\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("   height: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\ttransform: rotateX(60deg) rotateY(0deg) rotateZ(-45deg);\r\n");
      out.write("/* \ttransform: rotate(-30deg) skew(30deg,0deg); */\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("\theight:200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn.item{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("\ttransition: all 0.25s ease-out;\r\n");
      out.write("\tleft:0px;\r\n");
      out.write("\ttop:0px;\r\n");
      out.write("\topacity:1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn.item:not(.opened){\r\n");
      out.write("\tbackground:rgba(255, 255, 255,0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center:hover{\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tbackground:#ff1464 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center:hover .bar{\r\n");
      out.write("\tbackground:#ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn.item a:hover{\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tbackground:#ff1464 !important;\r\n");
      out.write("\tcolor:#ffffff !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn.item a{\r\n");
      out.write("\topacity:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn.item.opened a{\r\n");
      out.write("\topacity:1;\r\n");
      out.write("\tbackground:#ffff64;\r\n");
      out.write("\tcolor:#000000;\r\n");
      out.write("\tpadding:0 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn.item.opened{\r\n");
      out.write("\tfont-family:'open sans';\r\n");
      out.write("\r\n");
      out.write("\tfont-size:5rem;\r\n");
      out.write("\tdisplay:flex;\r\n");
      out.write("\tjustify-content:center;\r\n");
      out.write("\talign-items:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#up,#bottom{\r\n");
      out.write("\ttop:20px;\r\n");
      out.write("\tleft:-20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#right,#left{\r\n");
      out.write("\ttop:40px;\r\n");
      out.write("\tleft:-40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#up.opened{\r\n");
      out.write("\ttop:-100%;\r\n");
      out.write("\tleft:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#right.opened{\r\n");
      out.write("\tleft:140%;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bottom.opened{\r\n");
      out.write("\ttop:100%;\r\n");
      out.write("\tleft:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#left.opened{\r\n");
      out.write("\tleft:-140%;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center.close .bar.top{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:40px;\r\n");
      out.write("\tleft:50px;\r\n");
      out.write("\ttransform-origin:center left;\r\n");
      out.write("\ttransform:rotateZ(45deg);\r\n");
      out.write("\twidth:70%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center.close .bar.bottom{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tbottom:40px;\r\n");
      out.write("\tleft:50px;\r\n");
      out.write("\ttransform-origin:center left;\r\n");
      out.write("\ttransform:rotateZ(-45deg);\r\n");
      out.write("\twidth:70%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center.close .bar.middle{\r\n");
      out.write("\twidth:0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@keyframes float {\r\n");
      out.write("  0%,100% {\r\n");
      out.write("    top: 0px;\r\n");
      out.write("\t left:0px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  50% {\r\n");
      out.write("    top: -5px;\r\n");
      out.write("\t left:5px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("a{ \r\n");
      out.write("\ttext-decoration:none\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"page\">\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div id=\"center\" class=\"btn\">\r\n");
      out.write("\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t<div class=\"bar top\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"bar middle\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"bar bottom\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"up\" class=\"btn item\">\r\n");
      out.write("\t\t\t<a href=\"tologin\">登&nbsp;&nbsp;&nbsp;录</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"right\" class=\"btn item\">\r\n");
      out.write("\t\t\t<a href=\"toregister\">注&nbsp;&nbsp;&nbsp;册</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"bottom\" class=\"btn item\">\r\n");
      out.write("\t\t\t<a>修&nbsp;&nbsp;&nbsp;改</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"left\" class=\"btn item\">\r\n");
      out.write("\t\t\t<a href=\"tohuashao\">花&nbsp;&nbsp;&nbsp;少</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("const navItems = document.querySelectorAll('nav .item');\r\n");
      out.write("\r\n");
      out.write("document.querySelector('#center').addEventListener('click',function(){\r\n");
      out.write("\tfor(let i=0;i<navItems.length;i++){\r\n");
      out.write("\t\tnavItems[i].classList.toggle('opened')\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.querySelector('#center').classList.toggle('close')\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#ffffff\">\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
