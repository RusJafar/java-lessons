package lesson9;

public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle(5);
       Rectangle rectangle = new Rectangle(10, 5.5F);
       Triangle triangle = new Triangle(34, 55, 78);
       Square square = new Square(46);

        System.out.printf("Площадь круга = %s\n", circle.getArea());
        System.out.printf("Периметр круга = %s\n", circle.getPerimeter());

        System.out.printf("Площадь прямоугольника = %s\n", rectangle.getArea());
        System.out.printf("Периметр прмоугольника = %s\n", rectangle.getPerimeter());

        System.out.printf("Площадь триугольника = %s\n", triangle.getArea());
        System.out.printf("Периметр триугольника = %s\n", triangle.getPerimeter());

        System.out.printf("Площадь квадрата = %s\n", square.getArea());
        System.out.printf("Периметр квадрата = %s\n", square.getPerimeter());


    }
}
