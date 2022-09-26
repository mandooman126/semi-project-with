/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-26 03:34:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.faqqna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.faqqna.model.vo.Faqqna;
import java.util.ArrayList;
import kr.co.ansany.member.model.vo.Member;

public final class faqqna_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("kr.co.ansany.faqqna.model.vo.Faqqna");
    _jspx_imports_classes.add("kr.co.ansany.member.model.vo.Member");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

ArrayList<Faqqna> qnaList = (ArrayList<Faqqna>) request.getAttribute("qnaList");
String qnaPageNavi = (String) request.getAttribute("qnaPageNavi");
String type = (String) request.getAttribute("type");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/faq.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/qna.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/Noto_Sans.css\">\n");
      out.write("<!--  <link rel=\"stylesheet\" href=\"/css/default.css\"> -->\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/bootstrap.css\" />\n");
      out.write("<style>\n");
      out.write("h1{\n");
      out.write("	font-family: ns-bold;\n");
      out.write("}\n");
      out.write(".pageNavi {\n");
      out.write("	margin: 30px;\n");
      out.write("	color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pagination {\n");
      out.write("	justify-content: center;\n");
      out.write("	align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page-link {\n");
      out.write("	color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page-item.active .page-link {\n");
      out.write("	z-index: 1;\n");
      out.write("	color: #ccc;\n");
      out.write("	font-weight: bold;\n");
      out.write("	background-color: #333;\n");
      out.write("	border-color: #444;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page-link:focus, .page-link:hover {\n");
      out.write("	color: #ccc;\n");
      out.write("	background-color: #222;\n");
      out.write("	border-color: #444;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("	<div class=\"faqqna-content\">\n");
      out.write("		<div class=\"faqqna-wrap\">\n");
      out.write("			<div class=\"qna-notice-head\">\n");
      out.write("				<div class=\"faqqna-title\">\n");
      out.write("					<h1>FAQ & QnA</h1>\n");
      out.write("					<p>안사니스토어에 많이 물어보시는 질문과 새로운 소식을 만나보세요.</p>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"faqqna-tab\" value=\"");
      out.print(type);
      out.write("\">\n");
      out.write("					<ul>\n");
      out.write("						<li><a href=\"javascript:void(0)\">FAQ</a></li>\n");
      out.write("						<li><a href=\"javascript:void(0)\">QnA</a></li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"faq-content\">\n");
      out.write("				<div class=\"faq-main\">\n");
      out.write("					<div class=\"faq-top\">\n");
      out.write("						<div class=\"faq-tab\">\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"javascript:void(0)\">전체</a></li>\n");
      out.write("								<li><a href=\"javascript:void(0)\">주문/결제</a></li>\n");
      out.write("								<li><a href=\"javascript:void(0)\">세금계산서/영수증</a></li>\n");
      out.write("								<li><a href=\"javascript:void(0)\">배송</a></li>\n");
      out.write("								<li><a href=\"javascript:void(0)\">취소/환불/AS</a></li>\n");
      out.write("								<li><a href=\"javascript:void(0)\">회원관련</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"faq-list\">\n");
      out.write("						<div class=\"faq-mainlist\">\n");
      out.write("							<div class=\"faq-questions\">\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">주문/결제</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. ESP상품의 결제 방법에는 무엇이 있나요?</span>\n");
      out.write("											<span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>ESP와 같은 무형 상품은 신용카드로 결제 가능하며, 가상계좌 결제는 사용하실 수\n");
      out.write("													없습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">주문/결제</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. ESP상품의 결제 방법에는 무엇이 있나요?</span>\n");
      out.write("											<span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>신용카드로 결제 가능하며, 가상계좌 결제는 사용하실 수 없습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">주문/결제</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 가상계좌 이용 시 입금확인은 어떻게\n");
      out.write("												하나요?</span> <span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>주문 접수 시 주문 완료 메일과 SMS(주문자 핸드폰번호)를 통해 계좌번호를 보내\n");
      out.write("													드리오니</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>해당 계좌로 입금해주시기 바랍니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>가상 계좌번호 입금 확인은 오전 및 오후 각각 2회씩 진행 되고 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>입금 후 익일까지 확인이 되어 있지 않은 경우에는 소니스토어로 연락 주시기 바랍니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<br>\n");
      out.write("											<p>\n");
      out.write("												<span>주문 후 3일 이내(영업일 기준)에 입금되지 않을 경우는 주문이 자동으로 취소됩니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>주문 취소 후 재 주문을 통해 가상계좌 번호를 재 발송 해 드리고 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>주문 하실 때 입력하신 입금인명과 실제 입금하신 분의 이름이 똑같아야 입금확인이\n");
      out.write("													됩니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>만약 다를 경우 반드시 고객지원센터(1588-0000)나\n");
      out.write("													이메일(ansanystore@ansany.co.kr)로 연락 주시기 바랍니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">주문/결제</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 신용카드 무이자할부 혜택은 어디서\n");
      out.write("												확인하나요?</span> <span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>결제 페이지에서 확인하실 수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">주문/결제</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 대량 구매 문의는 어디로 해야 하나요?</span> <span\n");
      out.write("											class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>B2B 기업체 특판 구매는</span><span\n");
      out.write("													style=\"color: rgb(100, 73, 173);\">1)모델 2)수량 3)납기일\n");
      out.write("													4)납품처 5)제품 용도<span>의 정보가 필요합니다.</span>\n");
      out.write("												</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>위의 정보를포함한 메일을 송부 부탁 드립니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">세금계산서/영수증</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 신용카드 영수증 출력은 어떻게 하나요?</span> <span\n");
      out.write("											class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>신용카드 영수증은 고객님께서 입력해주신 e-mail로 보내 드리는 결제확인메일의 <영수증\n");
      out.write("														출력>버튼을 클릭하시면</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>바로 출력 하실 수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>만약 e-mail을 지우셨을 경우 안사니사이트(www.ansany.com)의 사용내역\n");
      out.write("													및 청구내역 조회에서 발급 받으실 수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">세금계산서/영수증</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 현금영수증 및 세금계산서 발급은\n");
      out.write("												가능한가요?</span> <span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>가상 계좌 입금을 통한 결제일 경우, 현금 영수증 및 세금계산서가 발급 가능합니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>구매 결제창을 통해 현금 영수증 및 세금계산서 발급 신청을 할 수 있으나 누락 또는\n");
      out.write("													수정이 필요한 경우는</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>고객지원센터1588-0000또는 안사니스토어(ansany@ansany.co.kr)로\n");
      out.write("													연락 주시기 바랍니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">배송</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 배송 일정 및 배송 현황 조회는 어디서\n");
      out.write("												하나요?</span> <span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>고객님께서 주문해주신 상품은 입금확인 후 발송 준비되며, 지역에 따라 3~7일 이내\n");
      out.write("													전국 어디든 배송 가능합니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>비회원의 예약판매 상품 등 일부 상품에 대해서는 상품 수급 사정에 의해 배송이 지연될\n");
      out.write("													수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>주문상품에 대한 상세한 확인 및 배송상황은 </span><span\n");
      out.write("													style=\"color: rgb(100, 73, 173); text-decoration: underline;\">'마이\n");
      out.write("													페이지'</span><span>에서 모두 확인하실 수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">배송</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 배송료 부담은 누가하나요?</span> <span\n");
      out.write("											class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>안사니스토어는 무료 배송을 원칙으로 하고 있습니다. 다만 산간 도서지방의 경우는 상품\n");
      out.write("													특성에 따라 부담하실 수도 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">취소/환불/AS</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 주문취소 및 반품 신청은 어떻게 하나요?</span>\n");
      out.write("											<span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>주문취소 및 반품신청은 e-mail 및 고객지원센터로 요청하실 수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>(e-mail : ansany@ansony.co.kr / 전화 : 1588-0000)</span>\n");
      out.write("											</p>\n");
      out.write("											<br>\n");
      out.write("											<p>\n");
      out.write("												<span>e-mail을 통한 신청 시 운영시간 이후에는 익일 처리되므로 다소 지연될 수\n");
      out.write("													있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>구입하신 상품에 대해서는 제품을 받으신 날로부터</span><span\n");
      out.write("													style=\"color: rgb(100, 73, 173);\">7일 이내에 교환 및 반품이 가능</span><span>합니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>단, 구입하신 상품의 내용이 표시, 광고 내용과 다르거나 계약 내용과 다르게 이행된\n");
      out.write("													경우에는</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>해당상품을 공급 받은 날부터 3개월 이내, 그 사실을 안 날 또는 알 수 있었던\n");
      out.write("													날부터 30일 이내에 청약철회 가능합니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>제품하자가 아닌 변심으로 인한 반품 시에는 고객님께서 반품 비용을 부담하셔야 합니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">취소/환불/AS</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 가상 계좌 주문건의 경우,환불은 어떻게\n");
      out.write("												처리되나요?</span> <span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>가상 계좌 주문 취소 및 환불 요청은 “안사니 온라인 스토어 -> 마이페이지 ->\n");
      out.write("													주문/배송” 내역에서 취소신청이 가능합니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>고객지원 센터를 통해서 취소하시는 경우에는, 입금자 확인을 위해 고객센터 통화 후\n");
      out.write("													입금한 통장의 사본을 보내주셔야 합니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>환불 금액은 신청하신 날로부터 3영업일 이내에 완료됩니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>환불 관련 궁금하신 부분은 안사니 고객지원센터(1588-0000) 또는\n");
      out.write("													안사니스토어(ansany@ansany.co.kr)로 연락 바랍니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">회원관련</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 안사니스토어 회원 가입은 어떻게 해야\n");
      out.write("												하나요?</span> <span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>안사니스토어 온라인사이트에서 회원 가입을 하시면 누구나 안사니스토어 회원이 되실 수\n");
      out.write("													있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"questions-div\">\n");
      out.write("									<div class=\"faq-questions-head hidediv\">\n");
      out.write("										<a href=\"javascript:void(0)\"> <span class=\"faq-div\">회원관련</span>\n");
      out.write("											<span class=\"faq-div-title\">Q. 개명한 경우 이름을 어떻게 변경 하나요?</span>\n");
      out.write("											<span class=\"material-icons\">keyboard_arrow_down</span>\n");
      out.write("										</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"faq-answer\">\n");
      out.write("										<div class=\"faq-answerbox\">\n");
      out.write("											<p>\n");
      out.write("												<span>개명하신 경우 기존 아이디로 로그인 하신 후, 회원정보를 수정하실 수 있습니다.</span>\n");
      out.write("											</p>\n");
      out.write("											<p>\n");
      out.write("												<span>다만,개명한 이름으로 실명인증이 가능해야 합니다.</span>\n");
      out.write("											</p>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"addfaq-Btn\">\n");
      out.write("						<button>더보기 +</button>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"qna-wrap\">\n");
      out.write("				<div class=\"qna-content\">\n");
      out.write("					<div class=\"qna-top-wrap\">\n");
      out.write("						");

						if (m != null) {
						
      out.write("\n");
      out.write("						<div>\n");
      out.write("							<a href=\"/faqqnaWriteFrm.do\">문의하기</a>\n");
      out.write("						</div>\n");
      out.write("						");

						}
						
      out.write("\n");
      out.write("					</div>\n");
      out.write("					<table class=\"qna-table\">\n");
      out.write("						<tr class=\"qna-title\">\n");
      out.write("							<th style=\"width: 7%;\">번호</th>\n");
      out.write("							<th style=\"width: 15%;\">문의유형</th>\n");
      out.write("							<th style=\"width: 32%;\">제목</th>\n");
      out.write("							<th style=\"width: 9%;\">작성자</th>\n");
      out.write("							<th style=\"width: 15%;\">처리상태</th>\n");
      out.write("							<th style=\"width: 15%;\">문의날짜</th>\n");
      out.write("							<th style=\"width: 7%;\">조회수</th>\n");
      out.write("						</tr>\n");
      out.write("						");

						for (Faqqna qna : qnaList) {
						
      out.write("\n");
      out.write("						<tr class=\"qna-answer\">\n");
      out.write("							<td>");
      out.print(qna.getQnaNo());
      out.write("</td>\n");
      out.write("							");

							if (qna.getQnaCateNo() == 1) {
							
      out.write("\n");
      out.write("							<td>주문/결제</td>\n");
      out.write("							");

							} else if (qna.getQnaCateNo() == 2) {
							
      out.write("\n");
      out.write("							<td>세금계산서/영수증</td>\n");
      out.write("							");

							} else if (qna.getQnaCateNo() == 3) {
							
      out.write("\n");
      out.write("							<td>배송</td>\n");
      out.write("							");

							} else if (qna.getQnaCateNo() == 4) {
							
      out.write("\n");
      out.write("							<td>취소/환불/AS</td>\n");
      out.write("							");

							} else if (qna.getQnaCateNo() == 5) {
							
      out.write("\n");
      out.write("							<td>회원관련</td>\n");
      out.write("							");

							} else if (qna.getQnaCateNo() == 6) {
							
      out.write("\n");
      out.write("							<td>기타문의</td>\n");
      out.write("							");

							}
							
      out.write("\n");
      out.write("							");

							if (m != null) {
							
      out.write("\n");
      out.write("							");

							if (m.getMemberId().equals(qna.getQnaWriter()) || m.getMemberLevel() == 1) {
							
      out.write("\n");
      out.write("							<td><a href=\"/faqqnaView.do?qnaNo=");
      out.print(qna.getQnaNo());
      out.write('"');
      out.write('>');
      out.print(qna.getQnaTitle());
      out.write("</a></td>\n");
      out.write("							");

							} else {
							
      out.write("\n");
      out.write("							<td><a href=\"javascript:void(0);\"\n");
      out.write("								onclick=\"alert('작성자만 확인할 수 있습니다.');\">");
      out.print(qna.getQnaTitle());
      out.write("</a></td>\n");
      out.write("							");

							}
							
      out.write("\n");
      out.write("							");

							} else {
							
      out.write("\n");
      out.write("							<td><a href=\"javascript:void(0);\"\n");
      out.write("								onclick=\"alert('작성자만 확인할 수 있습니다.');\">");
      out.print(qna.getQnaTitle());
      out.write("</a></td>\n");
      out.write("							");

							}
							
      out.write("\n");
      out.write("\n");
      out.write("							<td>");
      out.print(qna.getQnaWriter());
      out.write("</td>\n");
      out.write("							");

							if (qna.getQnaStatus() == 0) {
							
      out.write("\n");
      out.write("							<td>답변대기중</td>\n");
      out.write("							");

							} else if (qna.getQnaStatus() == 1) {
							
      out.write("\n");
      out.write("							<td>답변완료</td>\n");
      out.write("							");

							}
							
      out.write("\n");
      out.write("							<td>");
      out.print(qna.getQnaDate());
      out.write("</td>\n");
      out.write("							<td>");
      out.print(qna.getQnaReadCount());
      out.write("</td>\n");
      out.write("						</tr>\n");
      out.write("						");

						}
						
      out.write("\n");
      out.write("					</table>\n");
      out.write("					<div class=\"pageNavi\">");
      out.print(qnaPageNavi);
      out.write("</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
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
      out.write("\n");
      out.write("	<script src=\"/js/faq.js\"></script>\n");
      out.write("	<script>\n");
      out.write("		console.log($(\".faqqna-tab\").attr(\"value\"));\n");
      out.write("		if ($(\".faqqna-tab\").attr(\"value\") == \"qna\") {\n");
      out.write("			$(\".faqqna-tab>ul\").children().eq(1).click();\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("</body>\n");
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