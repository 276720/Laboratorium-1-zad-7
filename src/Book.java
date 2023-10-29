public class Book {

    private final int isbn;
    private final String tytul;
    private final String autor;
    private int hash;

    public Book(int isbn, String tytul, String autor) { // Konstruktor z parametrami
        this.isbn = isbn;
        this.tytul = tytul;
        this.autor = autor;

        hash = isbn;
        hash = 31 * hash; // obliczenie hasha
    }

    @Override
    public String toString() { //Przesłonięta metoda, która zwraca reprezentację obiektu Book w postaci ciągu znaków.
        return "Book{" +
                "isbn=" + isbn +
                ", tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }


    public boolean equals(Object o) {//Przesłonięta metoda, ktora porównuje tylko hazh i isbn objektów
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (hash != o.hashCode()) {
            return false;
        }
        if (isbn != book.isbn) return false;
        return true;
    }

    @Override
    public int hashCode() { //Przesłonięta metoda, która zwraca hash obiektu
        return hash;
    }
}
