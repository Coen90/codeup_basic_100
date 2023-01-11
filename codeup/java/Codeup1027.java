import java.util.Scanner;

public class Codeup1027 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] times = sc.nextLine().split("[.]");
    sc.close();
    for (int i = times.length - 1; i >= 0; i--) {
      System.out.print(times[i]);
      if (i > 0) {
        System.out.print("-");
      }
    }
  }
}
