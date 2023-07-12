import java.util.*;

public class LongestSubarrayWithEqualZeroOnes {

  public static int longestSubarrayWithEqualZeroOnes(int[] nums) {
    int n = nums.length;
    int count0 = 0;
    int count1 = 0;
    int maxLen = 0;

    for (int i = 0; i < n; i++) {
      if (nums[i] == 0) {
        count0++;
      } else {
        count1++;
      }

      if (count0 == count1) {
        maxLen = Math.max(maxLen, count0 + count1);
      } else if (count0 > count1) {
        count0 = 0;
      } else {
        count1 = 0;
      }
    }

    return maxLen;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    int longestSubarrayWithEqualZeroOnes = longestSubarrayWithEqualZeroOnes(nums);
    System.out.println(longestSubarrayWithEqualZeroOnes);
  }
}
