package com.koreaIT.jsp.am;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prinDan")
public class PrintDanServiet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		
		response.getWriter().append("<div> == 8단 == </div>");
		
		for(int i = 1;  i <=100; i++) {
			response.getWriter().append("<div> 8 * " + i + "=" + (8 * i) + "</div>");
		}
	
		response.getWriter().append("파라미터 출력예시 : " + request.getParameter("dan"));
		
		

	}
}
