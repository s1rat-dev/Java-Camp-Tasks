package day5Homework5.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import day5Homework5.dataAccess.abstracts.UserDao;
import day5Homework5.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	List<String> emailList = new ArrayList<String>();
	List<User> userList = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		
		this.userList.add(user);
		this.emailList.add(user.getEmail());
		System.out.println("Hibernate ile eklendi: " + user.getFirstName());
		
	}


	@Override
	public List<String> getMailList() {
		return this.emailList;
	}

	@Override
	public List<User> getAllUsers() {
		return this.userList;
	}


}
