package splitwise.User;

import splitwise.UserExpenseBalanceSheet;

public class User {
	String userId;
	String userName;
	UserExpenseBalanceSheet userExpenseBalanceSheet;
	
	public User(String userId, String userName) {
		this.userId=userId;
		this.userName=userName;
		userExpenseBalanceSheet=new UserExpenseBalanceSheet();
	}
	public String getUserId() {
		return userId;
	}
	public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
		return userExpenseBalanceSheet;
	}
}
