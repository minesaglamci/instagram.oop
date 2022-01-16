package instagram.oop;

public class DirectMessage {
	private int idDirectMessage;
	private String onlineFriendsImages;
	private String chats;
	private String messageRequests;
	private String calls;
	
	public DirectMessage() {
		super();
	}

	public DirectMessage(int idDirectMessage, String onlineFriendsImages, String chats, String messageRequests,
			String calls) {
		super();
		this.idDirectMessage = idDirectMessage;
		this.onlineFriendsImages = onlineFriendsImages;
		this.chats = chats;
		this.messageRequests = messageRequests;
		this.calls = calls;
	}

	public int getIdDirectMessage() {
		return idDirectMessage;
	}

	public void setIdDirectMessage(int idDirectMessage) {
		this.idDirectMessage = idDirectMessage;
	}

	public String getChats() {
		return chats;
	}

	public void setChats(String chats) {
		this.chats = chats;
	}

	public String getCalls() {
		return calls;
	}

	public void setCalls(String calls) {
		this.calls = calls;
	}

	public String getOnlineFriendsImages() {
		return onlineFriendsImages;
	}

	public String getMessageRequests() {
		return messageRequests;
	}
	
	

}
