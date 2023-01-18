package greedy;

import java.io.*;
import java.util.*;

public class Bj1026 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int cnt = Integer.parseInt(br.readLine());
    StringTokenizer stA = new StringTokenizer(br.readLine());
    StringTokenizer stB = new StringTokenizer(br.readLine());
    int[] A = new int[cnt];
    Integer[] B = new Integer[cnt];
    for (int i = 0; i < cnt; i++) {
      A[i] = Integer.parseInt(stA.nextToken());
      B[i] = Integer.parseInt(stB.nextToken());
    }

    Arrays.sort(A);
    Arrays.sort(B, Comparator.reverseOrder());

    int result = 0;
    for (int i = 0; i < cnt; i++) {
      result += A[i] * B[i];
    }
    bw.append(String.valueOf(result));

    bw.flush();
    br.close();
    bw.close();
  }
}
