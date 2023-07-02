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
 * @Date   Nov 18, 20223:49:49 PM
 */
@WebServlet("/t")
public class TableServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		int port = req.getServerPort();
		String IP = req.getServerName();
		String uRLString = req.getRequestURI();
		
		System.out.println("name："+name);
		System.out.println("password："+password);
		System.out.println("port："+port);
		System.out.println("IP："+IP);
		System.out.println("uRLString："+uRLString);
		
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		//往resp对象输出里面写HTML数据
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<h1>你好呀！！</h1>");
		printWriter.write("<!DOCTYPE html>");
		printWriter.write("<html>");
		printWriter.write("<head> ");
		printWriter.write("<meta charset=\"utf-8\"> ");
		printWriter.write("<title>表单</title> ");
		printWriter.write("</head>");
		printWriter.write("<body>");
		printWriter.write("<form action=\"\">");
		printWriter.write("First name: <input type=\"text\" name=\"firstname\"><br>");
		printWriter.write("Last name: <input type=\"text\" name=\"lastname\">");
		printWriter.write("<input type=\"submit\">\r\n");
		printWriter.write("</form>");
		printWriter.write("</body>");
		printWriter.write("</html>");
		printWriter.flush();
		printWriter.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
}
