package MultiThreading;

public class executing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t=new Mythread();
		t.start();
       multitassk mlt=new multitassk();
       mlt.run();
       mlt.show();
       Thread trd=new Thread(mlt);
       trd.start();
       System.out.println(trd.getState());
       
    	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
