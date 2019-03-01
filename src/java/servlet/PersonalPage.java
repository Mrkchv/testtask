package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalPage extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("firstname") != null){
            req.setAttribute("firstname", req.getSession().getAttribute("firstname"));
            req.setAttribute("lastname", req.getSession().getAttribute("lastname"));

            getServletContext().getRequestDispatcher("/personalpage.jsp").forward(req, resp);
        }
        else{
            resp.sendRedirect("/TT1.0");
        }
    }
}
