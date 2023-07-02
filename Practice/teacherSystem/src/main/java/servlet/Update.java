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
 * @date   Dec 19, 202210:21:28 AM
 */
@WebServlet("/update")
public class Update extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String sex=req.getParameter("sex");
		int age = Integer.parseInt(req.getParameter("age"));
		String position = req.getParameter("posotion");
		Teacher teacher = new Teacher(id,name,sex,age,position);
		try {
			Utile.update(teacher);
			resp.sendRedirect("select");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
