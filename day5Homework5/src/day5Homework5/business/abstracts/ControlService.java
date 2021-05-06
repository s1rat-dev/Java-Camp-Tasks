package day5Homework5.business.abstracts;
import java.util.List;
import day5Homework5.entities.concretes.User;

public interface ControlService {
	
	public boolean checkInformations(User user, List<String> emailList);
	public boolean checkEmail(User user, List<String> emailList);
	public boolean checkPassword(int passwordLength);
	public boolean checkNames(String firstName,String lastName);
	
	
}
