
This is done by dev2
package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private String msg;
	public void init() throws ServletException{
		msg="hello world";
		
	}

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        System.out.println("Hi");
        out.println("<h1>"+msg+"</h1>");
    }
}
