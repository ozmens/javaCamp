package javaCampHomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Serkan","Özmen","ozmens@gmail.com","abcde");
		
		Instructor instructor1 = new Instructor();
		instructor1.firstName="Engin";
		instructor1.lastName="Demiroğ";
		
		Student student1 = new Student();
		student1.firstName="Damla";
		student1.lastName="Özmen";
				
		UserManager userManager = new UserManager();
		userManager.add(user1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.assign(instructor1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.register(student1);
	
	}
	
	

}
