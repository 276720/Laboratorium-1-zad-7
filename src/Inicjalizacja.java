import java.util.HashSet;


public class Inicjalizacja {
    private static void printCollection(HashSet<Book> book) { //Metoda służąca do wyświetlania
        for (Book element : book) {                          //zawartości zbioru książek (HashSet<Book>) na konsoli.
            System.out.println(element.toString());
        }
    }
    public static void run() { // Metoda uzupełnia kolekcję i wyświetlia: jej zawartość,
        boolean areBooksEqual;   // hashkody obiektów i zwraca true lub false w zależnośći od stbn
        HashSet<Book> book = new HashSet<>();

        Book book1 = new Book(123, "Book 1", "Autor 1");
        Book book2 = new Book(123, "Book 2", "Autor 2");
        Book book3 = new Book(456, "Book 3", "Autor 3");
        Book book4 = new Book(789, "Book 4", "Autor 4");

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);


        areBooksEqual = book1.equals(book2);
        System.out.println(areBooksEqual);


        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());


        printCollection(book);
    }

}
