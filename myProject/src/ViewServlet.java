

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/viewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        out.println("<a href='view.jsp'>Add New Passenger</a>");
	        out.println("<h1>Passenger List</h1>");
	        List<save> list=savaPassenge.getAllEmployees();

	        out.print("<table border='1' width='100%'");
	        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th> <th>Edit</th><th>Delete</th></tr>");
	        for(save e:list){
	            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFName()+"</td><td>"+e.getPassword()+"</td> <td>"+e.getUser()+"</td><td>"+e.getContract()+"</td><td>"+e.getGender()+"</td><td>"+e.getAge()+"</td><td>"+e.getOrigin()+"</td><td>"+e.getDestination()+"</td><td>"+e.getNational_id()+"</td><td>"+e.getDatee()+"</td><a href='EditServlet?id="+e.getId()+"'>edit</a></td> <td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");
	        }
	        out.print("</table>");

	        out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
