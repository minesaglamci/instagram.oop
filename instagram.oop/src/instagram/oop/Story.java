package instagram.oop;

public class Story {
	private int idStory;
	private String [] reactionEmojis;
	private String [] answerBox;
	private String image;
	
	public Story() {
		super();
	}

	public Story(int idStory, String[] reactionEmojis, String[] answerBox, String image) {
		super();
		this.idStory = idStory;
		this.reactionEmojis = reactionEmojis;
		this.answerBox = answerBox;
		this.image = image;
	}

	public int getIdStory() {
		return idStory;
	}

	public void setIdStory(int idStory) {
		this.idStory = idStory;
	}

	public String[] getReactionEmojis() {
		return reactionEmojis;
	}

	public void setReactionEmojis(String[] reactionEmojis) {
		this.reactionEmojis = reactionEmojis;
	}

	public String[] getAnswerBox() {
		return answerBox;
	}

	public void setAnswerBox(String[] answerBox) {
		this.answerBox = answerBox;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
