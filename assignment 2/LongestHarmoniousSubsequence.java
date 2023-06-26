import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxLength = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int length = frequencyMap.get(num) + frequencyMap.get(num + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxLength = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + maxLength);

        scanner.close();
    }
}
