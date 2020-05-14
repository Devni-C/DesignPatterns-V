package book;

import java.util.ArrayList;
import java.util.List;

public abstract class Category {
    protected List<Book> books = new ArrayList<Book>();

    public Category() {
        createCategory();
    }

    protected abstract void createCategory();

    @Override
    public String toString() {
        return "Category(" +
                "books: " + books +
                ")";
    }
}
