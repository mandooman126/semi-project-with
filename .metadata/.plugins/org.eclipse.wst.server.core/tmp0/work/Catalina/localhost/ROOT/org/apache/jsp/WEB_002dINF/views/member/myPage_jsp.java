/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-25 10:06:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.member.model.vo.Member;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1664038669508L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1663949583926L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>마이페이지</title>\r\n");
      out.write("    <!--css-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/myPage.css\">\r\n");
      out.write("    <!--fonts-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/Noto_Sans.css\">\r\n");
      out.write("    <!--jquery-->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("<content>\r\n");
      out.write("        <div class=\"mypage-wrap\">\r\n");
      out.write("            <div class=\"mypage-header\">\r\n");
      out.write("                <h1>마이페이지</h1>\r\n");
      out.write("                <div class=\"span-wrap\">\r\n");
      out.write("                    <span class=\"welecome\">회원이름 안녕하세요 :)</span>\r\n");
      out.write("                    <a href=\"/logout.do\" class=\"logoutLink\" name=\"logout\">로그아웃</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"header-box\">\r\n");
      out.write("                    <a href=\"#\"><li class=\"oneMemberLevel\">회원등급</li></a>\r\n");
      out.write("                    <a href=\"/updateMemberInfoFrm.do\"><li class=\"oneMemberInfo\">회원정보수정</li></a>\r\n");
      out.write("                    <a href=\"#\"><li class=\"oneMembercart\">장바구니</li></a>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mypage-content\">\r\n");
      out.write("                <div class=\"memberOrder_tbl\">\r\n");
      out.write("                    <h1>주문내역</h1>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <colgroup>\r\n");
      out.write("                            <col style=\"width: 120px;\">\r\n");
      out.write("                            <col>\r\n");
      out.write("                            <col style=\"width: 160px;\">\r\n");
      out.write("                            <col style=\"width: 160px;\">\r\n");
      out.write("                        </colgroup>\r\n");
      out.write("                        <tread>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th scope=\"col\">주문일</th>\r\n");
      out.write("                                <th scope=\"col\">주문번호</th>\r\n");
      out.write("                                <th scope=\"col\">상품정보</th>\r\n");
      out.write("                                <th scope=\"col\">상품가격</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tread>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td scope=\"col\">주문날짜</td>\r\n");
      out.write("                                <td scope=\"col\">주문번호</td>\r\n");
      out.write("                                <td scope=\"col\">상품명</td>\r\n");
      out.write("                                <td scope=\"col\">내용</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        작성 가능한 구매후기가 있어요 구매후기를 작성하신 고객님께\r\n");
      out.write("                        <strong class=\"reserve\">적립금</strong>\r\n");
      out.write("                        을 지급해 드립니다\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"myBoardView_tbl\">\r\n");
      out.write("                    <h1>1:1 문의내역</h1>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <colgroup>\r\n");
      out.write("                            <col style=\"width: 120px;\">\r\n");
      out.write("                            <col>\r\n");
      out.write("                            <col style=\"width: 160px;\">\r\n");
      out.write("                            <col style=\"width: 160px;\">\r\n");
      out.write("                            <col style=\"width: 100px;\">\r\n");
      out.write("                        </colgroup>\r\n");
      out.write("                        <tread>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th scope=\"col\">상담구분</th>\r\n");
      out.write("                                <th scope=\"col\">상담제목</th>\r\n");
      out.write("                                <th scope=\"col\">작성일</th>\r\n");
      out.write("                                <th scope=\"col\">답변유무</th>\r\n");
      out.write("                                <th scope=\"col\">삭제</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tread>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>교환문의</td>\r\n");
      out.write("                                <td>색상변경</td>\r\n");
      out.write("                                <td>작성일</td>\r\n");
      out.write("                                <td>답변유무</td>\r\n");
      out.write("                                <td class=\"colDelete-btn\">\r\n");
      out.write("                                    <button type=\"button\">삭제</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table><!--table 끝-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </content><!--컨텐츠 끝-->\r\n");
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
