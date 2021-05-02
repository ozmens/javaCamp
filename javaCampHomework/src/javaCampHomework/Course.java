package javaCampHomework;

public class Course {
	
	public Course(int id,String name, String instructorFirstName, 
			String instructorLastName, double completionPercentage) {
		this.id=id;
		this.name=name;
		this.instructorFirstName=instructorFirstName;
		this.instructorLastName=instructorLastName;
		this.completionPercentage=completionPercentage;
	}
	
	int id;
	String name;
	String instructorFirstName;
	String instructorLastName;
	double completionPercentage;

}
