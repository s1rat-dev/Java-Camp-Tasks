
public class CourseManager {
	
	Course[] myCourses = new Course[3];
	int courseCounter = 0;

	public void addToMyCourses(Course myCourse) {
		
		this.myCourses[this.courseCounter] = myCourse;
		this.courseCounter++;

	}

	public void showMyCourses()
	{
		if(this.courseCounter == 0)
			System.out.println("Hic kursunuz bulunmamakta.");
		else
		{
			for (Course course : this.myCourses)
			{
				if(course != null)
				{

					System.out.println("Kurs adý: "+course.courseTitle);
					System.out.println("Kurs detayý: "+course.courseDetail);
					System.out.println("Kurs ucreti: "+course.coursePrice);
					System.out.println("Egitmen: "+course.courseAuthor);
					System.out.println();
				}
			}
		}
	}
	
}
