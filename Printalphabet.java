// Java program to print uppercase and lowercase alphabets

public class Printalphabet {

    public static void main(String[] args) {
        //Print  Uppercase alphabets
        System.out.println("Upperccase Alphabets");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.print("\n");
        System.out.println("Lowercase Alphabets");
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            System.out.print(ch1 + " ");
        }
    }
}
