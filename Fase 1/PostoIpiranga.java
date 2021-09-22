package src;
import java.util.Scanner;

public class PostoIpiranga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int alcool, gasosa, diesel, tipo;
            alcool = 0;
            gasosa = 0;
            diesel = 0;

            tipo = sc.nextInt();
            
            while (tipo != 4) {
                if (tipo == 1) {
                    alcool = alcool + 1;
                } else
                if (tipo == 2) {
                    gasosa = gasosa + 1;
                } else
                if (tipo == 3) {
                    diesel = diesel + 1;
                }
                tipo = sc.nextInt();
            }
            System.out.println("Muito Obrigado!");
            System.out.println("Álcool: "+alcool);
            System.out.println("Gasosa: "+gasosa);
            System.out.println("Diesel: "+diesel);

        sc.close();
    }
    
}
