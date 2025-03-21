package inventoryMS;

import java.util.List;

public class UserController {
	List<User> usersList;

	public UserController(List<User> usersList) {
		this.usersList = usersList;
	}
	public void addUser(User user) {
		usersList.add(user);
	}
	public void removeUser(User user) {
		usersList.remove(user);
	}
	public User getUser(int userId) {
		for(User user:usersList) {
			if(user.userId==userId) {
				return user;
			}
		}
		return null;
	}
	
}
