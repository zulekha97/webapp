

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editServlet")
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public editServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	          response.setContentType("text/html");
	          PrintWriter out=response.getWriter();
	          out.println("<h1>Update Passenger</h1>");
	          String sid=request.getParameter("id");
	          int id=Integer.parseInt(sid);

	          save e=savaPassenge.getEmployeeById(id);
	          out.print("<form action='EditServlet2' method='post'>");
	          out.print("<table>");
	          out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
	          out.print("<tr><td>Full name:</td><td><input type='text' name='fname' value='"+e.getFName()+"'/></td></tr>");
	          out.print("<tr><td>Password:</td><td><input type='password' name='pass' value='"+e.getPassword()+"'/></td></tr>");
	          out.print("<tr><td>Username:</td><td><input type='email' name='user' value='"+e.getUser()+"'/></td></tr>");
	          out.print("<tr><td>Contract:</td><td><input type='text' name='phone' value='"+e.getContract()+"'/></td></tr>");
	          out.print("<tr><td>Origin:</td><td><input type='password' name='origin' value='"+e.getOrigin()+"'/></td></tr>");
	          out.print("<tr><td>UDestination:</td><td><input type='email' name='destination' value='"+e.getDestination()+"'/></td></tr>");
	          out.print("<tr><td>Departure date:</td><td><input type='text' name='departure_date' value='"+e.getDatee()+"'/></td></tr>");
	          out.print("<tr><td>Gender:</td><td><input type='password' name='gender' value='"+e.getGender()+"'/></td></tr>");
	          out.print("<tr><td>National ID:</td><td><input type='password' name='n_id' value='"+e.getGender()+"'/></td></tr>");
	          out.print("</td></tr>");
	          out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
	          out.print("</table>");
	          out.print("</form>");

	          out.close();
	}


}
