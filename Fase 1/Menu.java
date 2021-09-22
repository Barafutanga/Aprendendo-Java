package src;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("OLÁ, SEJA BEM VINDO AO BIGTOPBURGUER, POR FAVOR SELECIONE UM DOS LANCHES ABAIXO USANDO O SEU CÓDIGO");
        System.out.println("1 -HotDog R$:4,00");
        System.out.println("2 -X-Salada R$:4,50");
        System.out.println("3 -X-Bacon R$:5,00");
        System.out.println("4 -Torrada simples R$:2,00");
        System.out.println("5 -Refrigerante R$:1,50");

        int Code, Size;
        Code = sc.nextInt();
        Size = sc.nextInt();

        double Total;
        if (Code == 1) {
            Total = Size * 4.0;
        } 
        else if (Code == 2) {
            Total = Size * 4.5;
        }
        else if (Code == 3) {
            Total = Size * 5.0;
        }
        else if (Code == 4) {
            Total = Size * 2.0;
        }
        else if (Code == 5) {
            Total = Size * 1.5;
        }
        else {Total = 0;}
       
        //Order
        if (Code >= 1 && Code <=5) {
        System.out.printf("Total: R$ %.2f%n", Total);
        }
       //Invalid order
        if (Code >= 6 || Code <= 0) {
            System.out.println("Perdão, mas este código não é válido, digite outro");
        }
        
        sc.close();
    }
    
}
