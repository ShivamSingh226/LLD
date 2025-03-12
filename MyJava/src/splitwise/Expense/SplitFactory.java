package splitwise.Expense;
import splitwise.Expense.Split.EqualExpenseSplit;
import splitwise.Expense.Split.ExpenseSplit;
import splitwise.Expense.Split.UnequalExpenseSplit;
import splitwise.Expense.Split.PercentageExpenseSplit;
public class SplitFactory {
	public static ExpenseSplit getSplitObject(ExpenseSplitType expenseSplitType) {
		switch(expenseSplitType) {
			case EQUAL:
				return new EqualExpenseSplit();
			case UNEQUAL:
				return new UnequalExpenseSplit();
			case PERCENTAGE:
				return new PercentageExpenseSplit();
			default:
				return null;

		}

	}
}
