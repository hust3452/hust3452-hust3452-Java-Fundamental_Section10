package Section10_006;

import java.util.ArrayList;

public class OrderManage implements Manage<Order> {
    ArrayList<Order> Orders = new ArrayList<Order>();

    @Override
    public void add(Order item) {
    Orders.add(item);
    System.out.println("Da them don hang thanh cong");
    }

    @Override
    public void update(int index, Order item) {
            Orders.set(index, item);
    }

    @Override
    public void delete(int item) {
        Orders.remove(item);

    }

    @Override
    public void display() {
        if (Orders.size() > 0) {
            for (int i = 0; i < Orders.size(); i++) {
                System.out.println(Orders.get(i));
            }
        }else{
            System.out.println("Khong co don hang nao");
        }
    }
}
