package splitwise.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
	List<User> usersList;
	public UserController() {
		usersList=new ArrayList<>();
	}
	public void addUser(User user) {
		usersList.add(user);
	}
	public User getUser(String userId) {
		for(User user:usersList) {
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		return null;
	}
	public List<User> getAllUsers(){
		return usersList;
	}
}
