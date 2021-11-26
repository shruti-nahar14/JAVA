package Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount acc=new SavingAccount();
      acc.Account();
      acc.BankName("SBI");
      CommericalAccount a=new CommericalAccount();
      a.Account();
      a.BankName("ICICI");
	}

}
