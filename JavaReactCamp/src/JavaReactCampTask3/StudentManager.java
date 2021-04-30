package JavaReactCampTask3;

public class StudentManager extends UserManager{
	 @Override
	    public void login(User user){
	        System.out.println( user.getFirstName() + " " + user.getLastName() + " logged in.");
	    }

	    public void watchLesson(String lesson){
	        System.out.println(lesson + " watched the lesson.");
	    }
	    
	    public void finishLesson(String lesson){
	        System.out.println(lesson + " finished the lesson.");
	    }

	    public void enterExam(String exam){
	        System.out.println(exam + " exam entered.");
	    }
}
