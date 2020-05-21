package momento;

import java.util.ArrayList;

// Originator
public class BookReservation {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) this.books.clone();
    }

    public BookMomento save() {
        return new BookMomento(getBooks());
    }

    public void revert(BookMomento bookMomento) {
        books = bookMomento.getBooks();
    }

    static class BookMomento {
        ArrayList<Book> books;

        public BookMomento(ArrayList<Book> books) {
            this.books = books;
        }

        private ArrayList<Book> getBooks() {
            return books;
        }
    }
}
