package day3Homework2;

import Management.*;
import UserTypes.*;


public class Main {

	public static void main(String[] args) {
		
		User user = new User(0, "siratsemih@gmail.com", "pass123", "Sýrat", "Çöp");
		Student student = new Student(1, "siratsemih@outlook.com", "pass1234", "Sýrat", "Çöp", "herhangibirurl", "Kastamonu..");
		Instructor instructor = new Instructor(2, "deneme@mail.com", "pass1234", "deneme", "kayit", "Yazýlým Mimarisi");
		
		UserManager myUserManager = new UserManager();
		StudentManager myStudentManager = new StudentManager();
		InstructorManager myInstructorManager = new InstructorManager();
		
		
		System.out.println("*********************************************");
		myStudentManager.addStudent(student);
		myStudentManager.showStudentInfos(student);
		myStudentManager.deleteStudent(student);
		System.out.println("*********************************************");
		
		System.out.println("*********************************************");
		myUserManager.addUser(user);
		myUserManager.showUserInfos(user);
		myUserManager.deleteUser(user);
		System.out.println("*********************************************");
		
		System.out.println("*********************************************");
		myInstructorManager.addInstructor(instructor);
		myInstructorManager.showInstructorInfos(instructor);
		myInstructorManager.deleteInstructor(instructor);
		System.out.println("*********************************************");
		
		// Silinmesi sonrasý bilgi görüntüleme/silme islemleri.
		myInstructorManager.showInstructorInfos(instructor);
		myStudentManager.showStudentInfos(student);
		myUserManager.showUserInfos(user);
		System.out.println("**********************************************");
		myStudentManager.deleteStudent(student);
		myInstructorManager.deleteInstructor(instructor);
		myUserManager.deleteUser(user);
		

	}

}
