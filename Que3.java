
//Demonstrate gerPriority() and setPriority() methods in Java threads.
class Thread5 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thread6 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class Que3 {
    public static void main(String[] args) {
        Thread5 t1= new Thread5();
        Thread6 t2= new Thread6();
        t1.start();
        System.out.println(t2.getState());
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);
        System.out.println(t2.getState());
      System.out.println(t2.currentThread());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}