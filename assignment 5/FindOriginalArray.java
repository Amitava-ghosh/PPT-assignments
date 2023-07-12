import java.util.*;

public class FindOriginalArray {

  public static List<Integer> findOriginalArray(int[] changed) {
    List<Integer> original = new ArrayList<>();
    Map<Integer, Integer> seen = new HashMap<>();

    for (int num : changed) {
      if (seen.containsKey(num)) {
        original.add(seen.get(num));
      } else {
        seen.put(num * 2, num);
      }
    }

    int n = original.size();
    int i = 0;
    while (i < n) {
      if (!seen.containsKey(2 * original.get(i))) {
        original.clear();
        break;
      }
      i++;
    }

    return original;
  }

  public static void main(String[] args) {
    int[] changed = {1, 3, 4, 2, 6, 8};
    List<Integer> original = findOriginalArray(changed);

    System.out.println(original);
  }
}
