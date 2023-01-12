import java.util.*;

public class Codeup1045 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    sc.close();
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.printf("%.2f", a / (float) b);
  }
}
