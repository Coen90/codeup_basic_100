package dfs;

import java.io.*;
import java.util.*;

public class Bj2606 {

  static int count;
  static int node;
  static int line;
  static boolean[] check;
  static int[][] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    count = 0;
    node = Integer.parseInt(br.readLine());
    line = Integer.parseInt(br.readLine());

    arr = new int[node + 1][node + 1];
    check = new boolean[node + 1];

    for (int i = 0; i < line; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      arr[a][b] = 1;
      arr[b][a] = 1;
    }
    dfs(1);

    System.out.println(count - 1);
  }

  public static void dfs(int start) {

    check[start] = true;
    count++;

    for (int i = 0; i <= node; i++) {
      if (arr[start][i] == 1 && !check[i])
        dfs(i);
    }
  }
}