package splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
	Map<String, Balance> usersVsBalance;
	double amountThatYouOwe;
	double amountThatYouGetBack;
	double totalAmount;
	double totalYourExpense;
	public UserExpenseBalanceSheet() {
		
		this.usersVsBalance = new HashMap<>();
		this.amountThatYouOwe = 0;
		this.amountThatYouGetBack = 0;
		this.totalYourExpense = 0;
	}
	public double getAmountThatYouOwe() {
		return amountThatYouOwe;
	}
	public Map<String, Balance> getUsersVsBalance() {
		return usersVsBalance;
	}
	public void setUsersVsBalance(Map<String, Balance> usersVsBalance) {
		this.usersVsBalance = usersVsBalance;
	}
	public double getTotalYourExpense() {
		return totalYourExpense;
	}
	public void setTotalYourExpense(double totalYourExpense) {
		this.totalYourExpense = totalYourExpense;
	}
	public void setAmountThatYouOwe(double amountThatYouOwe) {
		this.amountThatYouOwe = amountThatYouOwe;
	}
	public double getAmountThatYouGetBack() {
		return amountThatYouGetBack;
	}
	public void setAmountThatYouGetBack(double amountThatYouGetBack) {
		this.amountThatYouGetBack = amountThatYouGetBack;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
