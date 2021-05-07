package Task6_Eccomerce.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import Task6_Eccomerce.business.concretes.UserManager;
import Task6_Eccomerce.dataAcces.abstracts.UserDao;
import Task6_Eccomerce.entities.concretes.User;

public class UserManagerDao implements UserDao{
	// E-mail has not been used before
	public static List<User> userList = new ArrayList<User>();

	@Override
	public void addUser(User user) {
		if(UserManager.nameControl == false && UserManager.passwordControl == false && 
				UserManager.emailControl == false) {
			System.out.println("Kontrol ediniz..");
		}else {
			System.out.println("User is adding : ");
			System.out.println(user.getFirstName() + " " + user.getLastName());
			System.out.println(user.getEmail());
			
			userList.add(user);
			
		}
	}

	@Override
	public void updateUser(User user) {
		
		if(UserManager.nameControl == false ) {
			System.out.println("Make sure your username is at least 2 characters and write it in the correct email format.");
		}else {
			System.out.println("User is adding ..");
			System.out.println(user.getFirstName() + " " + user.getLastName());
			System.out.println(user.getEmail());
			
			userList.add(user);
			System.out.println("User added ..");
		}
		
	}

	@Override
	public void deleteUser(User user) {
		if((user.getFirstName().isEmpty() == false) && (user.getLastName().isEmpty() == false)&&
				(user.getEmail().isEmpty() == false )&& (user.getPassword().isEmpty() == false )){
			System.out.println("User is deleting .. ");
			userList = null;
			System.out.println("User deleted ..");
		}else {
			System.out.println("An error occurred");
		}
		
	}

	@Override
	public void displayUser(User user) {
		
		if((user.getFirstName().isEmpty() == false) && (user.getLastName().isEmpty() == false)&&
				(user.getEmail().isEmpty() == false )&& (user.getPassword().isEmpty() == false )){
			System.out.println("Showing user information .. ");
			
			System.out.println("User name : " + user.getFirstName() + " " + user.getFirstName());
			System.out.println("Email : " + user.getEmail());
			
			System.out.println("User information showed ..");
		}else {
			System.out.println("An error occurred");
		}
		
		
		
		
	}

	

}
