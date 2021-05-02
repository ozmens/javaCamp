package javaCampHomework;

public class InstructorManager {
	public void add(User user) {
		System.out.println("Eðitimci bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void update(User user) {
		System.out.println("Eðitimci bilgileri güncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void remove(User user) {
		System.out.println("Eðitimci bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	

	

}
