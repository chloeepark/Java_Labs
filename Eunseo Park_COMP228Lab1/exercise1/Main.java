package exercise1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Singers singer1 = new Singers();
        
        System.out.println("Default values:");
        System.out.println(singer1);

        singer1.setSingerId(1);
        singer1.setSingerName("Yerin Baek");
        singer1.setSingerAddress("South Korea");
        singer1.setDateOfBirth(LocalDate.of(1997, 6, 26)); 
        singer1.setNumberOfAlbumsPublished(22);

        System.out.println("\nUpdated values:");
        System.out.println(singer1);
    }
}
