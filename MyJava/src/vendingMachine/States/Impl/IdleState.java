package vendingMachine.States.Impl;

import java.util.ArrayList;
import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.States.State;

public class IdleState implements State {
	public IdleState() {
		System.out.println("Machine currently in Idle State");
	}
	public IdleState(VendingMachine vendingMachine) {
		System.out.println("Machine currently in Idle State");
		vendingMachine.setCoinList(new ArrayList<>());
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		machine.setVendingMachineState(new HasMoneyState());
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("First click on insert Coin button");
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("First click on insert coin button");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("First insert coin before choosing products");
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("First insert coin before getting the change");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("First insert coin before dispensing products");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Can't refund money in IdleState");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Can't update inventory in idleState");
	}
	
}
