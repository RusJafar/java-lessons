package homework10;

import java.util.Objects;

public class Book extends PrintEdition {
    protected String author;
    private static int countOfPages;

    public Book(String name, int year, int pages) {
        super(name, year, pages);
    }

    public String getAuthor() {
        return author;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name=" + name + '\'' +
                "author='" + author + '\'' +
                ", countOfPages=" + countOfPages +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", publisher=" + publisher +
                '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(author, countOfPages);
    }
}
