public class Main {
    public static void main(String[] args){
       // salida(); 
        salidas();
        System.out.println(salidaaa());

    }

    public static void salida(){
        for(int i = 1; i <= 10; i++){
            for( int j = 1; j <= 10; j++){
                    System.out.println(i + " , " + j);
                if( i + j == i * j){
                    System.out.println(i + " , " + j);
                }
            }
        }
    }

    public static void salidas(){
        char salida = '\u20AC';
        char charA = '\u0041';         // Latin capital 'A'
        char charZ = '\u005A';         // Latin capital 'Z'
        char charCopyright = '\u00A9'; // Copyright symbol ©
        char charEuro = '\u20AC';      // Euro symbol €
        char charChinese = '\u4E2D';   // Chinese character '中'

        System.out.println("Using Unicode escape sequences:");
        System.out.println("\\u0041: " + charA);
        System.out.println("\\u005A: " + charZ);
        System.out.println("\\u00A9: " + charCopyright);
        System.out.println("\\u20AC: " + charEuro);
        System.out.println("\\u4E2D: " + charChinese);
        System.out.println(salida);
    }

    public static boolean salidaaa(){
        return (true || false && true);
    
    }
}
