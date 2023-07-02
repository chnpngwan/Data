package com.zhangboyun.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhangboyun.Bean.Food;
import com.zhangboyun.dao.FoodDao;

/**
 * Servlet implementation class FoodupServlet
 */
@WebServlet(name = "FoodupServlet", urlPatterns = { "/FoodupServlet" })
public class FoodupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("bid"));
		Food food=FoodDao.upFood(id);
		request.setAttribute("food", food);
		request.getRequestDispatcher("foodUp.jsp").forward(request, response);
	}

}
