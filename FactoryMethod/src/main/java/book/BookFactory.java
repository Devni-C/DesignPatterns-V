package book;

public class BookFactory {
    public static Category createCategory(CategoryCode categoryCode) {
        switch (categoryCode) {
            case EDUCATIONAL:
                return new Educational();
            case CHILDRENS:
                return new Childrens();
            case GENERAL:
                return new General();
        }
        return null;
    }
}
