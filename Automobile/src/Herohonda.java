
public class Herohonda implements bike 
{

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "pqr";
	}

	@Override
	public String getcolour() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public int noofcc() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String toString() 
	{
		return "\nHEROHONDA MODEL: "+getmodel()+
				"\nHEROHONDA COLOUR: "+getcolour()+
				"\nHEROHONDA PRICE: "+getprice()+
				"\nHEROHONDA NO-OF-CC: "+noofcc();
		
	}
}
