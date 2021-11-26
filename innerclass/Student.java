package innerclass;

public class Student {
	private int id=101;
	private String Name="Shruti";
	private String Address="Bhujadi Estate Rahuri";
	
public class Course
{
	private int Course_id=10001;
	private String Course_name="Java Programming";
	private int price=5000;
	public void showAlldata()
	{
		System.out.println("-------------DISPLAY STUDENT DETAILS------------");
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+Name);
		System.out.println("Student Address: "+Address);
		System.out.println("Course Id: "+Course_id);
		System.out.println("Course Name: "+Course_name);
		System.out.println("Course Price: "+price);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student t=new Student();
    Student.Course sc=t.new Course();
    sc.showAlldata();
	}

}
