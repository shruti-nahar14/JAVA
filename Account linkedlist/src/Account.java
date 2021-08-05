
public class Account {
	
	private int accid;
	private String custname;
	private double accbal;
	public Account(int accid, String custname, double accbal) {
		super();
		this.accid = accid;
		this.custname = custname;
		this.accbal = accbal;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	

}
