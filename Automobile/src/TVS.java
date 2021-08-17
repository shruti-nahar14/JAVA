
public class TVS implements bike
{

@Override
public String getmodel() {
	// TODO Auto-generated method stub
	return "xyx";
}

@Override
public String getcolour() {
	// TODO Auto-generated method stub
	return "green";
}

@Override
public double getprice() {
	// TODO Auto-generated method stub
	return 80000;
}

@Override
public int noofcc() {
	// TODO Auto-generated method stub
	return 4;
}
@Override
public String toString()
{
	return "\nTVS MODEL: "+getmodel() +
			"\nTVS COLOUR: "+getcolour() + 
			"\nTVS PRICE: "+getprice() + 
			"\nTVS NO-OF-CC: "+noofcc();
}
}