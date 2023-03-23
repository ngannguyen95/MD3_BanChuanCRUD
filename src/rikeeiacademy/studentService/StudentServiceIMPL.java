package rikeeiacademy.studentService;

import rikeeiacademy.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudent {
    public static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Nguyễn Hạnh Phúc", 18));
        studentList.add(new Student(2, "Nguyễn Hạnh Phích", 13));
        studentList.add(new Student(3, "Nguyễn Văn A", 15));
        studentList.add(new Student(4, "Nguyễn MAi Manh", 18));
        studentList.add(new Student(5, "Nguyễn Thị B", 18));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    // update và thêm sinh viên
    @Override
    public void save(Student student) {
        for (Student item : studentList) {
            if (item.getId() == student.getId()) {
                item.setName(student.getName());
                item.setAge(student.getAge());
                return;
            }
        }
        studentList.add(student);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(studentList.get(i));
            }
        }
    }

    @Override
    public void update(int id) {

    }
    @Override
    public void detail(int id){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                System.out.println("Thông tin sinh viên: ");
                System.out.println("id: "+studentList.get(i).getId()+" name: "+studentList.get(i).getName()
                        +" age:"+studentList.get(i).getAge());
            }
        }
    }

}
