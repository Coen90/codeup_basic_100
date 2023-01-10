import java.util.*;

public class Codeup1020 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(sc.nextLine(), "-");
    sc.close();
    System.out.printf("%s%s", st.nextToken(), st.nextToken());
  }

}
