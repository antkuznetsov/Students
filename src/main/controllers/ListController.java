package main.controllers;

import main.model.entity.Student;
import main.services.StudentService;
import main.services.StudentServiceImpl;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by admin on 18.04.2017.
 */

public class ListController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

    public  static StudentService service = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("value", "Hello, student");

        List<Student> list = service.findAll();
        req.setAttribute("list", list);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list.jsp");
        dispatcher.forward(req, resp);
    }

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
}
