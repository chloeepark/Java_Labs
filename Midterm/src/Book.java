abstract class Book {
   private String title;
   private String ISBN;
   private String publisher;
   protected double price;
   private int year;

   // Constructor
   public Book(String title, String ISBN, String publisher, int year) {
      this.title = title;
      this.ISBN = ISBN;
      this.publisher = publisher;
      this.year = year;
   }

   // Getters and Setters
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getISBN() {
      return ISBN;
   }

   public void setISBN(String ISBN) {
      this.ISBN = ISBN;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   // toString method
   @Override
   public String toString() {
      return 
            "Title: " + title + "\n" +
            "ISBN: " + ISBN + "\n" +
            "Publisher: " + publisher + "\n" +
            "Year: " + year + "\n" +
            "Price: $" + price;
   }

   // Abstract methods
   public abstract void setPrice(double price);

   public abstract String getGenre();
}
