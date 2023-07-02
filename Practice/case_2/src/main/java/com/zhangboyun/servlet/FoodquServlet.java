package com.zhangboyun.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhangboyun.Bean.Food;
import com.zhangboyun.dao.FoodDao;

/**
 * Servlet implementation class FoodquServlet
 */
@WebServlet(name = "/FoodquServlet", urlPatterns = { "/FoodquServlet" })
public class FoodquServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String search=request.getParameter("search");		
		List<Food> fi=FoodDao.queryFoods(search);	
		request.setAttribute("list",fi);	
	request.getRequestDispatcher("foodList.jsp").forward(request, response);
	}
		
}
