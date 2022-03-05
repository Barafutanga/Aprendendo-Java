package class118;

//java
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;

//class188
import class118.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("ENTER WORKER DATA");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter contract #" +i+ " data: " +sc.nextDouble());
            System.out.print("Date (DD/MM/YYYY): " +sc.nextDouble());
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print(sc.nextDouble());
            System.out.print("Durantion (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear, substring(3));
        sc.close();

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " +worker.getDepartment());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }

    private static int substring(int i) {
        return 0;
    }
    
}
