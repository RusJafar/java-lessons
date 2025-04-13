package lesson2;

import java.util.List;

public class PrintCycle {
    public static void main(String[] args ) {
        List list = List.of(new String[]{"1", "2", "3"});

        moneySaver();
    }

    private void repeatText (String text, int count) {
        for(int i = 0; i <= count; i++) {
            System.out.println(text);
        }
    }

    private static void printListByItem (List list) {
        list.forEach((value) -> {
            System.out.println(value);
        });
    }

    private static void printNumbers(int start, int end) {
        for(int i = start; i <= end; i++) {
            if((i%3) == 0 && (i%5) == 0) {
                System.out.println(i);
            }
        }
    }

    private static void moneySaver () {
        int cash = 10000000;
        int days = 15;
        int increaseByPercent = 13;

        for (int i = 0; i < days; i++) {
            cash += cash / 100 * increaseByPercent;
        }

        System.out.println(cash);
    }
}
