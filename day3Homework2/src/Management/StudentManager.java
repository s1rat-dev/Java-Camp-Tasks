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
			System.out.println("��renci zaten sistemde mevcut.");
		
	}
	
	public void deleteStudent(Student student)
	{
		if(student.isStatus())
		{
			/*
			 * Silme i�lemleri
			 */
			System.out.println("��renci sistemden silindi.");
			student.setStatus(false);
		}
		else
			System.out.println("��renci zaten sistemde mevcut de�il.");
	}
	
	
	public void showStudentInfos(Student student)
	{
		
		System.out.println("\nId: " + student.getId());
		System.out.println("Ad-Soyad: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Adres: " + student.getAdress());
		System.out.println("Email: " + student.getEmail());
		String sentence = "��renci " + ((student.isStatus()) ?  "sistemde ekli." : "sistemde ekli de�il.") + "\n";
		System.out.println(sentence);
	}
}
