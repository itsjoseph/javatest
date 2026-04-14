package Jerarquias.src;

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

    public double semiPerimeter() {
        return perimeter() / 2;
    } 
}
