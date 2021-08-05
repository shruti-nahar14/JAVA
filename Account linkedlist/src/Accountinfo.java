import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


public class Accountinfo {
public List<Account> create()
{
	Scanner sc=new Scanner(System.in);
	List<Account> lst=new LinkedList<Account>();
	String str;
	do
	{
	System.out.println("Enter the Accid Custname Accbal");
	Account acc=new Account(sc.nextInt(),sc.next(),sc.nextDouble());
	lst.add(acc);
	System.out.println("Do you want more object to be added ");
	str=sc.next();
	}while(str.equals("yes"));
	return lst;
}
public void display(List<Account> lst)
{
	for(Account a: lst )
   {
	System.out.println(a.getAccid()+"\t"+a.getCustname()+"\t"+a.getAccbal());	
  }
}
public void search(List<Account> lst,int empid)
{
	boolean b=false;
	for(Account a:lst)
	{
	b=lst.contains(a);
	}
	if(b)
	{
		System.out.println("search");
	}
	else
	{
		System.out.println("not searched");
	}
	
}
}
