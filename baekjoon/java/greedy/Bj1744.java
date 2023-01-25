package greedy;

import java.io.*;
import java.util.*;

public class Bj1744 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<Integer> plus = new ArrayList<>();
    List<Integer> minus = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int tmp = Integer.parseInt(br.readLine());
      if (tmp > 0) {
        plus.add(tmp);
      } else {
        minus.add(tmp);
      }
    }

    Collections.sort(plus, Collections.reverseOrder()); // 3 2 1
    Collections.sort(minus); // -1
    int result = 0;
    for (int i = 0; i < plus.size();) {
      if (i + 1 < plus.size() && plus.get(i + 1) != 1 && plus.get(i) != 1) {
        result += plus.get(i++) * plus.get(i++);
      } else {
        result += plus.get(i++);
      }
    }

    for (int i = 0; i < minus.size();) {
      if (i + 1 < minus.size()) {
        result += minus.get(i++) * minus.get(i++);
      } else {
        result += minus.get(i++);
      }
    }
    System.out.println(result);
  }
}
