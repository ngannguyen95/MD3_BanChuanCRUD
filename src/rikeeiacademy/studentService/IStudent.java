package rikeeiacademy.studentService;

import rikeeiacademy.model.Student;

import java.util.List;


public interface IStudent {
    List<Student> findAll();

    void save(Student student);

    void delete(int id);

    void update(int id);

    void detail(int id);
}
