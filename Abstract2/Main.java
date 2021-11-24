package Abstract2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("---------------------------");
      Course c=new EngineeringCourse();
      c.CourseDetails();
      c.IstituteName("Alpha Istitute");
      System.out.println("-----------------------------");
      Course c1=new ScienceCourse();
      c1.CourseDetails();
      c1.IstituteName("Linkcode Institute");
      System.out.println("-----------------------------");
      Course c2=new FinanceCourse();
      c2.CourseDetails();
      c2.IstituteName("ABC Commerce Institute");
	}

}
