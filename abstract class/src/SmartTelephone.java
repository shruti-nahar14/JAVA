
public class SmartTelephone extends Telephone {
	  @Override
	void ring() {
		// TODO Auto-generated method stub
		System.out.println("Ringing!!!!!!");
	}
	  @Override
	void lift() {
		// TODO Auto-generated method stub
		System.out.println("Lifting!!!!!!");	
	}
	  @Override
	void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnecting...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SmartTelephone s=new SmartTelephone();
       s.lift();
       s.ring();
       s.disconnect();
      
	}


}
