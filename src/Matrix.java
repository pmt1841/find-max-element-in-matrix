import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        addElement(matrix);
        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        System.out.println("Maximum element in matrix: " + findMaxElement(matrix));

    }

    public static void addElement(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.printf("Enter the elements [%d][%d] of the matrix: ", r, c);
                matrix[r][c] = sc.nextInt();
            }
        }
    }

    public static int findMaxElement(int[][] matrix) {
        int columns = matrix[0].length;
        int max = matrix[0][0];

        for (int[] element : matrix) {
            for (int c = 0; c < columns; c++) {
                if (element[c] > max) {
                    max = element[c];
                }
            }
        }
        return max;
    }
}
