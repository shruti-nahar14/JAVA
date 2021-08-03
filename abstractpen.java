package a;

	abstract class Pen{
	    abstract void write();
	    abstract void refill();
	}

	class FountainPen extends Pen{
	    void write(){
	        System.out.println("Write");
	    }
	    void refill(){
	        System.out.println("Refill");
	    }
	    void changeNib(){
	        System.out.println("Changing the nib");
	    }
	}
	
	public class abstractpen {
	    public static void main(String[] args) {
	        // Q1 + Q2
	        FountainPen pen = new FountainPen();
	        pen.changeNib();

	    

	    }
	}



