package servlet;

import java.io.IOException;
import java.util.List;

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
 * @date   Dec 2, 20223:05:43 PM
 */
@WebServlet("/select")
public class SelectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Book> list = JDBCUtil.select();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getId()+"-"
					+list.get(i).getName()+"-"
					+list.get(i).getAuthor()+"-"
					+list.get(i).getPrice()+"-"
					+list.get(i).getTyper()
					);
		}
	}
}
