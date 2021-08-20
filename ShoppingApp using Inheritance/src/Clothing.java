
public class Clothing extends Product{
	private String fabric;
	private String size;
	public Clothing(int id, String name, double price,int qty, String fabric, String size) {
		super(id, name, price,qty);
		this.fabric = fabric;
		this.size = size;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	

}
