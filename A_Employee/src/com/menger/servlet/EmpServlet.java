package com.menger.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.menger.entity.PageBean;
import com.menger.service.EmpService;

public class EmpServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String current = request.getParameter("currentPage");
		if (current == null) {
			current = "1";
		}
		String size = request.getParameter("pageSize");
		if (size == null) {
			size = "5";
		}
		int currentPage = Integer.parseInt(current);
		int pageSize = Integer.parseInt(size);
		EmpService empService = new EmpService();
		PageBean pb = empService.queryPage(currentPage, pageSize);
		request.setAttribute("pb", pb);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
