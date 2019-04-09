
public class OS {
	private String type;
	private int version;
	
	// constructor
	public OS(String type, int version) {
		this.type = type;
		this.version = version;
	}
	
	// getters & setters
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
}
