package main.services;

import main.model.dao.StudentDao;
import main.model.entity.Student;
import main.model.impl.StudentDaoImpl;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Artem Panasyuk on 19.04.2017.
 */
public class StudentServiceImpl implements StudentService {
    private DataSource dataSource = DataSourceFactory.getMyPGDataSource();
    private StudentDao studentDao = new StudentDaoImpl(dataSource);

    public List<Student> findAll(){
      return studentDao.findAll();
    }
}
