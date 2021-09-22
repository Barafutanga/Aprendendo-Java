import java.util.Scanner;

public class ImparCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int limite = sc.nextInt();

            for (int conte = 1; conte <= limite; conte ++) {
                if(conte % 2 != 0) {
                    System.out.println(conte);
                }
            }


        sc.close();
    }
    
}
