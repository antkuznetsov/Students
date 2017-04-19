package main.services;

import main.models.pojo.Student;

import java.util.List;

/**
 * Created by Kuznetsov on 19/04/2017.
 */

public interface StudentServiceInterface {
    List<Student> getAllStudent();
}
