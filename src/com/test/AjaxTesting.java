package com.test;

import java.io.IOException;

import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxTesting
 */
@WebServlet("/ajax")
public class AjaxTesting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxTesting() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String results = ("BEST BUY STORES MAPLEWOOD").substring(0, 12);
		
		System.out.println(results);
		
		ServletOutputStream ps = response.getOutputStream();
		
		response.setContentType("text/html");
		ps.println ("Man how r u");
		
		ps.close();		
	}

}
