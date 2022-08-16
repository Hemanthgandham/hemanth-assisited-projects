package UserValidation;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		doGet(request, response);
		String uName=request.getParameter("uName");
		String pass=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		if(uName.equals("venky")&&pass.equals("1234"))
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("username", uName);
			rd=request.getRequestDispatcher("Dashboard");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

}