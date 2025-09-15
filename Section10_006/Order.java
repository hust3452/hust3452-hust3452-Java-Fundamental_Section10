package Section10_006;

public class Order {
    private int orderId;
    private String customerName;

    //contruction
  public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    //setter getter
   public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId : " + orderId +
                ", customerName : " + customerName +
                '}';
    }
}
