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
 * @date   Nov 30, 20224:01:12 PM
 */
@WebServlet("/insert")
public class Insert  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Hero hero = new Hero();
		hero.setEquip_ids1("1331,1334,1421,1333,1327,1336");
		hero.setTips1("偏肉型的法师出装，使得墨子成为标准法坦，能抗能打");
		hero.setEquip_ids2("1131,1132,1421,1133,1137,1136");
		hero.setTips2("全输出装备赵云，输出能力极强，但生存能力较弱");
		try {
			JDBCUtil.insert(hero);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
