import java.util.*;

public class Codeup1038 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    sc.close();
    long result = 0L;
    for (String s : arr) {
      result += Long.valueOf(s);
    }
    System.out.println(result);
  }
}
