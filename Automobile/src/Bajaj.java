
public class Bajaj implements bike

{
	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "kmn";
	}

	@Override
	public String getcolour() {
		// TODO Auto-generated method stub
		return "gray";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 88000;
	}

	@Override
	public int noofcc() {
		// TODO Auto-generated method stub
		return 3;
	}
	public String tostring()
	{
		return "BAJAJ MODEL: "+getmodel() +
				"\nBAJAJ COLOUR: "+getcolour() + 
				"\nBAJAJ PRICE: "+getprice() +
				"\n BAJAJ NO-OF-CC: "+noofcc();
	}
}
