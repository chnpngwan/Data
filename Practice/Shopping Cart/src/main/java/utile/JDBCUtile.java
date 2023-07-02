package utile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Good;

/**
 * @author ChnpngWng
 *
 * @date   Dec 20, 20228:54:51 AM
 */
public class JDBCUtile {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_shopping?characterEncoding=UTF-8", "root", "123456");
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
	
	public static List<Good> select() throws SQLException{
		String sqlString = "select * from tb_good;";;
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		ResultSet resultSet = statement.executeQuery();
		List<Good> good = new ArrayList<>();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			Double price = resultSet.getDouble("price");
			int count = resultSet.getInt("count");
			Date createTime = resultSet.getDate("createTime");
			String desc = resultSet.getString("desc");
			Good good2 = new Good(id, name, price, count, createTime, desc);
			good.add(good2);
		}
		return good;
	}
	
	public static void delete(int id) throws SQLException {
		String sqlString = "delete from tb_good where id="+id+";";
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		statement.executeUpdate();
	}
	
	public static void insert(Good good) throws SQLException {
		String sql = "insert into tb_good(name, price, count, createTime,desc) "
				+ "values("
				+ "'"
				+ good.getName()
				+ "'"
				+ ", "
				+ good.getPrice()
				+ ", "
				+ good.getCount()
				+ ", "
				+ good.getCreateTime()
				+ ", "
				+ "'"
				+ good.getDesc()
				+ "'"
				+ ");";
		System.out.println(sql);
		Connection conn = getConnection();
		PreparedStatement state;
		try {
			state = conn.prepareStatement(sql);
			state.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Good> select(String key) throws SQLException {
		String sql = "select * from tb_good where name like '%"
				+ key
				+ "%';";
		System.out.println(sql);
		Connection conn = getConnection();
		try {
			PreparedStatement state = conn.prepareStatement(sql);
			ResultSet resultSet = state.executeQuery();
			List<Good> list = new ArrayList<Good>();
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Double price = resultSet.getDouble("price");
				int count = resultSet.getInt("count");
				Date createTime = resultSet.getDate("createTime");
				String desc = resultSet.getString("desc");
				Good good2 = new Good(id, name, price, count, createTime, desc);
				list.add(good2);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void update(Good good) throws SQLException {
		String sql = "update tb_good set name="
				+ "'"
				+ good.getName()
				+ "'"
				+ ", price"
				+ good.getPrice()
				+ ", count"
				+ good.getCount()
				+ ", createTime"
				+ good.getCreateTime()
				+ ", desc="
				+ "'"
				+ good.getDesc()
				+ "'"
				+ " where id="
				+ good.getId()
				+ ";";
		System.out.println(sql);
		Connection conn = getConnection();
		PreparedStatement state;
		try {
			state = conn.prepareStatement(sql);
			state.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
