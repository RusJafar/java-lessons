package lesson6;

import lesson6.models.TourModel;

public class ToursUtils {
    /**
     * Метод сохраняет тур в переданный массив
     *
     * @param country
     * @param city
     * @param transfer
     * @param days
     * @param price
     * @param stars
     * @param food
     * @param tours
     */
    public static void addTour(String country, String city, String transfer, String days, String price, String stars,
                               String food, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] == null) {
                tours[i][0] = String.valueOf(i + 1);
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transfer;
                tours[i][4] = days;
                tours[i][5] = price;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;
            }
        }
    }

    public static void printToursByCountry(String country, String[][] tours) {
        for (String[] tour : tours) {
            TourModel tourModel = new TourModel(tour);
            if (tourModel.id != null && tourModel.country.equals(country)) {
                printTour(tourModel);
            }
        }
    }

    public static void printTourByPrice(String price, String[][] tours) {
        for (String[] tour : tours) {
            TourModel tourModel = new TourModel(tour);
            if (tourModel.id != null && Integer.parseInt(tourModel.price) <= Integer.parseInt(price)) {
                printTour(tourModel);
            }
        }
    }

    public static void printTour(TourModel tour) {
        System.out.printf("%s. Страна: %s, Город: %s, Трансфер: %s, Дней: %s, Цена: %s, Звезды: %s, Питание: %s\n",
                tour.id, tour.country, tour.city, tour.transfer, tour.days, tour.price, tour.stars, tour.food);
    }
}
