package homework10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book harryPotterBook = new Book("Harry Potter", 2019, 2);
        Book StephenHowkingsUniverseBook = new Book("Stephen Howkings Universe", 2019, 251);
        Book oruell1984Book = new Book("1984", 2019, 250);
        Book history7classBook = new Book("History of civilization 7 class", 2019, 229);
        Magazine murzilkaMagazine = new Magazine("Murzilka", 1987, 1);
        Book atomicHeartBook = new Book("Atomic Heart", 2022, 1);
        Book micronomicaBook = new Book("Micronomica", 303, 665);

        List<PrintEdition> printEditionsList = List.of(murzilkaMagazine, harryPotterBook, StephenHowkingsUniverseBook,
                oruell1984Book, history7classBook, atomicHeartBook, micronomicaBook);
//        printInfo(printEditionsList);
        System.out.println(getBiggestBook(printEditionsList));
    }

    public static void printInfo(List<PrintEdition> list) {
        for (PrintEdition printEdition : list) {
            System.out.println(printEdition.toString());
        }
    }

    public static PrintEdition getBiggestBook(List<PrintEdition> list) {
        List<Book> listOfBooks = extractBooksFromPrintEdition(list);
        int max = 0;
        PrintEdition result = null;
        for (PrintEdition book : listOfBooks) {
            if (book.getPublisher() > max) {
                max = book.getPublisher();
                result = book;
            }
        }

        return result;
    }

    public static List<Book> extractBooksFromPrintEdition(List<PrintEdition> list) {
        List<Book> listOfBooks = new ArrayList();
        for (PrintEdition printEdition : list) {
            if (isInstanceOfBook(printEdition)) {
                listOfBooks.add((Book) printEdition);
            }
        }
        return listOfBooks;
    }


    public static boolean isInstanceOfBook(PrintEdition printEdition) {
        if (printEdition instanceof Book) {
            return true;
        }
        return false;
    }


}
