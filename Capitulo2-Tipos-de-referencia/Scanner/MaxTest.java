import java.util.Scanner;
public class MaxTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x, y;

        System.out.println("Enter 2 numbers");

        if (in.hasNextInt()) {
            x = in.nextInt();
            if (in.hasNextInt()) {
                y = in.nextInt();
                System.out.println("Max value: " + Math.max(x, y));
            }
        }

    }
}