package interfaces;

public class PartTimeEmployee extends Employee {
    private double ratesperhour;
    private int workhours;
    public PartTimeEmployee(String name, String id, double rates, int hours) {
        super(name, id);
        this.ratesperhour = rates ;
        this.workhours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return ratesperhour * workhours;
    }
}