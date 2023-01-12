import java.util.*;

public class Codeup1041 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    int ascii = (int) str.charAt(0);
    char c = (char) (ascii + 1);
    System.out.println(c);
  }
}
