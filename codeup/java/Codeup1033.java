import java.util.*;

public class Codeup1033 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();
    String oct = Integer.toHexString(a);
    System.out.println(oct.toUpperCase());
  }
}
