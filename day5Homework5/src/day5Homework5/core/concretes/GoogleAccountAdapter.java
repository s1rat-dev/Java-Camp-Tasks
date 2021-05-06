package day5Homework5.core.concretes;

import day5Homework5.accounts.GoogleAccount;
import day5Homework5.core.abstracts.AccountService;

public class GoogleAccountAdapter implements AccountService {

	@Override
	public void signUpSocialAccounts(String email, String password) {
		GoogleAccount googleAccount = new GoogleAccount();
		googleAccount.signUpWithGoogle(email,password);
		
		
	}
	
}
