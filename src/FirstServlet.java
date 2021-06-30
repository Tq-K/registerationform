import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("WELCOME TO SERVER SIDE");
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String gender = request.getParameter("gender");
		String condition = request.getParameter("condition");
		if(condition!=null){
			out.println("<h2> Name    : "+name+"</h2>");
			out.println("<h2> Email   : "+email+"</h2>");
			out.println("<h2> Password: "+password+"</h2>");
			out.println("<h2> Gender  : "+gender+"</h2>");

		}else{
				out.println("<h2>You have not accepted terms and conditions</h2>");
		}
	}
}
