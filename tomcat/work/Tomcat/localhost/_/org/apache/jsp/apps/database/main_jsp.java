/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.16
 * Generated at: 2014-02-08 11:33:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.apps.database;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/apps/database/main.js.jsp", Long.valueOf(1391859213895L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      com.pet.email.web.util.WebConstants WebConstants = null;
      WebConstants = (com.pet.email.web.util.WebConstants) _jspx_page_context.getAttribute("WebConstants", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (WebConstants == null){
        WebConstants = new com.pet.email.web.util.WebConstants();
        _jspx_page_context.setAttribute("WebConstants", WebConstants, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"pull-right\">\r\n");
      out.write("\t\t<button class=\"btn btn-primary\" type=\"button\" id=\"database-new-btn\">New</button>\r\n");
      out.write("\t\t<button class=\"btn btn-primary\" type=\"button\">Import</button>\r\n");
      out.write("\t\t<button class=\"btn btn-danger\" type=\"button\">Delete</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<span class=\"clearfix\"></span>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<table class=\"table table-bordered table-striped\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"10px\"><input type=\"checkbox\" name=\"check_all\" value=\"1\" /></th>\r\n");
      out.write("\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>Description</th>\r\n");
      out.write("\t\t\t\t<th>Date Created</th>\r\n");
      out.write("\t\t\t\t<th>Status</th>\r\n");
      out.write("\t\t\t\t<th>Type</th>\r\n");
      out.write("\t\t\t\t<th>Size</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th><input type=\"checkbox\" name=\"check_all\" value=\"1\" /></th>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td><a>Test</a></td>\r\n");
      out.write("\t\t\t\t<td>Test</td>\r\n");
      out.write("\t\t\t\t<td>Yesterday</td>\r\n");
      out.write("\t\t\t\t<td>Active</td>\r\n");
      out.write("\t\t\t\t<td>Subscription</td>\r\n");
      out.write("\t\t\t\t<td>1231</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"pull-right\">\r\n");
      out.write("\t\t<ul class=\"pagination\">\r\n");
      out.write("\t  \t\t<li><a>&laquo;</a></li>\r\n");
      out.write("\t  \t\t<li><a>1</a></li>\r\n");
      out.write("\t  \t\t<li><a>2</a></li>\r\n");
      out.write("\t  \t\t<li><a>3</a></li>\r\n");
      out.write("\t  \t\t<li><a>4</a></li>\r\n");
      out.write("\t  \t\t<li><a>5</a></li>\r\n");
      out.write("\t  \t\t<li><a>&raquo;</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade bs-modal-lg\" id=\"add-database-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t<div class=\"modal-dialog modal-lg\">\r\n");
      out.write("    \t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("        \t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("        \t\t<h4 class=\"modal-title\" id=\"myModalLabel\">New Database</h4>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div class=\"modal-body\">\r\n");
      out.write("        \t\t<form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("        \t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t\t<label for=\"database-name\" class=\"col-sm-2 control-label\">Name</label>\r\n");
      out.write("    \t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("      \t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"database-name\" placeholder=\"Name\">\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t\t<label for=\"database-description\" class=\"col-sm-2 control-label\">Description</label>\r\n");
      out.write("    \t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("      \t\t\t\t\t\t<textarea rows=\"5\" id=\"database-description\" class=\"form-control\"></textarea>\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t\t<label for=\"database-type\" class=\"col-sm-2 control-label\">Type</label>\r\n");
      out.write("    \t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("      \t\t\t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons\">\r\n");
      out.write("  \t\t\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
      out.write("    \t\t\t\t\t\t\t\t<input type=\"radio\" checked=\"checked\" name=\"database-type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WebConstants.DATABASE_TYPE_SUBSCRIBE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> Subscription\r\n");
      out.write("  \t\t\t\t\t\t\t\t</label>\r\n");
      out.write("  \t\t\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
      out.write("    \t\t\t\t\t\t\t\t<input type=\"radio\" name=\"database-type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WebConstants.DATABASE_TYPE_UNSUBSCRIBE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> Unsubscribe\r\n");
      out.write("  \t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("        \t\t</form>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div class=\"modal-footer\">\r\n");
      out.write("        \t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        \t\t<button type=\"button\" class=\"btn btn-primary\" id=\"add-database-save-btn\">Save</button>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("\tvar $newBtn = $(\"#database-new-btn\");\r\n");
      out.write("\tvar $newDBModal = $(\"#add-database-modal\");\r\n");
      out.write("\t\r\n");
      out.write("\tvar url = 'database?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WebConstants.ACTION_NAME}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WebConstants.GET_DATABASE_LIST}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\tapp.ajaxCall({url : url, data : null, callbackFn : function(data, textStatus, jqXHR) {\r\n");
      out.write("\t\ttry {\r\n");
      out.write("\t\t\tvar json = $.parseJSON(jqXHR.responseText);\r\n");
      out.write("\t\t\talert(json.success);\r\n");
      out.write("\t\t} catch (e) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$newBtn.unbind(\"click\");\r\n");
      out.write("\t$newBtn.click(function() {\r\n");
      out.write("\t\tvar $saveBtn = $(\"#add-database-save-btn\");\r\n");
      out.write("\t\tvar $inputDesc = $(\"#database-description\");\r\n");
      out.write("\t\tvar $inputName = $(\"#database-name\");\r\n");
      out.write("\t\tvar $inputType = $(\"input:radio[name=database-type]:checked\")\r\n");
      out.write("\t\t$saveBtn.unbind(\"click\");\r\n");
      out.write("\t\t$saveBtn.click(function() {\r\n");
      out.write("\t\t\tvar name = $inputName.val();\r\n");
      out.write("\t\t\tvar desc = $inputDesc.html();\r\n");
      out.write("\t\t\tvar type = $inputType.val();\r\n");
      out.write("\t\t\tif(name == null || name == '')\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\tvar data = {name : name, desc : desc, type : type};\r\n");
      out.write("\t\t\tvar url = 'database?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WebConstants.ACTION_NAME}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WebConstants.DO_SAVE_DATABASE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\tapp.ajaxCall({url : url, data : data, callbackFn : function(data, textStatus, jqXHR) {\r\n");
      out.write("\t\t\t\t$newDBModal.modal('hide');\r\n");
      out.write("\t\t\t}});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$newDBModal.modal();\r\n");
      out.write("\t});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}