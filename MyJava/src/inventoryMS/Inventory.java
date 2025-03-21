package inventoryMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Inventory {
	List<ProductCategory> productCategoryList;
	Inventory(){
		productCategoryList=new ArrayList<>();
	}
	public void addCategory(int categoryId, String name, int price) {
		ProductCategory productCategory=new ProductCategory();
		productCategory.price=price;
		productCategory.productCategoryName=name;
		productCategory.productCategoryId=categoryId;
		productCategoryList.add(productCategory);
	}
	public void addProduct(Product product, int productCategoryId) {
		ProductCategory productCategory=null;
		for(ProductCategory category:productCategoryList) {
			if(category.productCategoryId==productCategoryId) {
				productCategory=category;
			}
		}
		if(productCategory!=null) {
			productCategory.addProduct(product);
		}
	}
	public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {
		for(Entry<Integer,Integer> entry:productCategoryAndCountMap.entrySet()) {
			ProductCategory pCategor=getProductCategoryFromID(entry.getKey());
			pCategor.removeProduct(entry.getValue());
		}
	}
	private ProductCategory getProductCategoryFromID(int productCategoryId){

        for(ProductCategory productCategory : productCategoryList){

            if(productCategory.productCategoryId == productCategoryId){
                return productCategory;
            }
        }

        return null;
    }

}
