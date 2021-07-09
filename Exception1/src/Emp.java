/////////////////////////////
 /*Input:-
1.create 
2.display 
3. calculate 
Enter your choice 
1
-------------------------------------
Enter the empid 
101
Enter the empname 
shruti
Enter the designation 
Manager
Enter the basic 
200
 *Output:-OOPS!!!! LowSalException basic salary is less than 500
 *Description:userdefined exception LowSalException()
 *Date:9-July-2021
 *Author Name:Shruti Nahar
 */
////////////////////////////
import java.util.Scanner;

public class Emp {
	int empId;
	String empName;
	String designation;
	double basic;
	static double hra;
	public Emp(int empId, String empName, String designation, double basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
	}
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		if(basic<500)
		{
			try
			{
				throw new LowSalException();
			}
			catch(LowSalException l)
			{
				System.out.println(l);
			}
		}
		return basic;
	}



	public void setBasic(double basic) {
		this.basic = basic;
	}

    public static Emp create()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the empid ");
    	int id=sc.nextInt();
    	System.out.println("Enter the empname ");
    	String name=sc.next();
    	System.out.println("Enter the designation ");
    	String d=sc.next();
    	System.out.println("Enter the basic ");
    	double basic=sc.nextDouble();
    	Emp e=new Emp(id,name,d,basic);
    	e.getBasic();
    	return e;
    }
    public static void Printdep(Emp e)
    {
    	System.out.println("EMPID: "+e.getEmpId());
    	System.out.println("EMPNAME: "+e.getEmpName());
    	System.out.println("EMP DESIGNATION: "+e.getDesignation());
    	System.out.println("EMP BASIC: "+e.getBasic());
    }
    public static void calculatehra(Emp e)
    {
    	if(e.getDesignation()==" Manager")
    	{
    		hra=e.getBasic()*0.1;
    		System.out.println("Manager HRA is "+hra);
    	}
    	else if(e.getDesignation()==" Officer")
    	{
    		hra=e.getBasic()*0.1;
    		System.out.println("Officer HRA is "+hra);
    	}
    	else if(e.getDesignation()==" Clerk")
    	{
    		hra=e.getBasic()*0.05;
    		System.out.println("Clerk HRA is "+hra);
    	}
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Emp e=null;
		do
		{
		System.out.println("\n1.create \n2.display \n3. calculate ");
		System.out.println("Enter your choice ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		  System.out.println("-------------------------------------");
		   Emp e1=create();
		   e=e1;
		   break;
		case 2:
			System.out.println("----------------------------------------");
		     Printdep(e);
		     break;
		case 3:
			System.out.println("-----------------------------------------");
			calculatehra(e);
		    break;
		}
		System.out.println("Do you want to Continue!!!!!!!! ");
		}while(sc.next().equals("yes"));
      
	}

}
