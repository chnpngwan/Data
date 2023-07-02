package utile;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book_model.Book;

/**
 * @author ChnpngWng
 *
 * @date   Dec 2, 20221:42:00 PM
 */
public class JDBCUtil {
	
	private static String URL ="jdbc:mysql://localhost:3306/book";
	private static String USER ="root";
	private static String PASSWORD ="123456";
	//内部使用
	//1、加载驱动：静态代码块
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//2、获取连接
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//外部使用
	//增
	public static void insert (Book book) {
		//1、编写sql
		String sql ="insert into tb_book(name,author,price,type) values("
				+"'"
				+book.getName()
				+"'"
				+","
				+"'"
				+book.getAuthor()
				+"'"
				+","
				+book.getPrice()
				+","
				+"'"
				+book.getTyper()
				+"'"
				+");";
		System.out.println(sql);
		//2、搞到connection对像：getConnection
		Connection connection =getConnection();
		try {
			//3、搞到preparedStatement对象：connection对象的prepareStatement(sql)
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//4、执行preparedStatement对象的executeUpdate()
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//删
	public static void delete (int id) {
		//1、编写sql
		String sql ="delete from tb_book where id="+ id +";";
		System.out.println(sql);
		//2、搞到connection对像：getConnection
		Connection connection =getConnection();
		try {
			//3、搞到preparedStatement对象：connection对象的prepareStatement(sql)
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//4、执行preparedStatement对象的executeUpdate()
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//改
	public static void update (Book book) {
		//1、编写sql
		String sql ="update tb_book set name="
				+ "'"+book.getName() + "'"
				+ ", author="
				+ "'"+book.getAuthor() + "'"
				+ ", price="
				+book.getPrice()
				+ ", type="
				+ "'"+book.getTyper() + "'"
				+ " where id="
				+book.getId()
				+ ";";
		System.out.println(sql);
		//2、搞到connection对像：getConnection
		Connection connection =getConnection();
		try {
			//3、搞到preparedStatement对象：connection对象的prepareStatement(sql)
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//4、执行preparedStatement对象的executeUpdate()
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//查
	public static List<Book> select() {
		//1、编写sql
		String sql ="select id,name,author,price,type from tb_book";
		//2、搞到connection对像：getConnection
		System.out.println(sql);
		Connection connection =getConnection();
		try {
			//3、搞到preparedStatement对象：connection对象的prepareStatement(sql)
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//4、执行preparedStatement对象的executeQuery()
			ResultSet resultSet = preparedStatement.executeQuery();
			//5、数据转换：ResltSet--->List<Bok>
			List<Book> list = new ArrayList<>();
			while(resultSet.next()) {
				//当前行：id
				int id = resultSet.getInt("id");
				//当前行：name
				String name = resultSet.getString("name");
				//当前行：author
				String author = resultSet.getString("author");
				//当前行：price
				Double price = resultSet.getDouble("price");
				//当前行：type
				String type = resultSet.getString("type");
				//book表示当前被遍历的书
				Book book = new Book(id, name, author, price, type);
				//将书加到list里面
				list.add(book);
			}
			//将所有书进行装箱到list
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
