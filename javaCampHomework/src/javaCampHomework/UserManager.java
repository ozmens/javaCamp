package javaCampHomework;

public class UserManager {
	public void Add(User user) {
		System.out.println("Kullanýcý bilgileri kaydedildi : " + user.firstName + " " + user.lastName);
		
	}
	
	public void Update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void Remove(User user) {
		System.out.println("Kullanýcý bilgileri silindi : "+ user.firstName + " " + user.lastName);
		
	}
	
	public void Login(User user) {
		System.out.println("Giriþ baþarýlý : "+ user.firstName + " " + user.lastName);
		
	}
}
