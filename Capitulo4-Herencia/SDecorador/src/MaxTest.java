import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxTest {
    public static void main(String[] args){ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese dos numeros en la misma linea: ");   

        try {
            if (br != null) {
                String[] input = br.readLine().split(" ");
                int num1 = Integer.parseInt(input[0]);
                int num2 = Integer.parseInt(input[1]);

                System.out.println("El numero mayor es: " + Math.max(num1, num2));
            }
        } catch (Exception e) {
            System.out.println("Error al leer los numeros. Asegurese de ingresar dos numeros separados por espacio.");
        }
    }
    
}
