package campHomework;

public class main {

	public static void main(String[] args) {
		
		courses kurs1 = new courses("C# Kursu", "Engin DEM�RO�", "1");
		
		courses kurs2 = new courses("JAVA Kursu", "Engin DEM�RO�", "2");
		
		courses kurs3 = new courses("Programlamaya Giri� ��in Temel Kurs", "Engin DEM�RO�", "3");
		

      courses[] courses = {kurs1,kurs2,kurs3};
		
		for(courses Course :courses){
			System.out.println("Course: " + Course.getName());
		}
		
		yourCourses courseManager = new yourCourses();
		
		courseManager.add(kurs1);
		courseManager.add(kurs2);
		courseManager.add(kurs3);

	}

}
