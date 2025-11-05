import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the number you want to check if it is odd or even : ");
        int num= sc.nextInt();
       

        if(num%2 == 0){
            System.out.println(num + " is Even number");

        }
        else {
            System.out.println("The number " + num + " is odd");
        }
    }
}
