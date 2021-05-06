package day5Homework5.dataAccess.abstracts;
import java.util.List;

import day5Homework5.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	List<String> getMailList();
	List<User> getAllUsers();

}	
