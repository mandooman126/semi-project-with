/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-26 03:20:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.faqqna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.faqqna.model.vo.FaqqnaComment;
import java.util.ArrayList;
import kr.co.ansany.faqqna.model.vo.Faqqna;
import kr.co.ansany.member.model.vo.Member;

public final class faqqnaView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1664162376726L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.co.ansany.faqqna.model.vo.FaqqnaComment");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

    	Faqqna faq = (Faqqna)request.getAttribute("faq");
    	FaqqnaComment fc = (FaqqnaComment)request.getAttribute("commentList");
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/qnaView.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
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
      out.write("	<div class=\"qna-content-wrap\">\n");
      out.write("        <div class=\"qna-views-content\">\n");
      out.write("            <table class=\"qna-views-table\">\n");
      out.write("                <tr class=\"qna-views-top\">\n");
      out.write("                    <th style=\"width: 15%;\">분류</th>\n");
      out.write("                    <th style=\"width: 45%;\">제목</th>\n");
      out.write("                    <th style=\"width: 15%;\">작성자</th>\n");
      out.write("                    <th style=\"width: 15%;\">작성일</th>\n");
      out.write("                    <th style=\"width: 10%;\">조회수</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                	");
if(faq.getQnaCateNo()==1) {
      out.write("\n");
      out.write("                    <td>주문/결제</td>\n");
      out.write("                    ");
}else if(faq.getQnaCateNo()==2) {
      out.write("\n");
      out.write("                    <td>세금계산서/영수증</td>\n");
      out.write("                    ");
}else if(faq.getQnaCateNo()==3) {
      out.write("\n");
      out.write("                    <td>배송</td>\n");
      out.write("                    ");
}else if(faq.getQnaCateNo()==4) {
      out.write("\n");
      out.write("                    <td>취소/환불/AS</td>\n");
      out.write("                    ");
}else if(faq.getQnaCateNo()==5) {
      out.write("\n");
      out.write("                    <td>회원관련</td>\n");
      out.write("                    ");
}else if(faq.getQnaCateNo()==6) {
      out.write("\n");
      out.write("                    <td>기타문의</td>\n");
      out.write("                    ");
} 
      out.write("\n");
      out.write("                    <td>");
      out.print(faq.getQnaTitle() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(faq.getQnaWriter() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(faq.getQnaDate() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(faq.getQnaReadCount() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"qna-views-top\">첨부파일</th>\n");
      out.write("                    <td colspan=\"4\">\n");
      out.write("                    	");
if(faq.getQnaFileName() != null) {
      out.write("\n");
      out.write("                    	<img src=\"/img/file.png\" width=\"16px\">\n");
      out.write("                    	<a href=\"/faqqnaFileDown.do?qnaNo=");
      out.print(faq.getQnaNo());
      out.write('"');
      out.write('>');
      out.print(faq.getQnaFileName() );
      out.write("</a>\n");
      out.write("                    	");
} 
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"qna-views-top\">내용</th>\n");
      out.write("                    <td colspan=\"4\">\n");
      out.write("                        <div class=\"qna-views-qnacontent\"  style=\"overflow: auto; text-align: left; padding-left: 5px;\">\n");
      out.write("                            ");
      out.print(faq.getQnaContentBr() );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
if(m != null && faq.getQnaWriter().equals(m.getMemberId())) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                	<th colspan=\"5\" class=\"qnaBtn\">\n");
      out.write("                		<div class=\"qnaUpdateBtn\"><a href=\"/faqqnaUpdateFrm.do?qnaNo=");
      out.print(faq.getQnaNo());
      out.write("\">수정</a></div>\n");
      out.write("                        <div class=\"qnaUpdateBtn\"><a href=\"javascript:void(0)\" onclick=\"qnaDelete(");
      out.print(faq.getQnaNo());
      out.write(")\">삭제</a></div>\n");
      out.write("                	</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
} 
      out.write("\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        ");
if(fc == null) {
      out.write("\n");
      out.write("        	");
if(m.getMemberLevel()==1) {
      out.write("\n");
      out.write("            <div class=\"commentBox\">\n");
      out.write("                <form action=\"/insertQnaComment.do\" method=\"post\">\n");
      out.write("                    <div class=\"comment-info\">\n");
      out.write("                        <div class=\"comment-wrap\">\n");
      out.write("                            <div class=\"info-icon\">\n");
      out.write("                                <span class=\"material-icons\" style=\"font-size: 50px;\">account_circle</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"comment-user-info\" style=\"border: none\">\n");
      out.write("                            	<input type=\"hidden\" name=\"qcWriter\" value=\"");
      out.print(m.getMemberId() );
      out.write("\">\n");
      out.write("								<input type=\"hidden\" name=\"qnaRef\" value=\"");
      out.print(faq.getQnaNo() );
      out.write("\">\n");
      out.write("								\n");
      out.write("								<input type=\"hidden\" name=\"qcRef\" value=\"0\">\n");
      out.write("                                <p></p>\n");
      out.write("                                <p></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"comment-text\">\n");
      out.write("                                <textarea id=\"comment-textarea\" name=\"qcContent\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"commentBtn\"><button type=\"submit\" class=\"commentButton\">등록</button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("        ");
}else {
      out.write("\n");
      out.write("        \n");
      out.write("            <div class=\"commentBox\">\n");
      out.write("            	\n");
      out.write("            	<div class=\"comment-info\">\n");
      out.write("            		<div class=\"comment-wrap\">\n");
      out.write("            			<div class=\"info-icon\">\n");
      out.write("                            <span class=\"material-icons\" style=\"font-size: 50px;\">account_circle</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"comm-user-info\" style=\"border: none;\">\n");
      out.write("                            <p>");
      out.print(fc.getQcWriter() );
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(fc.getQcDate() );
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"comment-text\">\n");
      out.write("                            <textarea class=\"comment-textBox\" name=\"commenttextContent\" readonly>");
      out.print(fc.getQcContent());
      out.write("</textarea>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        ");
if(m.getMemberLevel()==1) {
      out.write("\n");
      out.write("                        <div class=\"qnaComm-btn\">\n");
      out.write("                            <div class=\"commUpdateBtn\">\n");
      out.write("                            	<a href=\"javascript:void(0)\" onclick=\"qnaCommUpdate(this,");
      out.print(fc.getQcNo());
      out.write(',');
      out.print(faq.getQnaNo());
      out.write(");\">수정</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"commDelBtn\">\n");
      out.write("                            	<a href=\"javascript:void(0)\" onclick=\"qnaCommDelete(this,");
      out.print(fc.getQcNo());
      out.write(',');
      out.print(faq.getQnaNo());
      out.write(");\">삭제</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
} 
      out.write("\n");
      out.write("            		</div>\n");
      out.write("            	</div>\n");
      out.write("            	\n");
      out.write("            </div>\n");
      out.write("          ");
} 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("    	function qnaDelete(qnaNo){\n");
      out.write("    		if(confirm(\"문의사항을 삭제하시겠습니까?\")){\n");
      out.write("    			location.href=\"/faqqnaDelete.do?qnaNo=\"+qnaNo;\n");
      out.write("    		}\n");
      out.write("    	}\n");
      out.write("    	function qnaCommUpdate(obj,fcNo,qnaNo){\n");
      out.write("    		$(obj).parent().parent().prev().children().attr('readonly',false).css(\"background-color\",\"lightcyan\").focus();\n");
      out.write("    		$(obj).text(\"완료\");\n");
      out.write("    		$(obj).attr(\"onclick\",\"commUpdateComplete(this,\"+fcNo+\",\"+qnaNo+\")\");\n");
      out.write("    		\n");
      out.write("    		$(obj).parent().next().children().text(\"취소\");\n");
      out.write("    		$(obj).parent().next().children().attr(\"onclick\",\"commUpdateCancel(this,\"+fcNo+\",\"+qnaNo+\")\");\n");
      out.write("    	}\n");
      out.write("    	function commUpdateCancel(obj,fcNo,qnaNo){\n");
      out.write("    		$(obj).parent().parent().prev().children().attr('readonly',true).css(\"background-color\",\"white\");\n");
      out.write("    		\n");
      out.write("    		$(obj).parent().prev().children().text(\"수정\");\n");
      out.write("    		$(obj).parent().prev().children().attr(\"onclick\",\"qnaCommUpdate(this,\"+fcNo+\",\"+qnaNo+\")\");\n");
      out.write("\n");
      out.write("    		$(obj).text(\"삭제\");\n");
      out.write("    		$(obj).attr(\"onclick\",\"qnaCommDelete(this,\"+fcNo+\",\"+qnaNo+\")\");\n");
      out.write("    	}\n");
      out.write("    	function commUpdateComplete(obj,fcNo,qnaNo){\n");
      out.write("    		//form태그 생성\n");
      out.write("    		const form = $(\"<form action='/qnaCommUpdate.do' method='post'></form>\")\n");
      out.write("    		//input태그 생성\n");
      out.write("    		const fcInput = $(\"<input type='text' name='fcNo'>\");\n");
      out.write("    		//fcNo값 세팅\n");
      out.write("    		fcInput.val(fcNo);\n");
      out.write("    		//form태그에 추가\n");
      out.write("    		form.append(fcInput);\n");
      out.write("    		//input태그 생성(qnaNo);\n");
      out.write("    		const qnaInput = $(\"<input type='text' name='qnaNo'>\");\n");
      out.write("    		qnaInput.val(qnaNo);\n");
      out.write("    		form.append(qnaInput);\n");
      out.write("    		//textarea\n");
      out.write("    		console.log($(obj).parent().parent().prev().children());\n");
      out.write("    		const fcContent = $(obj).parent().parent().prev().children();\n");
      out.write("    		form.append(fcContent);\n");
      out.write("    		$(\"body\").append(form);\n");
      out.write("    		\n");
      out.write("    		form.submit();\n");
      out.write("    	}\n");
      out.write("    	function qnaCommDelete(obj,fcNo,qnaNo){\n");
      out.write("    		if(confirm(\"삭제하시겠습니까?\")){\n");
      out.write("    				location.href=\"/qnaCommDelete.do?fcNo=\"+fcNo+\"&qnaNo=\"+qnaNo;\n");
      out.write("    			}\n");
      out.write("    		}\n");
      out.write("    	\n");
      out.write("    </script>\n");
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