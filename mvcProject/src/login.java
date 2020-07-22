import loginBean.LoginBean;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password=request.getParameter("pass");

        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPass(password);
        request.setAttribute("bean",bean);

        boolean status = bean.validate();

        if(status)
        {
            RequestDispatcher rd=request.getRequestDispatcher("loginSuccess.jsp");
            rd.forward(request,response);
        }
        else
        {
            RequestDispatcher rdp = request.getRequestDispatcher("loginError");
            rdp.forward(request,response);
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
