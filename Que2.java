/*Add a step method in the welcome thread of question 1 to delay its execution for 200ms.*/
/////////////////////////////
/*Input:--
 *Output:
 Good morning
 Welcome
 *Description:Implementation of delay for 200ms 
 *Date:17-09-2021
 *Author Name:Shruti Nahar
 *//////////////////////////////
class Thread3 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
    }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Thread4 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class Que2 {
    public static void main(String[] args) {
        Thread3 t1= new Thread3();
        Thread4 t2= new Thread4();
        t1.start();
        t2.start();
    }
}
