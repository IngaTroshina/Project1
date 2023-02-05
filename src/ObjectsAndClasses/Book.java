package ObjectsAndClasses;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.publicationYear = year;
    }
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
