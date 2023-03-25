package com.techpalle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.Dao.DataAcces;
import com.techpalle.model1.Student;
import com.techpalle.util.SuccessPage;


@WebServlet("/")
public class MyServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String path=request.getServletPath();
		
		switch(path)
		{
		case "/logStudent":
			validCustomer(request,response);
			break;
			
		case "/regStudent":
			insertCustomer(request,response);
			break;
			
		case "/reg":
			getRegistrationPage(request,response);
			break;
			
		case "/log":
			getLoginPage(request,response);
			break;
			
		
		default :
			getstartupPage(request,response);
			break;
			
			
		}
	}


	private void getstartupPage(HttpServletRequest request, HttpServletResponse response) {
		try {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void validCustomer(HttpServletRequest request, HttpServletResponse response)
	{
       String email = request.getParameter("tbemail");
       String password = request.getParameter("tbpass");
       boolean b = Student.validCustomer(email,password);
       
       if(b) 
       {
       try {
			RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
			SuccessPage sp = new SuccessPage();
			request.setAttribute("successDetails", sp);
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
       }
       else {
    	   getLoginPage(request, response);
       }
	}





	private void getLoginPage(HttpServletRequest request, HttpServletResponse response) 
	{
		
		
		try {
			RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}


	private void getRegistrationPage(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");

			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void insertCustomer(HttpServletRequest request, HttpServletResponse response)
	{
		String name = request.getParameter("tbname");
		String email = request.getParameter("tbemail");
		String password = request.getParameter("tbpass");
		String state = request.getParameter("ddlstate");
		
		Student s = new Student(name, email, password, state);
		DataAcces.insertCustomer(s);
		try {
			RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
