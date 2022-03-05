import java.util.Scanner;
import Entities.student;

public class NotaSemetral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student stu =  new student();
            System.out.print("Student name: ");
                stu.name = sc.nextLine();
            System.out.println("Notes from each grade:");
                stu.tri1 = sc.nextDouble();
                stu.tri2 = sc.nextDouble();
                stu.tri3 = sc.nextDouble();
            
            if (stu.totalPoints() > 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
                System.out.print("Remaining ");
            }
                System.out.println(stu.totalPoints());
        

        sc.close();

    }
    
}
