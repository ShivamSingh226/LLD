package designATM.ATMStates;

import designATM.ATM;
import designATM.Card;
import designATM.TransactionType;

public abstract class ATMState {
	public void insertCard(ATM atm, Card card) {
		System.out.println("OOPS! Something Gone Wrong");
	}
	public void authenticatePin(ATM atm, Card card, int pin) {
		System.out.println("OOPS! Something Gone Wrong");
	}
	public void selectOperation(ATM atm,Card card, TransactionType txType) {
		System.out.println("OOPS! Something Gone Wrong");
	}
	public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {
		System.out.println("OOPS! Something Gone Wrong");
	}
	public void displayBalance(ATM atm, Card card) {
		System.out.println("OOPS! Something Gone Wrong");
	}
	public void returnCard() {
		System.out.println("OOPS! Something Gone Wrong");
	}
	public void exit(ATM atm) {
		System.out.println("OOPS! Something Gone Wrong");
	}
}
