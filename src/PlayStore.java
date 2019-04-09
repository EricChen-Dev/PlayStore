
import java.util.HashMap;
import java.util.ArrayList;

public class PlayStore {
	
	// whatever variables you need here.
	// They must all be marked as private
	
	// Declare a private variable (array or similar) to store your Content objects here
	private HashMap<String, Content> contents;
	
	// Declare a private variable (array or similar) to store your User objects here
	private ArrayList<User> users;
	
	public PlayStore() {
		contents = new HashMap<String, Content>();
		users = new ArrayList<User>();
	}
	
	public void add(String id, Content content) {
		contents.put(id, content);
	}
	
	public void add(User user) {
		users.add(user);
	}
	
	
	public void showReadingOfGenre(String genre) {
		System.out.println(genre + ":");
		for (Content value: contents.values()) {
			if (value instanceof Reading && value.getGenre()==genre) {
				System.out.println(value.getID() + " " + value.getApplicationName());
			}
		}
	}
	
	
	public void showContent() {
		System.out.println("Content: ");
		for (Content value: contents.values()) {
			System.out.println(value.getID() + " " + value.getApplicationName());
		}
	}
	
	public void showContent(String type) {
		System.out.println(type + " Content: ");
		for (Content value: contents.values()) {
			if (value.getClass().getName().contains(type)) {
				System.out.println(value.getID() + " " + value.getApplicationName());
			}
		}
	}
	
}