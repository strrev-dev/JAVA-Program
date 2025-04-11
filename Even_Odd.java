// This program checks if a number is even or odd

import java.util.Scanner;

public class Even_Odd{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " number is even.");
            } else {
                System.out.println(number + "number is odd.");
            }
    sc.close();
        }
    }
}
// public class Even_odd{
//     public static void main(String[] args) {
        
//         try (Scanner scanner = new scanner (System.inn)){

//             System.out.println("enter a number: ");
//             int number = scanner.nextInt();
//             if( number %2 == 0){
//                 System.out.println("The number is even.");
//             }else{
//                 System.out.println("The number is odd.  ");
//             }
//             }
//         }
//     }
// }