package productDetails;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class product extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "jdbc:mysql://localhost/project2";
		String username = "root";
		String password = "hemanth4409*";

		response.setContentType("text/html");

		int pId = Integer.parseInt(request.getParameter("p_ID"));

		PrintWriter out = response.getWriter();

		String querys = "select * from product1 where productid=?";
		out.print("<h1>Displaying the product Details...</h1>");
		out.print("<table border='1'><tr><th>productid</th><th>productname</th><th>productprice</th></tr>");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection dbCon = DriverManager.getConnection(url, username, password);
			PreparedStatement st = dbCon.prepareStatement(querys);

			st.setInt(1, pId);

			ResultSet result = st.executeQuery();

			while (result.next()) {

				out.print("<tr><td>");
				out.println(result.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(3));
				out.print("</td>");
				out.print("</tr>");

			}

		} catch (Exception e) {

			System.out.println("Some Issue : " + e.getMessage());

		}

	}

}