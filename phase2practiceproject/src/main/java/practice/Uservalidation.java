package practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Uservalidation extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter k = res.getWriter();
		System.out.println("inside user validation service method");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		 if(username.equals("hemanth") && password.equals("1144")){
			k.println("<h1>Welcome to the page</h1>");
			
			k.println("<h3><input type = 'submit' value = 'Logout'/></h3>");
			}
		else
			{
			k.println("<h1>User credentilas not valid</h1>");
			k.println("<h2>Please check the credentials before enter!</h2>");
		}
		
	}

}