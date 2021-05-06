package day5Homework5.entities.concretes;
import day5Homework5.core.abstracts.AccountService;
import day5Homework5.entities.abstracts.Entity;

public class User implements Entity{
	
	private boolean status;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	AccountService accountService;
	
	public User(String email, String password, AccountService accountService)
	{
		this.email = email;
		this.password = password;
		this.accountService = accountService;
		this.status = false;
		this.accountService.signUpSocialAccounts(email, password);
	}

	public User( String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.status = false;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
