/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-26 04:02:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.photo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.photo.model.vo.PhotoComment;
import java.util.ArrayList;
import kr.co.ansany.photo.model.vo.Photo;
import kr.co.ansany.member.model.vo.Member;

public final class photoView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1664162376726L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1664157968486L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.co.ansany.photo.model.vo.PhotoComment");
    _jspx_imports_classes.add("kr.co.ansany.member.model.vo.Member");
    _jspx_imports_classes.add("kr.co.ansany.photo.model.vo.Photo");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

Photo p = (Photo) request.getAttribute("p");
ArrayList<PhotoComment> commentList = (ArrayList<PhotoComment>) request.getAttribute("commentList");
ArrayList<PhotoComment> reCommentList = (ArrayList<PhotoComment>) request.getAttribute("reCommentList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>사진전 상세보기</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/Noto_Sans.css\" />\r\n");
      out.write("<style>\r\n");
      out.write(".header-logo>a>img {\r\n");
      out.write("	margin-bottom: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content {\r\n");
      out.write("	padding-top: 81px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-wrap {\r\n");
      out.write("	padding-top: 50px;\r\n");
      out.write("	padding-bottom: 100px;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content {\r\n");
      out.write("	width: 960px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-form {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	display: block;\r\n");
      out.write("	padding: 0.8rem;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-title {\r\n");
      out.write("	padding: 20px 0px;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("	font-size: 1.5rem;\r\n");
      out.write("	font-family: ns-bold;	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#photoContent {\r\n");
      out.write("	min-height: 300px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#photoContent>img {\r\n");
      out.write("	max-height: 800px;\r\n");
      out.write("	max-width: 800px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom {\r\n");
      out.write("	width: 960px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	margin-bottom: 36px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom>div>a {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 80px;\r\n");
      out.write("	line-height: 24px;\r\n");
      out.write("	height: 24px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	border-radius: 30px;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	float: right;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom>div>button {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 80px;\r\n");
      out.write("	line-height: 24px;\r\n");
      out.write("	height: 24px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	border-radius: 30px;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	float: right;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom>div>button {\r\n");
      out.write("	background-color: #000;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom>div>button:hover {\r\n");
      out.write("	background-color: #5865f5;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border-color: #5865f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom>div>a:hover {\r\n");
      out.write("	background-color: #000;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	border-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td-title {\r\n");
      out.write("	width: 300px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul {\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul>li:first-child {\r\n");
      out.write("	width: 15%;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul>li:first-child>span {\r\n");
      out.write("	font-size: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul>li:nth-child(2) {\r\n");
      out.write("	width: 75%\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul>li:nth-child(2)>textarea.input-form {\r\n");
      out.write("	height: 96px;\r\n");
      out.write("	min-height: 96px;\r\n");
      out.write("	resize: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul>li:last-child {\r\n");
      out.write("	width: 10%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputCommentBox>form>ul>li:last-child>button {\r\n");
      out.write("	height: 96px;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	background-color: black;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox {\r\n");
      out.write("	margin: 30px 0px;\r\n");
      out.write("	display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul {\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul>li:first-child {\r\n");
      out.write("	width: 15%;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul>li:first-child>span {\r\n");
      out.write("	font-size: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul>li:nth-last-child(2) {\r\n");
      out.write("	width: 75%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul>li:nth-last-child(2)>textarea.input-form {\r\n");
      out.write("	height: 96px;\r\n");
      out.write("	min-height: 96px;\r\n");
      out.write("	resize: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul>li:last-child {\r\n");
      out.write("	width: 10%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputRecommentBox>form>ul>li:last-child>button {\r\n");
      out.write("	height: 96px;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	background-color: black;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 댓글관련 css */\r\n");
      out.write(".posting-comment {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	border-top: 2px solid #ccc;\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:first-child {\r\n");
      out.write("	width: 15%;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	min-height: 100px;\r\n");
      out.write("	border-right: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment.reply>li:first-child {\r\n");
      out.write("	width: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:first-child .material-icons {\r\n");
      out.write("	font-size: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment.reply>li:first-child .material-icons:first-child {\r\n");
      out.write("	font-size: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment.reply>li:last-child {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	width: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	width: 85%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>p {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>.comment-info>span {\r\n");
      out.write("	padding: 0px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>.comment-info>span:not(:last-child) {\r\n");
      out.write("	border-right: 2px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>.comment-content {\r\n");
      out.write("	padding: 0px 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>.comment-link {\r\n");
      out.write("	text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>.comment-link>a {\r\n");
      out.write("	margin: 0px 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".posting-comment>li:last-child>.comment-link>a:hover {\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".comment-link>a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".material-icons {\r\n");
      out.write("	color: #222222;\r\n");
      out.write("}\r\n");
      out.write("textarea {\r\n");
      out.write("	resize: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");

Member m = (Member) session.getAttribute("m");

      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- jquery -->\r\n");
      out.write("<script src=\"/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<!-- 기본 CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/header.css\" />\r\n");
      out.write("\r\n");
      out.write("<div class=\"header-body\">\r\n");
      out.write("	<div class=\"header-fixed\">\r\n");
      out.write("		<div class=\"header-wrap\">\r\n");
      out.write("			<div class=\"header-top\">\r\n");
      out.write("				<div class=\"header-logo\">\r\n");
      out.write("					<a href=\"/index.jsp\"><img src=\"/img/logo2.png\" alt=\"\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"header-navi\">\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"/productList.do\">제품</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"#\">헤드폰/이어폰</a></li>\r\n");
      out.write("								<li><a href=\"#\">스피커</a></li>\r\n");
      out.write("								<li><a href=\"#\">턴테이블</a></li>\r\n");
      out.write("								<li><a href=\"#\">워크맨</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"/noticeList.do?reqPage=1\">커뮤니티</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"/noticeList.do?reqPage=1\">공지사항</a></li>\r\n");
      out.write("								<li><a href=\"/reviewList.do?reqPage=1\">구매후기</a></li>\r\n");
      out.write("								<li><a href=\"/photoList.do\">사진전</a></li>\r\n");
      out.write("								<li><a href=\"/freeBoardList.do?reqPage=1\">자유게시판</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"#\">멤버십</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"/membership.do\">등급&혜택 안내</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"#\">고객 서비스</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"/faqqnaList.do?reqPage=1&type=faq\">FAQ / Q<span>&</span>A\r\n");
      out.write("								</a></li>\r\n");
      out.write("								<li><a href=\"#\"></a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"#\">직영점 안내</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"/map.do\">찾아오시는길</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"header-icon\">\r\n");
      out.write("					<div class=\"icon-wrap\">\r\n");
      out.write("						<div>\r\n");
      out.write("							<a href=\"/cartView.do\"> <span class=\"material-icons\">shopping_cart</span>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div>\r\n");
      out.write("							");

							if (m == null) {
							
      out.write("\r\n");
      out.write("							<a href=\"loginFrm.do\"> <span class=\"material-icons\">person</span>\r\n");
      out.write("							</a>\r\n");
      out.write("							");

							} else {
							
      out.write("\r\n");
      out.write("							<a href=\"/myPageFrm.do\"> <span class=\"material-icons\"\r\n");
      out.write("								style=\"color: #5865f5\">person</span>\r\n");
      out.write("							</a>\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div>\r\n");
      out.write("							<a href=\"#\"> <span class=\"material-icons\">search</span>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"/js/header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"page-wrap\">\r\n");
      out.write("		<div class=\"page-content\">\r\n");
      out.write("			<div class=\"page-title\">사진전</div>\r\n");
      out.write("			");

			if (m != null && p.getPhotoWriter().equals(m.getMemberId())) {
			
      out.write("\r\n");
      out.write("			<div class=\"wrap-bottom\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<button onclick=\"photoDelete(");
      out.print(p.getPhotoNo());
      out.write(");\">삭제</button>\r\n");
      out.write("					<a href=\"/photoUpdateFrm.do?photoNo=");
      out.print(p.getPhotoNo());
      out.write("\">수정</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			} else if (m != null && m.getMemberLevel() == 1) {
			
      out.write("\r\n");
      out.write("			<div class=\"wrap-bottom\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<button onclick=\"photoDelete(");
      out.print(p.getPhotoNo());
      out.write(");\">삭제</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<table class=\"table table-group-divider\" id=\"photoView\">\r\n");
      out.write("				<tr class=\"table-secondary\">\r\n");
      out.write("					<th>제목</th>\r\n");
      out.write("					<td colspan=\"3\" class=\"td-title\">");
      out.print(p.getPhotoTitle());
      out.write("</td>\r\n");
      out.write("					<th>작성자</th>\r\n");
      out.write("					<td>");
      out.print(p.getPhotoWriter());
      out.write("</td>\r\n");
      out.write("					<th>조회수</th>\r\n");
      out.write("					<td>");
      out.print(p.getPhotoReadCount());
      out.write("</td>\r\n");
      out.write("					<th>작성일</th>\r\n");
      out.write("					<td>");
      out.print(p.getPhotoDate());
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th style=\"line-height: 300px;\">내용</th>\r\n");
      out.write("					<td colspan=\"9\">\r\n");
      out.write("						<div id=\"photoContent\">\r\n");
      out.write("							<img src=\"/upload/photo/");
      out.print(p.getPhotoFilePath());
      out.write("\" alt=\"\"> <br>\r\n");
      out.write("							<br>\r\n");
      out.write("							");
      out.print(p.getPhotoContentBr());
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			");

			if (m != null) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"inputCommentBox\">\r\n");
      out.write("				<form action=\"/insertPcomment.do\" method=\"post\">\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><span class=\"material-icons\">person</span></li>\r\n");
      out.write("						<li><input type=\"hidden\" name=\"pCommentWriter\"\r\n");
      out.write("							value=\"");
      out.print(m.getMemberId());
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("							name=\"photoRef\" value=\"");
      out.print(p.getPhotoNo());
      out.write("\"> <input\r\n");
      out.write("							type=\"hidden\" name=\"pCommentRef\" value=\"0\"> <textarea\r\n");
      out.write("								class=\"input-form\" name=\"pCommentContent\"></textarea></li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<button type=\"submit\" class=\"btn-repl\">댓글쓰기</button>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("			<div class=\"commentBox\">\r\n");
      out.write("				");

				for (PhotoComment pc : commentList) {
				
      out.write("\r\n");
      out.write("				<ul class=\"posting-comment\">\r\n");
      out.write("					<li><span class=\"material-icons\">person</span></li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<p class=\"comment-info\">\r\n");
      out.write("							<span>");
      out.print(pc.getpCommentWriter());
      out.write("</span> <span>");
      out.print(pc.getpCommentDate());
      out.write("</span>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p class=\"comment-content\">");
      out.print(pc.getpCommentContent());
      out.write("</p><textarea name=\"pCommentContent\" class=\"input-form\"\r\n");
      out.write("							style=\"min-height: 96px; display: none;\">");
      out.print(pc.getpCommentContent());
      out.write("</textarea>\r\n");
      out.write("						<p class=\"comment-link\">\r\n");
      out.write("							");

							if (m != null) {
							
      out.write("\r\n");
      out.write("							");

							if (m.getMemberId().equals(pc.getpCommentWriter())) {
							
      out.write("\r\n");
      out.write("							<a href=\"javascript:void(0)\"\r\n");
      out.write("								onclick=\"modifyComment(this,");
      out.print(pc.getpCommentNo());
      out.write(',');
      out.write(' ');
      out.print(p.getPhotoNo());
      out.write(");\">수정</a>\r\n");
      out.write("							<a href=\"javascript:void(0)\"\r\n");
      out.write("								onclick=\"deleteComment(this,");
      out.print(pc.getpCommentNo());
      out.write(',');
      out.write(' ');
      out.print(p.getPhotoNo());
      out.write(");\">삭제</a>\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("							<a href=\"javascript:void(0)\" class=\"recShow\">답글</a>\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</p>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				");

				for (PhotoComment pct : reCommentList) {
				
      out.write("\r\n");
      out.write("				");

				if (pct.getpCommentRef() == pc.getpCommentNo()) {
				
      out.write("\r\n");
      out.write("				<ul class=\"posting-comment reply\">\r\n");
      out.write("					<li><span class=\"material-icons\">subdirectory_arrow_right</span>\r\n");
      out.write("						<span class=\"material-icons\">person</span></li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<p class=\"comment-info\">\r\n");
      out.write("							<span>");
      out.print(pct.getpCommentWriter());
      out.write("</span> <span>");
      out.print(pct.getpCommentDate());
      out.write("</span>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p class=\"comment-content\">");
      out.print(pct.getpCommentContent());
      out.write("</p> <textarea\r\n");
      out.write("							name=\"pCommentContent\" class=\"input-form\"\r\n");
      out.write("							style=\"min-height: 96px; display: none;\">");
      out.print(pct.getpCommentContent());
      out.write("</textarea>\r\n");
      out.write("						<p class=\"comment-link\">\r\n");
      out.write("							");

							if (m != null) {
							
      out.write("\r\n");
      out.write("							");

							if (m.getMemberId().equals(pct.getpCommentWriter())) {
							
      out.write("\r\n");
      out.write("							<a href=\"javascript:void(0)\"\r\n");
      out.write("								onclick=\"modifyComment(this,");
      out.print(pct.getpCommentNo());
      out.write(',');
      out.write(' ');
      out.print(p.getPhotoNo());
      out.write(");\">수정</a>\r\n");
      out.write("							<a href=\"javascript:void(0)\"\r\n");
      out.write("								onclick=\"deleteComment(this,");
      out.print(pct.getpCommentNo());
      out.write(',');
      out.write(' ');
      out.print(p.getPhotoNo());
      out.write(");\">삭제</a>\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</p>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("				");

				if (m != null) {
				
      out.write("\r\n");
      out.write("				<div class=\"inputRecommentBox\">\r\n");
      out.write("					<form action=\"/insertPcomment.do\" method=\"post\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><span class=\"material-icons\">subdirectory_arrow_right</span>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li><input type=\"hidden\" name=\"pCommentWriter\"\r\n");
      out.write("								value=\"");
      out.print(m.getMemberId());
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("								name=\"photoRef\" value=\"");
      out.print(p.getPhotoNo());
      out.write("\"> <input\r\n");
      out.write("								type=\"hidden\" name=\"pCommentRef\" value=\"");
      out.print(pc.getpCommentNo());
      out.write("\"> <textarea\r\n");
      out.write("									class=\"input-form\" name=\"pCommentContent\"></textarea></li>\r\n");
      out.write("							<li>\r\n");
      out.write("								<button type=\"submit\" class=\"btn-repl\">댓글쓰기</button>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("				");

				} // 답글달기 form 조건문
				
      out.write("\r\n");
      out.write("				");

				} // 댓글종료 반복문 종료
				
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("	\r\n");
      out.write("		function photoDelete(photoNo){\r\n");
      out.write("			if(confirm(\"삭제하시겠습니까?\")) {\r\n");
      out.write("				location.href=\"/photoDelete.do?photoNo=\"+photoNo;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		$(\".recShow\").on(\"click\",function(){\r\n");
      out.write("			const idx = $(\".recShow\").index(this);\r\n");
      out.write("			if($(this).text() == \"답글\") {\r\n");
      out.write("				$(this).text(\"취소\");\r\n");
      out.write("			} else {\r\n");
      out.write("				$(this).text(\"답글\");\r\n");
      out.write("			}\r\n");
      out.write("			$(\".inputRecommentBox\").eq(idx).toggle();\r\n");
      out.write("			$(\".inputRecommentBox\").eq(idx).find(\"textarea\").focus();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		function modifyComment(obj,pCommentNo,photoNo) {\r\n");
      out.write("			$(obj).parent().prev().show();\r\n");
      out.write("			$(obj).parent().prev().prev().hide();\r\n");
      out.write("			$(obj).text(\"수정\");\r\n");
      out.write("			$(obj).attr(\"onclick\",\"modifyComplete(this,\"+pCommentNo+\",\"+photoNo+\")\");\r\n");
      out.write("			\r\n");
      out.write("			$(obj).next().text(\"취소\");\r\n");
      out.write("			$(obj).next().attr(\"onclick\",\"modifyCancle(this,\"+pCommentNo+\",\"+photoNo+\")\");\r\n");
      out.write("			\r\n");
      out.write("			$(obj).next().next().hide();\r\n");
      out.write("		}\r\n");
      out.write("		function modifyCancle(obj,pCommentNo,photoNo){\r\n");
      out.write("			$(obj).parent().prev().hide();\r\n");
      out.write("			$(obj).parent().prev().prev().show();\r\n");
      out.write("			\r\n");
      out.write("			$(obj).prev().text(\"수정\");\r\n");
      out.write("			$(obj).prev().attr(\"onclick\",\"modifyComment(this,\"+pCommentNo+\",\"+photoNo+\")\");\r\n");
      out.write("			$(obj).text(\"삭제\");\r\n");
      out.write("			$(obj).attr(\"onclick\",\"deleteComment(this,\"+pCommentNo+\",\"+photoNo+\")\");\r\n");
      out.write("			$(obj).next().show();\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function modifyComplete(obj,pCommentNo,photoNo){\r\n");
      out.write("			const form = $(\"<form action='/photoCommentUpdate.do' method='post'></form>\");\r\n");
      out.write("			const pCommentInput = $(\"<input type ='text' name='pCommentNo'>\");\r\n");
      out.write("			pCommentInput.val(pCommentNo);\r\n");
      out.write("			form.append(pCommentInput);\r\n");
      out.write("			const photoInput = $(\"<input type='text' name='photoNo'>\");\r\n");
      out.write("			photoInput.val(photoNo);\r\n");
      out.write("			form.append(photoInput);\r\n");
      out.write("			const pCommentContent = $(obj).parent().prev();\r\n");
      out.write("			form.append(pCommentContent);\r\n");
      out.write("			$(\"body\").append(form);\r\n");
      out.write("			form.submit();\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function deleteComment(obj,pCommentNo,photoNo){\r\n");
      out.write("			if(confirm(\"댓글을 삭제하시겠습니까?\")){\r\n");
      out.write("				location.href = \"/deletePhotoComment.do?pCommentNo=\"+pCommentNo+\"&photoNo=\"+photoNo;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/footer.css\" />\r\n");
      out.write("<footer>\r\n");
      out.write("	<div class=\"footer-content\">\r\n");
      out.write("		<div class=\"footer-left\">\r\n");
      out.write("			<div class=\"footer-link\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("					<li><a href=\"#\">개인정보처리방침</a></li>\r\n");
      out.write("					<li><a href=\"#\">소비자 피해 보상보험</a></li>\r\n");
      out.write("					<li><a href=\"#\">사이트 맵</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<p class=\"small-size\">* 본 사이트의 컨텐츠는 저작권법의 보호를 받는 바, 상업적 목적의 무단전재,\r\n");
      out.write("				복사, 배포 등을 금합니다.</p>\r\n");
      out.write("			<p class=\"small-size\">* 소비자피해보상보험 고객님은 안전거래를 위해 현금 등으로 결제 시 저희\r\n");
      out.write("				쇼핑몰에서 가입한 구매안전서비스를 이용하실 수 있습니다.</p>\r\n");
      out.write("			<p class=\"bold-size\">사업장 주소: 서울특별시 영등포구 선유동2로 57 이레빌딩 19층 A강의실</p>\r\n");
      out.write("			<p class=\"bold-size\">개인정보관리책임자: AnSany TEL: 안사니 고객센터 1588-4444\r\n");
      out.write("				EMAIL: ansany_contact@ansany.com</p>\r\n");
      out.write("			<p class=\"bold-size\">Copyright © An Sany Corporation. All rights\r\n");
      out.write("				reserved.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"footer-right\">\r\n");
      out.write("			<div class=\"followus\">FOLLOW US</div>\r\n");
      out.write("			<div class=\"site-logos\">\r\n");
      out.write("				<a href=\"https://www.facebook.com/sonykorea\" target=\"_blank\"><img\r\n");
      out.write("					src=\"/img/facebook.png\" class=\"logos\"></a> <a\r\n");
      out.write("					href=\"https://www.instagram.com/sonykorea/\" target=\"_blank\"><img\r\n");
      out.write("					src=\"/img/instagram.png\" class=\"logos\"></a> <a\r\n");
      out.write("					href=\"https://www.youtube.com/user/sonystyleblog\" target=\"_blank\"><img\r\n");
      out.write("					src=\"/img/youtube.png\" class=\"logos\"></a> <a\r\n");
      out.write("					href=\"https://stylezineblog.com/?intcmp=Main_Blog\" target=\"_blank\"><img\r\n");
      out.write("					src=\"/img/blog.png\" class=\"logos\"></a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
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
