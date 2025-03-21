package inventoryMS;

import java.util.Map;

public class Warehouse {
	Inventory inventory;
	Address address;
	public void removeItemFromInventory(Map<Integer,Integer> productAndCountMap) {
		inventory.removeItems(productAndCountMap);
	}
	public void addItemToInventory(Map<Integer,Integer> productAndCountMap) {
		
	}
	
}
