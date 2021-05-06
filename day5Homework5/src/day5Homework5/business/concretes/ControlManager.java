package day5Homework5.business.concretes;
import java.util.List;
import day5Homework5.business.abstracts.ControlService;
import day5Homework5.entities.concretes.User;
import java.util.regex.*;

public class ControlManager implements ControlService
{

	@Override
	public boolean checkInformations(User user, List<String> emailList) {
	
		if(this.checkEmail(user, emailList) && this.checkNames(user.getFirstName(), user.getLastName()) && this.checkPassword(user.getPassword().length()))
		{
			return true;
		}
		
		return false;
		
	}

	@Override
	public boolean checkEmail(User user, List<String> emailList) {
		
		// RFC 5322
		String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
				

		for(String item : emailList)
		{
		
			if(item == user.getEmail())
			{
				System.out.println("Bu mail ile daha önce kaydolundu.");
				return false;
			}
		}
	
		
		if(!Pattern.matches(emailRegex, user.getEmail()))
		{
			System.out.println("Gerçek bir mail adresi girdiðinizden emin olun.");
			return false;
		}
		
		return true;
		
	}
	

	@Override
	public boolean checkPassword(int passwordLength) {
		
		if(passwordLength < 6)
		{
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr.");
			return false;
		}
		
		return true;
	}

	
	@Override
	public boolean checkNames(String firstName, String lastName) {
		
		if(firstName.length() < 2 && lastName.length() < 2)
		{
			System.out.println("Adýnýz veya þifreniz çok kýsa.");
			return false;
		}
		
		return true;
	}
	
	
}
