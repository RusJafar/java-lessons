package lesson6;

import java.util.Scanner;

import static lesson6.ToursUtils.printTourByPrice;
import static lesson6.ToursUtils.printToursByCountry;

public class ScannerUtils {
    public static int chooseFilter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет");
        System.out.println("Команды:");
        System.out.println("1 - тур по странам");
        System.out.println("2 - тур по бюджету");

        return sc.nextInt();
    }

    public static void searchToursByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну");

        String country = scanner.nextLine();
        printToursByCountry(country, tours);
    }

    public static void searchToursByPrice(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену");

        String price = scanner.nextLine();
        printTourByPrice(price, tours);
    }
}
