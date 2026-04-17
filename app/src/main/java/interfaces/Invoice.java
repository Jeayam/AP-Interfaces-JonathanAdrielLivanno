package interfaces;

public class Invoice implements Payable {
    private String partNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String part, int qty, double price) {
        this.partNumber = part;
        this.quantity = qty;
        this.pricePerItem = price;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}