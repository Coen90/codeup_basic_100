package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Bj1931 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[][] time = new int[N][2];

    for (int i = 0; i < N; i++) {
      String[] tmp = br.readLine().split(" ");
      time[i][0] = Integer.parseInt(tmp[0]);
      time[i][1] = Integer.parseInt(tmp[1]);
    }

    Arrays.sort(time, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[1] == o2[0]) {
          return o1[0] - o2[1];
        }
        return o1[1] - o2[1];
      }
    });

    int count = 0;
    int prevEndTime = 0;

    for (int i = 0; i < N; i++) {
      if (prevEndTime <= time[i][0]) {
        prevEndTime = time[i][1];
        count++;
      }
    }

    bw.append(String.valueOf(count));

    bw.flush();
    br.close();
    bw.close();
  }
}