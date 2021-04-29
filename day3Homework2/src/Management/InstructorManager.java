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
			System.out.println("Eðitmen zaten sistemde mevcut.");
		
	}
	
	public void deleteInstructor(Instructor instructor)
	{
		if(instructor.isStatus())
		{
			/*
			 * Silme iþlemleri
			 */
			System.out.println("Eðitmen sistemden silindi.");
			instructor.setStatus(false);
		}
		else
			System.out.println("Eðitmen zaten sistemde mevcut deðil.");
	}
	
	
	public void showInstructorInfos(Instructor instructor)
	{
		
		System.out.println("\nId: " + instructor.getId());
		System.out.println("Ad-Soyad: " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("Branþ: " + instructor.getBranchName());
		System.out.println("Email: " + instructor.getEmail());
		String sentence = "Eðitmen " + ((instructor.isStatus()) ?  "sistemde ekli." : "sistemde ekli deðil.") + "\n";
		System.out.println(sentence);
	}
}
