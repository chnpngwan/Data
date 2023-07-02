package servlet;

import java.io.IOException;
import java.util.logging.Handler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ChnpngWng
 * @Date   Nov 23, 20223:14:49 PM
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
}
