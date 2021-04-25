
public class Course {
	
	int courseID;
	String courseTitle;
	String courseDetail;
	String courseAuthor;
	String coursePrice;
	
	// Constructor
	public Course(int id,String title,String detail, String author,String price)
	{
		this.courseID = id;
		this.courseTitle = title;
		this.courseDetail = detail;
		this.courseAuthor = author;
		this.coursePrice = (price == "0") ? "Ucretsiz" : price + " TL";
	}
	
}
