package Section10_003;

import Section10_002.Book;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserManegement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<User> users = new LinkedList<>();

        do {
            System.out.println("********** QUAN LI NGUOI DUNG ********\n" +
                    "1.Them nguoi dung\n" +
                    "2.Tim kiem nguoi dung\n" +
                    "3.Hien thi nguoi dung\n" +
                    "4.Thoat");
            System.out.println("Nhap vao su lua chon cua ban");
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                        String regexPhone = "^(0[3|5|7|8|9])[0-9]{8}$";
                        try {
                            System.out.println("Them ten nguoi dung");
                            String name = scanner.nextLine();

                            String email;
                            do {
                                System.out.println("Them dia chi email");
                                String emailInput = scanner.nextLine();

                                if (Pattern.matches(regexEmail, emailInput)) {
                                    email = emailInput;
                                    break;
                                } else {
                                    System.out.println("Email invalid");
                                }
                            } while (true);

                            String phoneNumber;
                            do {
                                System.out.println("Them so dien thoai");
                                String phoneInput = scanner.nextLine();

                                if (Pattern.matches(regexPhone, phoneInput)) {
                                    phoneNumber = phoneInput;
                                    break;
                                } else {
                                    System.out.println("Phone invalid");
                                }
                            } while (true);

                            //luu vao hashmap
                            users.add(new User(name, email, phoneNumber));
                        } catch (Exception e) {
                            System.err.println("Error : Vui long nhap dung dinh dang ");
                        }

                        break;
                    case 2:
                        System.out.println("Nhap ten nguoi dung :");
                        String searchName = scanner.nextLine();
                        boolean found = false;
                        for (User user : users) {
                            if (user.getName().equalsIgnoreCase(searchName)) {
                                System.out.println("Tim thay"+user);
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Khong tim thay nguoi dung");
                        }
                        break;
                    case 3:
                        if (users.isEmpty()) {
                            System.out.println("Danh sach dang trong");
                        }else{
                            System.out.println("Danh sach nguoi dung :");
                            for (User user : users) {
                                System.out.println("."+user);
                            }
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Vui long nhap gia tri tu 1-4");
                }


            } catch (NumberFormatException e) {
                System.err.println("Error : Vui long nhap dung dinh dang cua thong tin");
            }

        } while (true);


    }
}



