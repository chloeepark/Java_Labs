// Eunseo Park (301423139)
import java.util.Scanner;

public class MainDrive {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // Create a Scanner object

      // Prompt the user to enter book information
      System.out.println("Enter the type of book (Science/Children): ");
      String type = scanner.nextLine();
      System.out.println("Enter title: ");
      String title = scanner.nextLine();
      System.out.println("Enter ISBN: ");
      String ISBN = scanner.nextLine();
      System.out.println("Enter publisher: ");
      String publisher = scanner.nextLine();
      System.out.println("Enter year: ");
      int year = scanner.nextInt();
      System.out.println("Enter price: ");
      double price = scanner.nextDouble();

      // Create a book object based on the type of book
      Book book;
      if (type.equalsIgnoreCase("Science")) { // Check if the type is Science
         book = new ScienceBook(title, ISBN, publisher, year); 
      } 
      else if (type.equalsIgnoreCase("Children")) { // Check if the type is Children
         book = new ChildrenBook(title, ISBN, publisher, year);
      } 
      else {
         System.out.println("Invalid book type."); // Display an error message
         scanner.close();
         return;
      }

      // Set the price of the book
      book.setPrice(price);

      // Display the book information
      System.out.println("\nBook Information:");
      System.out.println(book);
      System.out.println("Genre: " + book.getGenre());

      scanner.close();
   }
}
