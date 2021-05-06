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
		
		User user1 = new User("S�rat","��p", "siratsemih@gmail.com","deneme123");
		
		// Mail yanl��
		User user2 = new User("Falan","Filan","falanfilan","sifre123");
		
		// Ad - soyad k�sa
		User user3 = new User("a","b","deneme@falan.com","sifre123");
		
		// Parola 6'dan kucuk
		User user4 = new User("S�rat","��p", "farklieposta@gmail.com","sifre");
		
		// Mevcut e-posta
		User user5 = new User("S�rat","��p", "siratsemih@gmail.com","deneme123");
		
		// Google ile giri�, normalde google bize bir isim soyisim d�nd�recektir. Fakat sim�le oldu�u i�in onunla u�ra�maya gerek duymad�m.
		User user6 = new User("sirat@gmail.com","mailsifresi",new GoogleAccountAdapter());
		user6.setFirstName("falanca");
		user6.setLastName("filanca");
		
		// Do�rulaman�n yanl�� yap�lmas�.
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
		// Ba�ar�l� giri�.
		userManager.signIn("siratsemih@gmail.com", "deneme123");
		// Kullan�c� zaten sistemde.
		userManager.signIn("siratsemih@gmail.com", "deneme123");
		
		System.out.println("----------------------------");
		// Ba�ar�l� ��k��.
		userManager.signOut("siratsemih@gmail.com", "deneme123");
		
		System.out.println("----------------------------");
		// Giri� yapmam�� kullan�c�dan ��kay� deneme
		userManager.signOut("sirat@gmail.com", "mailsifresi");
		
		
		System.out.println("----------------------------");
		// Do�rulamay� yanl�� yapt�ktan sonra deneme.
		userManager.signIn("deneme@mail.com", "sifre123");
		
		
	}

}
