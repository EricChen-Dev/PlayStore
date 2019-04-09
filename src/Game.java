
public class Game extends Content {
	private boolean isMultiPlayer;
	private OS operatingSystem;
	
	// constructor
	public Game(String ID, String applicationName, int price, boolean isMultiPlayer, OS operatingSystem) {
		this.ID = ID;
		this.applicationName = applicationName;
		this.price = price;
		this.isMultiPlayer = isMultiPlayer;
		this.operatingSystem = operatingSystem;
	}
	
	// getters & setters
	public boolean isMultiPlayer() {
		return isMultiPlayer;
	}
	
	public void setMultiPlayer(boolean isMultiPlayer) {
		this.isMultiPlayer = isMultiPlayer;
	}
	
	public OS getOperatingSystem() {
		return operatingSystem;
	}
	
	public void setOperatingSystem(OS operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}
