package javaCampHomework;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void remove(User user) {
		System.out.println("Kullanýcý bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void login(User user) {
		System.out.println("Giriþ baþarýlý : "+ user.firstName + " " + user.lastName);
		
	}
}
