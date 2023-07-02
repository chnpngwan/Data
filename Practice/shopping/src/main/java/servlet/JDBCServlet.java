package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Util;

/**
 * @author ChnpngWng
 *
 * @date   Dec 6, 20228:46:04 AM
 */
@WebServlet("/jdbc")
public class JDBCServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Connection connection = Util.getConnection();
			if (connection==null) {
				System.out.println("失败");
			}else {
				System.out.println(connection);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
