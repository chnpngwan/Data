package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Good;
import utile.JDBCUtile;

/**
 * @author ChnpngWng
 *
 * @date   Dec 20, 202210:56:55 AM
 */
@WebServlet("/select")
public class Select extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		List<Good> list;
		try {
			list = JDBCUtile.select(key);
			req.setAttribute("list", list);
			req.setAttribute("lists", key);
			req.getRequestDispatcher("show").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
