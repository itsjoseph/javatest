package Jerarquias;

import Jerarquias.src.Circle;
import Jerarquias.src.Rectangle;
import Jerarquias.src.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] a = {new Circle(2.0), new Rectangle(1.0, 1.3), null};

        System.out.println("Total area: " + totalarea(a));
        printAll(a);
    }

    public static double totalarea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                total += shape.area();
            }
        }
        return total;
    }

    public static void printAll(Shape[] arr){
        for (Shape shape : arr) {
            System.out.println(shape);
        }
    }
    
}
