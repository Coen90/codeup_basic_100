import java.io.*;

public class Codeup1048 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nums = br.readLine().split(" ");
    br.close();
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    int result = a * (1 << b);
    System.out.println(result);
  }
}
