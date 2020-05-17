package builder;

public class Application {
    public static void main(String[] args) {
        Book.Builder builder = new Book.Builder(1, "abcd 123 456");
        System.out.println(builder.build());

        Book book = builder.title("Harry Potter").author("J.K. Rowlin").price(850.00).build();
        System.out.println(book);
    }
}
