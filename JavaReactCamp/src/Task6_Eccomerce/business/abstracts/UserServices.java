package Task6_Eccomerce.business.abstracts;

import Task6_Eccomerce.entities.concretes.User;


public interface UserServices {
	
	boolean checkPasswordLength(User user);
	
	boolean emailControl(User user);
	
	boolean checkNameLength(User user);
	
	void login(User user);
	
	void register(User user);

}
