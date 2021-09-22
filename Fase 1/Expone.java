import java.util.Scanner;

public class Expone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int fat = 1;

        for (int limiter = 1; limiter <= limit; limiter ++) {
            fat = fat * limiter;
        }

        System.out.println(fat);
        
        sc.close();
    }
    
}
