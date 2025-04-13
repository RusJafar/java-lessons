package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры");
        System.out.println("1- новичек");
        System.out.println("2- Любитель");
        System.out.println("3- Профессионал");
        System.out.println("4- Особый");
        System.out.println("______________\n Для выхода введите \"exit\"\n");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();

        SuperField field;

        switch (level) {
            case "1":
                field = new SuperField(9, 9, 10);
                field.printGameField();
                runGame(field, scanner);
                break;
            case "2":
                field = new SuperField(16, 16, 42);
                field.printGameField();
                runGame(field, scanner);
                break;
            case "3":
                field = new SuperField(32, 32, 32);
                field.printGameField();
                runGame(field, scanner);
                break;
            case "4":
                System.out.println("Введите количество строк");
                int countOfRow = scanner.nextInt();

                System.out.println("Введите количество колонок");
                int columns = scanner.nextInt();

                System.out.println("Введите количество мин");
                int mines = scanner.nextInt();
                field = new SuperField(columns, countOfRow, mines);
                field.printGameField();
                runGame(field, scanner);
        }
    }

    public static void runGame(SuperField field, Scanner scanner) {
        while (!field.isCellWithMineSelected()) {
            if(field.isGameWon()) {
                System.out.println("YOU WON");
            }
            System.out.println("Выберите клетку");
            String selectedCell = scanner.nextLine();
            if (selectedCell.equals("exit")) {
                System.out.println("EXIT");
                break;
            }
            field.addStepCount();
            field.checkCall(Integer.parseInt(selectedCell));
            field.printGameField();
        }
        System.out.println("GAME OVER");
    }


}
