package greedy;

import java.io.*;
import java.util.*;

public class Bj10610 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String strs = br.readLine();
    int[] arr = new int[strs.length()];
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = strs.charAt(i) - '0';
      total += arr[i];
    }

    Arrays.sort(arr);
    StringBuilder sb = new StringBuilder();

    if (arr[0] == 0 && total % 3 == 0) {
      for (int i = arr.length - 1; i >= 0; i--) {
        sb.append(String.valueOf(arr[i]));
      }
    } else {
      sb.append(String.valueOf(-1));
    }
    bw.append(sb);
    bw.flush();
    br.close();
    bw.close();
  }
}