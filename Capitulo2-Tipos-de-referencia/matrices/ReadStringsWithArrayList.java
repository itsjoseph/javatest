import java.util.ArrayList;
import java.util.Scanner;

public class ReadStringsWithArrayList {
    public static void main(String[] args){
        ArrayList<String> array = getStrings();
        for (int index = 0; index < array.size(); index++) {
            System.out.println(getStrings());
        }
    }

    public static ArrayList<String> getStrings() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("ingresa numeros, uno por cada linea");
        System.out.println("finaliza con linea en blanco");

        while (sc.hasNextLine()) {
            String oneline = sc.nextLine();
            if (oneline.equals("")) {
                break;
            }
            array.add(oneline);
        }

        System.err.println("done reading");

        return array;
    }
}
