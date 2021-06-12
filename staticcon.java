///////////////////////////////////////////////////////
//Class:Accountstatic
//       staticcon
//Input:--
//Output:FIRST OBJECT 
//        Account no: 101
//        Account Holdername: shruti
//        Account Balance 1000
//        Account IFSCCODE 1010
//        SECOND OBJECT 
//        Account no: 102
//        Account Holdername: prachi
//        Account Balance 20000
//        Account IFSCCODE 2010
//        AGAIN CALL FIRST OBJECT AND CHECK THE STATIC VARIABLE VALUE
//        Account no: 101
//        Account Holdername: shruti
//        Account Balance 1000
//        Account IFSCCODE 2010
//Description:Display the use of Static variable
//Date: 12-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
package staticconcept;
class Accountstatic
{
	 int accno;
    String accname;
    int accbal;
    static int ifsccode;
}

public class staticcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountstatic as=new Accountstatic();
		as.accno=101;
		as.accname="shruti";
		as.accbal=1000;
		as.ifsccode=1010;
	System.out.println("FIRST OBJECT ");
	System.out.println("Account no: "+as.accno);
	System.out.println("Account Holdername: "+as.accname);
	System.out.println("Account Balance "+as.accbal);
	System.out.println("Account IFSCCODE "+as.ifsccode);
	Accountstatic as1=new Accountstatic();
	as1.accno=102;
	as1.accname="prachi";
	as1.accbal=20000;
	as1.ifsccode=2010;
   System.out.println("SECOND OBJECT ");
   System.out.println("Account no: "+as1.accno);
   System.out.println("Account Holdername: "+as1.accname);
   System.out.println("Account Balance "+as1.accbal);
   System.out.println("Account IFSCCODE "+as1.ifsccode);
   System.out.println("AGAIN CALL FIRST OBJECT AND CHECK THE STATIC VARIABLE VALUE");
   System.out.println("Account no: "+as.accno);
   System.out.println("Account Holdername: "+as.accname);
   System.out.println("Account Balance "+as.accbal);
   System.out.println("Account IFSCCODE "+as.ifsccode);
			
}
}