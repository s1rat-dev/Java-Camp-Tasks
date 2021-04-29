package UserTypes;

public class Instructor extends User {
	
	
	private String branchName;
	
	public Instructor(int id, String email, String password, String firstName, String lastName, String branchName)
	{
		super(id,email,password,firstName,lastName);
		this.setBranchName(branchName);

		
	}

	public String getBranchName() 
	{
		return branchName;
	}

	public void setBranchName(String branchName) 
	{
		this.branchName = branchName;
	}
	
	
}
