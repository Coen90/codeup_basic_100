package baekjoon.java;

import java.io.*;

public class Bj14916 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] set = { 1, 1, 2, 2, 2, 8 };
    String[] needCheck = br.readLine().split(" ");
    for (int i = 0; i < needCheck.length; i++) {
      set[i] -= Integer.parseInt(needCheck[i]);
      bw.append(set[i] + " ");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
