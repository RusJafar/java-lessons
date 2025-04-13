package lesson9;

public class Rectangle extends Figure {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public float getArea() {
        return MathUtils.calculateAreaOfRectangle(a, b);
    }

    @Override
    public float getPerimeter() {
        return MathUtils.calculatePerimeter(a, b);
    }

}
