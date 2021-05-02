package JavaReactCampWork4;

public class Player {
	private int id;
	private String identityNumber;
	private String firstName;
	private String lastName;
	private String birtDay;
	
	public Player() {}
	
	public Player(int id, String identityNumber, String firstName, String lastName, String birtDay) {
		this.id = id;
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtDay = birtDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		
		this.identityNumber = identityNumber;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirtDay() {
		return birtDay;
	}

	public void setBirtDay(String birtDay) {
		this.birtDay = birtDay;
	}
	
	
}
