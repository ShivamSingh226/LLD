package splitwise.Expense.Split;

import java.util.List;

public interface ExpenseSplit {
	public void validateSplitRequest(List<Split> splitRequestLists, double Amount);
}
