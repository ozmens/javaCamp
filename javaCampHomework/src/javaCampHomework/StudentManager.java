package javaCampHomework;

public class StudentManager {
	public void add(User user) {
		System.out.println("��renci bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void update(User user) {
		System.out.println("��renci bilgileri g�ncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void remove(User user) {
		System.out.println("��renci bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	

}
