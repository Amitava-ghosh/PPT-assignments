import java.util.*;

public class FindOriginalArray {

  public static List<Integer> findOriginalArray(int[] changed) {
    Map<Integer, Integer> seen = new HashMap<>();
    List<Integer> original = new ArrayList<>();

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
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] changed = new int[n];
    for (int i = 0; i < n; i++) {
      changed[i] = scanner.nextInt();
    }

    List<Integer> original = findOriginalArray(changed);
    System.out.println(original);
  }
}
