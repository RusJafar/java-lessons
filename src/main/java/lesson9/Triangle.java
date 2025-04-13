package lesson9;

public class Triangle extends Figure {
    private float a;
    private float b;
    private float c;

    public Triangle(int a, int b, int c) {
        if(!MathUtils.isTriangleExist(a, b, c)) {
            throw new Error("Триугольника с такими сторонами не сущетвует");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public float getArea() {
        return MathUtils.calculateAreaOfTriangle(a, b, c);
    }

    @Override
    public float getPerimeter() {
        return MathUtils.calculatePerimeter(a, b, c);
    }
}
