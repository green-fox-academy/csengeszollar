import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//       printMatrix(rotateMatrix(matrix));
        int [][] rotatedMatrix = rotateMatrix(matrix);
        for (int i = 0; i < rotatedMatrix.length ; i++) {
           System.out.println();
//            for (int j = 0; j < rotatedMatrix[i].length ; j++) {
//                System.out.print(rotatedMatrix[i][j]);
//            }

        }
//        System.out.println(Arrays.deepToString(rotateMatrix(matrix)));
    }



    public static int[][] rotateMatrix(int matrix[][]) {
        int[][] rotatedMatrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[2 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

