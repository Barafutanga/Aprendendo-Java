import java.util.Locale;
import java.util.Scanner;

public class ExN1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //SOMA 
        /*
        int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = x + y;

        System.out.println(x + "+" + y + "=" + z);

        sc.close();
        */


        //Área do círculo
              
        Locale.setDefault(Locale.US);
            double pi, a;
            int r;
            pi = 3.14159;
            r = sc.nextInt();
            a = pi * Math.pow(r, 2);

            System.out.println();
            System.out.println("ÁREA DO CÍRCULO");
            System.out.println("a = pi * r^2");
            System.out.printf("%.2f%n", a);

        sc.close();


        
    }
}
