import java.util.*;

public class FindDuplicates {

  public static List<Integer> findDuplicates(int[] nums) {
    List<Integer> duplicates = new ArrayList<>();
    int[] seen = new int[nums.length];

    for (int num : nums) {
      if (seen[num - 1] == 1) {
        duplicates.add(num);
      } else {
        seen[num - 1] = 1;
      }
    }

    return duplicates;
  }

  public static void main(String[] args) {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> duplicates = findDuplicates(nums);

    System.out.println(duplicates);
  }
}
