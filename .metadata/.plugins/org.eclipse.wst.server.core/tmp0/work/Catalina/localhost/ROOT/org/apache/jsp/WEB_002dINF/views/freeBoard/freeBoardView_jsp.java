/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-23 05:59:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.freeBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.freeboard.model.vo.FreeBoard;
import kr.co.ansany.member.model.vo.Member;

public final class freeBoardView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("kr.co.ansany.freeboard.model.vo.FreeBoard");
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

FreeBoard f = (FreeBoard) request.getAttribute("f");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>자유게시판</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/bootstrap.css\" />\r\n");
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
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#freeBoardContent {\r\n");
      out.write("	min-height: 300px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom {\r\n");
      out.write("	width: 960x;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	margin-bottom: 36px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-bottom>div>a, button {\r\n");
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
      out.write(".td-title {\r\n");
      out.write("	width: 300px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	vertical-align: middle;\r\n");
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
      out.write("	<div class=\"page-wrap\">\r\n");
      out.write("		<div class=\"page-content\">\r\n");
      out.write("			<div class=\"page-title\">자유게시판</div>\r\n");
      out.write("			");

			if (m != null) {
			
      out.write("\r\n");
      out.write("			");

			if (f.getFreeBoardWriter().equals(m.getMemberId())) {
			
      out.write("\r\n");
      out.write("			<div class=\"wrap-bottom\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<button onclick=\"freeBoardDelete(");
      out.print(f.getFreeBoardNo());
      out.write(");\">삭제</button>\r\n");
      out.write("					<a\r\n");
      out.write("						href=\"/freeBoardUpdateFrm.do?freeBoardNo=");
      out.print(f.getFreeBoardNo());
      out.write("\">수정</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			} else if (m.getMemberLevel() == 1) {
			
      out.write("\r\n");
      out.write("			<div class=\"wrap-bottom\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<button onclick=\"freeBoardDelete(");
      out.print(f.getFreeBoardNo());
      out.write(");\">삭제</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<table class=\"table table-group-divider\" id=\"freeBoardView\">\r\n");
      out.write("				<tr class=\"table-secondary\">\r\n");
      out.write("					<th>제목</th>\r\n");
      out.write("					<td colspan=\"3\" class=\"td-title\">");
      out.print(f.getFreeBoardTitle());
      out.write("</td>\r\n");
      out.write("					<th>작성자</th>\r\n");
      out.write("					<td>");
      out.print(f.getFreeBoardWriter());
      out.write("</td>\r\n");
      out.write("					<th>조회수</th>\r\n");
      out.write("					<td>");
      out.print(f.getFreeBoardReadCount());
      out.write("</td>\r\n");
      out.write("					<th>작성일</th>\r\n");
      out.write("					<td>");
      out.print(f.getFreeBoardDate());
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>첨부파일</th>\r\n");
      out.write("					<td colspan=\"9\">\r\n");
      out.write("						");

						if (f.getFreeBoardFilename() != null) {
						
      out.write(" <img src=\"/img/file.png\" width=\"16px\"> <a\r\n");
      out.write("						href=\"/freeBoardFileDown.do?freeBoardNo=");
      out.print(f.getFreeBoardNo());
      out.write('"');
      out.write('>');
      out.print(f.getFreeBoardFilename());
      out.write("</a>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>내용</th>\r\n");
      out.write("					<td colspan=\"9\">\r\n");
      out.write("						<div id=\"freeBoardContent\">");
      out.print(f.getfreeBoardContentBr());
      out.write("</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		function freeBoardDelete(freeBoardNo){\r\n");
      out.write("			if(confirm(\"삭제하시겠습니까?\")) {\r\n");
      out.write("				location.href=\"/freeBoardDelete.do?freeBoardNo=\"+freeBoardNo;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
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