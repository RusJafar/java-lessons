package lesson8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SupperField2 {

    int[][] fieldOfMines;
    String[][] gameField;
    boolean isCellWithMineSelected = false;
    ArrayList<int[]> selectedCells = new ArrayList();

    int countOfMines = 0;

    public int[][] getFieldOfMines() {
        return fieldOfMines;
    }

    void SuperField2(int countRows, int countColumns, int mines) {
        fieldOfMines = new int[countColumns + 2][countRows + 2];
        gameField = new String[countColumns + 2][countRows + 2];
        this.countOfMines = mines;
        this.toMineField();
        this.addRandomMines();
        this.generateGameField();
    }

    public void toMineField() {
        for (int i = 0; i < countOfMines; i++) {
            int row = ThreadLocalRandom.current().nextInt(0, fieldOfMines.length - 2);
            int column = ThreadLocalRandom.current().nextInt(0, fieldOfMines[0].length - 2);
            if (fieldOfMines[row][column] == -1) {
                i--;
            }
            fieldOfMines[row][column] = -1;
        }
    }

    private void generateGameField() {
        int count = 0;
        for (int i = 1; i < gameField.length; i++) {
            for (int j = 1; j < gameField[0].length; j++) {
                gameField[i][j] = count++ + "";
            }
        }
    }

    public void addRandomMines() {
        for (int i = 1; i < fieldOfMines.length; i++) {
            for (int j = 1; j < fieldOfMines[0].length; j++) {
                // заполняем всех соседей +1 к числу, если в клеточке мина
                if (fieldOfMines[i][j] == -1) {
                    if (fieldOfMines[i - 1][j - 1] != -1) {
                        fieldOfMines[i - 1][j - 1] = fieldOfMines[i - 1][j - 1] + 1;
                    }
                    if (fieldOfMines[i - 1][j] != -1) {
                        fieldOfMines[i - 1][j] = fieldOfMines[i - 1][j] + 1;
                    }
                    if (fieldOfMines[i - 1][j + 1] != -1) {
                        fieldOfMines[i - 1][j + 1] = fieldOfMines[i - 1][j + 1] + 1;
                    }

                    if (fieldOfMines[i][j - 1] != -1) {
                        fieldOfMines[i][j - 1] = fieldOfMines[i][j - 1] + 1;
                    }
                    if (fieldOfMines[i][j + 1] != -1) {
                        fieldOfMines[i][j + 1] = fieldOfMines[i][j + 1] + 1;
                    }

                    if (fieldOfMines[i + 1][j - 1] != -1) {
                        fieldOfMines[i + 1][j - 1] = fieldOfMines[i + 1][j - 1] + 1;
                    }
                    if (fieldOfMines[i + 1][j] != -1) {
                        fieldOfMines[i + 1][j] = fieldOfMines[i + 1][j] + 1;
                    }
                    if (fieldOfMines[i + 1][j + 1] != -1) {
                        fieldOfMines[i + 1][j + 1] = fieldOfMines[i][j + 1] + 1;
                    }

                }
            }
        }
    }

    public void printField() {
        for (int i = 1; i < fieldOfMines.length; i++) {
            for (int j = 1; j < fieldOfMines[0].length; j++) {
                System.out.printf("%s | ", fieldOfMines[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void doStep() {
        Scanner scan = new Scanner(System.in);
        System.out.println("");

        int row = scan.nextInt();

        System.out.println("");
        int column = scan.nextInt();

        if (isFieldValueValid(row) && isFieldValueValid(column)) {
            System.out.println("Неверное число");
            this.doStep();
        }
    }

    private Boolean isFieldValueValid(int value) {
        return value <= 0 && value > fieldOfMines.length;
    }

    private void clearMines(int row, int column) {
        if(fieldOfMines[row][column] == -1) {
            System.out.println("You lose");
        }
    }

    // Отрисовка поля и раскраска выбранных полей
    public void printGameField() {
        for (int i = 1; i < gameField.length; i++) {
            for (int j = 1; j < gameField[0].length; j++) {
                if (isCellSelected(i, j)) {
                    System.out.printf("%s | ", colorizeCell(gameField[i][j] + "", "GREEN"));
                } else {
                    System.out.printf("%s | ", gameField[i][j]);
                }

            }
            System.out.print("\n");
        }
    }

    private boolean isCellSelected(int i, int j) {
        for (int k = 0; k < selectedCells.size(); k++) {
            if (selectedCells.get(k)[0] == i && selectedCells.get(k)[1] == j) {
                return true;
            }
        }
        return false;
    }

    private String colorizeCell(String value, String color) {
        String RED_BACKGROUND = "\u001B[41m";
        String GREEN_BACKGROUND = "\u001B[42m";
        String DEFAULT_BACKGROUND = "\u001B[0m";
        String YELLOW_BACKGROUND = "\u001B[43m";

        switch (color) {
            case "RED":
                return RED_BACKGROUND + value + DEFAULT_BACKGROUND;
            case "GREEN":
                return GREEN_BACKGROUND + value + DEFAULT_BACKGROUND;
            case "YELLOW":
                return YELLOW_BACKGROUND + value + DEFAULT_BACKGROUND;
            default:
                return value;
        }
    }
}
