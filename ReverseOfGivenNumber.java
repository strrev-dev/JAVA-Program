import java.util.Scanner;

public class ReverseOfGivenNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Any number to print the reverse : ");
         int num = sc.nextInt();
         int reverseNumber = 0;

         for(; num>0;){
            int lastDigit =num%10;
             reverseNumber = (reverseNumber * 10) + lastDigit;
            
            num = num/10;
         }
         System.out.println("The reverse of a number is : " + reverseNumber);
    }
}
