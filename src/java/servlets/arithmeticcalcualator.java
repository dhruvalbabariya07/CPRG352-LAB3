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
public class arithmeticcalcualator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("num1");
        String second = request.getParameter("num2");
        String option = request.getParameter("ac_calculate");

        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("result", "===");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } else {

            try {
                int firstvalue = Integer.parseInt(first);
                int secondvalue = Integer.parseInt(second);
                int result = 0;
                switch (option) {
                    case "+":
                        result = firstvalue + secondvalue;
                         request.setAttribute("result", result);
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

                        break;
                    case "-":
                        result = firstvalue - secondvalue;
                         request.setAttribute("result", result);
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

                        break;
                    case "*":
                        result = firstvalue * secondvalue;
                         request.setAttribute("result", result);
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

                        break;
                    default:
                        result = firstvalue % secondvalue;
                         request.setAttribute("result", result);
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

                        break;
                }
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

            } catch (NumberFormatException ex) {
                System.out.println(ex);
            }

        }

    }

}
