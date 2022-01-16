package instagram.oop;

public class User {
	private int id;
	private String userName;
	private String password;
	private String profileImage;
	private String explanation;
	private int numberOfFollowers;
	private int numberOfFollowings;
	
	
	public User() {
		super();
	}


	public User(int id, String userName, String password, String profileImage, String explanation,
			int numberOfFollowers, int numberOfFollowings) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.profileImage = profileImage;
		this.explanation = explanation;
		this.numberOfFollowers = numberOfFollowers;
		this.numberOfFollowings = numberOfFollowings;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	public int getNumberOfFollowers() {
		return numberOfFollowers;
	}


	public int getNumberOfFollowings() {
		return numberOfFollowings;
	}
	
	
}
