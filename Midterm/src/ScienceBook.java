public class ScienceBook extends Book {

   public ScienceBook(String title, String ISBN, String publisher, int year) {
      super(title, ISBN, publisher, year);
   }

   @Override // Override the setPrice method
   public void setPrice(double price) {
      this.price = price * 0.90; // 10% discount on the price
   }

   @Override // Override the getGenre method
   public String getGenre() {
      return "Science";
   }
}
