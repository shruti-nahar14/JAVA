package map;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class studentinfo {
	public 	Map<String ,student> create()
	{
		Scanner sc=new Scanner(System.in);
		Map<String ,student> studmap=new HashMap<String, student>();
		int ch;
		do
		{
			System.out.println("-----------------------------STUDENT DETAILS---------------------------------------");
			System.out.println("Enter the Studentid ");
			String id=sc.next();
			System.out.println("Enter the Student name ");
			String studname=sc.next();
			System.out.println("Enter the math marks ");
			int sub1=sc.nextInt();
			System.out.println("Enter the Science marks ");
			int sub2=sc.nextInt();
			System.out.println("Enter the Socialscience marks ");
			int sub3=sc.nextInt();
			int total=sub1+sub2+sub3;
			double per=total/3;
			studmap.put(id,new student(studname,sub1,sub2,sub3,total,per));
			System.out.println("Do you want add details press 1 ");
			ch=sc.nextInt();
		}while(ch==1);
		return studmap;	
		}
	public void display(Map<String ,student> stud)
	{
		Set<String> studkey=stud.keySet();
		System.out.println("ID\tSTUDENTNAME\tSUB1\tSUB2\tSUB3\tTOTAL\tPERCENTAGE");
		for(String s: studkey)
		{
			student sobj=stud.get(s);
			System.out.println( s +"\t"+sobj.getStudname()+"\t\t"+sobj.getSub1()+"\t"+sobj.getSub2()+"\t"+sobj.getSub3()+"\t"+sobj.getTotal()+"\t"+sobj.getAverage());
			
		}
	}
	

}
