
public class swift implements Automobile {

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "xyz";
	}

	@Override
	public String getcolour() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 600000;
	}
	@Override
	public String toString()
	{
		return "SWIFT MODEL: "+getmodel() +
				"\nSWIFT COLOUR: "+getcolour() + 
				"\nSWIFT PRICE: "+getprice();
	}

}
