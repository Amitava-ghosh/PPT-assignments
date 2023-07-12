import java.util.Scanner;

public class StaircaseProblem {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of coins: ");
    int n = scanner.nextInt();

    int rows = 0;
    for (int i = 1; i <= n; i++) {
      if (n - i >= 0) {
        rows++;
      } else {
        break;
      }
    }

    System.out.println("The number of complete rows is: " + rows);
  }
}
