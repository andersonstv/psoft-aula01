import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product prod = new Product(8.50, "Leite", "Piracanjuba");
        Lote lote = new Lote(100, prod, new Date(), new Date());
        System.out.println(prod);
        System.out.println(lote);
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
    }
}
