package vendingMachine.States.Impl;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.States.State;

public class SelectionState implements State {
	public SelectionState() {
		System.out.println("Currently Vending Machine is in Selection State");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("You can't click on Insert coin button while selecting");
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
	    throw new Exception("you can not insert Coin in selection state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		Item item =machine.getInventory().getItem(codeNumber);
		
		int paidByUser = 0;
        for(Coin coin : machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }else if(paidByUser>=item.getPrice()) {
        	if(paidByUser > item.getPrice()) {
                getChange(paidByUser-item.getPrice());
            }
        	machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }

	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Returned the change in Coin Dispense Tray"+returnChangeMoney);
		return returnChangeMoney;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Item cannot be dispensed in a selection state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Returned the full Money back in Coin Dispense Tray");
		machine.setVendingMachineState(new IdleState(machine));
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Inventory cannot be updted in Selection State");
	}
	
}
