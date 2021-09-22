import java.util.Scanner;
import java.util.Locale;

public class CoordinatesFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double x,y;
        System.out.println("BEM VINDO AO COORDINATOR 2000, POR FAVOR INSIRA O VALOR DAS COORDENADAS");
            System.out.print("X: ");
                x = sc.nextDouble();
            
            System.out.print("Y: ");
                y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo X");
        }
        else if (y == 0) {
            System.out.println("Eixo Y");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.printf("Quadrante 1" + "[%.1f,%.1f]",x,y);
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.printf("Quadrante 2" + "[%.1f,%.1f]",x,y);
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.printf("Quadrante 3" + "[%.1f,%.1f]",x,y);
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.printf("Quadrante 4" + "[%.1f,%.1f]",x,y);
        }

        sc.close();
    }
}
