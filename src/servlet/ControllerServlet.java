package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(true);

		List<Recode> recodeList = (List<Recode>)session.getAttribute("recodes");
		if (recodeList == null) {
			recodeList = new ArrayList<Recode>();
			session.setAttribute("recodes", recodeList);
		}

		request.setCharacterEncoding("UTF-8");
		request.setAttribute("recodes", recodeList);
		request.setAttribute("message", "本来ならDBからもってくる");
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/top.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		request.setCharacterEncoding("UTF-8");
		String recode = request.getParameter("recode");
		String message = "";
		try {
			HttpSession session = request.getSession(false);
			List<Recode> recodeList = (List<Recode>)session.getAttribute("recodes");
			if (recode != null) {
				Recode temp = new Recode();
				temp.setContent(recode);
				//レコード追加
				recodeList.add(temp);
				session.setAttribute("recodes", recodeList);
				request.setAttribute("recodes", recodeList);
			}

		} catch (NullPointerException e) {
			message = "セッションどっかいった";
		}

		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/top.jsp");
		dispatcher.forward(request, response);

	}

}
