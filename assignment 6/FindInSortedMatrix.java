import java.util.*;

public class FindInSortedMatrix {

  public static boolean find(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;
    int row = 0;
    int col = n - 1;

    while (row < m && col >= 0) {
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int m = scanner.nextInt();
    int n = scanner.nextInt();

    int[][] matrix = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    int target = scanner.nextInt();

    boolean found = find(matrix, target);
    System.out.println(found);
  }
}
