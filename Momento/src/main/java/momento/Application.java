package momento;

public class Application {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        BookReservation bookReservation = new BookReservation();

        bookReservation.addBook(new Book("Divergent"));
        bookReservation.addBook(new Book("Harry Potter"));

        careTaker.save(bookReservation);
        System.out.println(bookReservation.getBooks());

        bookReservation.addBook(new Book("Percy Jackson"));
        careTaker.save(bookReservation);
        System.out.println(bookReservation.getBooks());

        bookReservation.addBook(new Book("The Hobbit"));
        careTaker.save(bookReservation);
        System.out.println(bookReservation.getBooks());

        careTaker.revert(bookReservation);
        System.out.println(bookReservation.getBooks());

        careTaker.revert(bookReservation);
        System.out.println(bookReservation.getBooks());

        bookReservation.addBook(new Book("Insurgent"));
//        careTaker.save(bookReservation);
        System.out.println(bookReservation.getBooks());

        bookReservation.addBook(new Book("Going Solo"));
        careTaker.save(bookReservation);
        System.out.println(bookReservation.getBooks());

        careTaker.revert(bookReservation);
        System.out.println(bookReservation.getBooks());

        careTaker.revert(bookReservation);
        System.out.println(bookReservation.getBooks());

        careTaker.revert(bookReservation);
        System.out.println(bookReservation.getBooks());
    }
}
