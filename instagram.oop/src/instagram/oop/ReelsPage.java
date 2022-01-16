package instagram.oop;

public class ReelsPage {
	private int idReelsPage;
	private String video;
	private String videoDescription;
	private String sharingUserName;
	private int like;
	private String[] comment;
	private String[] send;
	
	public ReelsPage() {
		super();
	}

	public ReelsPage(int idReelsPage, String video, String videoDescription, String sharingUserName, int like,
			String[] comment, String[] send) {
		super();
		this.idReelsPage = idReelsPage;
		this.video = video;
		this.videoDescription = videoDescription;
		this.sharingUserName = sharingUserName;
		this.like = like;
		this.comment = comment;
		this.send = send;
	}

	public int getIdReelsPage() {
		return idReelsPage;
	}

	public void setIdReelsPage(int idReelsPage) {
		this.idReelsPage = idReelsPage;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String[] getComment() {
		return comment;
	}

	public void setComment(String[] comment) {
		this.comment = comment;
	}

	public String[] getSend() {
		return send;
	}

	public void setSend(String[] send) {
		this.send = send;
	}

	public String getVideo() {
		return video;
	}

	public String getVideoDescription() {
		return videoDescription;
	}

	public String getSharingUserName() {
		return sharingUserName;
	}
	

}
