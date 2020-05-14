package book;

public class Educational extends Category {
    protected void createCategory() {
        books.add(new Computing());
        books.add(new Accounting());
    }
}
