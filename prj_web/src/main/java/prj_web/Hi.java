package prj_web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Hi extends HttpServlet {

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	request.setCharacterEncoding("UTF-8");

	ArrayList<String> list = new ArrayList<>();
	list.add("안녕하세요");
	list.add("반갑습니다");
	list.add("Hello World");
	list.add("HIT");
	list.add("QUIT");
	request.setAttribute("list", list);
	
	String str = request.getParameter("text");
	request.setAttribute("text", str);
	
	request.getRequestDispatcher("./index.jsp").forward(request,response);
	
	//login();
}
}
