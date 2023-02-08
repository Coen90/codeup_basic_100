package bfs;

import java.io.*;
import java.util.*;

public class Bj2606_bfs {

  static int node;
  static int line;
  static int count = 0;
  static int[][] arr;
  static boolean[] visited;
  static Queue<Integer> queue = new LinkedList<>();
  static BufferedReader br;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    node = Integer.parseInt(br.readLine());
    line = Integer.parseInt(br.readLine());
    arr = new int[node + 1][node + 1];
    visited = new boolean[node + 1];
    for (int i = 0; i < line; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a][b] = arr[b][a] = 1;
    }
    dbs(1);

    System.out.println(count);
  }

  public static void dbs(int start) {
    queue.offer(start);
    visited[start] = true;

    while (!queue.isEmpty()) {
      int tmp = queue.poll();
      for (int i = 0; i <= node; i++) {
        if (arr[tmp][i] == 1 && !visited[i]) {
          queue.offer(i);
          visited[i] = true;
          count++;
        }
      }
    }
  }
}