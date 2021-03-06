package calendar;

import java.util.LinkedList;
import java.util.List;

public class CalendarMain {
	private List<User> userList;
	
	/**
	 * Initializes a new userList
	 */
	public CalendarMain() {
		userList = new LinkedList<User>();
	}	
	
	/**
	 * @param initialUsers  a List of already existing users
	 */
	public CalendarMain(LinkedList<User> initialUsers) {
		this.userList = initialUsers;
	}
	
	public static void main(String[] args) {
		new CalendarMain();
	}
}
