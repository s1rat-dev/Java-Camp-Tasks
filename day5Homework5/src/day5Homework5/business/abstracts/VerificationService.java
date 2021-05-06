package day5Homework5.business.abstracts;

public interface VerificationService {
	
	public boolean verificationProcess();
	public void generateVerificationCode();
	public void sendVerificationCode();
	public boolean checkVerificationCode();
	
}
