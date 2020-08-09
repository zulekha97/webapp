

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/savaServlet")
public class savaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public savaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("fname");
		String password =request.getParameter("pass");
		int date=Integer.parseInt("departure_date");
		String username =request.getParameter("user");
		String origin =request.getParameter("org");
		String destination =request.getParameter("dest");
		int age =Integer.parseInt("age");
		String national_id =request.getParameter("n_id");
		String gender =request.getParameter("gender");
		int contract =Integer.parseInt("phone");
		
		save sv = new save();
	       sv.setFName(name);
	       sv.setPassword(password);
	       sv.setDatee(date);
	       sv.setUser(username);
	       sv.setOrigin(origin);
	       sv.setDestination(destination);
	       sv.setAge(age);
	       sv.setNational_id(national_id);
	       sv.setGender(gender);
	       sv.setContract(contract);
	        request.setAttribute("log",sv);
	        
	       
	        PrintWriter out=response.getWriter();

	        
// 				save data
	        int status=savaPassenge.save(sv);
	        if(status>0){
	            out.print("<p>Record saved successfully!</p>");
	            request.getRequestDispatcher("index.jsp").include(request, response);
	        }else{
	            out.println("Sorry! unable to save record");
	        }

	        out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
