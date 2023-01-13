import java.io.*;

public class Codeup1050 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nums = br.readLine().split(" ");
    br.close();
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    System.out.println(a == b ? 1 : 0);
  }
}
