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
 * @date   Dec 2, 20222:18:46 PM
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book=new Book(0,"三体", "李四", 100.00, "玄幻小说");
		JDBCUtil.insert(book);
	}
}
