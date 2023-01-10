import java.util.*;

public class Codeup1024 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    for (int i = 0; i < s.length(); i++) {
      System.out.println("'" + s.charAt(i) + "'");
    }
  }

}
