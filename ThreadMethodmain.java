
public class ThreadMethodmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        threadMethodDemo t1=new threadMethodDemo("Java");
        threadMethodDemo t2=new threadMethodDemo("Oracle");
        t1.setName("Hello Thread 1");
        t2.setName("Hello Thread 2");
        System.out.println(t1.isAlive());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        System.out.println( t2.isAlive());
        for(int i=1;i<5;i++)
        {
        	System.out.println("main "+i);
        	try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        System.out.println("Thankyou");
        
	}

}
