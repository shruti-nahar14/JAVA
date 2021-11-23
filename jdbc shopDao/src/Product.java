
public class Product {
	private int prodid;
	private String prodname;
	private int price;
	private int prodqty;
	public Product(int prodid, String prodname, int price, int prodqty) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.price = price;
		this.prodqty = prodqty;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProdqty() {
		return prodqty;
	}
	public void setProdqty(int prodqty) {
		this.prodqty = prodqty;
	}

}
