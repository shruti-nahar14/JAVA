package bankmain;

public class currentacc extends Account1{
	private String companyname;

	public currentacc(int accid, String acctype, double accbal, String company) {
		super(accid, acctype, accbal);
		this.companyname = company;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	

}
