import java.util.*;

public class ReconstructPermutation {

  public static List<Integer> reconstructPermutation(String s) {
    List<Integer> perm = new ArrayList<>();
    int n = s.length();

    for (int i = 0; i < n; i++) {
      perm.add(i);
    }

    int i = 0;
    while (i < n - 1) {
      if (s.charAt(i) == 'I') {
        int j = i + 1;
        while (j < n && s.charAt(j) == 'I') {
          j++;
        }

        int temp = perm.get(i);
        perm.set(i, perm.get(j));
        perm.set(j, temp);
      }

      i++;
    }

    return perm;
  }

  public static void main(String[] args) {
    String s = "IDID";
    List<Integer> perm = reconstructPermutation(s);

    System.out.println(perm);
  }
}
