package lesson4;

public class Lesson4 {
    public static void main(String[] args) throws InterruptedException {
        printDesk();
    }
    public static void printDesk() throws InterruptedException {
        int[][] numbers = new int[8][8];

        for (int i =  0; i < numbers.length; i++) {
            for (int j =  0; j < numbers[i].length; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void timer() throws InterruptedException {
        for (int year = 0; year < 10; year++) {
            for (int mount = 0; mount < 12; mount++) {
                for (int day = 0; day < 31; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        for (int minute = 0; minute < 60; minute++) {
                            for (int sec = 0; sec < 60; sec++) {
                                System.out.printf("\n%d:%d:%d", hour, minute,sec);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }
    }
}
