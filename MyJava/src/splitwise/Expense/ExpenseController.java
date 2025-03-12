package splitwise.Expense;

import java.util.List;

import splitwise.BalanceSheetController;
import splitwise.Expense.Split.ExpenseSplit;
import splitwise.Expense.Split.Split;
import splitwise.User.User;

public class ExpenseController {
	BalanceSheetController balanceSheetController;

	public ExpenseController() {
		balanceSheetController=new BalanceSheetController();
	}
	public Expense createExpense(String expenseId, String description, double expenseAmount,
            List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser
) {
		ExpenseSplit expenseSplit =SplitFactory.getSplitObject(splitType);
		expenseSplit.validateSplitRequest(splitDetails, expenseAmount);
		Expense expense=new Expense(expenseId,description,expenseAmount,paidByUser,splitType,splitDetails );
		balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
		return expense;
	}
	
}
