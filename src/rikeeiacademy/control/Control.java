package rikeeiacademy.control;

import rikeeiacademy.model.Student;
import rikeeiacademy.studentService.StudentServiceIMPL;

import java.util.List;

public class Control {
    StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();

    public List<Student> showList() {
        return studentServiceIMPL.findAll();
    }

    public void createStudent(Student student) {
        studentServiceIMPL.save(student);
    }

    public void updateStudent(Student student) {
        studentServiceIMPL.save(student);
    }

    public void deleteStudent(int id) {
        studentServiceIMPL.delete(id);
    }

    public void detailStudent(int id) {
        studentServiceIMPL.detail(id);
    }
    public void sort(){

    }
}
