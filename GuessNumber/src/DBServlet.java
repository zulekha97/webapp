import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class DBServlet extends javax.servlet.http.HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
        PrintWriter out =response.getWriter();
        int count = 0;
        int guessNumber =Integer.parseInt(request.getParameter("guessnumber"));
        HttpSession session = request.getSession();
        Integer integer =(Integer)session.getAttribute("saveNumber");
        int realNumber = integer.intValue();
        System.out.println(realNumber);
        System.out.println(guessNumber);
        if (guessNumber > realNumber){
            session.setAttribute("message","guess high");
            System.out.println("No, that\'s too high. Guess again");
            response.sendRedirect("session.jsp");
        }else if ((guessNumber < realNumber)) {
         session.setAttribute(  "message","guess low");
            System.out.println("No, that\'s too low. Guess again");
            response.sendRedirect("session.jsp");
            count++;
        }else{
             session.setAttribute("message","You are right");
            System.out.println("That\'s right! You guessed my number in only "+count+ "tries! Would you like to play again?");
            response.sendRedirect("session.jsp");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    doPost(request,response);
    }
}
