package lesson9;

public class MathUtils {
    /**
     * Создание метода
     * 1 - модификатор доступа (слово определяющее область видимости)
     * public - доступен внутри всего проекта
     * protected - доступен только внутри текущей папки и наследникам текущего класса
     * -------(package) - доступен только внутри текущей папки
     * private - доступен только внутри текущего класса
     * <p>
     * Где можно ставить модификатор доступа:
     * - перед классом
     * - перед методом (там где создаете метод)
     * <p>
     * 2 - static (может быть или нет)
     * 3 - указываем возвращаем тип(или слово void, если ничего не возвращает)
     * 4 - название метода
     * 5 - входящие параметры (Всегда в () через , и с указанием типа и названия переменной
     * 6 - тело выполнения данного метода
     */

    public static float calculateAreaOfTriangle(float a, float b, float c) {
        double halfOfPerimeter = (a + b + c) / 2.0;
        double area = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c));

        return (float) area;
    }

    public static float calculateAreaOfRectangle(float a, float b) {
        return (float) a * b;
    }

    public static boolean isTriangleExist(float a, float b, float c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static float calculateAreaOfCircle(float r) {
        return (float) Math.PI * r * r;
    }

    public static void calculateAreaOfEllipse(int a, int b) {
        System.out.printf("Площадь эллипса равна: " + (Math.PI * a * b) + "\n");
    }

    public static void calculateAreaOfTrapeze(float a, float b, float h) {
        System.out.printf("Площадь трапеции равна: " + (a + b) / 2 * h + "\n");
    }

    public static float calculatePerimeter(float a, float b) {

        return (float) (a + b);
    }

    public static float calculatePerimeter(float a, float b, float c) {

        return (float) (a + b + c);
    }

    public static float calculateCirclePerimeter(float radius) {
        return (float) (2 * Math.PI * radius);
    }


    public static String formCamelCaseToScreamSnakeCase(String string) {
        char[] charArray = string.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char item : charArray) {
            if (Character.isUpperCase(item)) {
                result.append("_");
            }
            result.append(Character.toUpperCase(item));
        }
        return result.toString();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
