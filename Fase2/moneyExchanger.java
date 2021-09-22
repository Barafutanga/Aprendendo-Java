import java.util.Scanner;
import Entities.currencyConverter;
import java.util.Locale;

public class moneyExchanger {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Dollar price: $");
            double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
            double amount = sc.nextDouble();
            double finalPrice = currencyConverter.dollarToReal(amount, dollarPrice);

        System.out.printf("Total to be payed: R$ %.2f", finalPrice);
       
        sc.close();
    }
    
}
