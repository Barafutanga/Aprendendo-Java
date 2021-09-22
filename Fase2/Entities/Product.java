package Entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;
    public String setName;
    
    //valor total dos bens armazenados no estoque
    public double totalValueInStock() {
        return price * quantity;
    }
    //adição de bens no estoque
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    //remoção de bens no estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return name 
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, total: $"
            + String.format("%.2f",totalValueInStock()); 
    }

}
