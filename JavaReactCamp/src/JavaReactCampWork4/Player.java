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
		
		if(identityNumber.length() > 11) {
			System.out.println("Bu bir tc kimlik numarasý deðildir..");
		}else {
			
			for(int i = 0 ; i < identityNumber.length() ; i ++) {
				if((identityNumber.charAt(i) >= 'A' && identityNumber.charAt(i) <= 'Z') &&
						(identityNumber.charAt(i) >= 'a' && identityNumber.charAt(i) <= 'z')) {
					
					System.out.println("Bu bir tc kimlik numarasý deðildir..");
				}
			}
			
			this.identityNumber = identityNumber;
		}
		
		
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
