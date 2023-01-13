import java.util.*;

public class Codeup1043 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    sc.close();
    int result = Integer.parseInt(arr[0]) % Integer.parseInt(arr[1]);
    System.out.println(result);
  }
}
