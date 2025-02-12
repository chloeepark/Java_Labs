public class ChildrenBook extends Book {
   public ChildrenBook(String title, String ISBN, String publisher, int year) { 
      super(title, ISBN, publisher, year); // Call the superclass constructor
   }

   @Override // Override the setPrice method
   public void setPrice(double price) {
      this.price = price; // fixed price (specified by user)
   }

   @Override // Override the getGenre method
   public String getGenre() {
      return "Children";
   }
}
