package javaCampHomework;

public class StudentManager {
	public void add(User user) {
		System.out.println("Öðrenci bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void update(User user) {
		System.out.println("Öðrenci bilgileri güncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void remove(User user) {
		System.out.println("Öðrenci bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	

}
