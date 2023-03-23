package rikeeiacademy.view;

import rikeeiacademy.config.Config;
import rikeeiacademy.control.Control;
import rikeeiacademy.model.Student;

import java.util.List;

public class StudentView {
    Control control = new Control();

    public void showStudent() {
        System.out.println("----Id----Name----Age");
        for (int i = 0; i < getList().size(); i++) {
            System.out.println("    " + getList().get(i).getId() + "    " + getList().get(i).getName() + "    " + getList().get(i).getAge());
        }
    }

    public void createStudent() {
        int id = getList().get(getList().size() - 1).getId() + 1;
        System.out.println("Nhập vào tên: ");
        String name = Config.scanner().nextLine();
        System.out.println("Nhập vào tuổi; ");
        int age = Config.scanner().nextInt();

        control.createStudent(new Student(id, name, age));
    }

    public void updateStudent() {
        System.out.println("Nhập vào id cần sửa: ");
        int id = Config.scanner().nextInt();
        System.out.println("Nhập tên sửa: ");
        String name = Config.scanner().nextLine();
        System.out.println("Nhập tuổi sửa: ");
        int age = Config.scanner().nextInt();
        control.updateStudent(new Student(id, name, age));
    }

    public void deleteStudent() {
        System.out.println("Nhập vào id cần xóa: ");
        int id = Config.scanner().nextInt();
        control.deleteStudent(id);
    }

    public void detailStudent() {
        System.out.println("Nhập vào id sinh viên muốn xem: ");
        int id = Config.scanner().nextInt();
        control.detailStudent(id);
    }
    public void sort(){

    }

    private List<Student> getList() {
        return control.showList();
    }
}
