package vendingMachine;

import vendingMachine.States.State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine machine = new VendingMachine();
		try {
			    System.out.println("|");
	            System.out.println("filling up the inventory");
	            System.out.println("|");

	            fillUpInventory(machine);
	            displayInventory(machine);

	            System.out.println("|");
	            System.out.println("clicking on InsertCoinButton");
	            System.out.println("|");
	            State vendingState = machine.getVendingMachineState();
	            vendingState.clickOnInsertCoinButton(machine);

	            vendingState = machine.getVendingMachineState();
	            vendingState.insertCoin(machine, Coin.NICKEL);
	            vendingState.insertCoin(machine, Coin.QUARTER);
	           // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

	            System.out.println("|");
	            System.out.println("clicking on ProductSelectionButton");
	            System.out.println("|");
	            vendingState.clickOnStartProductSelectionButton(machine);

	            vendingState = machine.getVendingMachineState();
	            vendingState.chooseProduct(machine, 102);

	            displayInventory(machine);

 
		}catch(Exception e) {
			displayInventory(machine);
		}
	}
	private static void fillUpInventory(VendingMachine machine) {
		ItemShelf[] slots=machine.getInventory().getInventory();
		for(int i=0;i<slots.length;i++) {
			Item item=new Item();
		     if(i >=0 && i<3) {
                item.setItemType(ItemType.COKE);
                item.setPrice(12);
	         }else if(i >=3 && i<5){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(9);
            }else if(i >=5 && i<7){
               item.setItemType(ItemType.JUICE);
                item.setPrice(13);
            }else if(i >=7 && i<10){
                item.setItemType(ItemType.SODA);
                item.setPrice(7);
            }
		     slots[i].setItem(item);
		     slots[i].setSoldOut(false);
		}
	}
	private static void displayInventory(VendingMachine machine) {
		ItemShelf[] slots=machine.getInventory().getInventory();
		for(int i=0;i<slots.length;i++) {
			System.out.println("CodeNumber:"+slots[i].getCode()+"Item: "+slots[i].getItem().getItemType()+" Price: "+slots[i].getItem().getPrice()+ " isAvailable "+!slots[i].isSoldOut());
		}
	}

}
