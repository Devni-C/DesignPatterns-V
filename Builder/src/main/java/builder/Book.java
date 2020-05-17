package builder;

public class Book {
    private Integer id;
    private String title;
    private String isbn;
    private String author;
    private Double price;

    public Book(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.price = builder.price;
    }


    static class Builder {
        private Integer id;
        private String title;
        private String isbn;
        private String author;
        private Double price;

        public Book build() {
            return new Book(this);
        }

        public Builder(Integer id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", isbn = '" + isbn + '\'' +
                ", author = '" + author + '\'' +
                ", price = " + price +
                '}';
    }
}
