package greedy;

import java.io.*;

public class Bj10162 {
  public static void main(String[] args) throws IOException {
    final int[] BUTTONS = { 300, 60, 10 };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int time = Integer.parseInt(br.readLine());
    if (time % 10 > 0) {
      bw.append(String.valueOf(-1));
    } else {
      int[] clicks = new int[3];
      for (int i = 0; i < clicks.length; i++) {
        clicks[i] = time / BUTTONS[i];
        time = time % BUTTONS[i];
      }
      bw.append(clicks[0] + " " + clicks[1] + " " + clicks[2]);
    }

    bw.flush();
    br.close();
    bw.close();
  }
}