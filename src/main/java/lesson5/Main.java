package lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите фигуры");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");
        System.out.println("0 - выход");
        System.out.println("________________________");

        Scanner scanner = new Scanner(System.in);
        String choose = inputConverter(scanner.nextLine());


        switch (choose) {
            case "1":
                System.out.printf("Треуглдьник: Ввкдите три стороны: a, b, c \n");
                chosenTriangle(scanner);
                break;
            case "2":
                System.out.printf("Квадрат: Введите две стороны: a, b \n");
                chosenRectangle(scanner);
                break;
            case "3":
                System.out.printf("Круг: Введите радиус: r \n");
                chosenCircle(scanner);
                break;
            case "4":
                System.out.printf("Круг:Введите значения большой и малой полуосей: a, b  \n");
                chosenEllipse(scanner);
                break;
            case "5":
                System.out.printf("Трапеция: Ввдите значения оснований и высоту: a, b,  h \n");
                chosenTrapeze(scanner);
                break;
            case "0":
                System.out.printf("Выход");
                break;
            default:
                System.out.printf("Такой фигуры я не знаю \n");
                getHelp(choose);
        }
    }

    private static void chosenTriangle(Scanner scanner) {
        System.out.println("Введите сторону 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите сторону 'b'");
        int b = scanner.nextInt();
        System.out.println("Введите сторону 'c'");
        int c = scanner.nextInt();

        if (!MathUtils.isTriangleExist(a, b, c)) {
            System.out.println("Такого триугольника не существует");
            chosenTriangle(scanner);
        }

        MathUtils.calculateAreaOfTriangle(a, b, c);
    }

    private static void chosenRectangle(Scanner scanner) {
        System.out.println("Введите сторону 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите сторону 'b'");
        int b = scanner.nextInt();


        MathUtils.calculateAreaOfRectangle(a, b);
    }

    private static void chosenCircle(Scanner scanner) {
        System.out.println("Введите радиус круга 'r'");
        int a = scanner.nextInt();

        MathUtils.calculateAreaOfCircle(a);
    }

    private static void chosenEllipse(Scanner scanner) {
        System.out.println("Введите значения большой полуоси 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите значения малой полуоси 'a' и 'b'");
        int b = scanner.nextInt();

        MathUtils.calculateAreaOfEllipse(a, b);
    }

    private static void chosenTrapeze(Scanner scanner) {
        System.out.println("Введите значения основания 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите значения основания 'b'");
        int b = scanner.nextInt();
        System.out.println("Введите высоту 'h'");
        int h = scanner.nextInt();

        MathUtils.calculateAreaOfTrapeze(a, b, h);
    }

    private static String inputConverter(String value) {
        if(MathUtils.isNumeric(value)) {
            return value;
        }

        List<String> figures = getAvailableFigures();
        if(!figures.contains(value)){
            return value;
        }

        return figures.indexOf(value) + "";
    }

    private static List getAvailableFigures() {
        List<String> figures = Arrays.asList("", "треугольник", "квадрат", "круг", "трапеция", "овал");

        return figures;
    }

    private static void getHelp(String value) {
        List<String> figures = getAvailableFigures();
        AtomicInteger lakeAt = new AtomicInteger();
        int maxCoincidences = 0;

        for (int i = 0; i < figures.size(); i++) {
            int numberOfCoincidences = 0;
            char[] figureChars = figures.get(i)
                    .substring(0, value.length() - Math.abs(value.length() - figures.get(i).length())).toCharArray();
            for (int j = 0; j < figureChars.length; j++) {
                if (figureChars[j] == value.charAt(j)) {
                    numberOfCoincidences++;
                }
            }
            if (numberOfCoincidences > maxCoincidences) {
                maxCoincidences = numberOfCoincidences;
                lakeAt.set(i);
            }
        }

        if(!(maxCoincidences == 0)) {
            System.out.printf("Возможно вы имели ввиду %s \n", figures.get(lakeAt.get()) + "?");
        }
    }
}
