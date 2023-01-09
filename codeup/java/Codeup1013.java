import java.util.Scanner;

public class Codeup1013 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    sc.close();
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
      if (i < nums.length) {
        System.out.print(" ");
      }
    }
  }
}
