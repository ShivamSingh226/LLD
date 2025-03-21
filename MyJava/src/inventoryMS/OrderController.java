package inventoryMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {
	List<Order> ordersList;
	Map<Integer,List<Order>>userIdVsOrders;
	OrderController(){
		ordersList=new ArrayList<>();
		userIdVsOrders=new HashMap<>();
	}
	public Order createNewOrder(User user, Warehouse warehouse) {
		Order order=new Order(user,warehouse);
		ordersList.add(order);
		if(userIdVsOrders.containsKey(user.userId)) {
			List<Order> uIdOrder=userIdVsOrders.get(user.userId);
			uIdOrder.add(order);
			userIdVsOrders.put(user.userId, uIdOrder);
		}else {
			List<Order> uIdOrder=new ArrayList<>();
			uIdOrder.add(order);
			userIdVsOrders.put(user.userId, uIdOrder);
		}
		return order;
	}
	public void removeOrder(Order order){

        //remove order capability goes here
    }
	public List<Order> getOrderByCustomerId(int userId){
        return null;
    }

    public Order getOrderByOrderId(int orderId){
        return null;
    }


}
