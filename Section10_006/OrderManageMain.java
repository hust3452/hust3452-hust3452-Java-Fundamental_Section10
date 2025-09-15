package Section10_006;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderManageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManage manage = new OrderManage();

        do {
            System.out.println("********** QUAN LI DON HANG ********\n" +
                    "1.Them don hang\n" +
                    "2.Sua don hang\n" +
                    "3.Xoa don hang\n" +
                    "4.Hien thi danh sach don hang\n" +
                    "5.Thoat");
            System.out.println("Nhap vao su lua chon cua ban");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhap ma don hang");
                        int orderId = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhap ten khach hang");
                        String orderName = scanner.nextLine();
                        Order order = new Order(orderId, orderName);
                        manage.add(order);
                        break;
                    case 2:
                        manage.display();
                        System.out.println("Nhap Id don hang can sua");
                        int updateOrderId = Integer.parseInt(scanner.nextLine());
                        int index=-1;

                        for (int i=0;i< manage.Orders.size();i++){
                        if(manage.Orders.get(i).getOrderId() == updateOrderId){
                            index=i;
                            System.out.println("Nhap vao ten khach hang moi");
                            String updateOrderName = scanner.nextLine();
                            manage.update(index,new Order(updateOrderId,updateOrderName));
                            break;
                        }
                        }
                        if (index!=-1){
                            System.out.println("Khong tim thay gia tri nao phu hop");
                        }
                        break;
                    case 3:
                        manage.display();
                        System.out.println("Nhap Id don hang can sua");
                        int deleteOrderId = Integer.parseInt(scanner.nextLine());
                        int deleteIndex=-1;

                        for (int i=0;i< manage.Orders.size();i++){
                            if(manage.Orders.get(i).getOrderId() == deleteOrderId){
                                deleteIndex=i;
                                manage.delete(deleteIndex);
                                break;
                            }
                        }
                        if (deleteIndex!=-1){
                            System.out.println("Khong tim thay gia tri nao phu hop");
                        }
                        break;
                    case 4:
                        manage.display();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Vui long nhap cac lua chon tu 1-5");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error : Vui long nhap dung dinh dang cua thong tin");
            }
        } while (true);
    }
}
