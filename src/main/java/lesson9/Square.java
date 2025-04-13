package lesson9;

public class Square extends Figure {
    private float side;
    public  Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return MathUtils.calculateAreaOfRectangle(side, side);
    }

    @Override
    public float getPerimeter() {
        return MathUtils.calculatePerimeter(side, side);
    }

}
