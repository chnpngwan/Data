package servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utile.JDBCUtil;

/**
 * @author ChnpngWng
 *
 * @date   Dec 2, 20221:56:14 PM
 */
@WebServlet("/jdbc")
public class JDBCServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = JDBCUtil.getConnection();
		if(connection ==null) {
			System.out.println("失败");
		}else {
			System.out.println("成功");
		}
	}
}
