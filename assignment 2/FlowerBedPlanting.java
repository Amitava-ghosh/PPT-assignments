import java.util.Scanner;

public class FlowerBedPlanting {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean prevEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1 || flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1; 
                    count++; 

                    if (count >= n) {
                        return true; 
                    }
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of plots in the flowerbed: ");
        int length = scanner.nextInt();

        int[] flowerbed = new int[length];

        System.out.println("Enter the flowerbed (0 or 1 for each plot): ");
        for (int i = 0; i < length; i++) {
            flowerbed[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of flowers to plant: ");
        int n = scanner.nextInt();

        boolean canPlant = canPlaceFlowers(flowerbed, n);
        System.out.println("Can plant " + n + " flowers: " + canPlant);

        scanner.close();
    }
}
