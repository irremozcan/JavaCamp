package campHomework;

public class courses {
	
	private String name;
	private String teacher;
	private String courseID;
	
	public courses(String name, String teacher, String courseID) {
		this.name=name;
		this.teacher= teacher;
		this.courseID=courseID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

}
