//thiis is a java program to find the square, cube and square root of a number

import java.util.Scanner;

public class square_cube_root {
    public static void main(String[] args) {
        int num1  ;
        double Square , Cube , Squareroot;
        Scanner sc = new Scanner(System.in); // create a scanner object
        System.out.println("Please enter a number");
        num1 = sc.nextInt();
        Square = Math.pow(num1, 2);
        Cube = Math.pow(num1, 3);
        Squareroot = Math.sqrt(num1);
        System.out.println("the square of"  + num1 + "is " + Square);
        System.out.println("the cube of" + num1 + "is " + Cube);
        System.out.println("the square root of" + num1 + "is " + Squareroot);
        sc.close();
    }
}
