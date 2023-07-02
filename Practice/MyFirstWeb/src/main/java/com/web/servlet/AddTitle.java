package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.TitleDao;

/**
 * @author ChnpngWng
 * @date 2022-10-13 下午9:33:01
 */
public class AddTitle extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String title = req.getParameter("title");
		TitleDao titledao = new TitleDao();
		titledao.addTitle(title);
		req.setAttribute("msg", "发帖成功");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
