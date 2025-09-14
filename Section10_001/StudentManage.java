package Section10_001;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int count = 0;
        do {
            System.out.println("****** QUAN LI SINH VIEN *******\n" +
                    "1.Nhap thong tin sinh vien \n" +
                    "2.Hien thi danh sach sinh vien \n" +
                    "3.Thoat\n");
            System.out.println("Nhap vao su lua chon cua ban ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    int addNumber = 0;
                    System.out.println("Nhap vao so luong sinh vien ban muon them moi");
                    try {
                        addNumber = Integer.parseInt(scanner.nextLine());
                        count = count + addNumber;
                    } catch (InputMismatchException e) {
                        System.err.println("Error : Vui long nhap 1 so nguyen");
                    }
                    for (int i = 0; i < addNumber; i++) {
                        try {
                            System.out.print("Nhap ten sinh vien :");
                            String studentName = scanner.nextLine();

                            System.out.println("Nhap tuoi sinh vien :");
                            int studentAge = Integer.parseInt(scanner.nextLine());

                            System.out.println("Nhap vao so diem sinh vien :");
                            double studentScore = Double.parseDouble(scanner.nextLine());

                            //them sinh vien vao list
                            students.add(new Student(studentName, studentAge, studentScore));

                        } catch (NumberFormatException e) {
                            System.err.println("Error : Vui long nhap dung dinh dang cua thong tin");
                            i--;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long nhap lua chon tu 1-3");
            }
        } while (true);
    }




}
