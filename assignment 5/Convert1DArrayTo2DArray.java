import java.util.Scanner;

public class Convert1DArrayTo2DArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the 1D array: ");
    int n = scanner.nextInt();

    int[] original = new int[n];
    System.out.println("Enter the elements of the 1D array: ");
    for (int i = 0; i < n; i++) {
      original[i] = scanner.nextInt();
    }

    System.out.println("Enter the number of rows in the 2D array: ");
    int m = scanner.nextInt();

    System.out.println("Enter the number of columns in the 2D array: ");
    int n = scanner.nextInt();

    int[][] array = convert1DArrayTo2DArray(original, m, n);

    System.out.println(Arrays.deepToString(array));
  }

  public static int[][] convert1DArrayTo2DArray(int[] original, int m, int n) {
    if (original.length != m * n) {
      return new int[0][0];
    }

    int[][] array = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = original[i * n + j];
      }
    }

    return array;
  }
}
