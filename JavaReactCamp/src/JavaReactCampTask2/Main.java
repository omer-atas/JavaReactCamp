package JavaReactCampTask2;


public class Main {

	public static void main(String[] args) {
		
		// Property objects. - Ozellik nesnelerin tan�mlanmas�.
		
		Course course = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Kurs image-1","�cretsiz");

		Course course2 = new Course();
		course2.id=2;
		course2.title = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# & ANGULAR)";
		course2.subtitle = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		course2.image = "Kurs image-2";
		
		Course course3 = new Course();
		
		course3.id=3;
		course3.title = "Programlamaya Giri� ��in Temel Kurs";
		course3.subtitle = "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.";
		course3.image = "Kurs image-3";
		
		// adding and listing objects to the array. - nesnelerin diziye ekleyip listelenmesi.
		
		Course [] courses = {course,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		courseManager.display(courses);
		
		// Create a class that you think we define as a business class. Write at least two methods. - �� s�n�f� olarak tan�mlad���m�z� d���nd���n�z bir class olu�turunuz. En az iki metot yaz�n�z.
		
		courseManager.addCourse(course2);
		courseManager.deleteCourse(course2);
	}

}
