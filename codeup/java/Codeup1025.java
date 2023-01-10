import java.util.Scanner;

public class Codeup1025 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split("");// 5 4 3 2 1
    sc.close();
    for (int i = 0; i < arr.length; i++) { // 0
      System.out.println("[" + Integer.parseInt(arr[i]) * Math.round(Math.pow(10, arr.length - i - 1)) + "]");
    }
  }
}
