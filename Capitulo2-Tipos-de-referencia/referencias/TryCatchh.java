import java.util.Scanner;

public class TryCatchh {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x;

        System.out.println("enter a number: ");

        try {
            String oneline = in.nextLine();
            x = Integer.parseInt(oneline);
        
        System.out.println("divide between: " + (x / 2));


        } catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}