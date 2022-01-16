package instagram.oop;

public class Post {
	private int idPost;
	private String image;
	private String imageDescription;
	private int likeNumber;
	private String comment;
	private double dateTime;
	
	public Post() {
		super();
	}

	public Post(int idPost, String image, String imageDescription, int likeNumber, String comment, double dateTime) {
		super();
		this.idPost = idPost;
		this.image = image;
		this.imageDescription = imageDescription;
		this.likeNumber = likeNumber;
		this.comment = comment;
		this.dateTime = dateTime;
	}

	public int getIdPost() {
		return idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getLikeNumber() {
		return likeNumber;
	}

	public double getDateTime() {
		return dateTime;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}
	
	

}
