package vendingMachine;

public class Inventory {
	ItemShelf[] inventory=null;
	Inventory(int itemCount){
		inventory=new ItemShelf[itemCount];
		initialEmptyInventory();
	}
	
	  public ItemShelf[] getInventory() {
		return inventory;
	}

	public void setInventory(ItemShelf[] inventory) {
		this.inventory = inventory;
	}

	public void initialEmptyInventory() {
	        int startCode = 101;
	        for (int i = 0; i < inventory.length; i++) {
	            ItemShelf space = new ItemShelf();
	            space.setCode(startCode);
	            space.setSoldOut(true);
	            inventory[i]= space;
	            startCode++;
	        }
	}
	public void addItem(Item item, int codeNumber) throws Exception{
		for(ItemShelf itemShelf:inventory) {
			if(itemShelf.getCode()==codeNumber) {
				if(itemShelf.isSoldOut()) {
					itemShelf.setItem(item);
					itemShelf.setSoldOut(false);
				}else {
					throw new Exception("Item already present");
				}
			}
		}
	}
	public Item getItem(int codeNumber) throws Exception{
		for (ItemShelf itemShelf : inventory) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");

	}
	public void updateSoldOutItem(int codeNumber) {
		for(ItemShelf itemShelf:inventory) {
			if(itemShelf.getCode()==codeNumber) {
				itemShelf.setSoldOut(true);
			}
		}
	}

}
