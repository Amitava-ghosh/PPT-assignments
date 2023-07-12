import java.util.Arrays;

public class SquaresOfSortedArray {

  public static int[] getSquares(int[] nums) {
    int[] squares = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      squares[i] = nums[i] * nums[i];
    }

    Arrays.sort(squares);

    return squares;
  }

  public static void main(String[] args) {
    int[] nums = {-4, -1, 0, 3, 10};
    int[] squares = getSquares(nums);

    System.out.println(Arrays.toString(squares));
  }
}
