package JavaReactCampTask3;

public class Student extends User{
	
	private String number;
    private String[] receivedLessons;
	public Student(int id, String firstName, String lastName, String email, String number, String[] receivedLessons) {
		super(id, firstName, lastName, email);
		this.number = number;
		this.receivedLessons = receivedLessons;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String[] getReceivedLessons() {
		return receivedLessons;
	}
	public void setReceivedLessons(String[] receivedLessons) {
		this.receivedLessons = receivedLessons;
	}

    
}
