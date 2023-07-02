package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Teacher;
import utile.Utile;

/**
 * @author ChnpngWng
 *
 * @date   Dec 15, 20229:12:36 AM
 */
@WebServlet("/select")
public class SelectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<Teacher> list = Utile.select();
			System.out.println(list);
			req.setAttribute("list", list);
			req.getRequestDispatcher("Select.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
