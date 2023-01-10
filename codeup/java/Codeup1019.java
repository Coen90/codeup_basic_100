import java.util.*;

public class Codeup1019 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(sc.nextLine(), "[.]");
    sc.close();
    System.out.printf("%04d.%02d.%02d",
        Integer.parseInt(st.nextToken()),
        Integer.parseInt(st.nextToken()),
        Integer.parseInt(st.nextToken()));
  }
}
