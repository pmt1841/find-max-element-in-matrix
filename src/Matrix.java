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
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.printf("Enter the elements [%d][%d] of the matrix: ", r, c);
                matrix[r][c] = sc.nextInt();
            }
        }
        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        int max = matrix[0][0];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (matrix[r][c] > max) {
                    max = matrix[r][c];
                }
            }
        }
        System.out.println("Maximum element in matrix: " + max);
    }
}
