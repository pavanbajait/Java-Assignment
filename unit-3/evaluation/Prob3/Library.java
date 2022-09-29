package Prob3;
import java.util.HashSet;
import java.util.Set;

class Book {
    private int bookId;
    private String bookName;
    private String author;

    public Book(int bookId, String bookName, String author) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.author = author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        Book b1 = this;
        Book b2 = (Book) o;
        return b1.bookId == b2.bookId;
    }
    @Override
    public int hashCode() {
        return bookId;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class Library{
        public static void main(String[] args) {

            Set<Book> booksCollection= new HashSet<>();

            booksCollection.add(new Book(1,"Name1","Author1"));
            booksCollection.add(new Book(2,"Name2","Author1"));
            booksCollection.add(new Book(3,"Name1","Author1"));
            booksCollection.add(new Book(1,"Name4","Author2"));

            for(Book v : booksCollection) {
                System.out.println(v);
            }
    }

}
