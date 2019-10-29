public class DiagonalMatrix {
    public static void main(String[] args) {
        int size = 4;
        int matrix[][] = new int[size][size];



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] += 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();



        }

    }
}
