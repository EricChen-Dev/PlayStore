import java.util.ArrayList;

public class User {
	
	private String ID;
	private String name;
	private String phoneNumber;
	private double balance;
	private OS phone;
	private boolean isPremium;
	private ArrayList<Content> contents;
	
	// constructor
	public User(String ID, String name, String phoneNumber, double balance, OS phone) {
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.phone = phone;
		this.isPremium = false;
		this.contents = new ArrayList<Content>();
	}
	
	public void becomePremium() throws Exception {
		if (balance >= 100) {
			balance -= 100;
			isPremium = true;
		} else {
			throw new Exception("Balance is not enough!");
		}
	}
	
	public void buyContent(Content content) throws Exception {
		// check game type
		if (content instanceof Game) {
			Game game = (Game) content;
			OS os = game.getOperatingSystem();
			if (!os.getType().equals(phone.getType())) {
				throw new Exception("The type of OS is not match!");
			}
			if (os.getVersion() > phone.getVersion()) {
				throw new Exception("The os version is too low.");
			}
		}
		// check if is premium user
		double price = content.getPrice();
		if (isPremium) {
			price = 0.8 * price;
		}
		// check balance
		if (balance >= price) {
			balance -= price;
			content.setNumberOfDownload(content.getNumberOfDownload() + 1);
		} else {
			throw new Exception("Balance is not enough!");
		}
		// add to contents
		this.contents.add(content);
		System.out.format("%s buy %s successful!\n", name, content.getApplicationName());
	}
	
	public void showContentBought() {
		System.out.println("Content:");
		for (Content content: contents) {
			System.out.println(content.getID() + " " + content.getApplicationName());
		}
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public OS getPhone() {
		return phone;
	}
	
	public void setPhone(OS phone) {
		this.phone = phone;
	}

	public boolean isPremium() {
		return isPremium;
	}
}
