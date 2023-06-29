import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements (2n): ");
        int n = scanner.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

       
        int[] shuffledArray = shuffle(nums, n);

        System.out.println("Output: " + Arrays.toString(shuffledArray));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            shuffledArray[index++] = nums[i];
            shuffledArray[index++] = nums[i + n];
        }

        return shuffledArray;
    }
}
