package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author ChnpngWng
 *
 * @date   Nov 25, 20222:10:46 PM
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//1、加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2、获取连接
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/glory_of_kings","root","123456");
			//3、编写sql
			String sql = "select * from hero_equip;";
			//4、获取sql执行对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//5、执行sql
			ResultSet resultSet = preparedStatement.executeQuery();
			//6、对结果resultSet进行处理
			while(resultSet.next()) {
				//取当前行的
				Integer id = resultSet.getInt("hero_id");
				String equip_ids1 = resultSet.getString("equip_ids1");
				String tips1 = resultSet.getString("tips1");
				String equip_ids2 = resultSet.getString("equip_ids2");
				String tips2 = resultSet.getString("tips2");
				System.out.println(id+"-"+equip_ids1+"-"+tips1+"-"+equip_ids2+"-"+tips2);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
