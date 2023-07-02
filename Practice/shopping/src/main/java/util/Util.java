package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Food;

/**
 * @author ChnpngWng
 *
 * @date   Dec 6, 20228:33:28 AM
 */
public class Util {
	
	public static String URL = "jdbc:mysql://localhost:3306/food?characterEncoding=UTF-8";
	public static String USER = "root";
	public static String PASSWORD = "123456";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	public static List<Food> select() throws SQLException{
	    //1、编写sql语句
		String sqlString = "select * from tb_food;";
		//2、connection对象：通过getConnection()
		Connection connection = getConnection();
		//2、statement对象：通过connection对象的prepareStatement(sqlString)
		PreparedStatement statement = connection.prepareStatement(sqlString);
		//2、resultSet对象：通过statement对象的executeQuery()
		ResultSet resultSet = statement.executeQuery();
		//5、List对象，遍历ResultSet对象
		List<Food> foods = new ArrayList<>();
		while (resultSet.next()) {
			//5.1、获取当前行的数据，通过resultSet的get方法
			int id = resultSet.getInt("id");
			String cuisine = resultSet.getString("cuisine");
			String foodName = resultSet.getString("foodName");
			Double price = resultSet.getDouble("price");
			String memberPrice = resultSet.getString("memberPrice");
			String introduce = resultSet.getString("introduce");
			//5.2、构建当前行的实体类对象
			Food food = new Food(id, cuisine, foodName, price, price, introduce);
			//5.3、将当前行的实体类读一下，添加到List对象中
			foods.add(food);
		}
		//6、返回List对象
		return foods;
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}
