package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //Проверка на существование сессии
        if (req.getSession().getAttribute("firstname") != null){
            resp.sendRedirect("/TT1.0/personalpage");
            return;
        }

        DBSelect select = new DBSelect();

        try{
            select.SelectConstruction(req.getParameter("login"), req.getParameter("password"));
        }
        catch(Exception ex){
            System.out.print(ex.getStackTrace());
        }
        
        //Если пользователь найден, запускаем сессию
        if (select.userFind){
            req.getSession().setAttribute("firstname", select.firstname);
            req.getSession().setAttribute("lastname", select.lastname);
            resp.sendRedirect("/TT1.0/personalpage");
        }
        else{
            req.setAttribute("message", "Invalid login or password");
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
