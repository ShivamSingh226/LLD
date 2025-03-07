package vendingMachine.States.Impl;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.States.State;

public class DispenseState implements State {
	DispenseState(VendingMachine vendingMachine,int codeNumber) throws Exception{
		System.out.println("Currently, Machine is dispensing the product");
		dispenseProduct(vendingMachine, codeNumber);
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cannot click insert coin while dispensing");
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cannot select product while dispensing");
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cannot insert coin while dispensing");
		
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cannot shoose product while dispensing");
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("change cannot be returned while dispensing");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Product has been dispensed");
		Item item=machine.getInventory().getItem(codeNumber);
		machine.getInventory().updateSoldOutItem(codeNumber);
		machine.setVendingMachineState(new IdleState(machine));
		return item;
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cannot get refund while dispensing");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cannot update inventory while dispensing");
	}
	
}
