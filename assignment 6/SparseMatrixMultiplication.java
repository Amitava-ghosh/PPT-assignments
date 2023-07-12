import java.util.*;

public class SparseMatrixMultiplication {

  public static int[][] multiply(int[][] mat1, int[][] mat2) {
    int m = mat1.length;
    int k = mat1[0].length;
    int n = mat2[0].length;
    int[][] result = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int sum = 0;
        for (int k = 0; k < k; k++) {
          if (mat1[i][k] != 0 && mat2[k][j] != 0) {
            sum += mat1[i][k] * mat2[k][j];
          }
        }
        result[i][j] = sum;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int m = scanner.nextInt();
    int k = scanner.nextInt();
    int n = scanner.nextInt();

    int[][] mat1 = new int[m][k];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < k; j++) {
        mat1[i][j] = scanner.nextInt();
      }
    }

    int[][] mat2 = new int[k][n];
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < n; j++) {
        mat2[i][j] = scanner.nextInt();
      }
    }

    int[][] result = multiply(mat1, mat2);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}
