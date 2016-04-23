package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (
        name = "testservlet",
        urlPatterns = "/test",
        loadOnStartup = 1,
        initParams = {
                @WebInitParam (name = "database", value = "jdbc:localhost/myDB"),
                @WebInitParam (name = "server", value = "localhost")
        }
)
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("This is test servlet 2.");
        ServletConfig config = this.getServletConfig();
        writer.append(config.getInitParameter("database"));
        writer.append(config.getInitParameter("server"));
    }
}