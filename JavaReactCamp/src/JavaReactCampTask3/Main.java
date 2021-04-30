package JavaReactCampTask3;

public class Main {
	public static void main(String[] args) {

        String[] sendLessons = {"Python", "C#", "Java"};
        Instructor instructor = new Instructor(1,"Engin","Demiro�", "a@gmail.com " ,sendLessons);

        String[] receivedLessons1 = {"Python", "Java"};
        Student student1 = new Student(2,"�mer","ATA�", "b@gmail.com ","1",receivedLessons1);

        String[] receivedLessons2 = {"C#", "Java"};
        Student student2 = new Student(3,"�mer","ATA�", "b@gmail.com ","2",receivedLessons2);

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        instructorManager.login(instructor);
        studentManager.login(student1);
        studentManager.login(student2);

        instructorManager.addLesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
        instructorManager.addExam("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
        instructorManager.deleteLesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");

        studentManager.watchLesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
        studentManager.enterExam("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
        studentManager.finishLesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");

    }
}
