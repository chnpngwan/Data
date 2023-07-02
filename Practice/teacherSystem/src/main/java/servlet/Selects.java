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
 * @date   Dec 19, 20228:37:01 AM
 */
@WebServlet("/selects")
public class Selects extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String key=req.getParameter("key");
	try {
		List<Teacher> list=Utile.selects(key);
		req.setAttribute("list", list);
		req.getRequestDispatcher("Select.jsp").forward(req, resp);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
