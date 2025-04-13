package lesson4;

public class homeWork4 {
    public static void main(String[] args) {
//        printLeftPartOfDesk();
//        printRightPartOfDesk();
        printCenterPartOfDesk();
    }

    // Вывести в консоль сначала левую часть
    public static void printLeftPartOfDesk() {
        int[][] numbers = new int[8][8];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (count >= i && count >= j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
            count++;
        }
    }

    // Вывести в консоль сначала правую часть
    public static void printRightPartOfDesk() {
        int[][] numbers = new int[8][8];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (count <= i && count <= j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
            count++;
        }
    }

    // Для тех, кто готов решить, что-то посложнее
    public static void printCenterPartOfDesk() {
        int[][] numbers = new int[8][8];
        int rightRange = numbers.length / 2 - 1;
        int leftRange = numbers.length / 2;

        boolean toggle = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((j >= rightRange && j <= leftRange) || (i >= leftRange && i <= rightRange)) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");

            if (toggle) {
                rightRange++;
                leftRange--;
            } else {
                rightRange--;
                leftRange++;
            }

            if (rightRange <= 0 || leftRange <= 0) toggle = true;
        }
    }
}
