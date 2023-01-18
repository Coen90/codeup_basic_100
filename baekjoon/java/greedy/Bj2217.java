package greedy;

import java.io.*;
import java.util.*;

public class Bj2217 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] ropes = new int[N];

    for (int i = 0; i < N; i++) {
      ropes[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(ropes);
    int result = 0;
    for (int i = 0; i < ropes.length; i++) {
      int max_strength = ropes[i] * (ropes.length - i);
      if (result < max_strength) {
        result = max_strength;
      }
    }

    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}
