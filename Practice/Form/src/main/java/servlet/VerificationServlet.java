package servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 * @author ChnpngWng
 *
 * @date   Nov 23, 20223:53:03 PM
 */
@WebServlet("/verificationservlet")
public class VerificationServlet extends HttpServlet{
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name = req.getParameter("name");
			String passwordString = req.getParameter("password");
			if (name.equals("lisi")&&passwordString.equals("123")) {
				req.getSession().setAttribute("name", name);
				req.getSession().setAttribute("password", passwordString);
				resp.sendRedirect("successful.jsp");
			} else {
				resp.sendRedirect("fail.jsp");
			}
	}
}
