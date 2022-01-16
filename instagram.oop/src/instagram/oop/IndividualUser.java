package instagram.oop;

public class IndividualUser extends User {
	private int idIndividualUser;

	public IndividualUser(int id, String userName, String password, String profileImage, String explanation, int numberOfFollowers, int numberOfFollowings) {
		super(id, userName, password, profileImage, explanation, numberOfFollowers, numberOfFollowings);
	}

	public IndividualUser(int idIndividualUser) {
		super();
		this.idIndividualUser = idIndividualUser;
	}

	public int getIdIndividualUser() {
		return idIndividualUser;
	}

	public void setIdIndividualUser(int idIndividualUser) {
		this.idIndividualUser = idIndividualUser;
	}
	

}
