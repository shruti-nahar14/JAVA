public class customer {
	private int custid;
	private String custname;
	private double mobno;
	private address add;
    private Product prod[];
    private bill b;
  
	public customer(int custid, String custname, double mobno, address add,Product prod[]) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.mobno = mobno;
		this.add = add;
		this.prod=prod;
	}
	
	
	public Product[] getProd() {
		return prod;
	}


	public void setProd(Product[] prod) {
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
	
	public double getMobno() {
		return mobno;
	}

	public void setMobno(double mobno) {
		this.mobno = mobno;
	}

	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}


	public bill getB() {
		return b;
	}


	public void setB(bill b) {
		this.b = b;
	}

	


}
