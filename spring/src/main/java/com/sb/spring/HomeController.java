package com.sb.spring;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handles requests for the application home page.
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String hi = "hi";
		req.setAttribute("hi", hi);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/home.jsp");
		dispatcher.forward(req, resp);
	}
}
