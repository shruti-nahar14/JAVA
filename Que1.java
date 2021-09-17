

/////////////////////////////
/*Input:--
 *Output:
 *Welcome
Welcome
Welcome
Welcome
Welcome
Welcome
Welcome
Welcome
Welcome
Welcome
Good morning
Good morning
Good morning
Good morning
Good morning
Good morning
Good morning
Good morning
Good morning
Good morning
 *Description:Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
 *Date:17-09-2021
 *Author Name:Shruti Nahar
 *//////////////////////////////
class Thread1 extends Thread{
    public void run(){
        while (true){
        System.out.println("Welcome");
    }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
public class Que1 {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
