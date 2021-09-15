class CWH1 extends Thread{
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(4000); /* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */

            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Thread Interrupted");
        }
	System.out.println("Thread is running");

    }
}

public class Interrupt_1 extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
/*In the above code, the for loop runs for the first time, 
 * but the child thread is put to sleep after that. So, the main() 
 * method interrupts the child thread, and InterruptedException is generated.
 *Here, the child thread comes out of the sleeping state, but it does not stop working.
 */