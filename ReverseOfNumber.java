import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Any number to print the reverse : ");
         int num = sc.nextInt();

         for(; num>0;){
            int reverseNum =num%10;

            System.out.print(reverseNum);
            num = num/10;
         }
    }
}
