package homework10;

import java.util.Objects;

public class Magazine extends PrintEdition{
    private int number;

    public Magazine(String name, int year, int publisher) {
        super(name, year, publisher);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name=" + name + '\'' +
                "number=" + number +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return number == magazine.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
