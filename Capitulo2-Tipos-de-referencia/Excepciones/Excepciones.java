import java.io.IOException;

public class Excepciones {

    public static void processFile(String file) throws IOException{
        //implementacion omitida propaga hacia el llamante
        //todas las excepciones IOException omitidas
    }


    public static void main(String[] args){
        for(String filename : args){
            try { 
                processFile(filename);
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
}