import java.sql.Date;

public class bill {
	private int billno;
	private int total;
	private float gst;
	private Date billdate;
	private double finalbill;
	public bill(int billno, int total, float gst,Date billdate, double finalbill) {
		super();
		this.billno = billno;
		this.total = total;
		this.gst = gst;
		this.billdate = billdate;
		this.finalbill = finalbill;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
	public Date getBilldate() {
		return billdate;
	}
	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}
	public double getFinalbill() {
		return finalbill;
	}
	public void setFinalbill(double finalbill) {
		this.finalbill = finalbill;
	}
	
	
	
}
