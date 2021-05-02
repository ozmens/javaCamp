package javaCampHomework;

public class Instructor extends User {
	int instructorId;
	String currentCourseName;
	
	public Instructor () {
		
	}
	
	public Instructor(int instructorId, String currentCourseName) {
		this.instructorId = instructorId;
		this.currentCourseName = currentCourseName;
	}
	
}
