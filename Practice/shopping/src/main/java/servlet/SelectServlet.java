package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Food;
import util.Util;

/**
 * @author ChnpngWng
 *
 * @date   Dec 6, 20229:03:53 AM
 */
@WebServlet("/select")
public class SelectServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		try {
			List<Food> list = Util.select();
			System.out.println(list);
		//将数据list设置到resp里面
		req.setAttribute("list", list);
		//转发到jsp里面
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
/*		try {
			List<Food> list = Util.select();
			for(int i =0;i<list.size();i++) {
				System.out.println(
						list.get(i).getId()
						+"-"
						+list.get(i).getFoodName()
						+"-"
						+list.get(i).getCuisine()
						+"-"
						+list.get(i).getPrice()
						+"-"
						+list.get(i).getMemberPrice()
						+"-"
						+list.get(i).getIntroduce()
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}
}
