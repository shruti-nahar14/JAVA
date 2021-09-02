package inheritance;

public class son extends father {
private int sage;
public son(int sage)
{
	super(sage+20);
	this.sage=sage;
}
public void showage()
{
	super.showage();
	System.out.println("son age is "+sage);
}
}
