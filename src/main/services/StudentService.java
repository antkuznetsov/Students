package main.services;

import main.model.entity.Student;

import java.util.List;

/**
 * Created by Artem Panasyuk on 19.04.2017.
 */
public interface StudentService {
    List<Student> findAll();
}
