public class MatrixDemo {
    
    // Método auxiliar para imprimir la memoria consumida en Megabytes (MB)
    public static void printMemoryUsage(String tag) {
        Runtime runtime = Runtime.getRuntime();
        // Forzamos la ejecución del recolector de basura para obtener una lectura más precisa
        runtime.gc(); 
        
        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        double memoryInMB = memoryUsed / (1024.0 * 1024.0);
        
        System.out.printf("[%s] Memoria en uso: %.2f MB%n", tag, memoryInMB);
    }

    public static void printMatrix(int[][] m){
        System.out.println("Largo: " + m.length);
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                System.out.println(" (null) ");
            } else {
                for (int j = 0; j < m[i].length; j++)
                   System.out.print(m[i][j] + " "); 
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        printMemoryUsage("Inicio");

        int[][] a = {{1,2}, {3,4}, {5,6}};
        int[][] b = {{1,2}, null, {5,6}};
        int[][] c = {{1,2}, {3,3,4}, {5}};

        System.out.println("a: "); printMatrix(a);
        System.out.println("b: "); printMatrix(b);
        System.out.println("c: "); printMatrix(c);        

        printMemoryUsage("Final");
    }
}