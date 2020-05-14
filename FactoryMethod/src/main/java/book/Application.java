package book;

public class Application {
    public static void main(String[] args) {
        Category category1 = BookFactory.createCategory(CategoryCode.EDUCATIONAL);
        System.out.println(category1);

        Category category2 = BookFactory.createCategory(CategoryCode.CHILDRENS);
        System.out.println(category2);

        Category category3 = BookFactory.createCategory(CategoryCode.GENERAL);
        System.out.println(category3);
    }
}
