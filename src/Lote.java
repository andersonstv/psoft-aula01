import java.util.Date;
import java.util.Random;

public class Lote {
    private String id;
    private int quantity;
    private Product product;
    private Date productionDate;
    private Date expirationDate;

    public Lote(int quantity, Product product, Date productionDate, Date expirationDate) {
        this.quantity = quantity;
        this.product = product;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        Random rnd = new Random();
        int generatedId = rnd.nextInt();
        id = Integer.toString(generatedId);
    }

    @Override
    public String toString() {
        return "Lote:" +
                " | id = " + id +
                " | qt = " + quantity +
                " | productionDate = " + productionDate +
                " | expirationDate = " + expirationDate + System.lineSeparator() +
                "product = " + product;
    }
}
