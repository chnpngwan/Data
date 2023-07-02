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
 * @date   Nov 30, 20224:01:32 PM
 */
@WebServlet("/change")
public class Change extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Hero hero = new Hero();
		hero.setEquip_ids1("125345315");
		hero.setTips1("12333");
		hero.setEquip_ids2("1352453");
		hero.setTips2("4214524");
		hero.setHero_id(505);
		try {
			JDBCUtil.change(hero);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
