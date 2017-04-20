package main.controllers;

import main.services.UserService;
import main.services.UserServiceImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by admin on 18.04.2017.
 */

public class LoginServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

    private static UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (userService.auth(login, password) != null) {
            req.getSession().setAttribute("userLogin", login);
            //logger.debug("user: " + login + " logged" );
            resp.sendRedirect(req.getContextPath() + "/listStudents");
        } else {
            resp.sendRedirect("/");
        }
    }
}