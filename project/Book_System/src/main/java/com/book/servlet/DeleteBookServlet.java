package com.book.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.BookDao;
@WebServlet("/deleteById")
public class DeleteBookServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收页面中的ID
		int id = Integer.parseInt(req.getParameter("id"));
		//创建对象，调用删除方法
		boolean flag = new BookDao().delById(id);
		//判断删除结果
		if(flag) {
			req.setAttribute("success", "数据删除成功！");
			resp.sendRedirect("show");//重新进行全表查询
		}else {
			req.setAttribute("erro", "数据删除失败！");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
