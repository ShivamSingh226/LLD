package splitwise;

import java.util.List;
import java.util.Map.Entry;

import splitwise.Expense.Split.Split;
import splitwise.User.User;

public class BalanceSheetController {
	public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {
		UserExpenseBalanceSheet paidByUser=expensePaidBy.getUserExpenseBalanceSheet();
		paidByUser.setTotalAmount(totalExpenseAmount+paidByUser.getTotalAmount());
		for(Split split:splits) {
			User userOwe=split.getUser();
			UserExpenseBalanceSheet oweExpenseUserSheet=userOwe.getUserExpenseBalanceSheet();
			double oweAmount=split.getAmountOwe();
			if(expensePaidBy.getUserId().equals(userOwe.getUserId())) {
				paidByUser.setTotalYourExpense(paidByUser.getTotalYourExpense()+oweAmount);
			}else {
				paidByUser.setAmountThatYouGetBack(paidByUser.getAmountThatYouGetBack()+oweAmount);
				Balance userOweBalance;
				if(paidByUser.getUsersVsBalance().containsKey(userOwe.getUserId())) {
					userOweBalance=paidByUser.getUsersVsBalance().get(userOwe.getUserId());
				}else {
					userOweBalance=new Balance();
					paidByUser.getUsersVsBalance().put(userOwe.getUserId(), userOweBalance);
				}
				userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack()+oweAmount);
				
				
				//Now setting the balance sheet of garib and chindi users of splitwise
				
				oweExpenseUserSheet.setAmountThatYouOwe(oweExpenseUserSheet.getAmountThatYouOwe()+oweAmount);
				oweExpenseUserSheet.setTotalYourExpense(oweExpenseUserSheet.getTotalYourExpense()+oweAmount);
				Balance userPaidBalance;
				if(oweExpenseUserSheet.getUsersVsBalance().containsKey(expensePaidBy.getUserId())) {
					userPaidBalance=oweExpenseUserSheet.getUsersVsBalance().get(expensePaidBy.getUserId());
				}else {
					userPaidBalance=new Balance();
					oweExpenseUserSheet.getUsersVsBalance().put(expensePaidBy.getUserId(), userPaidBalance);
				}
				userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe()+oweAmount);
			}
		}
	}
	public void showBalanceSheetOfUser(User user) {

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet =  user.getUserExpenseBalanceSheet();
        
        
        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getAmountThatYouGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getAmountThatYouOwe());
        System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalAmount());
        
        for(Entry<String, Balance> entry:userExpenseBalanceSheet.getUsersVsBalance().entrySet()) {
        	String userId=entry.getKey();
        	Balance balance=entry.getValue();
        	System.out.println("userID:" + userId + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }
        System.out.println("---------------------------------------");

	}
}
