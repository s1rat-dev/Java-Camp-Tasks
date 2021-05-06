package day5Homework5.business.abstracts;
import day5Homework5.entities.concretes.User;

public interface UserService {
	
	public void signIn(String email,String password);
	public void signOut(String email,String password);
	public void register(User user);
	
}
