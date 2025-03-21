package inventoryMS;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	Map<Integer,Integer> productCategoryIdvsCount;
	Cart(){
		productCategoryIdvsCount=new HashMap<>();
	}
	public void addItemToCart(int productCategoryId, int count) {
		if(productCategoryIdvsCount.containsKey(productCategoryId)) {
			int noOfItems=productCategoryIdvsCount.get(productCategoryId);
			productCategoryIdvsCount.put(productCategoryId, noOfItems+count);
		}else {
			productCategoryIdvsCount.put(productCategoryId, count);
		}
	}
	public void removeItemFromCart(int productCategoryId,int count) {
		if(productCategoryIdvsCount.containsKey(productCategoryId)) {
			int noOfItems=productCategoryIdvsCount.get(productCategoryId);
			if(noOfItems-count==0) {
				productCategoryIdvsCount.remove(productCategoryId);
			}else {
				productCategoryIdvsCount.put(productCategoryId, noOfItems-count);
			}
			
		}
	}
	public void emptyCart(){
        productCategoryIdvsCount = new HashMap<>();
    }
	public  Map<Integer, Integer> getCartItems(){

        return productCategoryIdvsCount;
    }


}
