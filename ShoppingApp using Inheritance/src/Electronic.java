
public class Electronic extends  Product{
	private String Brand; 
	private String ram;
	private String storage;
	
	
	public Electronic(int id, String name, double price, int qty, String brand, String ram, String storage) {
		super(id, name, price, qty);
		Brand = brand;
		this.ram = ram;
		this.storage = storage;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	

}
