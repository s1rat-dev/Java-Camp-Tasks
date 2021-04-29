package UserTypes;

public class Student extends User {
	
	private String pathOfImage;
	private String adress;
	
	
	public Student(int id, String email, String password, String firstName, String lastName, String pathOfImage, String adress)
	{
		super(id,email,password,firstName,lastName);
		this.setAdress(adress);
		this.setPathOfImage(pathOfImage);
	}
	
	
	public void setAdress(String adress)
	{
		this.adress = adress;
	}
	 
	
	public void setPathOfImage(String pathOfImage)
	{
		this.pathOfImage = pathOfImage;
	}
	
	
	public String getAdress()
	{
		return this.adress;
	}
	
	
	public String getPathOfImage()
	{
		return this.pathOfImage;
	}
	
}
