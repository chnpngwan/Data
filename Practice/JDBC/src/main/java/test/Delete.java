package test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hero;
import util.JDBCUtil;

/**
 * @author ChnpngWng
 *
 * @date   Nov 30, 20224:01:21 PM
 */
@WebServlet("/delete")
public class Delete extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Hero hero = new Hero();
		hero.setHero_id(505);
		try {
			JDBCUtil.delete(505);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
