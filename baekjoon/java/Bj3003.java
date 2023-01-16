package baekjoon.java;

import java.io.*;

public class Bj3003 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int amount = Integer.parseInt(br.readLine());
    int result = calculator(amount);
    bw.append("" + result);
    bw.flush();
    br.close();
    bw.close();
  }

  public static int calculator(int num) {
    final int FIVE = 5;
    final int TWO = 2;
    if (num % FIVE == 0) {
      return num / FIVE;
    }

    for (int i = num / FIVE; i >= 0; i--) { // 2 1 0
      int rest = num - (i * FIVE);
      if (rest % TWO == 0) {
        return i + rest / TWO;
      }
    }
    return -1;
  }
}
