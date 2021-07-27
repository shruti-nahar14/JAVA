/////////////////////////////
/*class:stringfun
 *Input:--
 *Output:
//jack parker
//To_My_____Friend
//Dear Sachin, Thanks a lot!
//31
//-1
//Dear Harry,
	This Java Course is Nice.
Thanks!
 *Description:Implementation of String methods (inbuilt)
 *Date:27-July-2021
 *Author Name:Shruti Nahar
 *////////////////////////
public class stringfun {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "To My     Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}
