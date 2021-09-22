import java.util.Scanner;

public class Divisio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        
        int limit = sc.nextInt();

        for (int limiter = 0; limiter < limit; limiter ++) {
            double x, y;
            x = sc.nextDouble();
            y = sc.nextDouble();
            
            if (x != 0 || y != 0) {
                System.out.println(x / y);
            } else {
                System.out.println("Operação impossível");
            }
        }

    
    sc.close();
    }
    
}
