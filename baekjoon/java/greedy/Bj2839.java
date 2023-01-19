package greedy;

import java.io.*;

public class Bj2839 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int weight = Integer.parseInt(br.readLine());
    bw.write(String.valueOf(getResult(weight)));
    bw.flush();
    bw.close();
  }

  static int getResult(int weight) {
    int result = -1;
    final int LG = 5;
    final int SM = 3;
    if (weight % LG == 0) {
      result = weight / LG;
      return result;
    } else if (weight % SM == 0) {
      result = weight / SM;
    }
    for (int i = weight / LG; i >= 0; i--) { // 1 0
      if ((weight - (LG * i)) % SM == 0) {
        int tmp = ((weight - (LG * i)) / SM) + i;
        if (result > tmp || result == -1) {
          result = tmp;
          return result;
        }
      }
    }
    return result;
  }
}
