import java.util.Arrays;
import java.util.Scanner;

public class ScoreAfterOperation {
    public static int minScore(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int minScore = nums[n - 1] - nums[0];

        for (int i = 1; i < n; i++) {
            int minValue = nums[0] + k;
            int maxValue = nums[i] - k;
            minScore = Math.min(minScore, maxValue - minValue);
        }

        return minScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int minScore = minScore(nums, k);

        System.out.println("Minimum score: " + minScore);

        scanner.close();
    }
}
