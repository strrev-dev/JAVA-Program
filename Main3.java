//How to read and print an integer value in Java?
import java.util.*;
// import the Scanner class from the java.util package
public class Main3 {
   public static void main (String[] args){
  // create a scanner object  to read input
        try (Scanner scanner = new Scanner(System.in)) {
            //Prompt the user for an integer
            System.out.print("Enter an integer: ");
            //Read the integer from the user 
            int number = scanner.nextInt();
            //Print the integer
            System.out.println("you  entered " +number);
            //prompt the user for a float
            System.out.print("Enter a float: ");
            //read the float from the  user
            float number2 = scanner.nextFloat();
            //print the float
            System.out.println("you entered " + number2);
        }
   }
        // Note: It's a good practice to close the scanner to free up resources.
        // However, if you close the scanner, you cannot use it again in the same program.
    
}
