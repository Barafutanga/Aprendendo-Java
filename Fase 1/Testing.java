package src;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String human;
        human = sc.next();
        Character gender;
        gender = sc.next().charAt(0);
        int idade;
        idade = sc.nextInt();
        double altura;
        altura = sc.nextDouble();

        System.out.printf("%s é um belo %s com seus %d anos e medindo %.2f de altura", human, gender, idade, altura);
        sc.close();
    }
}
//Estamos em teste