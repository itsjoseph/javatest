import java.util.ArrayList;

public class BoxingDemoDos{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        int val = list.get(0);
        System.out.println("Valor: " + val);

    }
}