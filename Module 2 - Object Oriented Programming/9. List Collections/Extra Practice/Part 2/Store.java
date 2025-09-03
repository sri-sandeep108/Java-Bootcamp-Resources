import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return new Book(books.get(index));
    }

    public void setBook(int index, Book book) {
        books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        books.add(new Book(book));
    }

    public void sellBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                break;
            }
        }
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

}
