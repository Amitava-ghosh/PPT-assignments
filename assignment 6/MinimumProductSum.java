import java.util.*;

public class MinimumProductSum {

  public static int minimumProductSum(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int[] prefixSum1 = new int[n + 1];
    int[] prefixSum2 = new int[n + 1];

    for (int i = 0; i < n; i++) {
      prefixSum1[i + 1] = prefixSum1[i] + nums1[i];
      prefixSum2[i + 1] = prefixSum2[i] + nums2[i];
    }

    int minProductSum = Integer.MAX_VALUE;
    for (int i = 0; i <= n; i++) {
      int productSum = prefixSum1[i] * prefixSum2[n - i];
      minProductSum = Math.min(minProductSum, productSum);
    }

    return minProductSum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] nums1 = new int[n];
    int[] nums2 = new int[n];
    for (int i = 0; i < n; i++) {
      nums1[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      nums2[i] = scanner.nextInt();
    }

    int minimumProductSum = minimumProductSum(nums1, nums2);
    System.out.println(minimumProductSum);
  }
}
