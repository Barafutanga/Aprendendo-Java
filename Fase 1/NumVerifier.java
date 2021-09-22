package src;
import java.util.Scanner;

public class NumVerifier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("DIGITE UM VALOR PARA X");
        x = sc.nextInt();
        y = sc.nextInt();
        

        if (x>=0) {
            System.out.println("x assumiu valor positivo= "+ x);
        }
            else {
                System.out.println("x assumiu valor negativo= "+ x);
            }
        

        if (x % 2 == 0) {
            System.out.println("x é número par");
        }   else {
                System.out.println("x é número ímpar");
            }        


        if (x % y == 0 || y % x == 0) {
            System.out.println("x e y são múltiplos");
        }   else {
                System.out.println("x e y não são múltiplos");
        }
        
        
        
        sc.close();
    }
}
