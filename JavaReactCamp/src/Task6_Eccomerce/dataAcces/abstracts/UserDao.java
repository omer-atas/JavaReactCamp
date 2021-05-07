package Task6_Eccomerce.dataAcces.abstracts;

import Task6_Eccomerce.entities.concretes.User;

public interface UserDao {
	
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	void displayUser(User user);

}
