package main.controllers.listeners;

import main.controllers.LoginServlet;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Kuznetsov on 20/04/2017.
 */

public class AppStartListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // Здесь надо поместить конфигуратор лога (без static)
        PropertyConfigurator.configure(AppStartListener.class.getClassLoader()
                .getResource("log4j.properties"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
