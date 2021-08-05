import java.util.List;
import java.util.Scanner;

public class Accountlinked {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Accountinfo acc=new Accountinfo();
		List<Account> alst= acc.create();
		acc.display(alst);
		System.out.println("Enter the element to be searched ");
		int empid=sc.nextInt();
		acc.search(alst,empid );
	}

}
