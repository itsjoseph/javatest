public class MatrixDemo {
    public static void printMatrix(int[][] m){
        System.out.println("Largo: " + m.length);
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                System.out.println(" (null) ");
            } else {
                for (int j = 0; j < m[i].length; j++)
                   System.out.println(m[i][j] + ""); 
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        int[][] a = {{1,2}, {3,4}, {5,6}};
        int[][] b = {{1,2}, null, {5,6}};
        int[][] c = {{1,2}, {3,3,4}, {5}};

        System.out.println("a: "); printMatrix(a);
        System.out.println("b: "); printMatrix(b);
        System.out.println("c: "); printMatrix(c);        
    }
}