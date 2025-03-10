package designATM.ATMStates;

import designATM.ATM;
import designATM.Card;
import designATM.AmountWithdrawal.*;
public class CashWithdrawalState extends ATMState {
	public CashWithdrawalState() {
		System.out.println("Please enter the amount");
	}
	public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest) {
		if(atm.getAtmBalance()<withdrawalAmountRequest) {
			System.out.println("Insufficient funds in ATM");
			exit(atm);
		}else if(card.getBankBalance()<withdrawalAmountRequest) {
			System.out.println("Insufficient funds in your Bank Account");
			exit(atm);
		}else {
			card.deductBankBalance(withdrawalAmountRequest);
			atm.deductATMBalance(withdrawalAmountRequest);
			CashWithdrawProcessor cashWithdrawProcessor=new TwoThousandProcessor(new FiveHundredProcessor(new OneHundredProcessor(null)));
			cashWithdrawProcessor.withdraw(atm, withdrawalAmountRequest);
			exit(atm);
		}
	}
	@Override
	public void returnCard() {
		// TODO Auto-generated method stub
		System.out.println("Please collect your card");
	}
	@Override
	public void exit(ATM atm) {
		// TODO Auto-generated method stub
		returnCard();
		atm.setCurrentATMState(new IdleState());
		System.out.println("Exit happens");
	}
	
}
