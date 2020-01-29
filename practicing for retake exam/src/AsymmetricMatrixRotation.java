public class AsymmetricMatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.print(matrix[i][j]);
                }else if (j == 1) {
                    System.out.println(matrix[2*j - i][i]);

                }

            }
        }
    }
}
