
public class Account {
	private int accno;
	private String custname;
	private int accbal;
	public Account(int accno, String custname, int accbal) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	

}
