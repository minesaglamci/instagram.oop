package instagram.oop;

public class CommercialUser extends User {
	private int idCommercialUser;
	private String contactInformation;
	private String insightStatistics;
	
	public CommercialUser(int id, String userName, String password, String profileImage, String explanation, int numberOfFollowers, int numberOfFollowings) {
		super(id, userName, password, profileImage, explanation, numberOfFollowers, numberOfFollowings);
	}

	public CommercialUser(int idCommercialUser, String contactInformation, String insightStatistics) {
		super();
		this.idCommercialUser = idCommercialUser;
		this.contactInformation = contactInformation;
		this.insightStatistics = insightStatistics;
	}

	public int getIdCommercialUser() {
		return idCommercialUser;
	}

	public void setIdCommercialUser(int idCommercialUser) {
		this.idCommercialUser = idCommercialUser;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getInsightStatistics() {
		return insightStatistics;
	}
	
	

}
