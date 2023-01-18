package greedy;

import java.io.*;

public class Bj11047 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] tmp = br.readLine().split(" ");
    int cnt = Integer.parseInt(tmp[0]);
    int amount = Integer.parseInt(tmp[1]);
    int[] nums = new int[cnt];
    for (int i = 0; i < cnt; i++) {
      nums[i] = Integer.parseInt(br.readLine());
    }
    int result = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      int coins = amount / nums[i];
      result += coins;
      amount -= coins * nums[i];
    }
    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}
