package greedy;

import java.io.*;

public class Bj5585 {
  public static void main(String[] args) throws IOException {
    final int MONEY = 1_000;
    final int[] OTSURI = { 500, 100, 50, 10, 5, 1 };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int price = MONEY - Integer.parseInt(br.readLine());
    int result = 0;

    for (int i = 0; i < OTSURI.length; i++) {
      if (price == 0) {
        break;
      }
      result += price / OTSURI[i];
      price = price % OTSURI[i];
    }

    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}
