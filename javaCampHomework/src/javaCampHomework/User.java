package javaCampHomework;

public class User {
	
	public User(int id,String firstName, String lastName, 
			String email, String password) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}
	
	
	int id;
	String firstName;
	String lastName;
	String email;
	String password;
}
