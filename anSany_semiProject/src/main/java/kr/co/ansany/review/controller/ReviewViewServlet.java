package kr.co.ansany.review.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ansany.review.model.service.ReviewService;
import kr.co.ansany.review.model.vo.ReviewViewData;

/**
 * Servlet implementation class ReviewViewServlet
 */
@WebServlet(name = "ReviewView", urlPatterns = { "/reviewView.do" })
public class ReviewViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReviewViewServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		int freeBoardNo = Integer.parseInt(request.getParameter("reviewNo"));

		ReviewService service = new ReviewService();
		ReviewViewData rvd = service.selectOneReview(freeBoardNo);

		if (rvd == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
			request.setAttribute("title", "조회실패");
			request.setAttribute("msg", "게시글이 존재하지 않습니다.");
			request.setAttribute("icon", "info");
			request.setAttribute("loc", "/reviewList.do?reqPage=1");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/review/reviewView.jsp");
			request.setAttribute("r", rvd.getR());
			request.setAttribute("commentList", rvd.getCommentList());
			request.setAttribute("reCommentList", rvd.getReCommentList());
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
