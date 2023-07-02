package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utile.Utile;

/**
 * @author ChnpngWng
 *
 * @date   Dec 15, 202210:16:38 AM
 */
@WebServlet("/delete")
public class Delete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Utile.delete(id);
			resp.sendRedirect("select");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
