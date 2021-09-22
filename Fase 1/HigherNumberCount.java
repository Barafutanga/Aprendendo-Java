import java.util.Scanner;

public class HigherNumberCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Input values for each character");
        
            System.out.print("X: ");
            int x = sc.nextInt();
        
            System.out.print("Y: ");
            int y = sc.nextInt();

            System.out.print("Z: ");
            int z = sc.nextInt();

            int higher = max(x, y, z);

        showResult(higher);
        sc.close();
    }
        
    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

        
        

    public static void showResult(int value) {
        System.out.println("Higher= " + value);
    }
}