import java.util.Scanner;

public class CoordinateVisio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x,y;
            x = 1;
            y = 1;

        while (x != 0 || y != 0) {
            
            System.out.print("X: ");
                x = sc.nextInt();
        
            System.out.print("Y: ");
                y = sc.nextInt();

            if (x == 0 && y == 0) {
                System.out.println("Origem");
            }
            else if (x > 0 && y > 0) {
                System.out.printf("Quadrante 1");
            }
            else if (x < 0 && y > 0) {
                System.out.printf("Quadrante 2");
            }
            else if (x < 0 && y < 0) {
                System.out.printf("Quadrante 3");
            }
            else if (x > 0 && y < 0) {
                System.out.printf("Quadrante 4");
            }
            System.out.println();


        }

        

    sc.close();
    }
}
