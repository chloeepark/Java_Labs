// Subclass of Insurance that represents Health Insurance
class Health extends Insurance {
    public Health() {
       super("Health Insurance");
    }

    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}
