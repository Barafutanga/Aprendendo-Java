import java.util.Scanner;

public class CaseInterval {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int limit = sc.nextInt();

        for (int limiter = 0; limiter < limit; limiter ++) {
            double x1, x2, x3, med;
            x1 = sc.nextDouble() * 2;
            x2 = sc.nextDouble() * 3;
            x3 = sc.nextDouble() * 5;

            med = (x1 + x2 + x3) / limit;
            System.out.println(med);

        }
        
    sc.close();
    }
    
}
