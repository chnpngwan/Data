package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("    \n");
      out.write("    <title>医院门诊管理信息系统</title>\n");
      out.write("    \n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".ld {\n");
      out.write("\tfont-family: \"方正大标宋简体\";\n");
      out.write("\tcolor:#FFF;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tborder: #CCC solid 1px;\n");
      out.write("\tbackground-color: #323574;\n");
      out.write("}\n");
      out.write(".lk {\n");
      out.write("\tfont-size:9pt;\n");
      out.write("\tborder-bottom: #CCC solid 1px;\n");
      out.write("\tborder-left: #CCC solid 1px;\n");
      out.write("\tbackground-color: #CDECED;\n");
      out.write("}\n");
      out.write(".lm {\n");
      out.write("\tborder-bottom: #CCC solid 1px;\n");
      out.write("\tborder-left: #CCC solid 1px;\n");
      out.write("\tborder-right: #CCC solid 1px;\n");
      out.write("\tbackground-color: #CDECED;\n");
      out.write("}\n");
      out.write(".ln {\n");
      out.write("\tborder-bottom: #CCC solid 1px;\n");
      out.write("\tborder-left: #CCC solid 1px;\n");
      out.write("\tborder-right: #CCC solid 1px;\n");
      out.write("\tbackground-color: #D7E9B4;\n");
      out.write("}\n");
      out.write(".input {\t\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\t\n");
      out.write("\tfont-size: 1em\n");
      out.write("\t}\n");
      out.write(".submit {\n");
      out.write("\tborder:#039 solid 1px;\n");
      out.write("\tbackground-color:#CCC;\n");
      out.write("\twidth: 50px;\n");
      out.write("\theight: 25px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\tpadding-top:3px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("function login()\n");
      out.write("{\t\n");
      out.write("\tvar pattern = /^[a-zA-Z0-9_]+$/;\n");
      out.write("\tif (document.form1.name.value == \"\" ) \n");
      out.write("\t{\n");
      out.write("\t\talert(\"请输入用户名!\");\n");
      out.write("\t\tdocument.form1.name.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\tif (!pattern.test(document.form1.name.value) )  \n");
      out.write("\t{\n");
      out.write("\t\talert(\"用户名只能包含字母、数字!\");\n");
      out.write("\t\tdocument.form1.name.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\tif (document.form1.pwd.value == \"\"  )  \n");
      out.write("\t{\n");
      out.write("\t\talert(\"请输入密码!\");\n");
      out.write("\t\tdocument.form1.pwd.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\tif (!pattern.test(document.form1.pwd.value) )  \n");
      out.write("\t{\n");
      out.write("\t\talert(\"密码只能包含字母、数字!\");\n");
      out.write("\t\tdocument.form1.pwd.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function reg()\n");
      out.write("{\t\n");
      out.write("\tform1.action=\"users/reg.jsp\";\n");
      out.write("\tform1.submit();\n");
      out.write("}\n");
      out.write("</script>\n");

String message = (String)request.getAttribute("message");
	if(message == null){
		message = "";
	}
	if (!message.trim().equals("")){
		out.println("<script language='javascript'>");
		out.println("alert('"+message+"');");
		out.println("</script>");
	}
	request.removeAttribute("message");

      out.write("\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("    <tr>\n");
      out.write("      <td align=\"center\" height=\"400\" valign=\"middle\">\n");
      out.write("      <form action=\"UserLoginServlet\" method=\"post\" name=\"form1\" onSubmit=\"return login()\">\n");
      out.write("      <table width=\"50%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("          <tr>\n");
      out.write("            <th height=\"70\" colspan=\"2\" class=\"ld\" scope=\"col\">医院门诊管理信息系统</th>\n");
      out.write("\t\t  </tr>\n");
      out.write("          <tr>\n");
      out.write("            <th width=\"40%\" height=\"30\" align=\"right\" scope=\"row\" class=\"lk\">用户名:</th>\n");
      out.write("            <td width=\"60%\" height=\"30\" class=\"lm\">&nbsp;<input class=\"input\" type=\"text\" name=\"name\"></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <th width=\"40%\" height=\"30\" align=\"right\" scope=\"row\" class=\"lk\">密&nbsp;&nbsp;码:</th>\n");
      out.write("            <td height=\"30\" class=\"lm\">&nbsp;<input class=\"input\" type=\"password\" name=\"pwd\"></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <th height=\"30\" align=\"right\" scope=\"row\" class=\"lk\">登录身份：</th>\n");
      out.write("            <td height=\"30\" class=\"lm\">&nbsp;<select name=\"status\">\n");
      out.write("            <option value=\"挂号\">挂号</option>\n");
      out.write("            <option value=\"门诊\">门诊</option>\n");
      out.write("            <option value=\"药局\">药局</option>\n");
      out.write("            <option value=\"管理员\">管理员</option>\n");
      out.write("            </select></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <th height=\"35\" colspan=\"2\" scope=\"row\" class=\"ln\"><input class=\"submit\" type=\"submit\" value=\"登录\"></th>\n");
      out.write("         </tr>\n");
      out.write("        </table>\n");
      out.write("      </form>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
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
