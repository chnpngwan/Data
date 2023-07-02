package com.zhangboyun.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.zhangboyun.dao.FoodDao;

/**
 * Servlet implementation class FooddelteServlet
 */
@WebServlet(name = "FooddelteServlet", urlPatterns = { "/FooddelteServlet" })
public class FooddelteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doPost(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		int id=Integer.parseInt(request.getParameter("bid"));
		int s=FoodDao.delete(id);
		System.out.println(s);
		System.out.println(id);
		if (s>0) {
			request.getRequestDispatcher("FoodquServlet").forward(request, response);
		}else {
			JOptionPane.showConfirmDialog(null, "出错了！在FooddelteServlet界面,Servelet包下");
		}
	}

}
