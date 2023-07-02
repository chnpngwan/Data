package com.web.servlet;
import com.web.dao.*;
import com.web.pojo.User;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ChnpngWng
 * @date 2022-10-13 下午7:32:25
 */
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//登录的请求处理
		req.setCharacterEncoding("utf-8");
		//获取界面表单提交过来的用户名和密码
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		//创建UserDao的对象
		UserDao userDao = new UserDao();
		User user = userDao.login(account, password);
		//判断查询结果
		if(user!=null){
			HttpSession session = req.getSession();
			session.setAttribute("currUser", user);
			resp.sendRedirect("index.jsp");
		}
		else{
			req.setAttribute("msg", "用户名或者密码不正确！");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
