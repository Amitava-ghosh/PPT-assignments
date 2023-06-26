import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaxCandies {
    public static int maxCandies(int[] candyType) {
        int maxTypes = candyType.length / 2; 
        Set<Integer> uniqueTypes = new HashSet<>();

        for (int candy : candyType) {
            uniqueTypes.add(candy); 
        }

        return Math.min(maxTypes, uniqueTypes.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candies: ");
        int n = scanner.nextInt();

        int[] candyType = new int[n];

        System.out.println("Enter the candy types:");
        for (int i = 0; i < n; i++) {
            candyType[i] = scanner.nextInt();
        }

        int maxTypes = maxCandies(candyType);
        System.out.println("Maximum number of different types of candies Alice can eat: " + maxTypes);

        scanner.close();
    }
}
