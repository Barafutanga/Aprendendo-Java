package src;

public class Geometria {
    public static void main(String[] args){
        
        double a,b,c,pi;
        a = 4.0;
        b = 3.0;
        c = 6.0;
        pi = 3.14159;

        //triangle
        double tr;
        tr = (a*c) / 2;

        //circle
        double ci;
        ci = pi*Math.pow(c, 2);

        //trapezio
        double tra;
        tra = ((a+b)*c)/2;

        //square
        double squ;
        squ = Math.pow(b,2);

        //rectangle
        double rec;
        rec = a*b;

        System.out.println("AREA VALUE");
        System.out.println("Triangle= "+ tr);
        System.out.println("Circle= "+ ci);
        System.out.println("Trapezio= "+ tra);
        System.out.println("Square= "+ squ);
        System.out.println("Rectangle= "+ rec);

    }
    
}
