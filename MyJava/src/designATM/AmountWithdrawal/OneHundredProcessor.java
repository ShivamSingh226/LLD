package designATM.AmountWithdrawal;

import designATM.ATM;

public class OneHundredProcessor extends CashWithdrawProcessor {
	public OneHundredProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
		super(nextCashWithdrawProcessor);
	}
	public void withdraw(ATM atm,int remainingAmount) {
		int required=remainingAmount/100;
		int balance=remainingAmount%100;
		if(required<=atm.getNoOfOneHundredNotes()) {
			atm.deductOneHundredNotes(balance);
		}else if(required>atm.getNoOfOneHundredNotes()) {
			atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
			balance=balance+(required-atm.getNoOfOneHundredNotes())*100;
		}
		if(balance!=0) {
			super.withdraw(atm, balance);
		}
	}
}
