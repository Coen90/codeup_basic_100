import java.util.*;

public class Codeup1046 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    sc.close();
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    int c = Integer.parseInt(arr[2]);
    int sum = a + b + c;
    float avg = sum / (float) arr.length;
    System.out.println(sum);
    System.out.printf("%.1f", avg);
  }
}
