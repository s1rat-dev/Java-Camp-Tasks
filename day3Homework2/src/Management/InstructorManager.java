package Management;
import UserTypes.Instructor;

public class InstructorManager{
	
	public void addInstructor(Instructor instructor)
	{
		if(!instructor.isStatus())
		{
			/*
			 * Ekleme islemleri.
			 */
			System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " sisteme eklendi.");
			instructor.setStatus(true);
		}
		else
			System.out.println("E�itmen zaten sistemde mevcut.");
		
	}
	
	public void deleteInstructor(Instructor instructor)
	{
		if(instructor.isStatus())
		{
			/*
			 * Silme i�lemleri
			 */
			System.out.println("E�itmen sistemden silindi.");
			instructor.setStatus(false);
		}
		else
			System.out.println("E�itmen zaten sistemde mevcut de�il.");
	}
	
	
	public void showInstructorInfos(Instructor instructor)
	{
		
		System.out.println("\nId: " + instructor.getId());
		System.out.println("Ad-Soyad: " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("Bran�: " + instructor.getBranchName());
		System.out.println("Email: " + instructor.getEmail());
		String sentence = "E�itmen " + ((instructor.isStatus()) ?  "sistemde ekli." : "sistemde ekli de�il.") + "\n";
		System.out.println(sentence);
	}
}
