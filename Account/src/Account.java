
public class Account 
{
private int accno;
private String acctype;
private double accbal;
public Account(int accno, String acctype, double accbal) {
	this.accno = accno;
	this.acctype = acctype;
	this.accbal = accbal;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public double getAccbal() {
	return accbal;
}
public void setAccbal(double accbal) {
	this.accbal = accbal;
}

}
