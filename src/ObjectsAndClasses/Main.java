package ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book ("Убить пересмешника", new Author("Харпер", "Ли") , 1960);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.author = " + book1.getAuthor());
        System.out.println("book1.publicationYear = " + book1.getPublicationYear());
        book1.setPublicationYear(1980);
        System.out.println("book1.getPublicationYear() = " + book1.getPublicationYear());

        Book book2 = new Book("Вино из одуванчиков", new Author("Рэй", "Бредбери"), 1957);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.author = " + book2.getAuthor());
        System.out.println("book2.publicationYear = " + book2.getPublicationYear());
    }
}


