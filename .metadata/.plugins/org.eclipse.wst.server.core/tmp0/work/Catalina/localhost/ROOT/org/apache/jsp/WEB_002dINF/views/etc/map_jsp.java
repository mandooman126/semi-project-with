/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-22 12:38:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.etc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.member.model.vo.Member;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1663850042338L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1663331062258L));
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
      out.write("<title>직영점 안내 : 찾아오시는 길</title>\r\n");
      out.write("<style>\r\n");
      out.write(".btn {\r\n");
      out.write("	background: rgb(242, 242, 242);\r\n");
      out.write("	padding: 0.5em;\r\n");
      out.write("	height: 32px;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	min-width: 82px;\r\n");
      out.write("	color: #444;\r\n");
      out.write("	border: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/store.css\"></link>\r\n");
      out.write("<script src=\"/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=5ya8c2ww8s&submodules=geocoder\"></script>\r\n");
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
      out.write("	<div class=\"store_info_wrap\">\r\n");
      out.write("		<div class=\"bg_img\">\r\n");
      out.write("			<img src=\"img/store.jpg\"> <span class=\"bg\"></span>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"store_info_wrap_txtbox\">\r\n");
      out.write("			<strong class=\"info_txt\">직영점 안내</strong>\r\n");
      out.write("			<h1 class=\"info_store_title\">안사니스토어 압구정</h1>\r\n");
      out.write("			<p class=\"info_desc\">\r\n");
      out.write("				안사니 전 제품을 직접 체험하고,<br> 컨설팅도 받아 볼 수 있는 안사니스토어 직영점을 방문해 보세요!\r\n");
      out.write("			</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"store_info_wrap_guidebox\">\r\n");
      out.write("			<div class=\"guidebox_wrapper\">\r\n");
      out.write("				<div class=\"guidebox\">\r\n");
      out.write("					<span class=\"box_title\">매장 운영시간</span>\r\n");
      out.write("					<div class=\"box_time\">\r\n");
      out.write("						<em class=\"everyday\">매일</em> <span class=\"time\">11:00~20:00</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"guidebox\">\r\n");
      out.write("					<span class=\"box_title\">매장 전화번호</span>\r\n");
      out.write("					<div class=\"box_time\">\r\n");
      out.write("						<em class=\"everyday\">02)</em> <span class=\"time\">515-7946</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"guidebox\">\r\n");
      out.write("					<span class=\"box_title\">고객센터 운영시간</span>\r\n");
      out.write("					<div class=\"box_day\">\r\n");
      out.write("						<p class=\"day\">월-금요일</p>\r\n");
      out.write("						<p class=\"day\">09:00 ~ 18:00</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"way_box\">\r\n");
      out.write("			<div class=\"way_box_inner\">\r\n");
      out.write("				<div class=\"way_box_addr\">\r\n");
      out.write("					<strong class=\"way_box_addr_title\">오시는 길</strong>\r\n");
      out.write("					<p class=\"way_box_addr_txt\">\r\n");
      out.write("						서울특별시 강남구 선릉로 801 <br>(신사동 배강빌딩)\r\n");
      out.write("					</p>\r\n");
      out.write("					<button class=\"btn\">지도보기</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"way_box_transp\">\r\n");
      out.write("				<ul class=\"route\">\r\n");
      out.write("					<li class=\"route_subway\"><strong class=\"route_title\">지하철</strong>\r\n");
      out.write("						<p class=\"route_method\">\r\n");
      out.write("							<span class=\"color_subway1\">7호선</span> 강남구청 3-1번 출구 / <span\r\n");
      out.write("								class=\"color_subway2\"> 분당선 </span> 압구정로데오역 5번 출구\r\n");
      out.write("						</p></li>\r\n");
      out.write("					<li class=\"route_bus\"><strong class=\"route_title\">버스</strong>\r\n");
      out.write("						<p class=\"route_method\">\r\n");
      out.write("							<span class=\"color_bus1\">간선</span> 145, 301, 472 / <span\r\n");
      out.write("								class=\"color_bus2\"> 지선 </span> 4412, 3011\r\n");
      out.write("						</p></li>\r\n");
      out.write("					<li class=\"route_car\"><strong class=\"route_title\">승용차</strong>\r\n");
      out.write("						<p class=\"route_method\">\r\n");
      out.write("							도산대로 학동사거리 <span class=\"br\">배강빌딩 1층</span>\r\n");
      out.write("						</p></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"map\" style=\"width: 100%; height: 600px;\"></div>\r\n");
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
      out.write("<script>\r\n");
      out.write("	const mapView = $(\"#map\");\r\n");
      out.write("	const btn = $(\".btn\");\r\n");
      out.write("\r\n");
      out.write("	btn.on(\"click\", function() {\r\n");
      out.write("		if ($(this).html() == '지도보기') {\r\n");
      out.write("			$(this).html('지도닫기');\r\n");
      out.write("		} else {\r\n");
      out.write("			$(this).html('지도보기');\r\n");
      out.write("		}\r\n");
      out.write("		mapView.toggle();\r\n");
      out.write("	});\r\n");
      out.write("	const map = new naver.maps.Map(\"map\", {\r\n");
      out.write("		center : new naver.maps.LatLng(37.5235807, 127.0388520),\r\n");
      out.write("		zoom : 17,\r\n");
      out.write("		zoomControl : true,\r\n");
      out.write("		zoomControlOptions : {\r\n");
      out.write("			position : naver.maps.Position.TOP_RIGHT,\r\n");
      out.write("			style : naver.maps.ZoomControlStyle.SMALL\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	const marker = new naver.maps.Marker({\r\n");
      out.write("		position : new naver.maps.LatLng(37.5235807, 127.0388520),\r\n");
      out.write("		map : map,\r\n");
      out.write("		icon : {\r\n");
      out.write("			url : '/img/marker.png',\r\n");
      out.write("			origin : new naver.maps.Point(0, 0),\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	let contentString = [ \"<h3>안사니스토어 압구정</h3>\" ].join(\"\");\r\n");
      out.write("	let infoWindow = new naver.maps.InfoWindow();\r\n");
      out.write("	// 마커에 클릭이벤트 추가\r\n");
      out.write("	naver.maps.Event.addListener(marker, \"click\", function(e) {\r\n");
      out.write("		infoWindow = new naver.maps.InfoWindow({\r\n");
      out.write("			content : contentString\r\n");
      out.write("		});\r\n");
      out.write("		// 생성된 infoWindow를 map의 marker위치에 생성\r\n");
      out.write("		infoWindow.open(map, marker);\r\n");
      out.write("	});\r\n");
      out.write("	// 지도에 클릭이벤트 추가\r\n");
      out.write("	naver.maps.Event.addListener(map, \"click\", function(e) {\r\n");
      out.write("		if (infoWindow.getMap()) {\r\n");
      out.write("			infoWindow.close();\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
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
