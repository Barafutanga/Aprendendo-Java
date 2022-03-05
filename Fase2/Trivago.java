import java.util.Scanner;
import java.text.ParseException;
import Entities.clientRoomRent;

public class Trivago {
    public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    clientRoomRent[] vect = new clientRoomRent[10];

    System.out.print("Welcome to Hotel Trivago! How many rooms you wanna rent?");

    int n = sc.nextInt();

    for (int i=0; i<n; i++) {
        System.out.println();
        System.out.println("Rent #" + i +": " );
        System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
        System.out.print("E-mail: ");
            String email = sc.nextLine();
        System.out.print("Room: ");
            int room = sc.nextInt();
        vect[room] = new clientRoomRent(name, email);
    }

    System.out.println();
    System.out.println("Busy rooms: ");
    for (int i=0; i<10; i++)
        if (vect[i] != null) {
            System.out.println(i+": "+vect[i]);
        }

        sc.close();
    }
}    
    

