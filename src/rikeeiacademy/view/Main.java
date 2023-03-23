package rikeeiacademy.view;

import rikeeiacademy.config.Config;

public class Main {
    public Main() {
        while (true) {
            System.out.println("***************STUDENT MANAGEMENT**********");
            System.out.println("1. Show List");
            System.out.println("2.Create Student");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Detail Student");
            System.out.println("6. Sort ");
            System.out.println("7.Out");
            System.out.println(" Nhập lựa chọn: ");
            int choice = Config.scanner().nextInt();

            switch (choice) {
                case 1:
                    new StudentView().showStudent();
                    break;
                case 2:
                    new StudentView().createStudent();
                    break;
                case 3:
                    new StudentView().updateStudent();
                    break;
                case 4:
                    new StudentView().deleteStudent();
                    break;
                case 5:
                    new StudentView().detailStudent();
                    break;
                case 6:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
