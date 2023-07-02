package servlet;

import java.io.IOException;
import java.sql.SQLException;

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
 * @date   Dec 15, 202211:08:29 AM
 */
@WebServlet("/insert")
public class Add extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String sex=req.getParameter("sex");
		int age = Integer.parseInt(req.getParameter("age"));
		String position = req.getParameter("posotion");
		Teacher teacher = new Teacher(0,name,sex,age,position);
		try {
			Utile.insert(teacher);
			resp.sendRedirect("select");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
