package greedy;

import java.io.*;
import java.util.*;

public class Bj11399 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int cnt = Integer.parseInt(br.readLine());
    String[] strs = br.readLine().split(" ");
    int[] nums = new int[cnt];
    for (int i = 0; i < strs.length; i++) {
      nums[i] = Integer.parseInt(strs[i]);
    }
    Arrays.sort(nums);
    int result = 0;
    for (int i = 0; i < strs.length; i++) {
      result += nums[i] * (strs.length - i);
    }
    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}
