

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editServlet2")
public class editServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public editServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String sid=request.getParameter("id");
        int id=Integer.parseInt(sid);
        String name=request.getParameter("fname");
        String password=request.getParameter("pass");
       int contract=Integer.parseInt("phone");
        String gender=request.getParameter("gender");
        String username=request.getParameter("user");
        String national_id =request.getParameter("n_id");
        String origin=request.getParameter("origin");
        String destination=request.getParameter("destination");
        int departure_date=Integer.parseInt("date");
       int age=Integer.parseInt("age");

       save e=new save();
        e.setId(id);
        e.setFName(name);
        e.setPassword(password);
        e.setDatee(departure_date);
        e.setOrigin(origin);
        e.setUser(username);
        e.setDestination(destination);
        e.setNational_id(national_id);
        e.setContract(contract);
        e.setAge(age);
        e.setGender(gender);
        

        int status=savaPassenge.update(e);
        if(status>0){
            response.sendRedirect("ViewServlet");
        }else{
            out.println("Sorry! unable to update record");
        }

        out.close();
	}

}
