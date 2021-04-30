package JavaReactCampTask2;


public class Main {

	public static void main(String[] args) {
		
		// Property objects. - Ozellik nesnelerin tanýmlanmasý.
		
		Course course = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Kurs image-1","Ücretsiz");

		Course course2 = new Course();
		course2.id=2;
		course2.title = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# & ANGULAR)";
		course2.subtitle = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		course2.image = "Kurs image-2";
		
		Course course3 = new Course();
		
		course3.id=3;
		course3.title = "Programlamaya Giriþ Ýçin Temel Kurs";
		course3.subtitle = "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.";
		course3.image = "Kurs image-3";
		
		// adding and listing objects to the array. - nesnelerin diziye ekleyip listelenmesi.
		
		Course [] courses = {course,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		courseManager.display(courses);
		
		// Create a class that you think we define as a business class. Write at least two methods. - Ýþ sýnýfý olarak tanýmladýðýmýzý düþündüðünüz bir class oluþturunuz. En az iki metot yazýnýz.
		
		courseManager.addCourse(course2);
		courseManager.deleteCourse(course2);
	}

}
