import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Order> orderList = new ArrayList<>();
    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void executeOrder() {
        orderList.forEach(Order::execute);
    }
}
