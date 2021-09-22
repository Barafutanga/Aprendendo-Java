package src;
import java.util.Scanner;

public class MultiCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double limit = sc.nextDouble();

        for (int limiter = 1; limiter <= limit; limiter ++) {
            if (limit % limiter == 0) {
                System.out.println(limiter); 
            }
        }
    sc.close();
    }
    
}
