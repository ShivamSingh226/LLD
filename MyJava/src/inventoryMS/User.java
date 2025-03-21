package inventoryMS;

import java.util.ArrayList;
import java.util.List;

public class User {
	int userId;
	String userName;
	Address address;
	Cart cart;
	List<Integer> orderIds;
	public User() {
		cart=new Cart();
		orderIds=new ArrayList<>();
	}
	public Cart getUserCart() {
		return cart;
	}
}
