import java.util.ArrayList;

public class Content {
	protected String ID;
	protected String applicationName;
	protected String Genre;
	protected int numberOfDownload;
	protected double price;
	protected ArrayList<Comment> reviews;
	
	// constructor
	public Content() {
		this.reviews = new ArrayList<Comment>();
		this.numberOfDownload = 0;
	}
	
	public void addReview(Comment comment) {
		this.reviews.add(comment);
	}
	
	public void showReviews() {
		// show review
		for (Comment review: reviews) {
			System.out.format("%s (%s): %s\n", review.getUser().getName(), review.getUser().getID(), review.getComment());
			String indent = "\t";
			// show replies
			for (Comment replay: review.getReplies()) {
				System.out.print(indent);
				indent += "\t";
				System.out.format("%s (%s): %s\n", replay.getUser().getName(), replay.getUser().getID(), replay.getComment());
			}
		}
	}
	
	// getters & setters
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getApplicationName() {
		return applicationName;
	}
	
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	public int getNumberOfDownload() {
		return numberOfDownload;
	}
	
	public void setNumberOfDownload(int numberOfDownload) {
		this.numberOfDownload = numberOfDownload;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ArrayList<Comment> getReviews() {
		return reviews;
	}
	
	public void setReviews(ArrayList<Comment> reviews) {
		this.reviews = reviews;
	}
	
	public String getGenre()
	{
		return Genre;
	}
	
	public void setGenre(String genre)
	{
		this.Genre=genre;
		
	}
}
