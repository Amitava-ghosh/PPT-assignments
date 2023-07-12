import java.util.*;

public class ValidMountainArray {

  public static boolean validMountainArray(int[] arr) {
    int n = arr.length;

    if (n < 3) {
      return false;
    }

    boolean increasing = true;
    int i = 1;
    while (i < n && increasing) {
      if (arr[i] <= arr[i - 1]) {
        increasing = false;
      }
      i++;
    }

    if (!increasing) {
      while (i < n) {
        if (arr[i] >= arr[i - 1]) {
          return false;
        }
        i++;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    boolean validMountainArray = validMountainArray(arr);
    System.out.println(validMountainArray);
  }
}
