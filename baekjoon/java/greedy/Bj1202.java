package greedy;

import java.io.*;
import java.util.*;

public class Bj1202 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[][] jewels = new int[N][2];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      jewels[i][0] = Integer.parseInt(st.nextToken());
      jewels[i][1] = Integer.parseInt(st.nextToken());
    }

    Integer[] bags = new Integer[K];
    for (int i = 0; i < K; i++) {
      bags[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(jewels, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
      }
    });

    Arrays.sort(bags);

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    long result = 0;

    for (int i = 0, j = 0; i < K; i++) {
      while (j < N && jewels[j][0] <= bags[i]) {
        pq.offer(jewels[j++][1]);
      }

      if (!pq.isEmpty()) {
        result += pq.poll();
      }
    }

    System.out.println(result);
  }
}
