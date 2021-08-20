package shopmanger;

public class product
		{
	private int pid;
	private String pname;
	private int price;
	private int qty;
	public product(int pid, String pname, int price,int qty) {
		
		this.pid = pid;
		this.pname = pname;
		this.price= price;
		this.qty=qty;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
