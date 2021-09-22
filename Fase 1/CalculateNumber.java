import java.util.Scanner;
import java.util.Locale;

public class CalculateNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("DIGITE UM VALOR PARA X:");
        System.out.print("X: ");
        int x = sc.nextInt();

        for (int limiter = 1; limiter <= x; limiter ++){
            
            double x2, x3;
            x2 = Math.pow(limiter, 2);
            x3 = Math.pow(limiter, 3);

            System.out.printf("%d: %.1f - %.1f%n", limiter, x2, x3);
        }

        sc.close();
    }
    
}
