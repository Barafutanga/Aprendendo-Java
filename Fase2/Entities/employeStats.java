package Entities;

public class employeStats {

    public String name;
    public double grossSalary, taxSalary;
    
    public double liquidSalary() {
        return grossSalary - taxSalary;
    }
    public void increasedSalary(double increasePercetage) {
         grossSalary += (grossSalary - taxSalary)    * increasePercetage / 100;
    }
 
    public String toString() {
        return "Name: " + name
            + " | Liquid salary $"
            + liquidSalary();
            
    }

    
}
