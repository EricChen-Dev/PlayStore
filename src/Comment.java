

import java.util.ArrayList;

public class Comment {
	private User user;
	private String comment;
	private ArrayList<Comment> replies;
	
	// constructor
	public Comment(User user, String comment) {
		this.user = user;
		this.comment = comment;
		this.replies = new ArrayList<Comment>();
	}
	
	// getters & setters
	public void addReply(Comment reply) {
		replies.add(reply);
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public ArrayList<Comment> getReplies() {
		return replies;
	}
}
