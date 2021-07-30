package rockscissorpaper ; 
import java.util.Scanner;
import java.util.Random;

public class guessnumbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Game g=new Game();
         g.play();
	}

}
class Game{
    private int noOfGuesses;
    private int computerNumber;
    private int userInput;
    
	public Game(){
        Random rand = new Random();
        computerNumber = rand.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess your number >> ");
        userInput = sc.nextInt();
    }
    
    public boolean isCorrectNumber(){
        if (computerNumber == userInput){
            return false;
        } 
        else{
            return true;
        }
    }
    
    public void play(){
    	 Scanner sc = new Scanner(System.in);
        System.out.println("I have decided on a number between 0 - 100");
        System.out.println("Can you guess the number?");
        System.out.println();

    
        do
        {
        	
        	 takeUserInput();
        	 noOfGuesses++;
           if(isCorrectNumber())
           {
                if(userInput < computerNumber){
                System.out.println("The number you guess is smaller than Random number");
                System.out.println();
            }
            else if( userInput > computerNumber){
         
            	System.out.println("The number you guess is larger than Random number");
            }
           }
           else
           {
        	   System.out.println("Number Matched Congrulation!!!!");
        	   System.out.println("Computer Input was "+computerNumber);
           }
           System.out.println("Do you want to continue with game!!!!!!!!!!!!");
        }while(sc.next().equals("yes"));
        System.out.println("No of guess are "+noOfGuesses);
    }
}
