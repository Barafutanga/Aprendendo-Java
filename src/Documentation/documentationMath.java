package src.Documentation;
import java.util.Scanner;

public class documentationMath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double x, y, z;
        double A, B, C;
        
        //input values
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();


        //Raiz quadrada
            A = Math.sqrt(x);
            B = Math.sqrt(y);
            C = Math.sqrt(z);

        System.out.println();
        System.out.println("Raiz quadrada de:");
        System.out.println(x + " = " + A);
        System.out.println(y + " = " + B);
        System.out.println(z + " = " + C);


        //Potenciação
            A = Math.pow(x, y);
            B = Math.pow(y, x);
            C = Math.pow(z, y);

        System.out.println();
        System.out.println("Potenciação de:");
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(y + " elevado a " + x + " = " + B);
        System.out.println(z + " elevado a " + y + " = " + C);

        sc.close();
    }
}
