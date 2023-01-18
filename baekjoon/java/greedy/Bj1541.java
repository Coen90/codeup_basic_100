package greedy;

import java.io.*;

public class Bj1541 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int result = 0;
    String[] minus = br.readLine().split("[-]");
    for (int i = 0; i < minus.length; i++) {
      if (i == 0) {
        result += splitCalculator(minus[i]);
      } else {
        result -= splitCalculator(minus[i]);
      }
    }
    bw.append(String.valueOf(result));
    bw.flush();
  }

  public static int splitCalculator(String numbers) {
    String[] nums = numbers.split("[+]");
    int returnInt = 0;
    for (int i = 0; i < nums.length; i++) {
      returnInt += Integer.parseInt(nums[i]);
    }
    return returnInt;
  }
}
