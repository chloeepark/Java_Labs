package exercise1;

import java.time.LocalDate;

public class Singers {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private LocalDate dateOfBirth;
    private int numberOfAlbumsPublished;

    public Singers() {
        this.singerId = 0;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = LocalDate.now(); 
        this.numberOfAlbumsPublished = 0;
    }

    public Singers(int singerId) {
        this();
        this.singerId = singerId;
    }

    public Singers(int singerId, String singerName) {
        this(singerId);
        this.singerName = singerName;
    }

    public Singers(int singerId, String singerName, String singerAddress) {
        this(singerId, singerName);
        this.singerAddress = singerAddress;
    }

    public Singers(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth) {
        this(singerId, singerName, singerAddress);
        this.dateOfBirth = dateOfBirth;
    }

    public Singers(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth, int numberOfAlbumsPublished) {
        this(singerId, singerName, singerAddress, dateOfBirth);
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfAlbumsPublished() {
        return numberOfAlbumsPublished;
    }

    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    public void setAll(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth, int numberOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    @Override
    public String toString() {
        return "Singer ID: " + singerId + "\n" +
               "Singer Name: " + singerName + "\n" +
               "Singer Address: " + singerAddress + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "Number of Albums Published: " + numberOfAlbumsPublished;
    }
}
