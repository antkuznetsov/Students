package main.controllers.listeners;

import main.controllers.LoginServlet;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Kuznetsov on 20/04/2017.
 */

public class MySessionListener implements HttpSessionListener {

    private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        //LOGGER.trace();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
