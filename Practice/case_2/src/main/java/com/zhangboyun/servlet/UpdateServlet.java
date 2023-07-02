package com.zhangboyun.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.zhangboyun.Bean.Food;
import com.zhangboyun.dao.FoodDao;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet(name = "UpdateServlet", urlPatterns = { "/UpdateServlet" })
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");	
		
		int id=Integer.parseInt(request.getParameter("id"));
		String cuisine=request.getParameter("cuisine");
		String foodName=request.getParameter("foodName");
		double price=Integer.parseInt(request.getParameter("price"));
		double memberPrice=Integer.parseInt(request.getParameter("memberPrice"));
		String introduce=request.getParameter("introduce");
							
		Food food=new Food(id,cuisine,foodName,price,memberPrice,introduce);
		int s=FoodDao.updataFood(food);
		if (s>0) {
			request.getRequestDispatcher("FoodquServlet").forward(request, response);
		}else {
			JOptionPane.showConfirmDialog(null, "出错了！在UpdateServlet界面,Servelet包下");
		}
	}

}
