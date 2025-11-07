
import java.util.Scanner;

public class SumofNnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of N : ");
        int N = sc.nextInt();

        int sum = 0;

        int i =1;
        while(i<=N){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
