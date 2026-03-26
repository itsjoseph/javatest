public class classte {
    /*@author JLAGP*/

    /*Obtener un valor almacenado
    @return el valor alamacenado */
    public int read(){
        return storedValue;
    }

    /* almacenar un valo
    @param x es un valor al azar */
    public void write(String x){
        storedValue = x;
    }

    private int storedValue;
    
}