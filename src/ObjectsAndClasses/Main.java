package ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book ("Убить пересмешника", new Author("Харпер", "Ли") , 1960);
        System.out.println(book1);

        Book book2 = new Book("Вино из одуванчиков", new Author("Рэй", "Бредбери"), 1957);
        System.out.println(book2);
    }
}


