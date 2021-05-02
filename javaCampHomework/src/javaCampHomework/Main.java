package javaCampHomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Serkan","Özmen","ozmens@gmail.com","abcde");
				
		UserManager userManager = new UserManager();
		userManager.Add(user1);
		userManager.Login(user1);
	}
	
	

}
