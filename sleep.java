////////////////////////////////////////////////////////
/*Input:--
//Output:Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
My Thank you: 
Thank you: 
Thank you: 
Thank you: 
Thank you: 
Thank you: 
Thank you: 
Thank you: 
Thank you: 
Thank you: 
//Description:sleep method in thread 
//Date:16-09-2021
//Author: Shubham lodha*/
//////////////////////////////////////////////////////

class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
    	int i=0;
        while(i<10){
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

public class sleep {
    public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
