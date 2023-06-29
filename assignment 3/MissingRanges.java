import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        long next = lower;

        for (int num : nums) {
            if (num > next) {
                result.add(formatRange(next, num - 1));
            }

            next = (long) num + 1;
        }

        if (next <= upper) {
            result.add(formatRange(next, upper));
        }

        return result;
    }

    private static String formatRange(long start, long end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        List<String> result = findMissingRanges(nums, lower, upper);

        System.out.println("Missing ranges: " + result);

        scanner.close();
    }
}

