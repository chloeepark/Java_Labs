// Subclass of Insurance that represents Life Insurance
class Life extends Insurance {
   public Life() {
       super("Life Insurance");
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
