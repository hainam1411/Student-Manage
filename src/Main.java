import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudensManager st = new StudensManager();

        while (true) {
            System.out.println("1. Them hoc sinh");
            System.out.println("2. HIen thi danh sach");
            System.out.println("3. Xoa hoc sinh");
            System.out.println("4. Hien thi hoc sinh co GPA lon hon 8");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    st.addStudent(scanner);
                    break;
                case 2:
                    st.displayAll();
                    break;
                case 3:
                    st.removeStudent(scanner);
                    break;
                case 4:
                    st.checkGPA();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Vui long nhap lua chon cua ban tư 1-5");
            }
        }
    }



}
