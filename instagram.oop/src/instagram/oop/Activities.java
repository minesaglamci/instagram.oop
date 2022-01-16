package instagram.oop;

public class Activities {
	private int idActivities;
	private String notifications;
	private String followingRequests;
	private int numberOfFollowingRequests;
	private String profilePhotos;
	
	
	public Activities() {
		super();
	}


	public Activities(int idActivities, String notifications, String followingRequests, int numberOfFollowingRequests,
			String profilePhotos) {
		super();
		this.idActivities = idActivities;
		this.notifications = notifications;
		this.followingRequests = followingRequests;
		this.numberOfFollowingRequests = numberOfFollowingRequests;
		this.profilePhotos = profilePhotos;
	}


	public int getIdActivities() {
		return idActivities;
	}


	public void setIdActivities(int idActivities) {
		this.idActivities = idActivities;
	}


	public String getFollowingRequests() {
		return followingRequests;
	}


	public void setFollowingRequests(String followingRequests) {
		this.followingRequests = followingRequests;
	}


	public String getNotifications() {
		return notifications;
	}


	public int getNumberOfFollowingRequests() {
		return numberOfFollowingRequests;
	}


	public String getProfilePhotos() {
		return profilePhotos;
	}
	
	

}
