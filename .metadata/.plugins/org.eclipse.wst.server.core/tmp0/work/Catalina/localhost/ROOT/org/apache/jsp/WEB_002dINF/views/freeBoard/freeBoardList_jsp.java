/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-23 05:26:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.freeBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.net.aso.n;
import kr.co.ansany.freeboard.model.vo.FreeBoard;
import java.util.ArrayList;
import kr.co.ansany.member.model.vo.Member;

public final class freeBoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1663906225912L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1663894010154L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.co.ansany.member.model.vo.Member");
    _jspx_imports_classes.add("oracle.net.aso.n");
    _jspx_imports_classes.add("kr.co.ansany.freeboard.model.vo.FreeBoard");
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

ArrayList<FreeBoard> list = (ArrayList<FreeBoard>) request.getAttribute("list");
String pageNavi = (String) request.getAttribute("pageNavi");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>자유게시판 목록</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/bootstrap.css\" />\r\n");
      out.write("<style>\r\n");
      out.write(".header-logo>a>img {\r\n");
      out.write("	margin-bottom: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".board_wrap {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	max-width: 1920px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("	padding-top: 81px;\r\n");
      out.write("	padding-bottom: 81px;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-secondary {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tbody {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tbody tr>td:nth-child(2) {\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	padding-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navi {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	padding: 40px 0 20px;\r\n");
      out.write("	float: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navi ul {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: space-around;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	padding-left: 0;\r\n");
      out.write("	border-bottom: 2px solid #888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navi span {\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navi a {\r\n");
      out.write("	display: block;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	font-weight: 600px;\r\n");
      out.write("	font-size: 22px;\r\n");
      out.write("	line-height: 50px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: #010101;\r\n");
      out.write("	border-bottom: 2px solid transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tablink:hover {\r\n");
      out.write("	color: #ea0029;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tablink.active {\r\n");
      out.write("	color: #ea0029;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table_wrap {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding-top: 40px;\r\n");
      out.write("	padding-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pagination {\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pagination a {\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table {\r\n");
      out.write("	width: 1280px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table>tr>td>a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table:hover>tr>td>a {\r\n");
      out.write("	background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pageNavi {\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-item.active .page-link {\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("	color: #ccc;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	background-color: #333;\r\n");
      out.write("	border-color: #444;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-link:focus, .page-link:hover {\r\n");
      out.write("	color: #ccc;\r\n");
      out.write("	background-color: #222;\r\n");
      out.write("	border-color: #444;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top-wrap {\r\n");
      out.write("	width: 1280px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top-wrap>div>a {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	line-height: 30px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	border-radius: 30px;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top-wrap>div>a:hover {\r\n");
      out.write("	background-color: #5865f5;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border-color: #5865f5;\r\n");
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
      out.write("								<li><a href=\"#\">구매후기</a></li>\r\n");
      out.write("								<li><a href=\"/photoList.do\">사진전</a></li>\r\n");
      out.write("								<li><a href=\"/freeBoardList.do?reqPage=1\">자유게시판</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"#\">멤버십</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"#\">등급&혜택 안내</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"#\">고객 서비스</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"#\">FAQ / Q<span>&</span>A\r\n");
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
      out.write("	<div class=\"board_wrap\">\r\n");
      out.write("		<nav class=\"page-navi\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"/noticeList.do?reqPage=1\"> <span\r\n");
      out.write("						class=\"tablink\">공지사항</span>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"#\"> <span class=\"tablink\">구매후기</span>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"/photoList.do\"> <span class=\"tablink\">사진전</span>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"/freeBoardList.do?reqPage=1\"> <span\r\n");
      out.write("						class=\"tablink\">자유게시판</span>\r\n");
      out.write("				</a></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		");

		if (m != null) {
		
      out.write("\r\n");
      out.write("		<div class=\"top-wrap\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<a href=\"/freeBoardWriteFrm.do\">글쓰기</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("		<div class=\"table_wrap\">\r\n");
      out.write("			<table class=\"table table-hover table-group-divider\">\r\n");
      out.write("				<thead class=\"table-secondary\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th scope=\"col\" style=\"width: 10%;\">번호</th>\r\n");
      out.write("						<th scope=\"col\" style=\"width: 55%;\">제목</th>\r\n");
      out.write("						<th scope=\"col\" style=\"width: 10%;\">작성자</th>\r\n");
      out.write("						<th scope=\"col\" style=\"width: 15%;\">등록일</th>\r\n");
      out.write("						<th scope=\"col\" style=\"width: 10%;\">조회수</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				");

				for (FreeBoard f : list) {
				
      out.write("\r\n");
      out.write("				<tbody class=\"table\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th scope=\"row\">");
      out.print(f.getFreeBoardNo());
      out.write("</th>\r\n");
      out.write("						<td><a href=\"/freeBoardView.do?freeBoardNo=");
      out.print(f.getFreeBoardNo());
      out.write('"');
      out.write('>');
      out.print(f.getFreeBoardTitle());
      out.write("</a></td>\r\n");
      out.write("						<td>");
      out.print(f.getFreeBoardWriter());
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(f.getFreeBoardDate());
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(f.getFreeBoardReadCount());
      out.write("</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("			<div class=\"pageNavi\">");
      out.print(pageNavi);
      out.write("</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(\".tablink:eq(3)\").addClass(\"active\");\r\n");
      out.write("\r\n");
      out.write("		$(\".tablink\").on(\"click\", function() {\r\n");
      out.write("			const selectedIndex = $(\".tablink\").index(this);\r\n");
      out.write("			$(\".tablink\").each(function(index, item) {\r\n");
      out.write("				if (index != selectedIndex) {\r\n");
      out.write("					$(item).removeClass(\"active\");\r\n");
      out.write("				} else {\r\n");
      out.write("					$(item).addClass(\"active\");\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	");
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
