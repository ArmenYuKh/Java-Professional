// Создать класс Book, сделать 3 поля и соответствующие методы. Необходимо реализовать
// замыкание анонимного класса и лямбда-выражения.

package task3;

public class Book {
    private String author;
    private String title;
    private int year;

    final int newYear = 2000;
    int newYear2;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
