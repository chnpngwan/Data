package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.JDBCUtil;

/**
 * @author ChnpngWng
 *
 * @date   Nov 30, 20222:17:17 PM
 */
@WebServlet("/test")
public class JDBCTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);
			if (connection == null) {
				System.out.println("MySQL失败");
			} else {
				System.out.println("MySQL成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
