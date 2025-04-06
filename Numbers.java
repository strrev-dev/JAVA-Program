//find sum  and average of two numbers
import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        int num1, num2, sum;
        double average;
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println(  "Enter second number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        average = sum / 2.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        sc.close();
        }
    }
}