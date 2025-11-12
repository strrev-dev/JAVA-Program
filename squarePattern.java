
import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        System.out.print("Please enter the value of lines : ");
        int l = sc.nextInt();
        System.out.println("Please enter the value  of stars for per line : ");
        int s = sc.nextInt();

        for(i=0; i<l; i++){
            for(j=1; j<=s;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
