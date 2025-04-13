package homework10;

/**
 * Вы работаете над программой-каталогом для библиотеки.
 * 1. Разработать классы для хранения информации о печатных изданиях:
 * • книгах (название, автор, год издания, количество страниц, издательство);
 * •
 * журналах (название, год выхода, номер (в году), издательство).
 * 2. Создать массив печатных изданий с неоднородным составом (хранятся как книги, так и журналы), заполнить его несколькими элементами, вывести все элементы этого массива на экран.
 * 3. Найти в массиве самое толстое издание и вывести информацию о нем на экран
 * 4. Пояснить, где и зачем в данной программе используется полиморфизм
 * Замечания:
 * • Придумывайте названия классов в соответствии с их назначением.
 * • Помните о сокрытии данных. Делайте в своих классах удобные конструкторы.
 * •
 * Там, где это необходимо, используйте наследование.
 * •
 * Неоднородный массив можно организовывать как с помощью ссылок на интерфейс, так и на суперкласс.
 */

public class PrintEdition {
    protected String name;
    protected int year;
    protected int publisher;

    public PrintEdition() {

    }

    public PrintEdition(String name, int year, int publisher) {
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

    public int getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "PrintEdition{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", publisher=" + publisher +
                '}';
    }
}
