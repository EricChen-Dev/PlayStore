
public class Book extends Reading {
	private String authors[];
	
	// constructor
	public Book(String ID, String applicationName, double price, String publisher, String genre, int numberOfPages, String authors[]) {
		this.ID = ID;
		this.applicationName = applicationName;
		this.price = price;
		this.publisher = publisher;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
		this.authors = authors;
	}

	// getters & setters
	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	
}
