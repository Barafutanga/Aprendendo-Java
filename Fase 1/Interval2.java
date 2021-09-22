package src;
import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        int in, out;
        in = 0;
        out = 0;

        for (int limiter = 0; limiter < limit; limiter ++){
            int x = sc.nextInt();
            if (10 <= x && x <= 20) {
                in += 1;
            } else {out += 1;}
        }

        System.out.println(in +" in");
        System.out.println(out +" out");
        sc.close();
    }
}
