package JavaReactCampTask3;

public class Instructor extends User{
	
	 private String[] sendLessons;

	public Instructor(int id, String firstName, String lastName, String email, String[] sendLessons) {
		super(id, firstName, lastName, email);
		this.sendLessons = sendLessons;
	}

	public String[] getSendLessons() {
		return sendLessons;
	}

	public void setSendLessons(String[] sendLessons) {
		this.sendLessons = sendLessons;
	}

	

	
}
