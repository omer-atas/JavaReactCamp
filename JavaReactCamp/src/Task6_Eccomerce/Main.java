package Task6_Eccomerce;

import Task6_Eccomerce.business.concretes.UserManager;
import Task6_Eccomerce.core.ControlManager;
import Task6_Eccomerce.dataAcces.concretes.UserManagerDao;
import Task6_Eccomerce.entities.concretes.User;
import Task6_Eccomerce.google.GoogleManager;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setFirstName("Yunus");
		user.setLastName("Demir");
		user.setEmail("yunus@hotmail.com");
		user.setPassword("Yunus2");
		
		UserManagerDao userManagerDao = new UserManagerDao();
		GoogleManager googleManager = new GoogleManager();
		ControlManager controlManager = new ControlManager();
		
		UserManager userManager = new UserManager(userManagerDao,googleManager,controlManager);
		
		userManager.checkNameLength(user);
		controlManager.formatEmail(user);
		userManager.emailControl(user);
		userManager.register(user);
		
		System.out.println("Login islemi :");
		
		User user2 = new User();
		user2.setFirstName("Yunus");
		user2.setLastName("Demir");
		user2.setEmail("yunus@hotmail.com");
		user2.setPassword("Yunus2");
		
		
		UserManagerDao userManagerDao2 = new UserManagerDao();
		GoogleManager googleManager2 = new GoogleManager();
		ControlManager controlManager2 = new ControlManager();
		
		UserManager userManager2 = new UserManager(userManagerDao2,googleManager2,controlManager2);
		userManager2.login(user2);
		
	}

}
