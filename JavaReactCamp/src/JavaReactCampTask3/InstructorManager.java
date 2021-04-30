package JavaReactCampTask3;

public class InstructorManager extends UserManager{
	
	@Override
    public void login(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() +  " logged in.");
    }

    public void addLesson(String lesson){
        System.out.println(lesson + " watched the lesson.");
    }
    
    public void deleteLesson(String lesson){
        System.out.println(lesson + " deleted the lesson.");
    }
    
    public void updateLesson(String lesson){
        System.out.println(lesson + " updated the lesson.");
    }

    public void addExam(String exam){
        System.out.println(exam + " exam entered.");
    }
    
    

}
