package lesson6;

import static lesson6.ScannerUtils.chooseFilter;
import static lesson6.ToursUtils.addTour;

public class Main {
    public static void main(String[] args) {
        String[][] tours = new String[100][10];

        addTour("Egypt", "Sharm", "plane", "7", "1000", "4", "AI", tours);
        addTour("Thailand", "Pattaya", "plane", "10", "2500", "5", "AI", tours);
        addTour("Vietnam", "Nha Trang", "plane", "12", "2000", "5", "AI", tours);
        addTour("China", "Hong Kong", "plane", "14", "5500", "5", "AI", tours);
        addTour("Kamboja", "Sihanoukville", "plane", "14", "1500", "5", "AI", tours);
        addTour("Nianma", "Nianma", "plane", "14", "1500", "5", "AI", tours);
        addTour("Filipines", "Manila", "plane", "14", "2500", "3", "AI", tours);
        addTour("Malaysia", "Kuala Lumpur", "plane", "14", "3500", "5", "AI", tours);
        addTour("Indonesia", "Bali", "plane", "14", "3500", "5", "AI", tours);
        addTour("India", "Goa", "plane", "14", "1500", "3", "AI", tours);
        addTour("Sri Lanka", "Colombo", "plane", "14", "1500", "4", "AI", tours);

        int choose = chooseFilter();

        switch (choose) {
            case 1:
                ScannerUtils.searchToursByCountry(tours);
                break;
            case 2:
                ScannerUtils.searchToursByPrice(tours);
                break;

        }
    }
}