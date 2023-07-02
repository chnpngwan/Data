package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

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
 * @date   Dec 20, 202211:00:37 AM
 */
@WebServlet("/update")
public class Update extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		double price = Double.parseDouble(req.getParameter("price"));
		int count = Integer.parseInt(req.getParameter("count"));
		Date createTime = new Date(req.getParameter("createTime"));
		String desc = req.getParameter("desc");
		
		req.setAttribute("name", name);
		req.setAttribute("price", price);
		req.setAttribute("count", count);
		req.setAttribute("createTime", createTime);
		req.setAttribute("desc", desc);
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		double price = Double.parseDouble(req.getParameter("price"));
		int count = Integer.parseInt(req.getParameter("count"));
		Date createTime = new Date(req.getParameter("createTime"));
		String desc = req.getParameter("desc");
		Good good = new Good(0, name, price, count, createTime, desc);
		try {
			JDBCUtile.update(good);
			resp.sendRedirect("list");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
