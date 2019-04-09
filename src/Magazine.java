
public class Magazine extends Reading {
	private String title;
	
	// constructor
	public Magazine(String ID, String applicationName, double price, String publisher, String genre, int numberOfPages, String title) {
		this.ID = ID;
		this.applicationName = applicationName;
		this.price = price;
		this.publisher = publisher;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
		this.title = title;
	}

	// getters & setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
