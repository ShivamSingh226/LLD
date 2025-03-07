package vendingMachine.States.Impl;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.States.State;

public class HasMoneyState implements State {
	public HasMoneyState() {
		System.out.println("Currently machine is in HasMoneyState");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		machine.setVendingMachineState(new SelectionState());
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Accepted the coin");
		machine.getCoinList().add(coin);
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("you need to click on start product selection button first");
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("you can not get change in hasMoney state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("product can not be dispensed in hasMoney state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Returned the full amount money back in the tray");
		machine.setVendingMachineState(new IdleState(machine));
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("You do not update money in the hasMoneyState");
	}
	
}
