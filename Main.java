
public class Main {
	
	public static void main(String[] args) {
		Student student1 = new Student(1,"�rem","�ZCAN","1234","Java Kamp");
		Instructor �nst1 = new Instructor(1,"Engin", "DEM�RO�", "4321","Java Kamp");
		
		
		StudentManager studentMng = new StudentManager();
		UserManager userMng = new UserManager();
		InstructorManager �nstMng = new InstructorManager();
		
			studentMng.registered(student1);
			studentMng.CurrentHomework(student1);
		
		
			userMng.add(student1);
			userMng.delete(�nst1);
		

			�nstMng.create(�nst1);
			�nstMng.remove(�nst1);
		
	}
	
	
	
	
	
	
}
