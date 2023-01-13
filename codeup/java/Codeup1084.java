import java.io.*;

public class Codeup1084 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] nums = br.readLine().split(" ");
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    int c = Integer.parseInt(nums[2]);
    int result = 0;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        for (int g = 0; g < c; g++) {
          bw.append(i + " " + j + " " + g + "\n");
          result++;
        }
      }
    }
    bw.append("" + result);
    bw.flush();
    br.close();
    bw.close();
  }
}