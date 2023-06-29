import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DistinctIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of nums1 (space-separated): ");
        int[] nums1 = readIntArray(scanner);

        System.out.print("Enter the elements of nums2 (space-separated): ");
        int[] nums2 = readIntArray(scanner);

        List<Integer> distinctNums1 = findDistinctIntegers(nums1, nums2);

        List<Integer> distinctNums2 = findDistinctIntegers(nums2, nums1);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinctNums1);
        answer.add(distinctNums2);

        System.out.println("Output: " + answer);
    }

    private static int[] readIntArray(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    private static List<Integer> findDistinctIntegers(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                set.remove(num);
            }
        }

        return new ArrayList<>(set);
    }
}
