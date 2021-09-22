import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Password, pass;
        Password = 2002;
        pass = 0;

        while (Password != pass) {
            
            pass = sc.nextInt(); 
                if (pass != Password) {
                System.out.println("Senha inválida!");
                } else {System.out.println("Login confirmado!");}
            
        }
        
        sc.close();
    }
    
}
