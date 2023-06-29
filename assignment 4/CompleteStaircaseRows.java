import java.util.Scanner;

public class CompleteStaircaseRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of coins: ");
        int n = scanner.nextInt();

        int completeRows = arrangeCoins(n);

        System.out.println("Output: " + completeRows);
    }

    private static int arrangeCoins(int n) {
        int completeRows = 0;
        int remainingCoins = n;

        int currentRow = 1;

        while (remainingCoins >= currentRow) {
            remainingCoins -= currentRow;
            completeRows++;
            currentRow++;
        }

        return completeRows;
    }
}

