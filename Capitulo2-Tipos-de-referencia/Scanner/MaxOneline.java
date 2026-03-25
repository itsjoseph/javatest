import java.util.NoSuchElementException;
import java.util.Scanner;

public class MaxOneline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter 2 numbers");

        try {
            String oneline = in.nextLine();
            Scanner str = new Scanner(oneline);
            System.out.println(oneline.charAt(0));
            System.out.println(oneline.charAt(1));

            int x = str.nextInt();
            int y = str.nextInt();

            System.out.println("Max value: " + Math.max(x, y));

        } catch (NoSuchElementException e) {
            in.close();
            System.err.print(e);
        }finally{
            in.close();
        }
    }
}
