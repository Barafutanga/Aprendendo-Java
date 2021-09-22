import java.util.Scanner;
import java.util.Locale;
public class vector {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    //não use vírgulas, apenas pontos.

    System.out.print("Welcome to averagetron8000! Please, select how many size you whant to compare: ");

    //vetor
    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i=0; i<n; i++) {
        System.out.println("Please, inform size " + i);
        vect[i] = sc.nextDouble();
    }

    //soma total
    double total = 0;
    for (int i=0; i<n; i++) {
        total += vect[i];
    }

    double avg = total/n;

    System.out.printf("Average size: %.2f%n", avg);
    sc.close();
    }
    
    
}
