package day5Homework5;

import day5Homework5.business.abstracts.UserService;
import day5Homework5.business.concretes.ControlManager;
import day5Homework5.business.concretes.UserManager;
import day5Homework5.business.concretes.VerificationManager;
import day5Homework5.core.concretes.GoogleAccountAdapter;
import day5Homework5.dataAccess.concretes.InMemoryUserDao;
import day5Homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Sýrat","Çöp", "siratsemih@gmail.com","deneme123");
		
		// Mail yanlýþ
		User user2 = new User("Falan","Filan","falanfilan","sifre123");
		
		// Ad - soyad kýsa
		User user3 = new User("a","b","deneme@falan.com","sifre123");
		
		// Parola 6'dan kucuk
		User user4 = new User("Sýrat","Çöp", "farklieposta@gmail.com","sifre");
		
		// Mevcut e-posta
		User user5 = new User("Sýrat","Çöp", "siratsemih@gmail.com","deneme123");
		
		// Google ile giriþ, normalde google bize bir isim soyisim döndürecektir. Fakat simüle olduðu için onunla uðraþmaya gerek duymadým.
		User user6 = new User("sirat@gmail.com","mailsifresi",new GoogleAccountAdapter());
		user6.setFirstName("falanca");
		user6.setLastName("filanca");
		
		// Doðrulamanýn yanlýþ yapýlmasý.
		User user7 = new User("denemeisim","denemesoyisim","deneme@mail.com", "sifre123");
		
		
		
		
		UserService userManager = new UserManager(new InMemoryUserDao(), new ControlManager(), new VerificationManager());
		
		userManager.register(user1);
		System.out.println("----------------------------");
		userManager.register(user2);
		System.out.println("----------------------------");
		userManager.register(user3);
		System.out.println("----------------------------");
		userManager.register(user4);
		System.out.println("----------------------------");
		userManager.register(user5);
		System.out.println("----------------------------");
		userManager.register(user6);
		System.out.println("----------------------------");
		userManager.register(user7);
		
		
		System.out.println("----------------------------");
		// Baþarýlý giriþ.
		userManager.signIn("siratsemih@gmail.com", "deneme123");
		// Kullanýcý zaten sistemde.
		userManager.signIn("siratsemih@gmail.com", "deneme123");
		
		System.out.println("----------------------------");
		// Baþarýlý çýkýþ.
		userManager.signOut("siratsemih@gmail.com", "deneme123");
		
		System.out.println("----------------------------");
		// Giriþ yapmamýþ kullanýcýdan çýkayý deneme
		userManager.signOut("sirat@gmail.com", "mailsifresi");
		
		
		System.out.println("----------------------------");
		// Doðrulamayý yanlýþ yaptýktan sonra deneme.
		userManager.signIn("deneme@mail.com", "sifre123");
		
		
	}

}
