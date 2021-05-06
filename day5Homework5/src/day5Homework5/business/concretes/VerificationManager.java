package day5Homework5.business.concretes;
import java.util.Random;
import java.util.Scanner;

import day5Homework5.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{
	
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	String verificationCode = "";
	String inputVerificationCode;
	
	@Override
	public boolean verificationProcess() {
		
		this.generateVerificationCode();
		this.sendVerificationCode();
		
		if(this.checkVerificationCode())
			return true;
		
		return false;
		
	}

	@Override
	public void generateVerificationCode()
	{
		
		for(int i = 0; i < 3; i++)
		{
			char randomizedCharacter = (char) (random.nextInt(26) + 'a');
			this.verificationCode += randomizedCharacter;
		}
		
		for(int i = 0; i < 2 ; i++)
		{
			int randomizedInteger = random.nextInt(10);
			this.verificationCode += String.valueOf(randomizedInteger);
		}
		
	}

	@Override
	public void sendVerificationCode() {

		System.out.println("Dogrulama kodunuz: " + verificationCode);
		System.out.print("> ");
		this.inputVerificationCode = scanner.next();
		
		
	}

	@Override
	public boolean checkVerificationCode() {
		
		if(this.verificationCode.equals(inputVerificationCode))
		{		
			this.inputVerificationCode = "";
			this.verificationCode = "";
			return true;
		}
		
		return false;

		
	}
	
}
