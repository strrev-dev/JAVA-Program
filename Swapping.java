// Java program to swap two numbers with and without using third variable

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Please enter the second number: ");
            int b = sc.nextInt();
            System.out.println("before swapping a " + a + " b " + b);

            //swapping using third variable
            // int temp = a;
            // a = b;
            // b = temp;
            // System.out.println("after swapping using third variable a = " + a + " b = " + b);
            //swapping without using third variable
            a = a + b; // a now becomes 30
            b = a - b; // b becomes 10
            a = a - b; // a becomes 20
            System.out.println("after swapping without using third variable a = " + a + " b = " + b);
           

        }
    }
}


