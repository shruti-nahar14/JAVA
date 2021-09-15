package productjava;

public class productsupply {
	private int prodid;
	private String prodname;
	private double prodprice;
	private int prodqty;
	public productsupply(int prodid, String prodname, double prodprice, int prodqty)
	{
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodqty = prodqty;
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
	public double getProdprice() {
		return prodprice;
	}
	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
	public int getProdqty() {
		return prodqty;
	}
	public void setProdqty(int prodqty) {
		this.prodqty = prodqty;
	}
}
