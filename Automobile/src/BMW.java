
public class BMW implements Automobile {

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "txz";
	}

	@Override
	public String getcolour() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 700000;
	}
	@Override
	public String toString()
	{
		return "\nBMW MODEL: "+getmodel()+
				"\nBMW COLOUR: "+getcolour()+
				"\nBMW PRICE:  "+getprice();
	
	}
}
