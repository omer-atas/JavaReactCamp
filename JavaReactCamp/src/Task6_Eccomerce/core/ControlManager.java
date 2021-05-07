package Task6_Eccomerce.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Task6_Eccomerce.business.concretes.UserManager;
import Task6_Eccomerce.entities.concretes.User;

public class ControlManager implements ControlService{

	@Override
	public boolean formatEmail(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if(matcher.matches()==true) {
			
			UserManager.emailControl = true;
			return true;
		}
		else {
			UserManager.emailControl = false;
			return false;
		}
	}

}
