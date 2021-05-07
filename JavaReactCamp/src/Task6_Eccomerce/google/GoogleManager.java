package Task6_Eccomerce.google;

import Task6_Eccomerce.entities.concretes.User;

public class GoogleManager implements GoogleService {

	@Override
	public void verificationEposta(User user) {
		
		System.out.println("Google verification of the user of  " + user.getFirstName() + " " +
								user.getLastName() + " is being carried out");
		
		Thread thread = new Thread();
		try {
			thread.sleep(3000);
			System.out.println("The user of" + user.getFirstName() + " " +
								user.getLastName() + " has been verified by google..");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
