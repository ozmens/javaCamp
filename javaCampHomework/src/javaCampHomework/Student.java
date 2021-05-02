package javaCampHomework;

public class Student extends User {
	int studentId;
	String schoolName;
	String department;
	String registeredCourseName;
	
	public Student() {
		
	}
	
	public Student(int studentId, String schoolName, String department, String registeredCourseName) {
		super();
		this.studentId = studentId;
		this.schoolName = schoolName;
		this.department = department;
		this.registeredCourseName = registeredCourseName;
	}
}
