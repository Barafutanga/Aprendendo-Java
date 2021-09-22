import java.util.Scanner;

public class CaseIntervalCopy {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int limit = sc.nextInt();

        for (int limiter = 0; limiter < limit; limiter ++) {
            double x1, x2, x3, med;
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            med = (x1 * 2 + x2 * 3 + x3 * 5) / limit;
            System.out.printf("Média Ponderada: %.1f", med);

        }
        
    sc.close();
    }
    
}
