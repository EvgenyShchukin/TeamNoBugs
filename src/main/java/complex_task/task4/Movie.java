package complex_task.task4;

public class Movie {
    private String name;
    private int year;
    private String publisher;

    public Movie(String name, int year, String publisher) {
        this.name = name;
        this.year = year;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }
}
