package javarevision.Library;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", 3, 3);
        book.borrow();
        book.giveBack();
        book.giveBack();
        System.out.println(book.getCopies());

    }
}
