package javaCampHomework;

public class InstructorManager {
	public void add(User user) {
		System.out.println("E�itimci bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void update(User user) {
		System.out.println("E�itimci bilgileri g�ncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void remove(User user) {
		System.out.println("E�itimci bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	

	

}
