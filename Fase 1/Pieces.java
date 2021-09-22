package src;

public class Pieces {
    public static void main(String[] args){
        
        //serial
        int p1,p2;
        p1 = 10;
        p2 = 20;

        //pieces number
        int pn1, pn2;
        pn1 = 1;
        pn2 = 2;

        //value per piece
        int vp1, vp2;
        vp1 = 30;
        vp2 = 50;

        System.out.println("SERIAL");
        System.out.println("Piece 1= " + p1);
        System.out.println("Piece 2= " + p2);
        System.out.println();
        System.out.println("PIECES NUMBER");
        System.out.println("Piece 1= " + pn1);
        System.out.println("Piece 2= " + pn2);
        System.out.println();
        System.out.println("VALUE PER PIECE");
        System.out.println("Piece 1= " + vp1);
        System.out.println("Piece 2= " + vp2);
        System.out.println();
        System.out.println("VALUE PER PRODUCT");
        System.out.println("Product 1= "+ pn1 * vp1);
        System.out.println("Product 2= "+ pn2 * vp2);
    }
}
