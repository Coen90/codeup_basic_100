package greedy;

import java.io.*;

public class Bj1789 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long S = Long.parseLong(br.readLine());
    long number = 0;
    long result = 0;
    long cnt = 0;
    while (true) {
      number += cnt;
      if (number == S) {
        result = cnt;
        break;
      } else if (number > S) {
        result = cnt - 1;
        break;
      }
      cnt++;
    }

    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}