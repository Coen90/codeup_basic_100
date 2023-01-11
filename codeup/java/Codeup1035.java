import java.util.*;

public class Codeup1035 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    int num = Integer.parseInt(s, 16);
    String oct = Integer.toOctalString(num);
    System.out.println(oct);
  }
}
