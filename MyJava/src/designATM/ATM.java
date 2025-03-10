package designATM;

import designATM.ATMStates.ATMState;
import designATM.ATMStates.IdleState;

public class ATM {
	private static ATM atmObject=new ATM();
	ATMState currentATMState;
	private int atmBalance;
	int noOfTwoThousandNotes;
	int noOfFiveHundredNotes;
	int noOfOneHundredNotes;
	private ATM() {
		
	}
	public static ATM getAtmObject() {
		atmObject.setCurrentATMState(new IdleState());
		return atmObject;
	}
	public static void setAtmObject(ATM atmObject) {
		ATM.atmObject = atmObject;
	}
	public ATMState getCurrentATMState() {
		return currentATMState;
	}
	public void setCurrentATMState(ATMState currentATMState) {
		this.currentATMState = currentATMState;
	}
	public int getAtmBalance() {
		return atmBalance;
	}
	public void setAtmBalance(int atmBalance, int twoThousandNotes, int fiveHundredNotes, int oneHundredNotes) {
		this.atmBalance = atmBalance;
		this.noOfTwoThousandNotes=twoThousandNotes;
		this.noOfFiveHundredNotes=fiveHundredNotes;
		this.noOfOneHundredNotes=oneHundredNotes;
	}
	public int getNoOfTwoThousandNotes() {
		return noOfTwoThousandNotes;
	}
	public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
		this.noOfTwoThousandNotes = noOfTwoThousandNotes;
	}
	public int getNoOfFiveHundredNotes() {
		return noOfFiveHundredNotes;
	}
	public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
		this.noOfFiveHundredNotes = noOfFiveHundredNotes;
	}
	public int getNoOfOneHundredNotes() {
		return noOfOneHundredNotes;
	}
	public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
		this.noOfOneHundredNotes = noOfOneHundredNotes;
	}
	public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }


}
