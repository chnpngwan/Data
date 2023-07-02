package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book_model.Book;
import utile.JDBCUtil;

/**
 * @author ChnpngWng
 *
 * @date   Dec 2, 20222:41:43 PM
 */
@WebServlet("/change")
public class ChangeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = new Book(3, "你好", "李武", 100.00, "现代");
		JDBCUtil.update(book);
	}
}
