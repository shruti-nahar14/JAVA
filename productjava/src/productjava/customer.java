package productjava;

public class customer {
	private int custid;
	private String custname;
	private int mobno;
	private productsupply prod;
	
	
	public customer(int custid, String custname, int mobno, productsupply prod) {
		this.custid = custid;
		this.custname = custname;
		this.mobno = mobno;
		this.prod = prod;
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


	public int getMobno() {
		return mobno;
	}


	public void setMobno(int mobno) {
		this.mobno = mobno;
	}


	public productsupply getProd() {
		return prod;
	}


	public void setProd(productsupply prod) {
		this.prod = prod;
	}
	
	
	

}
