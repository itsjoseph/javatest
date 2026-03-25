import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args){
        if (args.length == 0) 
           System.out.println("No files specified");
        for (String argg : args){
            listfile(argg);
        }
    }

    public static void listfile(String fileName){
        Scanner fileIn = null;

        System.out.println("File: " + fileName);

        try {
            fileIn = new Scanner(new FileReader(fileName));
            while (fileIn.hasNextLine()){
                String oneline = fileIn.nextLine();
                System.out.println(oneline);
            }            
        } catch(IOException e){
            System.out.println(e);
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
        }
    }
}
