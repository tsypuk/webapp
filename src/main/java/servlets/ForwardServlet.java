package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "forward",
        urlPatterns = {
                "/forward",
                "/forward2",
                "/forward3"
        },
        displayName = "This is display name of forward servlet",
        loadOnStartup = 1

)
public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String nextPage = "/hello";
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(nextPage);
        requestDispatcher.forward(req, resp);
    }
}