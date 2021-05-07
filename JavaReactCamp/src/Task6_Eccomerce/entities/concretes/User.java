package Task6_Eccomerce.entities.concretes;

import Task6_Eccomerce.entities.abstracts.Entity;

public class User implements Entity {
	
	private int id = 0;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public User() {
		id = id +1;
	}

	public User(int id, String firstName, String lastName, String email, String password) {
		id = id +1;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
