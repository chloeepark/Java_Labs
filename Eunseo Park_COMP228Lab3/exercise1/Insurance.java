abstract class Insurance {
   private String insuranceType;
   private double monthlyCost;

   // Constructor
   public Insurance(String insuranceType) {
       this.insuranceType = insuranceType;
   }
   // Getters and Setters
   public String getInsuranceType() {
       return insuranceType;
   }
   
   public double getMonthlyCost() {
       return monthlyCost;
   }

   public void setMonthlyCost(double monthlyCost) {
       this.monthlyCost = monthlyCost;
   }
   // Abstract methods
   public abstract void setInsuranceCost(double cost);

   public abstract void displayInfo();
}
