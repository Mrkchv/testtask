package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signin extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Проверка на существование сессии
        if (req.getSession().getAttribute("firstname") != null){
            resp.sendRedirect("/TT1.0/personalpage");
            return;
        }
        
        DBSelect select = new DBSelect();
        try{
            select.SelectConstruction(req.getParameter("login"));
            //Если пользователем с данным логином найден, просим ввести другой
            if (select.userFind){
                req.setAttribute("messageSignin", "This login is used. Please, enter another login");
                getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
            }
            else{
                DBInsert insert = new DBInsert();
                insert.InsertConstructor(req.getParameter("login"), req.getParameter("firstname"), req.getParameter("lastname"), req.getParameter("password"));            
                req.getSession().setAttribute("firstname", req.getParameter("firstname"));
                req.getSession().setAttribute("lastname", req.getParameter("lastname"));
                resp.sendRedirect("/TT1.0/personalpage");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
