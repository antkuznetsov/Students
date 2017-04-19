package main.controllers;

import main.models.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuznetsov on 19/04/2017.
 */

public class ListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("value", "Привет, студенты");

        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student(1, "Антон Кузнецов", 24, 1);
        Student student2 = new Student(2, "Иван Рыков", 22, 1);
        Student student3 = new Student(3, "Александра Воробьева", 19, 1);

        list.add(student1);
        list.add(student2);
        list.add(student3);

        req.setAttribute("list", list);

        getServletContext().getRequestDispatcher("/list.jsp").forward(req, resp);
    }
}
