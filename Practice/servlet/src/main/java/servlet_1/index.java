package servlet_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.write("<h1>首页</h1>");
		response.sendRedirect("https://www.baidu.com");
		printWriter.flush();
		printWriter.close();
//		request.getRequestDispatcher("login").forward(request, response);
	}
}
