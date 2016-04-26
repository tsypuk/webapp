package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by rtsy on 20.04.2016.
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        ServletConfig config = this.getServletConfig();
        Enumeration<String> params = config.getInitParameterNames();

        writer.append("This is hello servlet.");

        while (params.hasMoreElements()) {
            String parameterName = params.nextElement();
            writer.append(parameterName).append(" : ");
            writer.append(config.getInitParameter(parameterName));
        }
    }
}