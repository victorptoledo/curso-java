package entities;

public class Product {

    String tv;
    double price;

    public Product(String tv, double price) {
        this.tv = tv;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
}
