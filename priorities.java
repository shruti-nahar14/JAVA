

/////////////////////////////
/*Input:--
 *Output:Thank you: Harry1
Thank you: Harry5 (most Important)
Thank you: Harry4
Thank you: Harry2
Thank you: Harry2
Thank you: Harry2
Thank you: Harry2
Thank you: Harry3
Thank you: Harry2
Thank you: Harry4
Thank you: Harry5 (most Important)
Thank you: Harry1
Thank you: Harry5 (most Important)
Thank you: Harry4
Thank you: Harry3
Thank you: Harry2
Thank you: Harry3
Thank you: Harry4
Thank you: Harry5 (most Important)
Thank you: Harry1
Thank you: Harry5 (most Important)
Thank you: Harry4
Thank you: Harry3
Thank you: Harry2
Thank you: Harry3
Thank you: Harry4
Thank you: Harry5 (most Important)
Thank you: Harry1
Thank you: Harry5 (most Important)
Thank you: Harry4
Thank you: Harry3
Thank you: Harry2
Thank you: Harry3
Thank you: Harry4
Thank you: Harry3
Thank you: Harry5 (most Important)
Thank you: Harry1
Thank you: Harry5 (most Important)
Thank you: Harry3
Thank you: Harry4
Thank you: Harry2
Thank you: Harry4
Thank you: Harry3
Thank you: Harry5 (most Important)
Thank you: Harry1
Thank you: Harry2
Thank you: Harry1
Thank you: Harry1
Thank you: Harry1
Thank you: Harry1

 *Description:Implementation of priorities in thread
 *Date:16-09-2021
 *Author Name:Shruti Nahar
 *//////////////////////////////
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
        }

    }
}

public class priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
