import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array in ascending order:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        int index = search(nums, target);

        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
        
        scanner.close();
    }
}
