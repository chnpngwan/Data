package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ChnpngWng
 * @Date   Nov 18, 20222:34:45 PM
 */
@WebServlet("/servlet/me")
public class MeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.修改Response对象
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		//往resp对象输出里面写HTML数据
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<h1>你好呀！！</h1>");
		printWriter.write("<h1>路福听</h1>");
		printWriter.flush();
		printWriter.close();
	}
}
