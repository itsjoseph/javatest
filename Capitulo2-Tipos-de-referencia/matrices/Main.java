import java.util.Random;

public class Main {
    public static final int DIFF_NUMBERS = 100;
    public static final int TOTAL_NUMBERS = 100000;
    
    public static void main(String[] args){
        //INICIALIZACION DE MATRIZ
        int[] numbers = new int[DIFF_NUMBERS + 1];
        
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=0;
        }
            Random r = new Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[r.nextInt(DIFF_NUMBERS + 1)]++;
        }

        for(int i = 0; i <= DIFF_NUMBERS; i++){
            System.out.println(i + ": " + numbers[i]);
        }
    }

}
