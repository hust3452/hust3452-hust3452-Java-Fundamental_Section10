package Section10_002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Book> books = new HashMap<>();


        do {
            System.out.println("********** QUAN LI SACH ********\n" +
                    "1.Them sach\n" +
                    "2.Tim kiem sach\n" +
                    "3.Hien thi danh sach\n" +
                    "4.Thoat");
            System.out.println("Nhap vao su lua chon cua ban");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        try{
                            System.out.println("Them ten sach");
                            String bookName = scanner.nextLine();
                            System.out.println("Them ten tac gia");
                            String authorName = scanner.nextLine();
                            System.out.println("Them nam xuat ban");
                            int publicYear = Integer.parseInt(scanner.nextLine());

                            //luu vao hashmap
                            books.put(bookName, new Book(bookName,authorName, publicYear));
                        }
                        catch (Exception e) {
                            System.err.println("Error : Vui long nhap dung dinh dang ");
                        }
                        break;
                    case 2:
                        System.out.println("Nhap vao ten sach can tim:");
                        String searchBook = scanner.nextLine();

                        if(books.containsKey(searchBook)) {
                            System.out.println(searchBook+ " " +books.get(searchBook));
                        }
                        else{
                            System.out.println("Khong tim thay ten sach phu hop");
                        }
                        break;
                    case 3:
                        if(books.isEmpty()){
                            System.out.println("Du lieu hien dang trong!!!!!!");
                        }else {
                            for (HashMap.Entry<String, Book> entry : books.entrySet()) {
                                System.out.println(entry.getKey() + " : " + entry.getValue());
                            }
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Vui long nhap so thu tu tu 1-4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error : Vui long nhap dung dinh dang cua thong tin");
            }

        } while (true);
    }
}
