package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Hero;

/**
 * @author ChnpngWng
 *
 * @date   Nov 30, 20222:04:19 PM
 */
//jdbc工具类
public class JDBCUtil {
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	
	//准备工作，加载驱动
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//准备工作，获取连接
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/glory_of_kings?characterEncoding=UTF-8",
				"root",
				"123456");
		return connection;
	}
	//为用户提供：增
	public static void insert(Hero hero) throws SQLException {
		
		String sql = "insert into hero_equip(equip_ids1,tips1,equip_ids2,tips2) values ("
				+ "'"+hero.getEquip_ids1() + "'"
				+ ","
				+ "'"+hero.getTips1() + "'"
				+ ","
				+ "'"+hero.getEquip_ids2() + "'"
				+ ","
				+ "'"+hero.getTips1() + "'"
				+ ") ;";
		System.out.println(sql);
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.executeUpdate();
	}
	//为用户提供：删
	public static void delete(int hero_id) throws SQLException {
		
		String sql = "delete from hero_equip where hero_id=" + hero_id + ";";
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.executeUpdate();
	}
	//为用户提供：改
	public static void change(Hero hero) throws SQLException {
		
		String sql = "update hero_equip set equip_ids1="
				+ "'"+hero.getEquip_ids1() + "'"
				+ ", tips1="
				+ "'"+hero.getTips1() + "'"
				+ ", equip_ids2="
				+ "'"+hero.getEquip_ids2() + "'"
				+ ", tips2="
				+ "'"+hero.getTips1() + "'"
				+ " where hero_id="
				+ "'"+hero.getHero_id() + "'"
				+ ";";
		System.out.println(sql);
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.executeUpdate();
	}
	//为用户提供：查所有
	//为用户提供：条件查
}
