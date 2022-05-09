import java.util.Random;
import java.util.Scanner;

public class Product {
    private String id;
    private double price;
    private String name;
    private String manufacturer;

    public Product(double price, String name, String manufacturer) {
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
        Random rnd = new Random();
        int generatedId = rnd.nextInt();
        id = Integer.toString(generatedId);
    }

    @Override
    public String toString() {
        return "Product:" +
                " | id =" + id +
                " | name = " + name +
                " | price = " + price +
                " | manufacturer = " + manufacturer;
    }
}
