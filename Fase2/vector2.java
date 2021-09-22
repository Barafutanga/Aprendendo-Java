import java.util.Scanner;
import Entities.vectorProduct;

public class vector2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to pricemediator9000! Tell me, how many itens you want to compare? - ");
    
    int n = sc.nextInt();
    vectorProduct[] vect = new vectorProduct[n];

    for (int i=0; i<n; i++) {
        sc.nextLine();
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Product name: ");
        double price = sc.nextDouble();
        vect[i] = new vectorProduct(name, price);
    }

    double total = 0;
    for (int i =0; i<n; i++) {
        total += vect[i].getPrice();
    }

    double avg = total / n;

    System.out.printf("AVERAGE PRICE: %.2f%n", avg);
    sc.close();
    }
    
}
