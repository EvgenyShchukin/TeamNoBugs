package practice_3;

public class Library {
    private String bookTitle = "Мертвые души";
    protected String author = "Гоголь";
    int year = 1876;
    public String category = "Криминал";

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("bookTitle: " + library.getBookTitle());
        library.setBookTitle("Мертвые души - новое");
        System.out.println("bookTitle: " + library.getBookTitle());
        //  library.bookTitle = "TestTitle" -- не доступен из-за метода private

        System.out.println("------------------------------------------");

        System.out.println("author: " + library.getAuthor());
        library.setAuthor("Николай Гоголь");
        System.out.println("author: " + library.getAuthor());
        library.author = "Великий Николай Гоголь"; // доступно
        System.out.println("author: " + library.getAuthor());

        System.out.println("------------------------------------------");

        System.out.println("year: " + library.getYear());
        library.setYear(1878);
        System.out.println("year: " + library.getYear());
        library.year = 1880; // доступно
        System.out.println("year: " + library.getYear());

        System.out.println("------------------------------------------");

        System.out.println("category: " + library.getCategory());
        library.setCategory("Драма");
        System.out.println("category: " + library.getCategory());
        library.category = "Фантастика"; // доступно
        System.out.println("category: " + library.getCategory());


    }
}
