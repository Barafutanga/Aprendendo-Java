
import java.util.Scanner;
import Entities.Triangle;

public class TriComparator_02 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Triangle x,y; //entidade Triangle
        x = new Triangle(); //entidade Triangle
        y = new Triangle(); //entidade Triangle

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); //entidade Triangle
        double areaY = y.area(); //entidade Triangle
        
        System.out.printf("Triangle X area: %.2f%n", areaX);
        System.out.printf("Triangle Y area: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();


    }
}
