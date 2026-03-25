import java.util.NoSuchElementException;
import java.util.Scanner;

public class MaxTestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers");

        try {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println("Max value: " + Math.max(x, y));
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }
}
