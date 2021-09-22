package src;

import java.util.Locale;

public class OfficeSuplyPrice {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";
       
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        //products
        System.out.println("Products:");
        System.out.printf("%s, wich price is $%.0f %n", product1, price1);
        System.out.printf("%s, wich price is $%.0f %n", product2, price2);
        System.out.println();
        //measure
        System.out.printf("Record: %d old, code %d and gender %s %n", age, code, gender);
        System.out.printf("Measure with eigth decimal places: %f %n", measure);
        System.out.printf("Rounded (three decimal places) %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal points: %.2f %n", measure);
        
    }
    
}
