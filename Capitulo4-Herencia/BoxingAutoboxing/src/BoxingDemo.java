import java.util.ArrayList;

public class BoxingDemo {

    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<>();
       numeros.add(new Integer(48));
       Integer wrappedval = numeros.get(0);
       System.out.println(numeros.get(0));
       int val = wrappedval.intValue();
       System.out.println("Valor: " + val);
    }
    
}
