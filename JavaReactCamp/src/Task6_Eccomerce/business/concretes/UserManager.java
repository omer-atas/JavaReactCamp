package Task6_Eccomerce.business.concretes;

import Task6_Eccomerce.business.abstracts.UserServices;
import Task6_Eccomerce.core.ControlManager;
import Task6_Eccomerce.dataAcces.concretes.UserManagerDao;
import Task6_Eccomerce.entities.concretes.User;
import Task6_Eccomerce.google.GoogleManager;

public class UserManager implements UserServices {
	
	public static boolean nameControl, passwordControl, emailControl;;
	private UserManagerDao userManagerDao;
	private GoogleManager googleManager;
	private ControlManager controlManager;
    
    public UserManager(UserManagerDao userManagerDao,GoogleManager googleManager,ControlManager controlManager) {
		this.userManagerDao = userManagerDao;
		this.googleManager = googleManager;
		this.controlManager = controlManager;
	}

	@Override
	public boolean checkNameLength(User user) {
		if((user.getFirstName().length() < 2) || (user.getLastName().length() < 2) ) {
			UserManager.nameControl = false;
			return false;
		}
		UserManager.nameControl = true;
		return true;
	}
    
    @Override
	public boolean checkPasswordLength(User user) {
		if(user.getPassword().length() < 6 ) {
			UserManager.passwordControl = false;
			return false;
		}else {
			UserManager.passwordControl = true;
			return true;
		}
	}

	
	
	@Override
	public boolean emailControl(User user) {
		
		for(int i = 0 ; i <  UserManagerDao.userList.size() ; i++) {
			if(UserManagerDao.userList.get(i).getEmail() == user.getEmail()) {
				System.out.println("Enter another e-mail..");
				System.exit(0);
			}
		}
		return true;
	}

	@Override
	public void register(User user) {
		if(checkNameLength(user) || 
				checkPasswordLength(user ) || this.controlManager.formatEmail(user) || emailControl(user)) {
			System.out.println("Registering..");
			this.userManagerDao.addUser(user);
			System.out.println("Google verification is performed for registration..");
			this.googleManager.verificationEposta(user);
			System.out.println("Registration completed..");
		}else {
			System.out.println("Registration could not be performed..");
		}
		
	}

	@Override
	public void login(User user) {
		
		for(int i = 0 ; i <  UserManagerDao.userList.size() ; i++) {
			if(UserManagerDao.userList.get(i).getEmail() == user.getEmail() &&
					UserManagerDao.userList.get(i).getPassword() == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() +
										" logged into the system ..");
			}else {
				System.out.println("Could not login..");
			}
		}
		
		
	}

	

	
}
