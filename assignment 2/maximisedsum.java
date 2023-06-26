import java.util.Arrays;
import java.util.Scanner;

public class maximisedsum {
    public static int aximisedsum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxSum = aximisedsum(nums);
        System.out.println("Maximum possible sum: " + maxSum);

        scanner.close();
    }
}
