import java.util.Scanner;

public class Print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value : ");
        int n = sc.nextInt() ;

        int count = 1;
        while(count <=n){
            System.out.println(count);
            count++;
        }

    }
}
