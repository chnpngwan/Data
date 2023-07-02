package utile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Teacher;


/**
 * @author ChnpngWng
 *
 * @date   Dec 15, 20228:37:00 AM
 */
public class Utile {
	private static String url="jdbc:mysql://localhost:3306/db_teacher?characterEncoding=UTF-8";
	private static String user="root";
	private static String password="123456";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	
	public static List<Teacher> select() throws SQLException{
		String sqlString = "select * from tb_teacher;";;
//		if (sqlString!=null) {
//			sqlString = "select * from tb_teacher;";
//		}else {
//			sqlString = "select * from tb_teacher where name like "
//					+ "'%"+key+"%'"
//					+";";
//		}
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		ResultSet resultSet = statement.executeQuery();
		List<Teacher> teacher = new ArrayList<>();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String sex = resultSet.getString("sex");
			int age = resultSet.getInt("age");
			String position = resultSet.getString("position");
			Teacher teachers = new Teacher(id,name,sex,age,position);
			teacher.add(teachers);
		}
		return teacher;
	}
	
	public static void delete(int id) throws SQLException {
		String sqlString = "delete from tb_teacher where id="+id+";";
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		statement.executeUpdate();
	}
	
	public static void insert(Teacher teacher) throws SQLException {
		String sqlString = "insert into tb_teacher(name,sex,age,position) values("
				+ "'"
				+ teacher.getName()
				+ "'"
				+ ","
				+ "'"
				+ teacher.getSex()
				+ "'"
				+ ","
				+ teacher.getAge()
				+ ","
				+ "'"
				+ teacher.getPosition()
				+ "'"
				+ ");";
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		statement.executeUpdate();
	}
	
	public static List<Teacher> selects(String key) throws SQLException{
		String sqlString = "select * from tb_teacher where name like "
				+ "'%"+key+"%'"
				+";";
		System.out.println(sqlString);
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		ResultSet resultSet = statement.executeQuery();
		List<Teacher> teacher = new ArrayList<>();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String sex = resultSet.getString("sex");
			int age = resultSet.getInt("age");
			String position = resultSet.getString("position");
			Teacher teachers = new Teacher(id,name,sex,age,position);
			teacher.add(teachers);
		}
		return teacher;
	}
	
	public static void update(Teacher teacher) throws SQLException {
		String sqlString = "update tb_teacher set name="
				+ "'"
				+ teacher.getName()
				+ "'"
				+ ", sex="
				+ "'"
				+ teacher.getSex()
				+ "'"
				+ ", age="
				+ teacher.getAge()
				+ ", position="
				+ "'"
				+ teacher.getPosition()
				+ "'"
				+ " where id="
				+ teacher.getId()
				+ ";";
		System.err.println(sqlString);
		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sqlString);
		statement.executeUpdate();
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}
