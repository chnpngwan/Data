package servlet;

import java.io.IOException;
import java.sql.SQLException;
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
 * @date   Dec 20, 20229:07:57 AM
 */
@WebServlet("/show")
public class Show extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<Good> list=JDBCUtile.select();
			req.setAttribute("list", list);
			req.getRequestDispatcher("show.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
