import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

import Entities.pimbaWorker;

public class pimbaEnterprise {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    List<pimbaWorker> list = new ArrayList<>();

    System.out.print("How many employees will be implemented? ");
    int n = sc.nextInt();
    for (int i=0; i<n; i++) {
        System.out.println("Employee nº"+ (i + 1));

    System.out.print("ID: ");
    int id = sc.nextInt();
    while (hasId(list, id)) {
        System.out.println("ID currently overtaken, try again");
        id = sc.nextInt();
    }

    System.out.print("Name: ");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.print("Sallary: ");
    double sallary = sc.nextDouble();

    list.add(new pimbaWorker(name, id, sallary));
    }

    System.out.println("Enter employee ID that will have increased sallary:");
    int id = sc.nextInt();
    pimbaWorker emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percetage: ");
            double percetage = sc.nextDouble();
            emp.increaseSallary(percetage);
        }
    System.out.println("List of employees: ");
    for (pimbaWorker obj : list) {
        System.out.println(obj);
    }


    sc.close();
    }

    public static boolean hasId(List<pimbaWorker> list, int id) {
        return false;
    }
    
}
