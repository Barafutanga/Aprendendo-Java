package src;
import java.util.Scanner;

public class IntervalVerifier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 0 && x <= 25) {
            System.out.println("[0,25] - x:" + x);
        }
        else if (x > 25 && x <= 50) {
            System.out.println("[26,50] - x:" + x);
        }
        else if (x > 50 && x <= 75) {
            System.out.println("[51,75] - x:" + x);
        }
        else if (x > 75 && x <= 100) {
            System.out.println("[76,100] - x:" + x);
        }
        else {
            System.out.println("x não se encontra nos intervalos determinados");}
        
        sc.close();
    }
}
