package Management;
import UserTypes.Student;


public class StudentManager{

	public void addStudent(Student student)
	{
		if(!student.isStatus())
		{
			/*
			 * Ekleme islemleri.
			 */
			System.out.println(student.getFirstName() + " " + student.getLastName() + " sisteme eklendi.");
			student.setStatus(true);
		}
		else
			System.out.println("Öðrenci zaten sistemde mevcut.");
		
	}
	
	public void deleteStudent(Student student)
	{
		if(student.isStatus())
		{
			/*
			 * Silme iþlemleri
			 */
			System.out.println("Öðrenci sistemden silindi.");
			student.setStatus(false);
		}
		else
			System.out.println("Öðrenci zaten sistemde mevcut deðil.");
	}
	
	
	public void showStudentInfos(Student student)
	{
		
		System.out.println("\nId: " + student.getId());
		System.out.println("Ad-Soyad: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Adres: " + student.getAdress());
		System.out.println("Email: " + student.getEmail());
		String sentence = "Öðrenci " + ((student.isStatus()) ?  "sistemde ekli." : "sistemde ekli deðil.") + "\n";
		System.out.println(sentence);
	}
}
