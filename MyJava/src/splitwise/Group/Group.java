package splitwise.Group;

import java.util.ArrayList;
import java.util.List;

import splitwise.Expense.Expense;
import splitwise.Expense.ExpenseController;
import splitwise.Expense.ExpenseSplitType;
import splitwise.Expense.Split.Split;
import splitwise.User.User;

public class Group {
	String groupId;
	String groupName;
	List<Expense> expenseList;
	List<User> usersList;
	ExpenseController expenseController;
	Group(){
		usersList=new ArrayList<>();
		expenseList=new ArrayList<>();
		expenseController=new ExpenseController();
	}
	public void addMember(User user) {
		usersList.add(user);
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
	public void setGroupName(String groupName) {
	    this.groupName = groupName;
	}
	public Expense createExpense(String expenseId, String description, double expenseAmount,
			List<Split> splitDetails, ExpenseSplitType expenseSplitType,User paidByUser) {
		Expense expense =expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, expenseSplitType,paidByUser);
		expenseList.add(expense);
		return expense;
		
	}

}
