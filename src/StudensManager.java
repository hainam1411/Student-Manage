import java.util.ArrayList;
import java.util.Scanner;

public class StudensManager {
    public static ArrayList<Students> studentList = new ArrayList<>();

    public static void addStudent(Scanner scanner) {
        System.out.println("Nhập ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập Tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập Email:");
        String email = scanner.nextLine();
        System.out.println("Nhập GPA:");
        double GPA = scanner.nextDouble();
        Students student = new Students(id, name, email, GPA);
        studentList.add(student);
    }


    public void displayAll() {
        System.out.println("Danh sach sinh vien: ");
        for (Students student : studentList) {
            System.out.println(student);
        }
    }

    public static void removeStudent(Scanner scanner) {
        System.out.println("Nhap id can xoa: ");
        int removeId = scanner.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == removeId) {
                indexToRemove = i;
                break;
            }
        }
    }

    public void checkGPA() {
        System.out.println("Danh sách sinh viên có GPA lớn hơn 8:");
        for (Students student : studentList) {
            if (student.getGPA() > 8.0) {
                System.out.println(student);
            }
        }
    }
}



