package JavaReactCampTask2;

public class CourseManager {
	
	public void display(Course [] courses) {
		
		System.out.println("Courses are display now.");
		
		System.out.println("**********************************************");
		
		for(Course course : courses) {
			System.out.println(course.title);
			System.out.println(course.subtitle);
		}
		
		System.out.println("**********************************************");
	}
	
	public void addCourse(Course course) {
		System.out.println(course.title + " adlı kurs eklendi.");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.title + " adlı kurs silindi.");
	}

}