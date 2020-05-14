package book;

public class Childrens extends Category {
    protected void createCategory() {
        books.add(new PictureBooks());
        books.add(new ComicArtBooks());
    }
}
