import java.util.*;

public class SpiralMatrix {

  public static int[][] generateSpiralMatrix(int n) {
    int[][] matrix = new int[n][n];
    int row = 0;
    int col = 0;
    int num = 1;

    while (num <= n * n) {
      for (int i = 0; i < n && num <= n * n; i++) {
        matrix[row][col++] = num++;
      }
      row++;

      for (int i = 0; i < n - 1 && num <= n * n; i++) {
        matrix[row][col] = num++;
        col++;
      }
      col--;

      for (int i = 0; i < n - 2 && num <= n * n; i++) {
        matrix[row][col--] = num++;
      }
      row--;

      for (int i = 0; i < n - 1 && num <= n * n; i++) {
        matrix[row][col] = num++;
        col--;
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[][] matrix = generateSpiralMatrix(n);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
