package practice_3;

public class LibraryTest {
    static void library() {
        Library library = new Library();

        System.out.println("bookTitle: " + library.getBookTitle());
        library.setAuthor("TestTitle");
        System.out.println("bookTitle: " + library.getBookTitle());
        System.out.println("author: " + library.getAuthor());
        library.setAuthor("TestAuthor");
        System.out.println("author: " + library.getAuthor());
        System.out.println("year: " + library.getYear());
        library.setYear(2023);
        System.out.println("year: " + library.getYear());
        System.out.println("category: " + library.getCategory());
        library.setCategory("TestCategory");
        System.out.println("category: " + library.getCategory());

        //library.bookTitle = "TestTitle")  --- Не доступпен, т.к. поле доступно только в классе library
        library.author = "TestAuthor2"; // Доступно
        System.out.println("author: " + library.getAuthor());
        library.year = 2024; //Доступно
        System.out.println("year: " + library.getYear());
        library.category = "TestCategory2";  //Доступно
        System.out.println("category: " + library.getCategory());
    }
}
