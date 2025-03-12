package splitwise.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
	@Override
	public void validateSplitRequest(List<Split> requests, double totalAmount) {
		double amountToBePresent=totalAmount/requests.size();
		for(Split split:requests) {
			if(split.getAmountOwe()!=amountToBePresent) {
				
			}
		}
	}
}
