package smartjava.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@SuppressWarnings("unused")
public class Bootstrap implements WebApplicationInitializer
{
    @Override
    public void onStartup(ServletContext container) throws ServletException
    {
        container.getServletRegistration("default").addMapping("/resource/*");

        AnnotationConfigWebApplicationContext rootContext =
                new AnnotationConfigWebApplicationContext();
        rootContext.register(RootContextConfiguration.class);
        container.addListener(new ContextLoaderListener(rootContext));


        AnnotationConfigWebApplicationContext soapContext =
                new AnnotationConfigWebApplicationContext();
        soapContext.register(SoapServletContextConfiguration.class);
        MessageDispatcherServlet soapServlet =
                new MessageDispatcherServlet(soapContext);
        soapServlet.setTransformWsdlLocations(true);
        ServletRegistration.Dynamic dispatcher = container.addServlet("springSoapDispatcher", soapServlet);
        dispatcher.setLoadOnStartup(3);
        dispatcher.addMapping("/services/Soap/*");

    }
}
