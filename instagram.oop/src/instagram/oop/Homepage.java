package instagram.oop;

public class Homepage {
	private SearchPage[] search;
	private ReelsPage[] reels;
	private ShoppingPage[] shopping;
	private User[] user;
	private Post[] post;
	private Activities[] activities;
	private DirectMessage[] directMessage;
	private String[] stories;
	
	
	public Homepage() {
		super();
	}

	public Homepage(SearchPage[] search, ReelsPage[] reels, ShoppingPage[] shopping, User[] user, Post[] post,
			Activities[] activities, DirectMessage[] directMessage, String[] stories) {
		super();
		this.search = search;
		this.reels = reels;
		this.shopping = shopping;
		this.user = user;
		this.post = post;
		this.activities = activities;
		this.directMessage = directMessage;
		this.stories = stories;
	}

	public SearchPage[] getSearch() {
		return search;
	}

	public void setSearch(SearchPage[] search) {
		this.search = search;
	}

	public ReelsPage[] getReels() {
		return reels;
	}

	public void setReels(ReelsPage[] reels) {
		this.reels = reels;
	}

	public ShoppingPage[] getShopping() {
		return shopping;
	}

	public void setShopping(ShoppingPage[] shopping) {
		this.shopping = shopping;
	}

	public User[] getUser() {
		return user;
	}

	public void setUser(User[] user) {
		this.user = user;
	}

	public Post[] getPost() {
		return post;
	}

	public void setPost(Post[] post) {
		this.post = post;
	}

	public Activities[] getActivities() {
		return activities;
	}

	public void setActivities(Activities[] activities) {
		this.activities = activities;
	}

	public DirectMessage[] getDirectMessage() {
		return directMessage;
	}

	public void setDirectMessage(DirectMessage[] directMessage) {
		this.directMessage = directMessage;
	}

	public String[] getStories() {
		return stories;
	}

	public void setStories(String[] stories) {
		this.stories = stories;
	}
	

}
