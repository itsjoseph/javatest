public class Matriz {
    public static void main(String[] args){
        String salida = "hello";
        System.out.println(salida.charAt(2)); 
        System.out.println(salida.substring(0,2));
        System.out.println(salida.length());
        System.out.println("55 en base 2: " + Integer.toString(55, 2)) ;
        Integer integerrrs = 10; 
        int x = Integer.parseInt("78987987");
        System.out.println(salida.getClass().getName());
        System.out.println(integerrrs.getClass().getName());


        int[] arrays = new int[100];
        for(int i = 0; i < arrays.length; i++){
            arrays[i] = 1*i;
        }

        for(int salidafor : arrays){
            if(salidafor == 50){
                continue;
            } else {
                System.out.println(salidafor);
            }

        }
        System.out.println(arrays[70]);
    }

}  
 
