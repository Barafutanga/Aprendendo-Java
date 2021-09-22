

import java.util.Scanner;
import java.util.Locale;
import Entities.employeStats;

public class WorkerStats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        employeStats WorkerStats = new employeStats();
            System.out.print("Employee name: ");
                WorkerStats.name = sc.nextLine();
            
            System.out.print("Gross salary: ");
                WorkerStats.grossSalary = sc.nextDouble();

            System.out.print("Tax: ");
                WorkerStats.taxSalary = sc.nextDouble();
            
            System.out.println(WorkerStats);

            System.out.print("Salary increase percetage: ");
                double percetage = sc.nextDouble();
                WorkerStats.increasedSalary(percetage);
                

            System.out.println("UPDATED DATA: " + WorkerStats);

             
        sc.close();
    }
    

    
}
