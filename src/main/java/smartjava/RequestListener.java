package smartjava;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.Enumeration;

/**
 * Created by roman.tsypuk on 5/1/16.
 */
@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println(sre.toString());
        Enumeration<String> en = sre.getServletRequest().getParameterNames();
        while (en.hasMoreElements()) {
            String current = en.nextElement();
            System.out.printf(sre.getServletRequest().getParameter(current));
        }
    }
}