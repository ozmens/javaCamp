package javaCampHomework;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void remove(User user) {
		System.out.println("Kullan�c� bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void login(User user) {
		System.out.println("Giri� ba�ar�l� : "+ user.firstName + " " + user.lastName);
		
	}
}
