
public class compartmentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  compartment arr[]=new compartment[10];
  arr[0]=new Firstclass();
  arr[1]=new Ladies();
  arr[2]=new General();
  arr[3]=new Luggage();
  display(arr);
	}
public static void display(compartment arr[])

{
	for(compartment c:arr)
		{
		  if(c instanceof Firstclass)
		  {
			  System.out.println("--------------------------------------FIRSTCLASS------------------------------------");
			  c.notice();
		  }
		  if(c instanceof Ladies)
		  {
			  System.out.println("--------------------------------------LADIES------------------------------------");
			  c.notice();
		  }
		  if(c instanceof General)
		  {
			  System.out.println("--------------------------------------GENERAL------------------------------------");
			  c.notice();
		  }
		  if(c instanceof Luggage)
		  {
			  System.out.println("--------------------------------------LUGGAGE------------------------------------");
			  c.notice();
		  }
		}
		}
}
