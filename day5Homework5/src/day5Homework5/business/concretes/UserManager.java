package day5Homework5.business.concretes;

import day5Homework5.business.abstracts.ControlService;
import day5Homework5.business.abstracts.UserService;
import day5Homework5.business.abstracts.VerificationService;
import day5Homework5.dataAccess.abstracts.UserDao;
import day5Homework5.entities.concretes.User;

public class UserManager implements UserService {
	

	
	UserDao userDao;
	ControlService controlService;
	VerificationService verificationService;
	
	public UserManager(UserDao userDao, ControlService controlService, VerificationService verificationService) 
	{
		this.userDao = userDao;
		this.controlService = controlService;
		this.verificationService = verificationService;
	}


	@Override
	public void signIn(String email, String password) {
		
		boolean isFound = false;
		
		if(userDao.getAllUsers() != null)
		{
			for(User tempUser :  userDao.getAllUsers())
			{
				if(tempUser.getEmail() == email && tempUser.getPassword() == password)
				{	
					isFound = true;
					if(!tempUser.isStatus())
					{
						System.out.println("Ba�ar�yla giri� yap�ld�.");
						tempUser.setStatus(true);
					}
					else
						System.out.println("Kullan�c� zaten sistemde.");
				}
			}
			if(!isFound)
				System.out.println("Email veya �ifre yanl��.");
		}
		else
			System.out.println("Sistemde kullan�c� bulunmamakta.");
		
	}

	@Override
	public void signOut(String email, String password) {
	
		boolean isFound = false;
		
		for(User tempUser :  userDao.getAllUsers())
		{
			if(tempUser.getEmail() == email && tempUser.getPassword() == password)
			{
				isFound = true;
				if(tempUser.isStatus())
				{
					System.out.println("Ba�ar�yla ��k�� yap�ld�.");
					tempUser.setStatus(false);
				}
				else
					System.out.println("Kullan�c� hen�z giri� yapmam��.");
			}
		}
		if(!isFound)
		{
			System.out.println("Email veya �ifre yanl��.");
		}
		
	}

	@Override
	public void register(User user) {
		
		if(this.controlService.checkInformations(user,this.userDao.getMailList()))
		{
			if(this.verificationService.verificationProcess())
			{
				System.out.println("Ba�ar�yla kay�t olundu.");
				// add to db.
				this.userDao.add(user);
			}
			else
				System.out.println("Dogrulama kodu yanl�� girildi."); 
		}
		else
			System.out.println("Bilgileriniz belirtilen kurallara uymuyor.");
		
	}
	
}
