package com.sob.suza;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();

    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("user");
		String password =request.getParameter("pass");
		
		login log = new login();
	       log.setName(name);
	       log.setPassword(password);
	        request.setAttribute("log",log);
	        
	        boolean status = log.validate();

	        if(status)
	        {
	            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");
	            rd.forward(request,response);
	        }
	        else
	        {
	            RequestDispatcher rdp = request.getRequestDispatcher("login-error.jsp");
	            rdp.forward(request,response);
	        }

	}

}
