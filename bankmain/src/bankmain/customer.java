package bankmain;

public class customer {
	private int custid;
	private String custname;
	private int custmobno;
	private Account1 acc;
	
	public customer(int custid, String custname, int custmobno, Account1 acc) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custmobno = custmobno;
		this.acc = acc;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getCustmobno() {
		return custmobno;
	}
	public void setCustmobno(int custmobno) {
		this.custmobno = custmobno;
	}
	public Account1 getAcc() {
		return acc;
	}
	public void setAcc(Account1 acc) {
		this.acc = acc;
	}
	
}
