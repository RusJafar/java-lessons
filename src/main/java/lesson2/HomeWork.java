package lesson2;

/**
 * Домашнее задание на третье занятие:
 * С помощью цикла For, напечатать на консоль:
 * 1) Только четные от -100 до -50
 * 2) Все числа в обратном порядке от 10 до 30
 * 3) Кол-во четных чисел в диапазоне от 30 до 61
 * 4) *** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
 * 5) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
 */

public class HomeWork {
    public static void main(String[] args) {
        onlyEvenNumber();
//        reverseOrder();
//        evenNumberCountFromRange();
//        accumulationTime();
//        numberOtherThenRang();
    }

    /**
     * 1) Только четные от -100 до -50
     */
    private static void onlyEvenNumber() {
        int start = -100;
        int end = -50;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 2) Все числа в обратном порядке от 10 до 30
     */
    private static void reverseOrder() {
        int start = 30;
        int end = 10;

        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }
    }

    /**
     * 3) Кол-во четных чисел в диапазоне от 30 до 61
     */
    private static void evenNumberCountFromRange() {
        int start = 30;
        int end = 61;

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    /**
     * 4) *** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
     */
    private static void accumulationTime() {
        double mountInYear = 12;
        int targetAmount = 200000;
        int wallet = 0;
        int incomePerMount = 9500;
        int timeInMounts = 0;

        while (wallet <= targetAmount) {
            wallet += incomePerMount;
            timeInMounts++;
        }

        double timeInYears = timeInMounts / mountInYear;
        System.out.println( timeInYears > 4
                ? String.format("Чтобы накопить %s рублей нужно %.2f лет", targetAmount, timeInYears)
                : String.format("Чтобы накопить %s рублей нужно %.2f года", targetAmount, timeInYears));
    }

    /** Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно */
    private static void numberOtherThenRang() {
        int start = 20;
        int end = 60;
        int exceptionStart = 30;
        int exceptionEnd = 40;

        for (int i = start; i <= end; i++) {
            if (i < exceptionStart || i > exceptionEnd) {
                System.out.println(i);
            }
        }
    }
}
