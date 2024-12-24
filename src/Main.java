import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OrderProcessingSystem orderProcessingSystem  = new OrderProcessingSystem();

        Order<InstoreOrder> order1 = new Order<>(1,"sandali", 23, LocalDate.of(2024, 12, 23), new InstoreOrder("Kaduwela") );
        Order<OnlineOrder> order2 = new Order<>(2,"devindie", 32, LocalDate.of(2024, 12, 24), new OnlineOrder("jfdkfldkl") );

        orderProcessingSystem.addOrder(order1);
        orderProcessingSystem.addOrder(order2);

        orderProcessingSystem.printOrderList();

        List<Order> filtered  = orderProcessingSystem.filterOrderByDate(LocalDate.of(2024, 12, 23));
        printProcessedData(filtered);

        List<Order> filteredInstoreOrders = orderProcessingSystem.filterBasedOnType("InstoreOrder");
        printProcessedData(filteredInstoreOrders);
        List<Order> filteredOnlineOrders = orderProcessingSystem.filterBasedOnType("OnlineOrder");
        printProcessedData(filteredOnlineOrders);

        List<Order> sortedBasedOnPurchaseDate = orderProcessingSystem.SortOrderByDate();
        printProcessedData(sortedBasedOnPurchaseDate);

        List<Order> sortedBasedOnId = orderProcessingSystem.SortOrderById();
        printProcessedData(sortedBasedOnId);

    }

    public static void printProcessedData(List<Order> listToPrint){
        listToPrint.forEach(order-> System.out.println(order.toString()));
        System.out.println();
    }
}