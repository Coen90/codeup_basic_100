package greedy;

import java.io.*;
import java.util.*;

public class Bj1715 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      pq.offer(Integer.parseInt(br.readLine()));
    }

    int result = 0;
    if (N == 1) {
      System.out.println(result);
      return;
    }

    while (!pq.isEmpty()) {
      int a = pq.poll();
      int b = pq.poll();
      int sum = a + b;
      result += sum;
      pq.offer(sum);
      if (pq.size() == 1) {
        break;
      }
    }

    System.out.println(result);
  }
}