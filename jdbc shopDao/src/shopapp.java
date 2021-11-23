import java.awt.List;
import java.util.Scanner;

public class shopapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Productdao dao=new Productdao();
		int i=0;
		System.out.println("1.CREATE \n2.DELETE \n3.UPDATE \n4.SEARCH \n5.DISPLAY ");
		do
		{
			System.out.println("Enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				do
				{
				System.out.println("Enter the prodid prodname price prodqty ");
				int prodid=sc.nextInt();
				String prodname=sc.next();
				int price=sc.nextInt();
				int prodqty=sc.nextInt();
				Product prod=new Product(prodid,prodname,price,prodqty);
				i=dao.create(prod);
				System.out.println("Do you want to buy more product yes/no");
				}while(sc.next().equals("yes"));
				if(i>0)
				{
					System.out.println("Record Created!!!!");
				}
				else
				{
					System.out.println("No Recorded Created ");
				}
				break;
			case 2:
				System.out.println("Enter the prodid to be deleted ");
				int id=sc.nextInt();
				i=dao.delete(id);
				if(i>0)
				{
					System.out.println("Record Deleted!!!!!");
				}
				else
				{
					System.out.println("Record Deleted ");
				}
				break;
			case 3:
				System.out.println("Enter the prodid and price too be updated ");
				Product p=new Product();
				p.setProdid(sc.nextInt());
				p.setPrice(sc.nextInt());
				i=dao.update(p);
				if(i>0)
				{
					System.out.println("Record Update!!!! ");
				}
				else
				{
					System.out.println("Record not Update ");
				}
				break;
			case 4:
				System.out.println("Enter the prodid to be searched ");
				int id1=sc.nextInt();
				java.util.List<Product> lst=dao.search(id1);
				Product p1=lst.get(0);
				System.out.println("SEARCH DETAILS ");
				System.out.println(p1.getProdid()+"\t"+p1.getProdname()+"\t"+p1.getPrice()+"\t"+p1.getProdqty());
				break;
			case 5:
				System.out.println("DISPLAY ALL RECORDS ");
				java.util.List<Product> pdao=dao.display();
				for(Product p2:pdao)
				{
					System.out.println(p2.getProdid()+"\t"+p2.getProdname()+"\t"+p2.getPrice()+"\t"+p2.getProdqty());
				}
				
			}
		System.out.println("Do you want to continue yes/no ");
		}while(sc.next().equals("yes"));
      System.out.println("-------------------------------THANKYOU-------------------------------------");
	}

}
