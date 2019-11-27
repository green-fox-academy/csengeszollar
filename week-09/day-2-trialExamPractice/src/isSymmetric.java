import sun.jvm.hotspot.oops.Array;

public class isSymmetric {
    public static void main(String[] args) {
        int[][] matr = { {1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
        System.out.println();
        System.out.println("Matrix is symmetric: " + isSymmetric(matr));
    }
    
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
        boolean symmetric = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (symmetric == false)
                break;
        }
        return symmetric;
    }
}
