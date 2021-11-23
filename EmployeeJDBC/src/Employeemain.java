import java.util.List;
import java.util.Scanner;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	Employeedao dao=new Employeedao();
	employee e=null;
    do
    {
    	System.out.println("1.Create \n2.Delete \n3.Update \n4.Search \n5.Display ");
        System.out.println("Enter the Choice ");
        int ch=sc.nextInt();
    switch(ch)
    {
    case 1:
    	System.out.println("------------------------------------");
    	System.out.println("Enter the emp id:  ");
    	int id=sc.nextInt();
    	System.out.println("Enter the emp Name: ");
    	String name=sc.next();
    	System.out.println("Enter the emp job:  ");
    	String job=sc.next();
    	System.out.println("Enter the emp salary: ");
    	float sal=sc.nextFloat();
    	System.out.println("Enter the emp commission: ");
    	float comm=sc.nextFloat();
    	System.out.println("Enter the emp deptno: ");
    	int deptno=sc.nextInt();
    	employee emp=new employee(id,name,job,sal,comm,deptno);
    	int i=dao.create(emp);
    	e=emp;
    	if(i>0)
    	{
    		System.out.println("-----------------RECORD SAVED-------------------");
    	}
    break;
    case 2:
    	System.out.println("Enter the emp id to delete the record ");
    	int id1=sc.nextInt();
    	int y=dao.delete(id1, e);
    	if(y>0)
    	{
    		System.out.println("----------------Record Deleted!!!!!!!!!!!  ");
    	}
    	else
    	{
    		System.out.println("Record not found");
    	}
    break;
    case 3:
    	System.out.println("Enter the emp id and emp salary to be updated ");
    	int id2=sc.nextInt();
    	float salary=sc.nextFloat();
    	 i=dao.update(id2,salary,e);
    	 if(i>0)
    	 {
    		 System.out.println("Record Updated!! ");
    		 System.out.println("Updated salaray "+salary);
    	 }
    	 else
    	 {
    		 System.out.println("Record Not Found");
    	 }
     break;
    case 4:
    	System.out.println("Enter the employee id to search ");
    	int id3=sc.nextInt();
    	List<employee> lst=dao.search(id3, e);
    	for(employee e1:lst)
    	{
    		System.out.println("------------------SEARCH RECORD-----------------------");
    		System.out.println("Employee id "+e1.getEmpno());
    		System.out.println("Employee Name "+e1.getEmpname());
    		System.out.println("Employee Job  "+e1.getJob());
    		System.out.println("Employee salary  "+e1.getSal());
    		System.out.println("Employee Commision  "+e1.getComm());
    		System.out.println("Employee Deptno  "+e1.getDeptno());
    	}
    	break;
    case 5:
    	System.out.println("DISPLAY ALL RECORDS ");
	        List<employee> p=dao.Display(e);
	        for(employee e1:p)
	    	{
	    		System.out.println("--------------------------------------------");
	    		System.out.println("Employee id "+e1.getEmpno());
	    		System.out.println("Employee Name "+e1.getEmpname());
	    		System.out.println("Employee Job  "+e1.getJob());
	    		System.out.println("Employee salary  "+e1.getSal());
	    		System.out.println("Employee Commision  "+e1.getComm());
	    		System.out.println("Employee Deptno  "+e1.getDeptno());
	    	}
    }
    
    System.out.println("Do yo want to continue!!!!!!!!  ");
    }while(sc.next().equals("yes"));
    System.out.println("------------------------THANKYOU-----------------------");
	}
	

}
