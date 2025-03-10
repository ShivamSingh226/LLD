package designATM;

public class ATMRoom {
	ATM atm;
	User user;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMRoom atmRoom=new ATMRoom();
		atmRoom.initialize();
		atmRoom.atm.printCurrentATMStatus();
		atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
		atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentATMStatus();


	}
	private void initialize() {
		atm=ATM.getAtmObject();
		atm.setAtmBalance(3500, 1,2,5);
		this.user=createUser();
	}
	private User createUser() {
		User user=new User();
		user.setCard(createCard());
		return user;
	}
	private Card createCard() {
		Card card=new Card();
		card.setBankAccount(createBankAccount());
		return card;
	}
	private BankAccount createBankAccount() {
		BankAccount bankAccount=new BankAccount();
		bankAccount.balance=3000;
		return bankAccount;
	}
	

}
