import java.util.Scanner;

public class MaxCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input from the user
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of operations: ");
        int numOps = scanner.nextInt();

        int[][] ops = new int[numOps][2];

        System.out.println("Enter the operations (ai, bi):");
        for (int i = 0; i < numOps; i++) {
            ops[i][0] = scanner.nextInt();
            ops[i][1] = scanner.nextInt();
        }

        int maxCount = maxCount(m, n, ops);

        System.out.println("Output: " + maxCount);
    }

    private static int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;

        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        return minRow * minCol;
    }
}

