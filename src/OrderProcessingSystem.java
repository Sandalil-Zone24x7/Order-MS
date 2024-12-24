import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderProcessingSystem {

    private List<Order> orderList = new ArrayList<>();

    public void OrderProcessingSystem(){
        this.orderList = new ArrayList<>();
    }

    //Method to add order to the order list
    public <T extends OrderType> void addOrder(Order<T> order) {
        this.orderList.add(order);
    }

    //Sort the orders by Id
    public List<Order> SortOrderById(){
        System.out.println("Sorting based on the order amount.");
        return orderList.stream().sorted(Comparator.comparingInt(Order::getOrderId)).toList();
    }

    //sort the orders based on the date
    public List<Order> SortOrderByDate(){
        System.out.println("Sorting based on the order date.");
        return orderList.stream().sorted(Comparator.comparingDouble(Order::getOrderId)).toList();
    }

    //filter the orders by date
    public List<Order> filterOrderByDate(LocalDate date){
        System.out.println("Filtering based on the order date: " + date.toString());
        return orderList.stream()
                .filter(order -> order.getOrderDate().equals(date))
                .toList();
    }

    //filter based on ordertype(Instore / online)
    public List<Order> filterBasedOnType(String type){
        System.out.println("Filtering based on the type: "+ type);
        return orderList.stream()
                .filter(order -> order.getOrderType().getClass().getSimpleName().equals(type))
                .toList();
    }

    //filter order based on the amount
    public List<Order> filterOrderByAmount(double amount){
        System.out.println("Filtering based on the order amount:" +amount);
        return orderList.stream().
                filter(order -> order.getTotalPrice() >= amount)
                .toList();

    }
    //Getter for the order list
    public  List<Order> getOrderList(){
        return this.orderList;
    }

    //Method to print the order list
    public void printOrderList(){
        System.out.println("Printing the full list of orders:");
        orderList.forEach(order-> System.out.println(order.toString()));
        System.out.println();

    }

}
