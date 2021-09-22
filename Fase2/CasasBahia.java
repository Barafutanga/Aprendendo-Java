import java.util.Scanner;
import java.util.Locale;
import Entities.Product;

public class CasasBahia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Product product = new Product();
            System.out.println("Enter product data");
            System.out.print("Name: ");
                product.setName(sc.nextLine());
            System.out.print("Price: ");
                product.setPrice(sc.nextDouble());
            System.out.print("Quantity: ");
                product.setQuantity(sc.nextInt());
        
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added into stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println("Updated data: " + product);
       
        System.out.println();
        System.out.print("Enter the number of products to be removed into into stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);


        sc.close();
    }
}
