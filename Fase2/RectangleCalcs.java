

import java.util.Scanner;
import java.util.Locale;
import Entities.rectangle;

public class RectangleCalcs {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    rectangle Rectangle = new rectangle();
        System.out.println("INSERT VALUES FOR RECTANGLE: ");
        System.out.println("WIDTH: ");
            Rectangle.width = sc.nextDouble();
        System.out.println("HEIGHT");
            Rectangle.height = sc.nextDouble();

    System.out.println(Rectangle);

    sc.close();
    }
}