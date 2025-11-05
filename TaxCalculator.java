import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("What is your income? : ");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        
        if (income <=500000){
         double tax = income*0.0;
         System.out.println("The income tax is only applicable for the income of above 5 lakh ");
        }
        else if (income >500000 && income <1000000){
            double tax = income*0.2;
            System.out.println("The tax for the income is : " + tax);
        }
        else{
            double tax = income *0.3;
            System.out.println("The tax for the income is : " + tax);
        }
    }
}
