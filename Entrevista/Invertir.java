package Entrevista;

public class Invertir {
    public static void main(String[] args) {
        String palabra = "Hola mundo";
        String invertida = invertirPalabra(palabra);
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + invertida);
    }

    public static String invertirPalabra(String palabra) {
        StringBuilder invertida = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida.append(palabra.charAt(i));
        }
        return invertida.toString();
    }
    
}
