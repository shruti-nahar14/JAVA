package bankmain;

public class Savingaccount extends Account1 {
	private double interestrate;

	public Savingaccount(int accid, String acctype, double accbal, double interestrate) {
		super(accid, acctype, accbal);
		this.interestrate = interestrate;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}
	

}
