import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Order <T extends OrderType>{

    private int orderId;
    private String customerName;
    private LocalDate date;
    private double totalPrice;
    private ArrayList<Product> productList;
    private T orderType;

    public Order(int orderId, String customerName, double totalPrice, LocalDate date, T orderType){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.date = date;
        this.orderType = orderType ;
    }

    public void printOrderType(){
        System.out.println(this.orderType.toString());
    }

    public int getOrderId(){
        return orderId;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public void processOrder(){

    }
    public LocalDate getOrderDate(){
        return this.date;
    }

    public String toString(){
        return "Order id: "+orderId+" order Type: " + (orderType != null ? orderType.toString() : "Order type not specified." )+ " Order date: "+ date.toString();
    }

    public T getOrderType(){
        return orderType;
    }
}
