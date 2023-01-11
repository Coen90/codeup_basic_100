import java.util.*;

public class Codeup1031 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();
    String oct = Integer.toOctalString(a);
    System.out.println(oct);
  }
}
