package com.example.mavenservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MavenServlet
 */
public class MavenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MavenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		// PrintWriter out = response.getWriter();
		// out.println("Hello Java");
		
		if ((request.getParameter("firstname") != "")
	   			 || (request.getParameter("lastname") != ""))
	   	 {
			// PrintWriter out = response.getWriter();
			// out.println("Request parameters were empty");
			

			String firstName = request.getParameter("firstname");
			String lastName = request.getParameter("lastname");
			
			request.setAttribute("firstname", firstName);
			request.setAttribute("lastname", lastName);	 
			getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);

	   	 }
	}
	

}
