
public class StudentManager {
	
	public void registered(Student student) {
		System.out.println(student.getCourses()+" "+"Kursuna Kaydolundu! "+" "+ student.getName()
			+" "+ student.getLastName());
	}

	public void CurrentHomework(Student student) {
		System.out.println(student.getCourses()+" "+"�devi Tamamland�! "+ student.getName()
			+" "+ student.getLastName());
	}


}
