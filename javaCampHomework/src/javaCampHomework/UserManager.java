package javaCampHomework;

public class UserManager {
	public void Add(User user) {
		System.out.println("Kullan�c� bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void Update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void Remove(User user) {
		System.out.println("Kullan�c� bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void Login(User user) {
		System.out.println("Giri� ba�ar�l� : "+ user.firstName + " " + user.lastName);
		
	}
}
