package lesson9;

public class Circle extends Figure{
    float radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return MathUtils.calculateAreaOfCircle(radius);
    }

    @Override
    public float getPerimeter() {
        return MathUtils.calculateCirclePerimeter(radius);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Circle circle = (Circle) object;
        return java.lang.Float.compare(circle.radius, radius) == 0;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), radius);
    }
}
