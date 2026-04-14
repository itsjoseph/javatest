package Jerarquias.src;

public class Rectangle extends Shape implements Stretchable {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void stretch(double factor) {
        if (factor <= 0)
            throw new IllegalArgumentException("Factor must be positive");

        if (length > width) {
            length *= factor;
        } else {
            width *= factor;
        }
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

}
