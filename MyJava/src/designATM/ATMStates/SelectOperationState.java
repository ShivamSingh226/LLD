package designATM.ATMStates;

import designATM.ATM;
import designATM.Card;
import designATM.TransactionType;

public class SelectOperationState extends ATMState {
	public SelectOperationState() {
		
	}
	@Override
	public void selectOperation(ATM atm, Card card, TransactionType txnType) {
		switch(txnType) {
			case CASH_WITHDRAWAL:
				atm.setCurrentATMState(new CashWithdrawalState());
				break;

			case BALANCE_CHECK:
				atm.setCurrentATMState(new CheckBalanceState());
				break;
			default: {
                System.out.println("Invalid Option");
                exit(atm);
            }

		}
	}
	@Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }

}
