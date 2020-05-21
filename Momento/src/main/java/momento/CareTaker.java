package momento;

import java.util.Stack;

public class CareTaker {
    Stack<BookReservation.BookMomento> history = new Stack();

    public void save(BookReservation bookReservation) {
        history.push(bookReservation.save());
    }

    public void revert(BookReservation bookReservation) {
        if(!history.isEmpty()) {
            bookReservation.revert(history.pop());
        } else {
            System.out.println("Cannot Undo...");
        }
    }
}
