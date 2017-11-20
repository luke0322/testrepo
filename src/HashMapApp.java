import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
	private static HashMap<String, User> users = new HashMap<>();
public static void main(String[] args) {
	System.out.println("hello");
	
	populateMap();
	
	for(Map.Entry user: users.entrySet()) {
		System.out.println("Userkey: " + user.getKey() + "uservalue: " + user.getValue());
	}
	String uString = "";
	while(!uString.equalsIgnoreCase("exit")) {
		uString = Console.getString("username?: ");
		System.out.println("user selected: "+ users.get(uString));
	}
	System.out.println("bye");
	}
public static void populateMap() {
	User u1 = new User (0, "sblessing", "pwd " , "Sean" , "Blessing" , "513-600-7096" , "sblessing@test.com",false,false);
	User u2 = new User (1, "lhinegardner", "pwd " , "Luke" , "Hinegardner" , "937-681-8495" , "lhinegardner@test.com",false,false);
	User u3 = new User (2, "epitt", "pwd " , "Eric" , "Pitt" , "513-210-7096" , "epitt@test.com",false,false);
	
	users.put(u1.getUsername(), u1);
	users.put(u2.getUsername(), u2);
	users.put(u3.getUsername(), u3);
	}
}
