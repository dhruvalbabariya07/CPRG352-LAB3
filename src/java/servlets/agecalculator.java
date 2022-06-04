package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dhruval
 */
public class agecalculator extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
        return;
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age=request.getParameter("current_age");
        try{
        if(age==null ||age.equals(""))
        {
        String message="You must give your current age";
        request.setAttribute("message",message );
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        else
        {
         int changedage=Integer.parseInt(age);
         changedage=changedage+1;
         request.setAttribute("message", "Your age next birthday will be"+  changedage); 
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        
        }
        catch(NumberFormatException ex){
            request.setAttribute("message", "You must enter number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);  
            return;
            
        }

    
    }
}

    
