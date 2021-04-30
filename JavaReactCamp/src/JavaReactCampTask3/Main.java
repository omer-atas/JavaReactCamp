package JavaReactCampTask3;

public class Main {
	public static void main(String[] args) {

        String[] sendLessons = {"Python", "C#", "Java"};
        Instructor instructor = new Instructor(1,"Engin","Demiroð", "a@gmail.com " ,sendLessons);

        String[] receivedLessons1 = {"Python", "Java"};
        Student student1 = new Student(2,"Ömer","ATAÞ", "b@gmail.com ","1",receivedLessons1);

        String[] receivedLessons2 = {"C#", "Java"};
        Student student2 = new Student(3,"Ömer","ATAÞ", "b@gmail.com ","2",receivedLessons2);

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        instructorManager.login(instructor);
        studentManager.login(student1);
        studentManager.login(student2);

        instructorManager.addLesson("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
        instructorManager.addExam("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
        instructorManager.deleteLesson("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");

        studentManager.watchLesson("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
        studentManager.enterExam("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
        studentManager.finishLesson("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");

    }
}
