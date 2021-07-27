/////////////////////////////
/*class:CBSEmark
 *Input:
Enter your Physics marks : 
55
Enter your English marks : 
85
Enter your Chemistry marks : 
67
Enter your Mathematics marks : 
56
Enter your Computer Science marks : 
87
 *Output:percentage : 70.0
 *Description:Displaying the CBSE Result in percentage 
 *Date:27-July-2021
 *Author Name:Shruti Nahar
 *////////////////////////
import java.util.Scanner;

public class CBSEmark {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();

        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}