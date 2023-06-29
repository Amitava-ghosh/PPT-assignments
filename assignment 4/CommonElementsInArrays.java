import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of arr1 (space-separated): ");
        int[] arr1 = readIntArray(scanner);

        System.out.print("Enter the elements of arr2 (space-separated): ");
        int[] arr2 = readIntArray(scanner);

        System.out.print("Enter the elements of arr3 (space-separated): ");
        int[] arr3 = readIntArray(scanner);

        int[] result = findCommonElements(arr1, arr2, arr3);

        System.out.print("Common elements in the three arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    private static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> commonElements = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int[] result = new int[commonElements.size()];
        for (int m = 0; m < commonElements.size(); m++) {
            result[m] = commonElements.get(m);
        }

        return result;
    }
}
