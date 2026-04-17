package interfaces;

// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double total = 0; //kasi total harganya
        List<Payable> accountsPayable = new ArrayList<>();

 
        accountsPayable.add(new SalariedEmployee("Frieren Livanno", "E001", 5000000));
        accountsPayable.add(new Invoice("Widget-99", 5, 100000));
        accountsPayable.add(new SalariedEmployee("Miya ALucard", "E002", 4500000));
        accountsPayable.add(new Invoice("Hammer-01", 2, 75000));
        accountsPayable.add(new PartTimeEmployee ("Jea", "PTE003", 20000, 47));
        accountsPayable.add(new Invoice("AK47-01", 1, 1500000));
        accountsPayable.add(new PartTimeEmployee("Chris", "PTE004", 20000, 67));
        accountsPayable.add(new Invoice("Couch-04", 3, 250000));

        System.out.println("Processing Payments:\n---------------------");

        for (Payable item : accountsPayable) {
            double amount = item.getPaymentAmount();
            System.out.printf("Payment due: Rp. ", amount);
            total += amount; // 🔥 kumpulkan total

        }
        System.out.println("---------------------");
        System.out.printf("TOTAL PAYMENT: Rp. ", total);
    }
}