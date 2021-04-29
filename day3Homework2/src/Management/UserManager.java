package Management;
import UserTypes.User;

public class UserManager {
	
	public void addUser(User user)
	{
		if(!user.isStatus())
		{
			/*
			 * Ekleme islemleri.
			 */
			System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi.");
			user.setStatus(true);
		}
		else
			System.out.println("Kullanýcý zaten sistemde mevcut.");
		
	}
	
	public void deleteUser(User user)
	{
		if(user.isStatus())
		{
			/*
			 * Silme iþlemleri
			 */
			System.out.println("Kullanýcý sistemden silindi.");
			user.setStatus(false);
		}
		else
			System.out.println("Kullanýcý zaten sistemde mevcut deðil.");
	}
	
	public void showUserInfos(User user)
	{
		
		System.out.println("\nId: " + user.getId());
		System.out.println("Ad-Soyad: " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Email: " + user.getEmail());
		String sentence = "Kullanýcý " + ((user.isStatus()) ?  "sistemde ekli." : "sistemde ekli deðil.") + "\n";
		System.out.println(sentence);
	}
}
