
public class InstructorManager {
	public void create(Instructor instructor) {
		System.out.println(instructor.getName()+" "+ instructor.getLastName()+" "+"taraf�ndan "
				+instructor.getLesson()+" Kursu Olu�turuldu!");
		
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getName()+" "+ instructor.getLastName()+" taraf�ndan "
				+instructor.getLesson()+" Kursu Silindi!");
		
	}

}
