class CWH2 extends Thread{
    public void run(){
        for (int i=0;i<10;++i){
            System.out.println(i);
        }
    }
}

public class Interrupt_2 extends Thread{
    public static void main(String[] args) {
         CWH2 t= new CWH2();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
/*Here the thread works normally because no exception occurred during the
 *  thread's execution, so the interrupt() only sets the value of the thread flag to true.
 */